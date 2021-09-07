package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.fooddetails;
import model.getfoodsf;
import java.util.ArrayList;

public final class Alterfood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Alterfood.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg \">\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-links\">Tomato <span class=\"sr-only\"></span></a>\n");
      out.write("                        <li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link my\" href=\"\" id=\"");
      out.print(session.getAttribute("rid"));
      out.write("\" style=\"color:red\">");
      out.print(session.getAttribute("uname"));
      out.write("</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"button nav-link my\" href=\"index.jsp\">\n");
      out.write("                                <div class=\"logout\" style=\"color:red\">Logout</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"\" style=\"text-align: center\">\n");
      out.write("            <h1>");
      out.print(session.getAttribute("uname"));
      out.write("</h1>\n");
      out.write("            <h6>In partner with Tomato</h6>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper-d\">\n");
      out.write("            <div class=\"foodbody\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");

                        fooddetails food = new fooddetails(session);
                        ArrayList<getfoodsf> fooddetailslist = food.getfooddetails();
                        for (getfoodsf foods : fooddetailslist) {
                    
      out.write("\n");
      out.write("                    <div class=\"col-lg-6 card1\" data-target=\"#mymodal\" data-toggle=\"modal\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <div class=\"img-container\">\n");
      out.write("                                    <img class=\"w-100\" src=\"side-img1.webp\" alt=\"food\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8\">\n");
      out.write("                                <div id=\"");
      out.print( foods.getFood_id());
      out.write("\" class=\"f-id\" >");
      out.print( foods.getF_name());
      out.write("</div>\n");
      out.write("                                <div>RS ");
      out.print( foods.getCost());
      out.write("</div>\n");
      out.write("                                <div>Veg</div>\n");
      out.write("                                <div>");
      out.print( foods.getDescription());
      out.write("</div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"addfood btn btn-success btn-lg\" data-target=\"#mymodals\" data-toggle=\"modal\">\n");
      out.write("                    <a class=\"btn btn-success btn-lg\" name=\"submitbt\">Add Food</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("  <div class=\"modal fade\" id=\"mymodals\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("      <h5 class=\"modal-title\">ADD NEW FOOD</h5>\n");
      out.write("      <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("      </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form method=\"POST\" action=\"register\" name=\"add\">\n");
      out.write("              <div style=\"height: 0.7rem;\"></div>\n");
      out.write("              <div>\n");
      out.write("                  <input class=\"food_name\" type=\"text\" name=\"f_name\" placeholder=\"Food name\" autocomplete=\"off\">\n");
      out.write("              </div>\n");
      out.write("             <div style=\"height: 0.7rem;\"></div>\n");
      out.write("              <div>\n");
      out.write("            <select class=\"drdown food_name\" name=\"preferences\" id=\"CITY\" >\n");
      out.write("              <option value=\"\">Preference</option>\n");
      out.write("              <option value=\"V\">Veg</option>\n");
      out.write("              <option value=\"N\">Non-Veg</option> \n");
      out.write("            </select>\n");
      out.write("            </div>\n");
      out.write("             <div style=\"height: 0.7rem;\"></div>\n");
      out.write("              <div> \n");
      out.write("                  <input class=\"food_name\" type=\"number\" placeholder=\"cost\" name=\"cost\" autocomplete=\"off\">\n");
      out.write("              </div>\n");
      out.write("             <div style=\"height: 0.7rem;\"></div>\n");
      out.write("              <div>\n");
      out.write("                  <input class=\"food_name\" type=\"text\" name=\"desc\"  placeholder=\"Descrption\" autocomplete=\"off\">\n");
      out.write("              </div>\n");
      out.write("             <div style=\"height: 0.7rem;\"></div>\n");
      out.write("         \n");
      out.write("      \n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        \n");
      out.write("        <button type=\"submit\" name=\"confirmfood\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("      </div>\n");
      out.write("       </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write("        <div class=\"modal fade\" id=\"mymodal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">Food Details</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <table class=\"table table-borderless\">\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                            <div style=\"display:none\" class=\"f-id\"></div>\n");
      out.write("                            <th scope=\"row\"></th>\n");
      out.write("                            <td><b>Food name</b></td>\n");
      out.write("                            <td class=\"f-name\"></td>\n");
      out.write("                            <td><div class=\"svg1\"><img class=\"w-100\" src=\"assessts/edit.svg\" alt=\"\"></img></div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\"></th>\n");
      out.write("                                <td><b>Preferences</b></td>\n");
      out.write("                                <td class=\"preference\"></td>\n");
      out.write("                                <td><div class=\"svg1\"><img class=\"w-100\" src=\"assessts/edit.svg\" alt=\"\"></img></div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\"></th>\n");
      out.write("                                <td><b>Cost</b></td>\n");
      out.write("                                <td>RS <span class=\"cost\"></span></td>\n");
      out.write("                                <td><div class=\"svg1\"><img class=\"w-100\" src=\"assessts/edit.svg\" alt=\"\"></img></div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\"></th>\n");
      out.write("                                <td><b>Descrption</b></td>\n");
      out.write("                                <td class=\"description\"></td>\n");
      out.write("                                <td><div class=\"svg1\"><img class=\"w-100\" src=\"assessts/edit.svg\" alt=\"\"></img></div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <div class=\"btnsub\">\n");
      out.write("                                <a class=\"btn btn-danger\" name=\"deletebt\" href=\"deletefood?button=delete\">Delete</a>\n");
      out.write("                                <a class=\"btn btn-success\" name=\"submitbt\" href=\"deletefood?button=submit\">Submit</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("//                    $.noConflict();\n");
      out.write("                    $('.card1').click(function () {\n");
      out.write("                        var foodId = $(this).find('.f-id').attr('id');\n");
      out.write("                        $.get(\"modelfood?fId=\" + foodId + \"&resId=");
      out.print(session.getAttribute("rid"));
      out.write("\", function (responseJson) {\n");
      out.write("                            $.each(responseJson, function (key, value) {\n");
      out.write("                                $('.modal-dialog .' + key).text(value);\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $('.modal-dialog .btn-danger').click(function () {\n");
      out.write("                        var foodId = $(this).parentsUntil('.modal').find('.f-id').text();\n");
      out.write("                        $(this).attr('href', 'deletefood?button=delete&fId='+foodId);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
