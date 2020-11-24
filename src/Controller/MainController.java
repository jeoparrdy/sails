package Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        switch (action){
            case "main":
        //if(action.equals("main")) {
                request.getRequestDispatcher("/main.jsp").forward(request, response);
                break;
            case "product":
                request.getRequestDispatcher("/product.jsp").forward(request, response);
                break;
            case "employer":
                request.getRequestDispatcher("/employer.jsp").forward(request, response);
                break;
            case "clients":
                request.getRequestDispatcher("/clients.jsp").forward(request, response);
                break;
            case "saleRegister":
                request.getRequestDispatcher("/saleRegister.jsp").forward(request, response);
                break;
            default:
               throw new AssertionError();
       }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
