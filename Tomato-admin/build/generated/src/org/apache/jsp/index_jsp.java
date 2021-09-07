package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.loginChecker.Status;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/assets/JSP/navBar.jsp");
  }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Tomato - Admin</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/navBar.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"root\">\r\n");
      out.write("            ");
      out.write("\n");
      out.write("<header class=\"navbar\">\n");
      out.write("    <h1 class=\"text-uppercase\"><a class=\"nav-link p-0\" href=\"index.jsp\">Tomato</a></h1>\n");
      out.write("    <div class=\"profile\">\n");
      out.write("        <div class=\"profile-photo\">\n");
      out.write("            <img src=\"images/1.png\" alt=\"image\">\n");
      out.write("        </div>\n");
      out.write("        <span id=\"");
      out.print( session.getAttribute("adminId"));
      out.write("\" class=\"admin\">");
      out.print( session.getAttribute("adminName"));
      out.write("</span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"options-container\">\n");
      out.write("        <div class=\"opt profile\">Profile</div>\n");
      out.write("        <div class=\"opt logout\">Logout</div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("\n");
      out.write("        $('.options-container').hide();\n");
      out.write("        $('.profile').click(function () {\n");
      out.write("\n");
      out.write("            $('.options-container').slideToggle(300);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(document).on('click', function (ev) {\n");
      out.write("\n");
      out.write("            var $optionsTrigger = $('.profile');\n");
      out.write("            if ($optionsTrigger !== ev.target && !$optionsTrigger.has(ev.target).length)\n");
      out.write("                $('.options-container').hide();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.logout').click(function () {\n");
      out.write("            window.location.href = 'logout';\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("            <div class=\"row wrapper\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <h2 class=\"\">Sign in</h2>\r\n");
      out.write("                    <div class=\"form-container\">\r\n");
      out.write("                        <form name=\"signin\" action=\"checkLogin\" method=\"POST\" class=\"form-group\">\r\n");
      out.write("                            <div class=\"email-container\">\r\n");
      out.write("                                Email/Tomato username\r\n");
      out.write("                                <input name=\"username\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                <div class=\"err-msg\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"password-container\">\r\n");
      out.write("                                Password\r\n");
      out.write("                                <input name=\"password\" type=\"\" class=\"form-control\">\r\n");
      out.write("                                <div class=\"err-msg\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"error-container\">\r\n");
      out.write("                                <p class=\"error\">Email and Password doesn't Match!!</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" name=\"login\" onclick=\"\" class=\"btn btn-danger login-btn\">Login</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <footer class=\"sticky-footer\">\r\n");
      out.write("                <p class=\"copyright\">Copyright &copy; 2020 Tomato&trade; Pvt. Ltd. All rights reserved.</p>\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <!-- Scripts -->\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(window).on('load', function () {\r\n");
      out.write("\r\n");
      out.write("            $('.profile').hide();\r\n");
      out.write("            $('.error-container').hide();\r\n");
      out.write("        ");
 if ((request.getAttribute("loginStatus") == Status.success)) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("            $('.profile').show();\r\n");
      out.write("        ");
 } else if (request.getAttribute("loginStatus") == Status.failure){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            $('.profile').hide();\r\n");
      out.write("            $('.error-container').show();\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Validation -->\r\n");
      out.write("    <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $(\"form[name = 'signin']\").validate({\r\n");
      out.write("                    rules: {\r\n");
      out.write("                        username: {\r\n");
      out.write("                            required: true,\r\n");
      out.write("                            email: true\r\n");
      out.write("                        },\r\n");
      out.write("                        password: {\r\n");
      out.write("                            required: true\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    messages: {\r\n");
      out.write("                        username: {\r\n");
      out.write("                            required: \"Username Should not be empty!!\"\r\n");
      out.write("                        },\r\n");
      out.write("                        password: {\r\n");
      out.write("                            required: \"Password Should not be empty!!\"\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    errorElement: 'div'\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $.validator.addMethod(\"alpha\", function (value, element) {\r\n");
      out.write("                    return this.optional(element) || /^[a-zA-Z_]+$/.test(value);\r\n");
      out.write("                }, \"Numbers and special characters are not allowed!!\");\r\n");
      out.write("            });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
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
