package Controller;

import Model.Employer;
import Model.EmployerDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Validator extends HttpServlet {

    EmployerDAO employerDAO = new EmployerDAO();
    Employer employer = new Employer();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action.equalsIgnoreCase("Login")){
            System.out.println(action);
            String user = request.getParameter("txtuser");
            System.out.println("user: " + user);
            String password = request.getParameter("txtpass");
            System.out.println("password: " + password);
            employer = employerDAO.validate(user, password);
            if(employer.getUser()!=null){
                request.getRequestDispatcher("Controller?action=main").forward(request,response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request,response);
            }
        }
        else {
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "short description";
    }
}
