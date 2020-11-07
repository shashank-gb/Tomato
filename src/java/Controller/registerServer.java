/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.fetchShopList;
import Model.registerModel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "register", urlPatterns = {"/register"})
public class registerServer extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public static registerModel.Status loginStatus = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        registerModel reg = new registerModel(session);
        
        try {
            
            if (request.getParameter("submit") != null) {
                String name = request.getParameter("uname");
                String email = request.getParameter("email");
                String pw = request.getParameter("password");
                
                registerModel.Status regStatus = null;
                regStatus = reg.Register(name, email, pw);

                if (regStatus != null)
                    
                    switch (regStatus) {
                        case existed:
                            request.setAttribute("regStatus", registerModel.Status.existed);
                            break;
                        case success:
                            request.setAttribute("regStatus", registerModel.Status.success);
                            break;
                        case failure:
                            request.setAttribute("regStatus", registerModel.Status.failure);
                            break;
                        default:
                            break;
                    }
                
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }else if(request.getParameter("signin") != null){
                
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                
                
                loginStatus = reg.Login(email, password);
                
                if(loginStatus == registerModel.Status.success){
                    
                    request.setAttribute("loginStatus", registerModel.Status.success);
                    
                }else{
                    
                    request.setAttribute("loginStatus", registerModel.Status.failure);
                    
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }else if (request.getParameter("signout") != null){
                
                session.invalidate();
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }
        } catch (Exception e) {
            System.out.print("Something wrong");
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
