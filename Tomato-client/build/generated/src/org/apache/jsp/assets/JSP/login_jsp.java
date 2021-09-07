package org.apache.jsp.assets.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"modal fade\" id=\"loginModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <section class=\"mh-wrapper\">\n");
      out.write("                    <h2 class=\"modal-title\" id=\"loginModalLabel\">Login</h2>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\" class=\"close-btn\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"#1C1C1C\" width=\"24\" height=\"24\" viewBox=\"0 0 20 20\" aria-labelledby=\"icon-svg-title- icon-svg-desc-\" role=\"img\" class=\"rbbb40-0 byLLrW\"><linearGradient id=\"ckfdyhhzr00c93b6h353wmd90\" x1=\"0\" x2=\"100%\" y1=\"0\" y2=\"0\"><stop offset=\"0\" stop-color=\"#1C1C1C\"></stop><stop offset=\"100%\" stop-color=\"#1C1C1C\"></stop></linearGradient><title id=\"icon-svg-title-\"></title><desc id=\"icon-svg-desc-\">It is an icon with title </desc><title>cross</title><path d=\"M11.42 10.42l3.54-3.54c0.38-0.4 0.38-1.040 0-1.42s-1.020-0.4-1.42 0l-3.54 3.54-3.54-3.54c-0.4-0.4-1.020-0.4-1.42 0s-0.38 1.020 0 1.42l3.54 3.54-3.54 3.54c-0.38 0.38-0.38 1.020 0 1.42 0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28l3.54-3.56 3.54 3.56c0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28c0.38-0.4 0.38-1.040 0-1.42l-3.54-3.54z\" fill=\"url(#ckfdyhhzr00c93b6h353wmd90)\"></path></svg>\n");
      out.write("                    </span>\n");
      out.write("                </button>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <section class=\"mb-wrapper login-form\">\n");
      out.write("                    <form method=\"POST\" action=\"register\" name=\"signin-form\" class=\"w-100\">\n");
      out.write("                        <div class=\"phno\" type=\"number\" inputmode=\"numeric\">\n");
      out.write("                            <div class=\"mail-inner\">\n");
      out.write("                                <input name=\"email\" class=\"phone-input\" type=\"text\" placeholder=\"Email\" autocomplete=\"off\">\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"height: 1rem;\"></div>\n");
      out.write("                            <div class=\"pass-inner\">\n");
      out.write("                                <input name=\"password\" class=\"phone-input\" type=\"text\" placeholder=\"Password\" autocomplete=\"off\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"signin-btn\">\n");
      out.write("                            <button name=\"signin\" type=\"submit\" class=\"btn btn-danger\">Sign in</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <section class=\"mb-wrapper login-unsuccess\">\n");
      out.write("                        <p class=\"error\">Email and Password does not match..</p>\n");
      out.write("                    </section>\n");
      out.write("<!--                    <div class=\"hr-text\">\n");
      out.write("                        <hr class=\"divider\">\n");
      out.write("                        <span>or</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"g-login\">\n");
      out.write("                        <div class=\"g-login-inner\">\n");
      out.write("                            <svg width=\"24\" height=\"24\" viewBox=\"0 0 22 22\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M4.87566 13.2946L4.10987 16.1534L1.31093 16.2126C0.474461 14.6611 0 12.886 0 10.9997C0 9.17565 0.443609 7.45552 1.22994 5.94092H1.23054L3.72238 6.39776L4.81396 8.87465C4.5855 9.54071 4.46097 10.2557 4.46097 10.9997C4.46106 11.8072 4.60732 12.5808 4.87566 13.2946Z\" fill=\"#FBBB00\"></path><path d=\"M21.8082 8.94507C21.9345 9.61048 22.0004 10.2977 22.0004 11C22.0004 11.7875 21.9176 12.5557 21.7598 13.2967C21.2243 15.8183 19.8252 18.0201 17.8869 19.5782L17.8863 19.5776L14.7477 19.4175L14.3035 16.6445C15.5896 15.8902 16.5947 14.7098 17.1242 13.2967H11.2422V8.94507H17.21H21.8082Z\" fill=\"#518EF8\"></path><path d=\"M17.8865 19.5778L17.8871 19.5784C16.002 21.0937 13.6073 22.0002 11.0006 22.0002C6.81152 22.0002 3.16945 19.6588 1.31152 16.2132L4.87625 13.2952C5.8052 15.7744 8.19679 17.5392 11.0006 17.5392C12.2057 17.5392 13.3348 17.2134 14.3036 16.6447L17.8865 19.5778Z\" fill=\"#28B446\"></path><path d=\"M18.0208 2.53241L14.4573 5.44981C13.4546 4.82307 12.2694 4.46102 10.9996 4.46102C8.13229 4.46102 5.69596 6.30682 4.81356 8.87494L1.23009 5.9412H1.22949C3.06022 2.41154 6.74823 0 10.9996 0C13.6686 0 16.1158 0.950726 18.0208 2.53241Z\" fill=\"#F14336\"></path></svg>\n");
      out.write("                            <span>Continue with Google</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mt-4\"></div>\n");
      out.write("                    <div class=\"f-login\">\n");
      out.write("                        <div class=\"f-login-inner\">\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M22.675 0h-21.35c-.732 0-1.325.593-1.325 1.325v21.351c0 .731.593 1.324 1.325 1.324h11.495v-9.294h-3.128v-3.622h3.128v-2.671c0-3.1 1.893-4.788 4.659-4.788 1.325 0 2.463.099 2.795.143v3.24l-1.918.001c-1.504 0-1.795.715-1.795 1.763v2.313h3.587l-.467 3.622h-3.12v9.293h6.116c.73 0 1.323-.593 1.323-1.325v-21.35c0-.732-.593-1.325-1.325-1.325z\" fill=\"#3b5998\"/></svg>\n");
      out.write("                            <span>Continue with Facebook</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("-->                </section>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <section class=\"mb-wrapper\">\n");
      out.write("                    <p>New to Tomato? <span class=\"pink-small-span\" type=\"button\" data-toggle=\"modal\" data-dismiss=\"modal\" data-target=\"#signupModal\">Create account</span></p>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
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
