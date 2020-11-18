package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class demoDtabase_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <title>SELECT Operation</title>\n");
      out.write("   </head>\n");
      out.write("\n");
      out.write("   <body>\n");
      out.write("       <form action=\"\" method=\"POST\">\n");
      out.write("   <select name=\"location\" id=\"loc_id\" onchange=\"this.form.submit()\">\n");
      out.write("   <option value=\"0\">Select City</option>\n");
      out.write("   ");

        String dbname = "tomato";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/";
        
        Connection con = null;
        PreparedStatement ps= null;
        ResultSet rs = null;
        Statement st = null;
       try{
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url+dbname, username , password);
  
        st = con.createStatement();

        String query = "select l_id, city from location group by city;";
        rs = st.executeQuery(query);
       
        while(rs.next()){
            System.out.println(rs.getString("city"));
            
      out.write("\n");
      out.write("            <option value=\"");
      out.print( rs.getInt("l_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("city"));
      out.write("</option>\n");
      out.write("            ");

        }
    }catch(Exception e){
        System.out.println(e);
    }
   
      out.write("\n");
      out.write("   </select>\n");
      out.write("   <select>\n");
      out.write("       <option value=\"0\">Select Hotel</option>\n");
      out.write("       ");

           try{
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection(url+dbname, username , password);

               st = con.createStatement();
               String query = "select * from restaurant where l_id = "+request.getParameter("location")+";";
               System.out.println(query);
               rs = st.executeQuery(query);
               
               while(rs.next()){
        
      out.write("\n");
      out.write("                  <option value=\"");
      out.print( rs.getInt("rid"));
      out.write("\"\n");
      out.write("                          \n");
      out.write("                    ");

                        if(request.getParameter("location")!=null){
                            if(rs.getInt("l_id") == Integer.parseInt(request.getParameter("location"))){
                                out.print("selected");
                            }
                        }
                    
      out.write("\n");
      out.write("                          \n");
      out.write("                  >");
      out.print(rs.getString("rname"));
      out.write("</option>\n");
      out.write("        ");
   
               }
           }catch(Exception e){

               System.out.println(e);

           }
        
      out.write("\n");
      out.write("   </select>\n");
      out.write("   </form>\n");
      out.write("   </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
