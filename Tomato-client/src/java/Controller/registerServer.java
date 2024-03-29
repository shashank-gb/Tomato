/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.registerModel;
import java.io.IOException;
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
                String ph = request.getParameter("phone");
                
                registerModel.Status regStatus = null;
                regStatus = reg.Register(name, email, pw, ph);

                if (regStatus != null)
                    
                    switch (regStatus) {
                        case existed:
                            session.setAttribute("regStatus", registerModel.Status.existed);
                            break;
                        case success:
                            session.setAttribute("regStatus", registerModel.Status.success);
                            break;
                        case failure:
                            session.setAttribute("regStatus", registerModel.Status.failure);
                            break;
                        default:
                            break;
                    }
                
//                    request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }else if(request.getParameter("signin") != null){
                
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                loginStatus = reg.Login(email, password);
                
                if(loginStatus == registerModel.Status.success){
                    
                    session.setAttribute("loginStatus", registerModel.Status.success);
                    
                }else{
                    
                    session.setAttribute("loginStatus", registerModel.Status.failure);
                    
                }
//                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }else if (request.getParameter("signout") != null){
                
                session.invalidate();
                
                
            }
            System.out.println(session.getAttribute("jspName")+" in register");
            request.getRequestDispatcher(session.getAttribute("jspName").toString()).forward(request, response);
//            request.getRequestDispatcher("").forward(request, response);
//            response.sendRedirect(url);
            
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
