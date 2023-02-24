package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profileAcc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/profileAcc.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <aside>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("          <div class=\"user-logo\"><img src=\"userlogo.jpg\"\" /></div>\n");
      out.write("          <nav>\n");
      out.write("            <ul>\n");
      out.write("              <li class=\"selectedLink\" name=\"home\">Home</li>\n");
      out.write("              <li name=\"about\">About Me</li>\n");
      out.write("              <li name=\"resume\">Resume</li>\n");
      out.write("              <li name=\"contact\">Contact</li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("        </div>\n");
      out.write("      </aside>\n");
      out.write("      <main>\n");
      out.write("        <div class=\"card active home\" data-home>\n");
      out.write("          <div class=\"title\">Home Page</div>\n");
      out.write("          <div class=\"content\">Content Goes Here</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card about\" data-about>\n");
      out.write("          <div class=\"title\">About Me Page</div>\n");
      out.write("          <div class=\"content\">Content Goes Here</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card resume\" data-resume>\n");
      out.write("          <div class=\"title\">Resume Page</div>\n");
      out.write("          <div class=\"content\">Content Goes Here</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card contact\" data-contact>\n");
      out.write("          <div class=\"title\">Contact Page</div>\n");
      out.write("          <div class=\"content\">Content Goes Here</div>\n");
      out.write("        </div>\n");
      out.write("      </main>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("      const showMessage = () => {\n");
      out.write("        alert(\"Hello JavaScript\");\n");
      out.write("      };\n");
      out.write("    </script>\n");
      out.write("    <script src=\"js/profileAcc.js\" type=\"text/javascript\"></script>\n");
      out.write("  </body>\n");
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
