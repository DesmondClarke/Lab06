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
        
        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //getting username from jsp
        String Username = request.getParameter("user");
        
        //creating user and session object
        User user = new User();
        HttpSession session = request.getSession();
        
        //storing the username in an attribute
        session.setAttribute("username", Username);
        
        //System.out.println(session.getAttribute(Username));
        
        String item = request.getParameter("itemAdd");
        System.out.println("This is the item: " + item);
        
        //I do not understand how to ise
        
        //login validaiton
        if(Username.equals("")){
            request.setAttribute("invalidEntry", true);
        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
        return;
        }else {
        
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
        return; 
        
        }
    }
}
