/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

public class ShoppingServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String User = (String) session.getAttribute("username");
        String action = request.getParameter("action");
        
        if(action != null) {
            if(action.equals("logout")) {
                session.invalidate();
                response.sendRedirect("shoppingList");
                return;
            }
        }
        if(User != null) {
               getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
        return;     
            }else {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
            return;
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        //getting username and action from jsp
        String Username = request.getParameter("user");
        String action = request.getParameter("action");
        
        //login validaiton
        if(Username.equals("")){
            request.setAttribute("invalidEntry", true);
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
            return;
        }else {
            
        //creating user and session object
        User user = new User();
        HttpSession session = request.getSession();
        
        if(action.equals("register")) {
            String username = request.getParameter("user");
            //storing the username in an attribute
            session.setAttribute("username", username);
            response.sendRedirect("shoppingList");
            return;
        }
        
        if(action != null) {
        if(action.equals("add")) {
        } else {
            System.out.println("it worked");
        }
        }
        }
        
        
        
        
        
//        //login validaiton
//        if(Username.equals("")){
//            request.setAttribute("invalidEntry", true);
//        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
//        return;
//        }else {
//        
//        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
//        return; 
//        
//        }
    }
}
