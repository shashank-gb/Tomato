package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.registerModel;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/assets/JSP/navBar.jsp");
    _jspx_dependants.add("/assets/JSP/connection.jsp");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=1098, initial-scale=1.0\">\r\n");
      out.write("    <title>Tomato</title>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.14.0/css/all.css\" integrity=\"sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/style.css\">\r\n");
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
      out.write("                            <form method=\"POST\" action=\"register\" name=\"signin-form\" class=\"w-100\">\r\n");
      out.write("                                <div class=\"phno\" type=\"number\" inputmode=\"numeric\">\r\n");
      out.write("                                    <div class=\"mail-inner\">\r\n");
      out.write("                                        <input name=\"email\" class=\"phone-input\" type=\"text\" placeholder=\"Email\" autocomplete=\"off\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div style=\"height: 1rem;\"></div>\r\n");
      out.write("                                    <div class=\"pass-inner\">\r\n");
      out.write("                                        <input name=\"password\" class=\"phone-input\" type=\"text\" placeholder=\"Password\" autocomplete=\"off\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"signin-btn\">\r\n");
      out.write("                                    <button name=\"signin\" type=\"submit\" class=\"btn btn-danger\">Sign in</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <section class=\"mb-wrapper login-unsuccess\">\r\n");
      out.write("                                <p class=\"error\">Email and Password does not match..</p>\r\n");
      out.write("                            </section>\r\n");
      out.write("                            <div class=\"hr-text\">\r\n");
      out.write("                                <hr class=\"divider\">\r\n");
      out.write("                                <span>or</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"g-login\">\r\n");
      out.write("                                <div class=\"g-login-inner\">\r\n");
      out.write("                                    <svg width=\"24\" height=\"24\" viewBox=\"0 0 22 22\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M4.87566 13.2946L4.10987 16.1534L1.31093 16.2126C0.474461 14.6611 0 12.886 0 10.9997C0 9.17565 0.443609 7.45552 1.22994 5.94092H1.23054L3.72238 6.39776L4.81396 8.87465C4.5855 9.54071 4.46097 10.2557 4.46097 10.9997C4.46106 11.8072 4.60732 12.5808 4.87566 13.2946Z\" fill=\"#FBBB00\"></path><path d=\"M21.8082 8.94507C21.9345 9.61048 22.0004 10.2977 22.0004 11C22.0004 11.7875 21.9176 12.5557 21.7598 13.2967C21.2243 15.8183 19.8252 18.0201 17.8869 19.5782L17.8863 19.5776L14.7477 19.4175L14.3035 16.6445C15.5896 15.8902 16.5947 14.7098 17.1242 13.2967H11.2422V8.94507H17.21H21.8082Z\" fill=\"#518EF8\"></path><path d=\"M17.8865 19.5778L17.8871 19.5784C16.002 21.0937 13.6073 22.0002 11.0006 22.0002C6.81152 22.0002 3.16945 19.6588 1.31152 16.2132L4.87625 13.2952C5.8052 15.7744 8.19679 17.5392 11.0006 17.5392C12.2057 17.5392 13.3348 17.2134 14.3036 16.6447L17.8865 19.5778Z\" fill=\"#28B446\"></path><path d=\"M18.0208 2.53241L14.4573 5.44981C13.4546 4.82307 12.2694 4.46102 10.9996 4.46102C8.13229 4.46102 5.69596 6.30682 4.81356 8.87494L1.23009 5.9412H1.22949C3.06022 2.41154 6.74823 0 10.9996 0C13.6686 0 16.1158 0.950726 18.0208 2.53241Z\" fill=\"#F14336\"></path></svg>\r\n");
      out.write("                                    <span>Continue with Google</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mt-4\"></div>\r\n");
      out.write("                            <div class=\"f-login\">\r\n");
      out.write("                                <div class=\"f-login-inner\">\r\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M22.675 0h-21.35c-.732 0-1.325.593-1.325 1.325v21.351c0 .731.593 1.324 1.325 1.324h11.495v-9.294h-3.128v-3.622h3.128v-2.671c0-3.1 1.893-4.788 4.659-4.788 1.325 0 2.463.099 2.795.143v3.24l-1.918.001c-1.504 0-1.795.715-1.795 1.763v2.313h3.587l-.467 3.622h-3.12v9.293h6.116c.73 0 1.323-.593 1.323-1.325v-21.35c0-.732-.593-1.325-1.325-1.325z\" fill=\"#3b5998\"/></svg>\r\n");
      out.write("                                    <span>Continue with Facebook</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
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
      out.write("                            <form method=\"POST\" action=\"register\" name=\"signup\">\r\n");
      out.write("                                <div class=\"fullname\" type=\"number\" inputmode=\"numeric\">\r\n");
      out.write("                                    <div class=\"name-inner\">\r\n");
      out.write("                                        <input type=\"text\" name=\"uname\" class=\"name-input\" placeholder=\"Fullname\" autocomplete=\"off\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div style=\"height: 1rem;\"></div>\r\n");
      out.write("                                    <div class=\"fullname-inner\">\r\n");
      out.write("                                        <input name=\"email\" class=\"mail-input\" type=\"email\" placeholder=\"Email\" autocomplete=\"off\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- <span id=\"email-err\"></span> -->\r\n");
      out.write("                                    <div style=\"height: 1rem;\"></div>\r\n");
      out.write("                                    <div class=\"pwd\">\r\n");
      out.write("                                        <input name=\"password\" class=\"pass-input\" type=\"password\" placeholder=\"Password\" autocomplete=\"off\">\r\n");
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
      out.write("                                    <input id=\"create-acc-btn\" type=\"submit\" name=\"submit\" class=\"btn btn-danger\" disabled value=\"Create account\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <div class=\"hr-text\">\r\n");
      out.write("                                <hr class=\"divider\">\r\n");
      out.write("                                <span>or</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"g-login\">\r\n");
      out.write("                                <div class=\"g-login-inner\">\r\n");
      out.write("                                    <svg width=\"24\" height=\"24\" viewBox=\"0 0 22 22\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M4.87566 13.2946L4.10987 16.1534L1.31093 16.2126C0.474461 14.6611 0 12.886 0 10.9997C0 9.17565 0.443609 7.45552 1.22994 5.94092H1.23054L3.72238 6.39776L4.81396 8.87465C4.5855 9.54071 4.46097 10.2557 4.46097 10.9997C4.46106 11.8072 4.60732 12.5808 4.87566 13.2946Z\" fill=\"#FBBB00\"></path><path d=\"M21.8082 8.94507C21.9345 9.61048 22.0004 10.2977 22.0004 11C22.0004 11.7875 21.9176 12.5557 21.7598 13.2967C21.2243 15.8183 19.8252 18.0201 17.8869 19.5782L17.8863 19.5776L14.7477 19.4175L14.3035 16.6445C15.5896 15.8902 16.5947 14.7098 17.1242 13.2967H11.2422V8.94507H17.21H21.8082Z\" fill=\"#518EF8\"></path><path d=\"M17.8865 19.5778L17.8871 19.5784C16.002 21.0937 13.6073 22.0002 11.0006 22.0002C6.81152 22.0002 3.16945 19.6588 1.31152 16.2132L4.87625 13.2952C5.8052 15.7744 8.19679 17.5392 11.0006 17.5392C12.2057 17.5392 13.3348 17.2134 14.3036 16.6447L17.8865 19.5778Z\" fill=\"#28B446\"></path><path d=\"M18.0208 2.53241L14.4573 5.44981C13.4546 4.82307 12.2694 4.46102 10.9996 4.46102C8.13229 4.46102 5.69596 6.30682 4.81356 8.87494L1.23009 5.9412H1.22949C3.06022 2.41154 6.74823 0 10.9996 0C13.6686 0 16.1158 0.950726 18.0208 2.53241Z\" fill=\"#F14336\"></path></svg>\r\n");
      out.write("                                    <span>Continue with Google</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mt-4\"></div>\r\n");
      out.write("                            <div class=\"f-login\">\r\n");
      out.write("                                <div class=\"f-login-inner\">\r\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M22.675 0h-21.35c-.732 0-1.325.593-1.325 1.325v21.351c0 .731.593 1.324 1.325 1.324h11.495v-9.294h-3.128v-3.622h3.128v-2.671c0-3.1 1.893-4.788 4.659-4.788 1.325 0 2.463.099 2.795.143v3.24l-1.918.001c-1.504 0-1.795.715-1.795 1.763v2.313h3.587l-.467 3.622h-3.12v9.293h6.116c.73 0 1.323-.593 1.323-1.325v-21.35c0-.732-.593-1.325-1.325-1.325z\" fill=\"#3b5998\"/></svg>\r\n");
      out.write("                                    <span>Continue with Facebook</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"mb-wrapper rform-success\">\r\n");
      out.write("                            <p>Successfully Registered</p>\r\n");
      out.write("                            <span>Click here to <span class=\"pink-small-span\" type=\"button\" data-toggle=\"modal\" data-dismiss=\"modal\" data-target=\"#loginModal\">Login</span></span>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"mb-wrapper rform-unsuccess\">\r\n");
      out.write("                            <p>Registration Failed</p>\r\n");
      out.write("                            <p>Try After Some time...</p>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"mb-wrapper rform-existed\">\r\n");
      out.write("                            <p>Email or username is already taken...</p>\r\n");
      out.write("                            <span>Click here to <span class=\"pink-small-span\" type=\"button\" data-toggle=\"modal\" data-dismiss=\"modal\" data-target=\"#loginModal\">Login</span></span>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <p>Already have an account? <span class=\"pink-small-span\" type=\"button\">Login</span></p>\r\n");
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
      out.write("    <nav id=\"after-login\" class=\"navbar navbar-expand-sm\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a href=\"\" class=\"nav-link navbar-brand\">TOMATO</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <div class=\"login-status-container\">\n");
      out.write("                    <div class=\"login-img\">\n");
      out.write("                        <img class=\"user-profile\" src=\"images/profile.webp\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <span class=\"username\"> ");
      out.print( session.getAttribute("uname") );
      out.write(" </span>\n");
      out.write("                    <i class=\"drop-down-icon\" size=\"18\" color=\"#FFFFFF\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"#FFFFFF\" width=\"18\" height=\"18\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\" class=\"rbbb40-0 ZGPg\"><linearGradient id=\"ckfuv0gb7306k2xny0hrl10an\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#FFFFFF\"></stop><stop offset=\"100%\" stop-color=\"#FFFFFF\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><title>chevron-down</title><path d=\"M4.48 7.38c0.28-0.28 0.76-0.28 1.060 0l4.46 4.48 4.48-4.48c0.28-0.28 0.76-0.28 1.060 0s0.28 0.78 0 1.060l-5 5c-0.3 0.3-0.78 0.3-1.060 0l-5-5c-0.3-0.28-0.3-0.76 0-1.060z\" fill=\"url(#ckfuv0gb7306k2xny0hrl10an)\"></path></svg>\n");
      out.write("                </i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"user-options\">\n");
      out.write("                    <div class=\"profile opt\">\n");
      out.write("                        <a class=\"opt-inner\" href=\"\">Profile</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Order-history opt\">\n");
      out.write("                        <a class=\"opt-inner\" href=\"\">Order History</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"Logout opt\">\n");
      out.write("                        <a class=\"opt-inner\" href=\"logout\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
      out.write("                    <div class=\"search-bar\">\r\n");
      out.write("                        <div class=\"search-inner\">\r\n");
      out.write("                            <div class=\"custom-dropdown\">\r\n");
      out.write("                                <i class=\"location-mark\">\r\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"#F57082\" width=\"20\" height=\"20\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\" class=\"rbbb40-0 kIxlGM\"><linearGradient id=\"ckfco2tsd008c3b6086g2ez9v\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#F57082\"></stop><stop offset=\"100%\" stop-color=\"#F57082\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><title>location-fill</title><path d=\"M10.2 0.42c-4.5 0-8.2 3.7-8.2 8.3 0 6.2 7.5 11.3 7.8 11.6 0.2 0.1 0.3 0.1 0.4 0.1s0.3 0 0.4-0.1c0.3-0.2 7.8-5.3 7.8-11.6 0.1-4.6-3.6-8.3-8.2-8.3zM10.2 11.42c-1.7 0-3-1.3-3-3s1.3-3 3-3c1.7 0 3 1.3 3 3s-1.3 3-3 3z\" fill=\"url(#ckfco2tsd008c3b6086g2ez9v)\"></path></svg>\r\n");
      out.write("                                </i>\r\n");
      out.write("                                <input class=\"location-input\" name='selectedLoc' type=\"text\" placeholder=\"Location\">\r\n");
      out.write("                                <i class=\"down-triangle toggle-down\">\r\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"#4F4F4F\" width=\"12\" height=\"12\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\" class=\"rbbb40-0 fQZfgq\"><linearGradient id=\"ckfcqt1f000pd3b60pyata5y6\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#4F4F4F\"></stop><stop offset=\"100%\" stop-color=\"#4F4F4F\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><title>down-triangle</title><path d=\"M20 5.42l-10 10-10-10h20z\" fill=\"url(#ckfcqt1f000pd3b60pyata5y6)\"></path></svg>\r\n");
      out.write("                                </i>\r\n");
      out.write("                                \r\n");
      out.write("                                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    try{
        
        String dbname = "tomato";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/";
        
        Connection con = null;
        PreparedStatement ps= null;
        ResultSet rs = null;
        Statement st = null;

        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url+dbname, username , password);
  
        st = con.createStatement();

      out.write('\n');
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"dropdown-options found\">\r\n");
      out.write("                                    ");

                                        st = con.createStatement();
                                        
                                        String locQuery = "SELECT city FROM location GROUP BY city";
                                        
                                        rs = st.executeQuery(locQuery);
                                        
                                        while(rs.next()){
                                    
      out.write("\r\n");
      out.write("                                    <div class=\"opt\">\r\n");
      out.write("                                        <span class=\"opt-inner\">");
      out.print(rs.getString("city"));
      out.write("</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                            \r\n");
      out.write("                                    ");
  }  
                                    }catch(Exception e){
                                        System.out.println(e);
                                    }
                                    
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"dropdown-options not-found\">\r\n");
      out.write("                                    <div class=\"opt\">\r\n");
      out.write("                                        <span class=\"opt-inner\">Oops! No matches</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"vertical-hr\"></div>\r\n");
      out.write("                            <div class=\"custom-search\">\r\n");
      out.write("                                <input class=\"search-input\" type=\"text\" placeholder=\"Search for restaurant, cuisine or a dish\">\r\n");
      out.write("                                <div class=\"search-icon-container\">\r\n");
      out.write("                                    <i class=\"search-icon\">\r\n");
      out.write("                                        <svg class=\"s-icon\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"#828282\" width=\"18\" height=\"18\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\" class=\"rbbb40-0 ZGPg\"><linearGradient id=\"ckfcqt1f200pk3b600mbaxvok\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#828282\"></stop><stop offset=\"100%\" stop-color=\"#828282\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><title>Search</title><path d=\"M19.78 19.12l-3.88-3.9c1.28-1.6 2.080-3.6 2.080-5.8 0-5-3.98-9-8.98-9s-9 4-9 9c0 5 4 9 9 9 2.2 0 4.2-0.8 5.8-2.1l3.88 3.9c0.1 0.1 0.3 0.2 0.5 0.2s0.4-0.1 0.5-0.2c0.4-0.3 0.4-0.8 0.1-1.1zM1.5 9.42c0-4.1 3.4-7.5 7.5-7.5s7.48 3.4 7.48 7.5-3.38 7.5-7.48 7.5c-4.1 0-7.5-3.4-7.5-7.5z\" fill=\"url(#ckfcqt1f200pk3b600mbaxvok)\"></path></svg>\r\n");
      out.write("                                    </i>\r\n");
      out.write("                                    <div class=\"restaurant-options\">\r\n");
      out.write("                                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    try{
        
        String dbname = "tomato";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/";
        
        Connection con = null;
        PreparedStatement ps= null;
        ResultSet rs = null;
        Statement st = null;

        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url+dbname, username , password);
  
        st = con.createStatement();

      out.write('\n');
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("                                    ");

                                        st = con.createStatement();
                                        
                                        String locQuery = "SELECT rname, city FROM restaurant INNER JOIN location ON restaurant.l_id = location.l_id and city = '"+"';";
                                        
                                        rs = st.executeQuery(locQuery);
                                        
                                        while(rs.next()){
                                    
      out.write("\r\n");
      out.write("                                        <div class=\"opt\">\r\n");
      out.write("                                            <span class=\"opt-inner\">");
      out.print(rs.getString("rname"));
      out.write(',');
      out.write(' ');
      out.print(rs.getString("city"));
      out.write("</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    ");
  }  
                                    }catch(Exception e){
                                        System.out.println(e);
                                    }
                                    
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- Order Options -->\r\n");
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
      out.write("        \r\n");
      out.write("        <!--<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>-->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            \r\n");
      out.write("            $(window).on('load', function() {\r\n");
      out.write("\r\n");
      out.write("                    $('.rform-success').hide();\r\n");
      out.write("                    $('.rform-unsuccess').hide();\r\n");
      out.write("                    $('.rform-existed').hide();\r\n");
      out.write("                    $('#after-login').hide();\r\n");
      out.write("                    $('.login-unsuccess').hide();\r\n");
      out.write("\r\n");
      out.write("                ");
 if(request.getAttribute("regStatus") == registerModel.Status.success) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    $('#signupModal').modal('show');\r\n");
      out.write("                    $('.rform').hide();\r\n");
      out.write("                    $('#signupModal .modal-footer').hide();\r\n");
      out.write("                    $('.rform-success').show();\r\n");
      out.write("\r\n");
      out.write("                ");
 }else if(request.getAttribute("regStatus") == registerModel.Status.existed){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    $('#signupModal').modal('show');\r\n");
      out.write("                    $('.rform').hide();\r\n");
      out.write("                    $('#signupModal .modal-footer').hide();\r\n");
      out.write("                    $('.rform-existed').show();\r\n");
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
 if(request.getAttribute("loginStatus") == registerModel.Status.success) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    $('#before-login').hide();\r\n");
      out.write("                    $('#after-login').show();\r\n");
      out.write("\r\n");
      out.write("                ");
 }else if(request.getAttribute("loginStatus") == registerModel.Status.failure){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    $('#loginModal').modal('show');\r\n");
      out.write("                    $('.login-unsuccess').show();\r\n");
      out.write("                    $('.phone-input').addClass('error');\r\n");
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"scripts/index.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"scripts/jquery.validate.js\"></script>\r\n");
      out.write("        <script src=\"scripts/validation.js\"></script>\r\n");
      out.write("        \r\n");
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
