/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.loginChecker;
import Model.loginChecker.Status;
import Model.resAndDelPartner;
import Model.resAndDelReq;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */
@WebServlet(name = "checkLogin", urlPatterns = {"/checkLogin"})
public class loginCheckerServlet extends HttpServlet {

    public static Status loginStatus = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {

            HttpSession session = request.getSession();

            if (request.getParameter("login") != null) {

                String email = request.getParameter("username");
                String password = request.getParameter("password");

                loginChecker loginCheck = new loginChecker(session);
                
                
                loginStatus = loginCheck.checkLoginCredentials(email, password);
                System.out.println(loginStatus);

                if (loginStatus == Status.success) {
                    
                    request.setAttribute("loginStatus", loginStatus);
                    
                    
                    request.getRequestDispatcher("dashboard.jsp").forward(request, response);
                    
                } else {
                    
                    request.setAttribute("loginStatus", loginStatus);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
