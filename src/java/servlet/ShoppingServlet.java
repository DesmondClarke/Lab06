/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.util.ArrayList;
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

        if (action != null) {
            if (action.equals("logout")) {
                session.invalidate();
                response.sendRedirect("shoppingList");
                return;
            }
        }
        if (User != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
            return;
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<String> itemArray = new ArrayList<>();
        String sessionUsername = (String) session.getAttribute("username");
        String Username = request.getParameter("user");
        String action = request.getParameter("action");


        //login validaiton
        if (Username == null || Username.equals("")) {
            request.setAttribute("invalidEntry", true);
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }
        if (action != null) {
            if (action.equals("add")) {
                if (request.getParameter("item") != null) {
                    itemArray.add(request.getParameter("item"));
                }
            }
            if (action.equals("delete")) {

            }

            if (action.equals("register")) {
                String username = request.getParameter("user");
                //storing the username in an attribute
                session.setAttribute("username", username);
                String u = (String) session.getAttribute("username");
                response.sendRedirect("shoppingList");
                return;
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
