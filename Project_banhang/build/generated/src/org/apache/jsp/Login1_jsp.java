package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/logincss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("        .highlight {\n");
      out.write("          background-color: lightblue;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            <div class=\"container-login\">\n");
      out.write("\n");
      out.write("                <div class=\"form-login\">\n");
      out.write("                    <form id=\"signup\" action=\"mainController\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"header\">\n");
      out.write("                        <h3 style=\"text-align: center;\">Login</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sep\"></div>\n");
      out.write("                    <div class=\"inputs\">\n");
      out.write("                        <br/><input type=\"text\" name=\"txtemail\" placeholder=\"email\" required=\"\"/>\n");
      out.write("                        <br/><input type=\"password\" name=\"txtpassword\" placeholder=\"password\" required=\"\"/>\n");
      out.write("                        <div class=\"login-container\">\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <span class=\"login-remeber\" id=\"text\"></span>ghi nhớ\n");
      out.write("                            <a class=\"login-fogot\" href=\"#\">Quên mật khẩu</a>\n");
      out.write("                        </div>\n");
      out.write("                        <br/><input type=\"submit\" value=\"Login\" name=\"action\"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("        <script>\n");
      out.write("        const text = document.getElementById(\"text\");\n");
      out.write("        text.addEventListener(\"click\", function() {\n");
      out.write("          text.classList.toggle(\"highlight\");\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
