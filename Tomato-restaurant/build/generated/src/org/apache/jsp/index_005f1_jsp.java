package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Assests/navBar.jsp");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=1098, initial-scale=1.0\">\r\n");
      out.write("    <title>Tomato</title>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.14.0/css/all.css\" integrity=\"sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style_1.css\">\r\n");
      out.write("    <!-- transform=\"matrix(1.7463 -0.5529 0.5362 1.3418 120.1196 265.1868)\" -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!--%\r\n");
      out.write("        response.setHeader(\"cache-control\", \"no-cache, no-store\");\r\n");
      out.write("        response.setHeader(\"pragma\", \"no-cache\");\r\n");
      out.write("        response.setHeader(\"Expires\", \"0\");\r\n");
      out.write("    %-->\r\n");
      out.write("        <!-- Login modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"loginModal\" role=\"dialog\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <section class=\"mh-wrapper\">\r\n");
      out.write("                            <h2 class=\"modal-title\" id=\"loginModalLabel\">Login</h2>\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\" class=\"close-btn\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"#1C1C1C\" width=\"24\" height=\"24\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\" class=\"rbbb40-0 byLLrW\"><linearGradient id=\"ckfdyhhzr00c93b6h353wmd90\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#1C1C1C\"></stop><stop offset=\"100%\" stop-color=\"#1C1C1C\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><title>cross</title><path d=\"M11.42 10.42l3.54-3.54c0.38-0.4 0.38-1.040 0-1.42s-1.020-0.4-1.42 0l-3.54 3.54-3.54-3.54c-0.4-0.4-1.020-0.4-1.42 0s-0.38 1.020 0 1.42l3.54 3.54-3.54 3.54c-0.38 0.38-0.38 1.020 0 1.42 0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28l3.54-3.56 3.54 3.56c0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28c0.38-0.4 0.38-1.040 0-1.42l-3.54-3.54z\" fill=\"url(#ckfdyhhzr00c93b6h353wmd90)\"></path></svg>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <section class=\"mb-wrapper login-form\">\r\n");
      out.write("                            <form id=\"modalsg\" method=\"POST\" action=\"register\" name=\"signin-form\" class=\"w-100\">\r\n");
      out.write("                                <div class=\"phno\" type=\"number\" inputmode=\"numeric\">\r\n");
      out.write("                                    <div class=\"mail-inner\">\r\n");
      out.write("                                        <input name=\"email\" id=\"email\" class=\"phone-input\" type=\"email\" placeholder=\"Email\" autocomplete=\"off\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div style=\"height: 1rem;\"></div>\r\n");
      out.write("                                    <div class=\"pass-inner\">\r\n");
      out.write("                                        <input name=\"password\" id=\"pd\" class=\"phone-input\" type=\"text\" placeholder=\"Password\" autocomplete=\"off\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"signin-btn\">\r\n");
      out.write("                                    <button name=\"signin\" id=\"submit1\" type=\"submit\" class=\"btn btn-danger\">Sign in</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                     </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <section class=\"mb-wrapper\">\r\n");
      out.write("                            <p>New to Tomato? <span class=\"pink-small-span\" type=\"button\" data-toggle=\"modal\" data-dismiss=\"modal\" data-target=\"#signupModal\">Create account</span></p>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Sign Up Modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"signupModal\" tabindex=\"-1\" aria-labelledby=\"signupModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <section class=\"mh-wrapper\">\r\n");
      out.write("                            <h2 class=\"modal-title\" id=\"loginModalLabel\">Signup</h2>\r\n");
      out.write("                            <button type=\"button\" class=\"close ml-auto\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\" class=\"close-btn\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"#1C1C1C\" width=\"24\" height=\"24\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\" class=\"rbbb40-0 byLLrW\"><linearGradient id=\"ckffaz1c7018x3b6hcvre3s9h\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#1C1C1C\"></stop><stop offset=\"100%\" stop-color=\"#1C1C1C\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><title>cross</title><path d=\"M11.42 10.42l3.54-3.54c0.38-0.4 0.38-1.040 0-1.42s-1.020-0.4-1.42 0l-3.54 3.54-3.54-3.54c-0.4-0.4-1.020-0.4-1.42 0s-0.38 1.020 0 1.42l3.54 3.54-3.54 3.54c-0.38 0.38-0.38 1.020 0 1.42 0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28l3.54-3.56 3.54 3.56c0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28c0.38-0.4 0.38-1.040 0-1.42l-3.54-3.54z\" fill=\"url(#ckffaz1c7018x3b6hcvre3s9h)\"></path></svg>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <section class=\"mb-wrapper rform\">\r\n");
      out.write("                            <form method=\"POST\" id=\"signinj\" action=\"register\" name=\"signup\">\r\n");
      out.write("                                <div class=\"fullname\" type=\"number\" inputmode=\"numeric\">\r\n");
      out.write("                                    <div style=\"height: 1rem;\"></div>\r\n");
      out.write("                                     <div class=\"fullname-inner\">\r\n");
      out.write("                                        <input class=\"mail-input\" id=\"name\" name=\"names\" type=\"text\" placeholder=\"Restaurant Name\" autocomplete=\"off\">       \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div style=\"height: 1rem;\"></div>\r\n");
      out.write("                                    <div class=\"fullname-inner\">\r\n");
      out.write("                                        <input name=\"emails\" id=\"mails\" class=\"mail-input\" id=\"mails\" type=\"email\" placeholder=\"Email\" autocomplete=\"off\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- <span id=\"email-err\"></span> -->\r\n");
      out.write("                                    <div style=\"height: 1rem;\"></div>\r\n");
      out.write("                                    <div class=\"pwd\">\r\n");
      out.write("                                        <input name=\"passwords\" id=\"pwds\" class=\"pass-input\" id=\"pwd1\" type=\"password\" placeholder=\"Password\" autocomplete=\"off\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- <span id=\"pass-err\"></span> -->\r\n");
      out.write("                                    <div style=\"height: 1rem;\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"terms-condition\">\r\n");
      out.write("                                    <label for=\"\" class=\"cb-wrapper\">\r\n");
      out.write("                                <input class=\"c-box\" type=\"checkbox\" aria-checked=\"false\">\r\n");
      out.write("                            </label>\r\n");
      out.write("                                    <span class=\"tc-text\">\r\n");
      out.write("                                I agree to Tomato's \r\n");
      out.write("                                <a href=\"\">Terms of Service</a>, <a href=\"\">Privacy Policy</a> and <a href=\"\">Content Policies</a>\r\n");
      out.write("                            </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"btn\">\r\n");
      out.write("                                    <input name=\"ressubmit\" id=\"create-acc-btn\" type=\"submit\" name=\"ressubmit\" class=\"btn btn-danger\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <p>Already have an account? <span class=\"pink-small-span\" type=\"button\" data-toggle=\"modal\" data-dismiss=\"modal\" data-target=\"#loginModal\">Login</span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Navigation Bar + heading + Search Bar -->\r\n");
      out.write("        <header>\r\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"navigation-bar\">\n");
      out.write("    <nav id=\"before-login\" class=\"navbar navbar-expand-sm\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a href=\"\" class=\"navbar-brand\">TOMATO</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" type=\"button\" data-toggle=\"modal\" data-target=\"#loginModal\" href=\"\">Login</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" type=\"button\" data-toggle=\"modal\" data-target=\"#signupModal\" href=\"\">Signup</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("            <div class=\"wrapper\">\r\n");
      out.write("                <div class=\"head\">\r\n");
      out.write("                    <div class=\"heading\">\r\n");
      out.write("                        <h1 class=\"text-uppercase\"><span class=\"text-danger\">Tom</span><span class=\"text-success\">ato</span></h1>\r\n");
      out.write("                        <h2>Discover the best food & drinks in <span>location</span></h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- Order Options \r\n");
      out.write("        <div class=\"body-container\">\r\n");
      out.write("            <section class=\"options-container\">\r\n");
      out.write("                <div class=\"options-wrapper\">\r\n");
      out.write("                    <div class=\"options order-food\">\r\n");
      out.write("                        <a class=\"opt-link\" href=\"Shops\">\r\n");
      out.write("                            <div class=\"image-container\">\r\n");
      out.write("                                <div class=\"image-wrapper\"></div>\r\n");
      out.write("                                <img src=\"images/ezgif.com-webp-to-png.png\" loading=\"lazy\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"image-title\">\r\n");
      out.write("                                <p class=\"title-text\">Order Food Online</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"options pro\">\r\n");
      out.write("                        <a class=\"opt-link\" href=\"\">\r\n");
      out.write("                            <div class=\"image-container\">\r\n");
      out.write("                                <div class=\"image-wrapper\"></div>\r\n");
      out.write("                                <img src=\"images/ezgif.com-webp-to-png (1).png\" loading=\"lazy\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"image-title\">\r\n");
      out.write("                                <p class=\"title-text\">Tomato Pro</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <section class=\"delivery-work\">\r\n");
      out.write("                <h1>How does Tomato&trade; Work?</h1>\r\n");
      out.write("                <div class=\"work-img-container\">\r\n");
      out.write("                    <img src=\"assets/SVG/howDeliveryWorks-final.svg\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <div class=\"subscribe-container\">\r\n");
      out.write("                <div class=\"left-container\">\r\n");
      out.write("                    <div class=\"title-container\">\r\n");
      out.write("                        <h4 class=\"title\">Special Offers & News</h4>\r\n");
      out.write("                        <p class=\"sub-title\">Subscribe now for news, promotions and more delivered right to your inbox</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input-container\">\r\n");
      out.write("                        <input class=\"sub-input\" type=\"email\" autocomplete=\"off\">\r\n");
      out.write("                        <button class=\"btn btn-sm btn-danger sub-btn\">Subscribe</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"right-container\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- footer -->\r\n");
      out.write("        <footer class=\"\">\r\n");
      out.write("            <div class=\"footer-container\">\r\n");
      out.write("                <section class=\"title\">\r\n");
      out.write("                    <h2 class=\"text-uppercase\">Tomato</h2>\r\n");
      out.write("                </section>\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div name=\"company\" class=\"content-inner\">\r\n");
      out.write("                        <h6 class=\"sub-title\">COMPANY</h6>\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Who we Are</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Report Fraud</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Contact</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div name=\"For Foodies\" class=\"content-inner\">\r\n");
      out.write("                        <h6 class=\"sub-title\">FOR FOODIES</h6>\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Code of Conduct</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Developers</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div name=\"For Restaurants\" class=\"content-inner\">\r\n");
      out.write("                        <h6 class=\"sub-title\">FOR RESTAURANTS</h6>\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Add Restaurant</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Claim your Listing</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div name=\"For You\" class=\"content-inner\">\r\n");
      out.write("                        <h6 class=\"sub-title\">FOR YOU</h6>\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Privacy</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Terms</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"\">\r\n");
      out.write("                                <p class=\"text\">Security</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div name=\"Social Links\" class=\"content-inner social-links\">\r\n");
      out.write("                        <h6 class=\"sub-title\">SOCIAL LINKS</h6>\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <a class=\"social-media\" href=\"\">\r\n");
      out.write("                                <svg class=\"social-icon\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"#1C1C1C\" width=\"22\" height=\"22\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\"><linearGradient id=\"ckfmh6i8pmj4f34pw7zi6901y\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#1C1C1C\"></stop><stop offset=\"100%\" stop-color=\"#1C1C1C\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><path d=\"M0 10C0 4.5 4.5 0 10 0C15.5 0 20 4.5 20 10C20 15.5 15.5 20 10 20C4.5 20 0 15.5 0 10ZM10.75 15.4375V10.1875H12.1875L12.375 8.375H10.75V7.5C10.75 7.0625 10.8125 6.8125 11.5 6.8125H12.375V5H10.9375C9.1875 5 8.625 5.875 8.625 7.3125V8.375H7.5V10.1875H8.5625V15.4375C8.5625 15.4375 10.75 15.4375 10.75 15.4375Z\" fill=\"url(#ckfmh6i8pmj4f34pw7zi6901y)\"></path></svg>\r\n");
      out.write("                                <p class=\"text\">Facebook</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a class=\"social-media\" href=\"\">\r\n");
      out.write("                                <svg class=\"social-icon\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"#1C1C1C\" width=\"22\" height=\"22\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\"><linearGradient id=\"ckfmh6i8qmj4h34pw26sa6ou4\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#1C1C1C\"></stop><stop offset=\"100%\" stop-color=\"#1C1C1C\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><path d=\"M0 10C0 4.5 4.5 0 10 0C15.5 0 20 4.5 20 10C20 15.5 15.5 20 10 20C4.5 20 0 15.5 0 10ZM10.0625 8.125V8.5L9.6875 8.4375C8.3125 8.25 7.125 7.6875 6.125 6.6875L5.625 6.1875L5.5 6.5625C5.25 7.375 5.375 8.25 5.9375 8.8125C6.25 9.125 6.1875 9.1875 5.6875 9C5.5 8.9375 5.375 8.875 5.3125 8.9375C5.25 9 5.4375 9.6875 5.5625 9.9375C5.75 10.3125 6.1875 10.6875 6.5625 10.875L6.9375 11.0625H6.5C6.0625 11.0625 6.0625 11.0625 6.125 11.25C6.3125 11.75 6.875 12.25 7.5625 12.5L8 12.6875L7.625 12.9375C7 13.3125 6.3125 13.5 5.625 13.5C5.3125 13.5 5 13.5625 5 13.5625C5 13.625 5.9375 14.0625 6.4375 14.25C8.0625 14.75 9.9375 14.5 11.375 13.6875C12.375 13.0625 13.375 11.875 13.875 10.75C14.125 10.125 14.375 9 14.375 8.5C14.375 8.1875 14.4375 8.125 14.8125 7.6875C15.0625 7.4375 15.3125 7.1875 15.3125 7.0625C15.375 6.9375 15.375 6.9375 15 7.0625C14.375 7.3125 14.25 7.25 14.625 6.875C14.875 6.625 15.125 6.1875 15.125 6.0625C15.125 6.0625 15 6.0625 14.875 6.125C14.75 6.1875 14.4375 6.3125 14.1875 6.375L13.8125 6.5L13.5 6.25C13.3125 6.125 13 5.9375 12.875 5.9375C12.5 5.8125 11.9375 5.8125 11.5625 6C10.5625 6.25 10 7.1875 10.0625 8.125Z\" fill=\"url(#ckfmh6i8qmj4h34pw26sa6ou4)\"></path></svg>\r\n");
      out.write("                                <p class=\"text\">Twitter</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a class=\"social-media\" href=\"\">\r\n");
      out.write("                                <svg class=\"social-icon\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"#1C1C1C\" width=\"22\" height=\"22\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\"><linearGradient id=\"ckfmh6i8qmj4j34pwdvpmefj8\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#1C1C1C\"></stop><stop offset=\"100%\" stop-color=\"#1C1C1C\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><path d=\"M0 10C0 4.5 4.5 0 10 0C15.5 0 20 4.5 20 10C20 15.5 15.5 20 10 20C4.5 20 0 15.5 0 10ZM10.1875 5C8.8125 5 8.625 5 8.0625 5C7.5 5.0625 7.125 5.125 6.8125 5.25C6.5 5.375 6.1875 5.5625 5.875 5.875C5.5625 6.1875 5.375 6.4375 5.25 6.8125C5.125 7.125 5 7.5 5 8.0625C5 8.625 5 8.75 5 10.1875C5 11.625 5 11.8125 5.0625 12.375C5.0625 12.9375 5.1875 13.3125 5.3125 13.625C5.4375 13.9375 5.625 14.25 5.9375 14.5625C6.1875 14.8125 6.5 15 6.875 15.1875C7.1875 15.3125 7.5625 15.4375 8.125 15.4375C8.6875 15.4375 8.875 15.5 10.25 15.5C11.6875 15.5 11.875 15.5 12.4375 15.4375C13 15.375 13.375 15.3125 13.6875 15.1875C14 15.0625 14.3125 14.875 14.625 14.5625C14.9375 14.25 15.125 14 15.25 13.625C15.375 13.3125 15.5 12.875 15.5 12.375C15.5625 11.8125 15.5625 11.625 15.5625 10.1875C15.5625 8.75 15.5625 8.625 15.5 8.0625C15.5 7.5 15.375 7.125 15.25 6.8125C15.125 6.4375 14.9375 6.1875 14.625 5.875C14.375 5.625 14.0625 5.4375 13.6875 5.25C13.375 5.125 12.9375 5.0625 12.4375 5C11.8125 5 11.625 5 10.1875 5ZM9.75 5.9375C9.875 5.9375 10.0625 5.9375 10.1875 5.9375C11.5625 5.9375 11.75 5.9375 12.3125 5.9375C12.8125 5.9375 13.0625 6.0625 13.25 6.125C13.5 6.25 13.6875 6.375 13.875 6.5C14.0625 6.625 14.1875 6.8125 14.25 7.125C14.3125 7.3125 14.4375 7.5625 14.4375 8.0625C14.5 8.625 14.5 8.8125 14.5 10.1875C14.5 11.5625 14.5 11.75 14.4375 12.3125C14.4375 12.8125 14.3125 13.125 14.25 13.3125C14.1875 13.5625 14.0625 13.6875 13.875 13.9375C13.6875 14.125 13.5 14.1875 13.25 14.3125C13.0625 14.375 12.8125 14.5 12.3125 14.5C11.75 14.5 11.5625 14.5625 10.1875 14.5625C8.8125 14.5625 8.625 14.5625 8.0625 14.5C7.5625 14.5 7.3125 14.375 7.125 14.3125C6.875 14.1875 6.6875 14.125 6.5 13.9375C6.3125 13.75 6.1875 13.5625 6.125 13.3125C6.0625 13.125 6 12.875 5.9375 12.3125C5.9375 11.75 5.9375 11.625 5.9375 10.1875C5.9375 8.8125 5.9375 8.625 5.9375 8.0625C6 7.5625 6.0625 7.3125 6.125 7.125C6.25 6.875 6.375 6.6875 6.5 6.5C6.625 6.3125 6.875 6.1875 7.125 6.125C7.3125 6.0625 7.5625 5.9375 8.0625 5.9375C8.5625 5.9375 8.75 5.9375 9.75 5.9375ZM13 6.8125C12.6875 6.8125 12.375 7.0625 12.375 7.4375C12.375 7.8125 12.625 8.0625 13 8.0625C13.375 8.0625 13.625 7.8125 13.625 7.4375C13.625 7.0625 13.3125 6.8125 13 6.8125ZM10.1875 7.5C8.75 7.5 7.5 8.6875 7.5 10.1875C7.5 11.6875 8.6875 12.875 10.1875 12.875C11.6875 12.875 12.875 11.6875 12.875 10.1875C12.875 8.6875 11.6875 7.5 10.1875 7.5ZM10.1875 8.4375C11.125 8.4375 11.9375 9.1875 11.9375 10.1875C11.9375 11.1875 11.1875 11.9375 10.1875 11.9375C9.25 11.9375 8.4375 11.1875 8.4375 10.1875C8.4375 9.1875 9.25 8.4375 10.1875 8.4375Z\" fill=\"url(#ckfmh6i8qmj4j34pwdvpmefj8)\"></path></svg>\r\n");
      out.write("                                <p class=\"text\">Instagram</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"copyright-container\">\r\n");
      out.write("                    <p>Copyright &copy; 2020 Tomato&trade; Pvt. Ltd. All rights reserved.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <!-- Scripts -->\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("<!--        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js\"></script>\r\n");
      out.write("        <script src=\"scripts/index.js\"></script>-->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   <script>\r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("      $(\"#modalsg\").validate({\r\n");
      out.write("          onSubmit:true,\r\n");
      out.write("          rules:{\r\n");
      out.write("            email:{\r\n");
      out.write("              required:true,\r\n");
      out.write("            },\r\n");
      out.write("            password:{\r\n");
      out.write("              required:true,\r\n");
      out.write("              minlength:8,\r\n");
      out.write("            }\r\n");
      out.write("          },\r\n");
      out.write("          messages:{\r\n");
      out.write("            email:{\r\n");
      out.write("              required:\"Please enter your id\",\r\n");
      out.write("            },\r\n");
      out.write("            password[:{\r\n");
      out.write("              required:\"Please enter your password\",\r\n");
      out.write("              minlength:\"enter atleast 8 Characters\",\r\n");
      out.write("            },\r\n");
      out.write("          },\r\n");
      out.write("          errorElement:\"div\",\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("  <script>\r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("      $(\"#signinj\").validate({\r\n");
      out.write("          onSubmit:true,\r\n");
      out.write("          rules:{\r\n");
      out.write("            names:{\r\n");
      out.write("              required:true,\r\n");
      out.write("            },\r\n");
      out.write("            emails:{\r\n");
      out.write("              required:true,  \r\n");
      out.write("            },\r\n");
      out.write("            passwords:{\r\n");
      out.write("                required:true,\r\n");
      out.write("                minlength:8,\r\n");
      out.write("            },\r\n");
      out.write("          },\r\n");
      out.write("          messages:{\r\n");
      out.write("              name:{\r\n");
      out.write("               required:\"enter the restaurant name\",    \r\n");
      out.write("              },\r\n");
      out.write("            emails:{\r\n");
      out.write("              required:\"Please enter your mail id\",\r\n");
      out.write("            },\r\n");
      out.write("            passwords :{\r\n");
      out.write("              required:\"Please enter your password\",\r\n");
      out.write("              minlength:\"enter atleast 8 Characters\",\r\n");
      out.write("            },\r\n");
      out.write("          },\r\n");
      out.write("          errorElement:\"div\",\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
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
