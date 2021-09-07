package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.acceptOrder;
import java.util.List;
import model.order;
import java.util.Map;
import model.orderDetails;

public final class restaurantfood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/restaurant.css\">\n");
      out.write("        <title>Restaurant</title>\n");
      out.write("        <style>\n");
      out.write("            .card, td{\n");
      out.write("                padding: .5rem 1rem !important;\n");
      out.write("            }\n");
      out.write("            .details{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-around;\n");
      out.write("            }\n");
      out.write("            .details div{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .details .btn-sm{\n");
      out.write("                max-width: 8%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            acceptOrder ord = new acceptOrder(request.getSession());
            String resReqstatus = ord.checkResStatus(Integer.parseInt(session.getAttribute("rid").toString()));
            if (resReqstatus == "accept") {
                orderDetails ordDet = new orderDetails(session);
                ordDet.getOrderDetails();
        
      out.write("\n");
      out.write("        <div class=\"first\">\n");
      out.write("            <div class=\"header\">     \n");
      out.write("                <nav class=\"navbar navbar-expand-lg \">\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n");
      out.write("                        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-links\">Tomato <span class=\"sr-only\"></span></a>\n");
      out.write("                            <li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"navbar-nav\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link my\" href=\"Alterfood.jsp?resId=");
      out.print(session.getAttribute("rid"));
      out.write("\" style=\"color:red\">Alter foods </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link nav-item sigcs\" style=\"color:red\" href=\"\" id='");
      out.print(session.getAttribute("uname"));
      out.write('\'');
      out.write('>');
      out.print(session.getAttribute("uname"));
      out.write("</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link nav-item\" style=\"color:red\" href=\"index_1.jsp\">Logout</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bodies\">\n");
      out.write("                <div class=\"body1\">\n");
      out.write("                    <h1 class=\"goess\">");
      out.print(session.getAttribute("uname"));
      out.write("</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"body2\">\n");
      out.write("                    <h1>Partner with Tomato</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body p-0\">\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <div class=\"o-id col-lg-1\">ID</div>\n");
      out.write("                        <div class=\"f-name col-lg-2\">Food</div>\n");
      out.write("                        <div class=\"qty col-lg-1\">Qty</div>\n");
      out.write("                        <div class=\"u-name col-lg-2\">Client</div>\n");
      out.write("                        <div class=\"mobile col-lg-2\">Mobile No</div>\n");
      out.write("                        <div class=\"address col-lg-2\">Address</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                orderDetails ordDetails = new orderDetails(session);
                Map<Integer, List<order>> map = (Map) ordDetails.getOrderDetails();
                for (Map.Entry<Integer, List<order>> o : map.entrySet()) {
            
      out.write("\n");
      out.write("            <div class=\"card\">\n");
      out.write("                ");

                    for (order o1 : o.getValue()) {
                
      out.write("\n");
      out.write("                <div class=\"card-body p-0\">\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <input id=\"oId\" hidden value=\"");
      out.print(o.getKey());
      out.write("\">\n");
      out.write("                        <div class=\"o-id col-lg-1\">");
      out.print( o.getKey());
      out.write("</div>\n");
      out.write("                        <div class=\"f-name col-lg-2\">");
      out.print( o1.getFoodName());
      out.write("</div>\n");
      out.write("                        <div class=\"qty col-lg-1\">");
      out.print( o1.getQty());
      out.write("</div>\n");
      out.write("                        <div class=\"u-name col-lg-2\">");
      out.print( o1.getuName());
      out.write("</div>\n");
      out.write("                        <div class=\"mobile col-lg-2\">");
      out.print(o1.getPhoneNumber());
      out.write("</div>\n");
      out.write("                        <div class=\"address col-lg-2\">");
      out.print(o1.getAddress());
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");

                    boolean status = ord.checkForDone(o.getKey());
                    if (status == true) {
                
      out.write("\n");
      out.write("                <button id=\"");
      out.print(o.getKey());
      out.write("\" class=\"btn btn-primary\">Accept</button>\n");
      out.write("                ");
} else {
      out.write("\n");
      out.write("                <button id=\"");
      out.print(o.getKey());
      out.write("\" class=\"btn btn-success\" disabled>Completed</button>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    $('button#");
      out.print(o.getKey());
      out.write("').click(function () {\n");
      out.write("                        var oId = $(this).parent().find('#oId').val();\n");
      out.write("                        window.location.href = 'orderAccept?oId=' + oId;\n");
      out.write("                    });\n");
      out.write("                </script>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");

        } else if (resReqstatus == "pending") {
        
      out.write("\n");
      out.write("        <h3>Your Request is not yet Accepted by Admin. Please Wait</h3>\n");
      out.write("\n");
      out.write("        <button type=\"button\" class=\"btn btn-success\"><a href=\"index_1.jsp\">Return To Main Page</a></button>\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("        <h3>Sorry Your Request is Rejected</h3>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
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
