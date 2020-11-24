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

            String user = request.getParameter("txtuser");
            String password = request.getParameter("txtpass");

            employer = employerDAO.validate(user, password);
            if(employer.getUser()!=null){
                request.setAttribute("user", employer);
                request.getRequestDispatcher("/main.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }
        }
        else {
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "short description";
    }
}
