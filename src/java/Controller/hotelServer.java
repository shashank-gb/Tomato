package Controller;

import Model.fetchFoodList;
import Model.foods;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "hotel", urlPatterns = {"/hotel"})
public class hotelServer extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try  {
            
            System.out.println(request.getParameter("resName"));
            if(request.getParameter("resName") != null){
                
                HttpSession session = request.getSession();
                fetchFoodList fetchFL = new fetchFoodList(session);

                ArrayList<foods> foodList = fetchFL.getAllFoods(request.getParameter("resName"));

                request.setAttribute("foodList", foodList);
                System.out.println(foodList+" in server");
                
                RequestDispatcher rd = request.getRequestDispatcher("foodOrder.jsp");
                rd.forward(request, response);
                
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
