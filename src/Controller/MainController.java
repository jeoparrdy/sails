package Controller;

import Model.Client;
import Model.ClientDAO;
import Model.Employer;
import Model.EmployerDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainController extends HttpServlet {

    Employer employer = new Employer();
    EmployerDAO employerDAO = new EmployerDAO();
    Client client = new Client();
    ClientDAO clientDAO = new ClientDAO();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String action = request.getParameter("action");

        if(menu.equals("main")) {
            request.getRequestDispatcher("/main.jsp").forward(request, response);
        }

        if(menu.equals("employer")) {
            switch (action){
                case "List":
                    List list = employerDAO.list();
                    request.setAttribute("employers", list);
                    break;
                case "Add":
                    String number = request.getParameter("txtNumber");
                    String name = request.getParameter("txtName");
                    String phone = request.getParameter("txtPhone");
                    String state = request.getParameter("txtState");
                    String user = request.getParameter("txtUser");
                    employer.setNumber(number);
                    employer.setName(name);
                    employer.setPhone(phone);
                    employer.setState(state);
                    employer.setUser(user);
                    employerDAO.add(employer);
                    request.getRequestDispatcher("MainController?menu=employer&action=List").forward(request,response);
                    break;
                case "Edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    Employer employerToEdit = employerDAO.listId(id);
                    request.setAttribute("employer",employerToEdit);
                    request.getRequestDispatcher("MainController?menu=employer&action=List").forward(request,response);
                    break;

                case "Update":
                    String numberToUp = request.getParameter("txtNumber");
                    String nameToUp = request.getParameter("txtName");
                    String phoneToUp = request.getParameter("txtPhone");
                    String stateToUp = request.getParameter("txtState");
                    String userToUp = request.getParameter("txtUser");
                    employer.setNumber(numberToUp);
                    employer.setName(nameToUp);
                    employer.setPhone(phoneToUp);
                    employer.setState(stateToUp);
                    employer.setUser(userToUp);
                    employer.setId(id);
                    employerDAO.update(employer);
                    request.getRequestDispatcher("MainController?menu=employer&action=List").forward(request,response);
                    break;

                case "Delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    employerDAO.delete(id);
                    request.getRequestDispatcher("MainController?menu=employer&action=List").forward(request,response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("/employer.jsp").forward(request, response);
        }

        if(menu.equals("product")) {
            request.getRequestDispatcher("/product.jsp").forward(request, response);
        }

        if(menu.equals("clients")) {
            request.getRequestDispatcher("/clients.jsp").forward(request, response);
        }
        if(menu.equals("saleRegister")) {
            switch (action){
                case "searchClient":
                    String number = request.getParameter("clientCode");
                    //client.setNumber(number);
                    client = clientDAO.search(number);
                    request.setAttribute("client", client);
                    break;
                default:
                    request.getRequestDispatcher("/saleRegister.jsp").forward(request, response);
//                    throw new AssertionError();
            }
            request.getRequestDispatcher("/saleRegister.jsp").forward(request, response);
        }



    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
