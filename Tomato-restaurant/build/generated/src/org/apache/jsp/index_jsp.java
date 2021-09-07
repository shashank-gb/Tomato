package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <html>\n");
      out.write("    \n");
      out.write("        <title>Tomato</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" ></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fontawesome.com/how-to-use/customizing-wordpress/snippets/setup-cdn-webfont\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       <div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" aria-labelledby=\"loginModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <section class=\"mh-wrapper\">\n");
      out.write("            <h2 class=\"modal-title\" id=\"loginModalLabel\">Login</h2>\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\" class=\"close-btn\">\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"#1C1C1C\" width=\"24\" height=\"24\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\" class=\"rbbb40-0 byLLrW\">\n");
      out.write("                  <linearGradient id=\"ckfdyhhzr00c93b6h353wmd90\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\">\n");
      out.write("                    <stop offset=\"0\" stop-color=\"#1C1C1C\"></stop>\n");
      out.write("                    <stop offset=\"100%\" stop-color=\"#1C1C1C\"></stop>\n");
      out.write("                  </linearGradient>\n");
      out.write("                  <title id=\"icon-svg-title-\"></title>\n");
      out.write("                  <desc id=\"icon-svg-desc-\">It is an icon with title </desc>\n");
      out.write("                  <title>cross</title>\n");
      out.write("                  <path\n");
      out.write("                    d=\"M11.42 10.42l3.54-3.54c0.38-0.4 0.38-1.040 0-1.42s-1.020-0.4-1.42 0l-3.54 3.54-3.54-3.54c-0.4-0.4-1.020-0.4-1.42 0s-0.38 1.020 0 1.42l3.54 3.54-3.54 3.54c-0.38 0.38-0.38 1.020 0 1.42 0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28l3.54-3.56 3.54 3.56c0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28c0.38-0.4 0.38-1.040 0-1.42l-3.54-3.54z\"\n");
      out.write("                    fill=\"url(#ckfdyhhzr00c93b6h353wmd90)\"></path>\n");
      out.write("                </svg>\n");
      out.write("              </span>\n");
      out.write("            </button>\n");
      out.write("          </section>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <section class=\"mb-wrapper\">\n");
      out.write("            <form id=\"modal-p\" action=\"register\" method=\"post\">\n");
      out.write("            <div class=\"phno\" type=\"number\" inputmode=\"numeric\">\n");
      out.write("              <div class=\"phno-inner\" id=\"go\">\n");
      out.write("              <input class=\"phone-input\" id=\"email\" name=\"email\" type=\"email\" placeholder=\"email\" autocomplete=\"off\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"phno pw\" type=\"text\" inputmode=\"numeric\">\n");
      out.write("              <div class=\"phno-inner\">\n");
      out.write("                <input class=\"phone-input\" type=\"text\" id=\"pd\" name=\"pd\" placeholder=\"Password\" autocomplete=\"off\">\n");
      out.write("                 <span style=\"display: block\"toggle=\"#password-field\" class=\"fa fa-fw fa-eye field-icon toggle-password\"></span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"otp-btn\">\n");
      out.write("              <button type=\"submit\" name=\"deliverylogin\" class=\"btn btn-danger\" style=\"margin-top:7px\">Submit</button>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("          </section>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <nav class=\" navbar navbar-dark\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <h3 style=\"font-size:3rem\">Tomato</h3>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"sigcs\" type=\"button\" data-toggle=\"modal\" data-target=\"#loginModal\" href=\"\">Login</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("  <div class=\"earn\">\n");
      out.write("    <div class=\"earnw\">\n");
      out.write("      <h3>Earn Weekly</h3>\n");
      out.write("      <p>join from home with us and start delivering today.</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-lg-4\">\n");
      out.write("      <div>\n");
      out.write("        <h2 style=\"color:black; padding:10px; text-decoration:underline; text-decoration-color:#CB202D\">Benefits</h2>\n");
      out.write("      </div>\n");
      out.write("      <div style=\"padding-bottom:10px;\">\n");
      out.write("        <img src=\"Assests/weekly_payments (1).svg\" style=\"padding-bottom:12px;\">\n");
      out.write("        <div class=\"wekpay\" style=\"line-height:0.3;\">\n");
      out.write("          <p><b>Weekly Payments</b></p>\n");
      out.write("          <p>Weekly payout and high incentives</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"working\" style=\"padding-bottom:10px;\">\n");
      out.write("        <img src=\"Assests/flexible_hours.svg\" style=\"padding-bottom:12px;\">\n");
      out.write("        <div style=\"line-height:0.3;\">\n");
      out.write("          <p>\n");
      out.write("            <b>Rewards</b></p>\n");
      out.write("          <p>\n");
      out.write("            Exciting performance-related rewards\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"insurance\" style=\"padding-bottom:10px;\">\n");
      out.write("        <img src=\"Assests/insurance.svg\" style=\"padding-bottom:12px;\">\n");
      out.write("        <div style=\"line-height:0.3;\">\n");
      out.write("          <p><b>insurance Coverage</b>\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            Feel safe with our accidental and medical insurance\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"mdcnt col-lg-4\" style=\"width:500px; height:300px;\">\n");
      out.write("      <span></span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4\">\n");
      out.write("      <div class=\"container-sm\">\n");
      out.write("        <h3 style=\"color:red; padding-bottom:10px;\">Join us...!</h3>\n");
      out.write("\n");
      out.write("        <form id=\"formlg\" action=\"register\" method=\"post\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" placeholder=\"NAME\" id=\"name\"name=\"name\" />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input type=\"email\" placeholder=\"Email\" id=\"email1\" name=\"email1\" />\n");
      out.write("          </div>\n");
      out.write("           <div class=\"form-group\"> \n");
      out.write("              \n");
      out.write("                <input type=\"text\" placeholder=\"Password\" class=\"pw1\" id=\"pw1\" name=\"pw1\"/>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("          <div>\n");
      out.write("            <select class=\"drdown\" name=\"CITY\" id=\"CITY\" >\n");
      out.write("              <option value=\"\">City</option>\n");
      out.write("              <option value=\"Davangere\">Davangere</option>\n");
      out.write("              <option value=\"Harihar\">Harihar</option>\n");
      out.write("              <option value=\"Banglore\">Banglore</option>\n");
      out.write("              <option value=\"Shivamooga\">Shivamooga</option>\n");
      out.write("            </select>\n");
      out.write("          </div>\n");
      out.write("          <div>\n");
      out.write("            <select class=\"drdown goes\" name=\"Vehicle\" id=\"vehicle\">\n");
      out.write("              <option value=\"\">Vehicle</option>\n");
      out.write("              <option value=\"bike\">BIKE</option>\n");
      out.write("              <option value=\"cycle\">CYCLE</option>\n");
      out.write("              <option value=\"ecycle\">ECYCLE</option>\n");
      out.write("            </select>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"check\" style=\"margin-left:10px;margin-right:10px; padding:10px 0;\">\n");
      out.write("            <input type=\"checkbox\" id=\"vehicle1\" name=\"vehicle\" value=\"Bike\">\n");
      out.write("            <span class=\"col-xs-10\" for=\"confirm_permission\"> Email can be used further purposes.</span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"bt1\">\n");
      out.write("            <div class>\n");
      out.write("              <button type=\"submit\" name=\"apply\" disabled id=\"myButton\" class=\"btn btn-light btn-lg\" style=\"color:#CB202D;\">Apply Now</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <footer>\n");
      out.write("    <div class=\"footers\">\n");
      out.write("      <div class=\"row m-0\">\n");
      out.write("        <div class=\"col-lg-3\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3\">\n");
      out.write("          <h4 style=\"padding:10px;\">Company</h1>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("              <li><a href=\"#\">About us</a></li>\n");
      out.write("              <li><a href=\"#\">Team</a></li>\n");
      out.write("              <li><a href=\"#\">Careers</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-lg-3\">\n");
      out.write("          <h4 style=\"padding:10px;\">Contact</h1>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("              <li><a href=\"#\">FAQ</a></li>\n");
      out.write("              <li><a href=\"#\">Help & Support </a></li>\n");
      out.write("              <li><a href=\"#\">Partner With us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <hr style=\"height:1px;background-color:#fff;width:75%;\">\n");
      out.write("    <p style=\"text-align:center\">tomato@2020</p>\n");
      out.write("  </footer>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("  $(document).ready(function(){\n");
      out.write("      alert(\"here\");\n");
      out.write("     $('#vehicle1').click(function() {\n");
      out.write("      if($(this).is(':checked')){\n");
      out.write("        $('#myButton').attr('disabled', false);\n");
      out.write("      }else{\n");
      out.write("        $('#myButton').attr('disabled', true);\n");
      out.write("      }\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  $(\"#formlg\").validate({\n");
      out.write("      onSubmit:true,\n");
      out.write("      rules: {\n");
      out.write("        name: {\n");
      out.write("          required: true,\n");
      out.write("          minlength: 3,\n");
      out.write("        },\n");
      out.write("        email1: {\n");
      out.write("          required: true,\n");
      out.write("         \n");
      out.write("        },\n");
      out.write("        CITY:{\n");
      out.write("          required: true,\n");
      out.write("        },\n");
      out.write("        Vehicle:{\n");
      out.write("            required:true,\n");
      out.write("        },\n");
      out.write("        pw1:{\n");
      out.write("              required:true,\n");
      out.write("              minlength:8,\n");
      out.write("            },\n");
      out.write("\n");
      out.write("      },\n");
      out.write("      messages: {\n");
      out.write("        name: {\n");
      out.write("          required: \"Please enter your name\",\n");
      out.write("          minlength: \"enter a valid name\",\n");
      out.write("        },\n");
      out.write("        email1: {\n");
      out.write("          required: \"enter your email id\",\n");
      out.write("        \n");
      out.write("        },\n");
      out.write("        CITY:{\n");
      out.write("          required:\"please select your place\",\n");
      out.write("        },\n");
      out.write("        Vehicle:{\n");
      out.write("          required:\"please select your vehicle\",\n");
      out.write("        },\n");
      out.write("        pd:{\n");
      out.write("              required:\"Please enter your password\",\n");
      out.write("              minlength:\"enter atleast 8 Characters\",\n");
      out.write("            },\n");
      out.write("\n");
      out.write("      },\n");
      out.write("      errorElement:\"div\",\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("  </script>\n");
      out.write("  <script>\n");
      out.write("   $(document).ready(function(){\n");
      out.write("      $(\"#modal-p\").validate({\n");
      out.write("          onSubmit:true,\n");
      out.write("          rules:{\n");
      out.write("            email:{\n");
      out.write("              required:true,\n");
      out.write("            },\n");
      out.write("            pd:{\n");
      out.write("              required:true,\n");
      out.write("              minlength:8,\n");
      out.write("            },\n");
      out.write("          },\n");
      out.write("          messages:{\n");
      out.write("            email:{\n");
      out.write("              required:\"Please enter your id\",\n");
      out.write("            },\n");
      out.write("            pd:{\n");
      out.write("              required:\"Please enter your password\",\n");
      out.write("              minlength:\"enter atleast 8 Characters\",\n");
      out.write("            },\n");
      out.write("          },\n");
      out.write("          errorElement:\"div\",\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write(" ");
 if (request.getAttribute("status") != null) {
      out.write("\n");
      out.write("        <div id=\"msg\">  ");
      out.print( request.getAttribute("status"));
      out.write("</div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
