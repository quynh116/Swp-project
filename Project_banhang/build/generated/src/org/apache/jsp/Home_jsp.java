package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/homecss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!--        <script src=\"js/login.js\" type=\"text/javascript\"></script>-->\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--begin of menu-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <nav aria-label=\"breadcrumb\">\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Category</a></li>\n");
      out.write("                        </ol>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"card bg-light mb-3\">\n");
      out.write("                        <div style=\"font-size: 18px;font-weight: 450; \" class=\"card-header bg-primary text-white text-uppercase\"><i class=\"fa fa-list\"></i> DANH M???C</div>\n");
      out.write("                        <ul class=\"list-group category_block\">\n");
      out.write("                            <li class=\"list-group-item text-white\"><a href=\"#\">S??ch B??n Ch???y</a></li>\n");
      out.write("                            <li class=\"list-group-item text-white\"><a href=\"#\">S??ch M???i Nh???t</a></li>\n");
      out.write("                            <li class=\"list-group-item text-white\"><a href=\"#\">S??ch Thi???u Nhi</a></li>\n");
      out.write("                            <li class=\"list-group-item text-white\"><a href=\"#\">S??ch V??n H???c</a></li>\n");
      out.write("                            <li class=\"list-group-item text-white\"><a href=\"#\">S??ch K??? N??ng S???ng</a></li>\n");
      out.write("                            <li class=\"list-group-item text-white\"><a href=\"#\">S??ch B??n Ch???y</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card bg-light mb-3\">\n");
      out.write("                        <div class=\"card-header bg-success text-white text-uppercase text-center\">S??CH Y??U TH??CH NH???T</div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img style=\"\" class=\"img-fluid\" src=\"images/Rectangle 30.png\" />\n");
      out.write("                            <h5 class=\"card-title\">?????c Nh??n T??m </h5>\n");
      out.write("                            <p class=\"card-text\">How to win friends and Influence People c???a Dale Carnegie l?? \n");
      out.write("                                quy???n s??ch n???i ti???ng nh???t, b??n ch???y nh???t v?? c?? t???m ???nh h?????ng nh???t c???a m???i th???i ?????i.</p>\n");
      out.write("                            <p class=\"bloc_left_price\">100.000??</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">?????c Nh??n T??m</a></h4>\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000??</p>\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\n");
      out.write("                                            <div style=\"width: 50px;\" class=\"col\">\n");
      out.write("                                                \n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Th??m Gi??? H??ng</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">?????c Nh??n T??m</a></h4>\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000??</p>\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\n");
      out.write("                                            <div style=\"width: 50px;\" class=\"col\">\n");
      out.write("                                                \n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Th??m Gi??? H??ng</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">?????c Nh??n T??m</a></h4>\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000??</p>\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\n");
      out.write("                                            <div style=\"width: 50px;\" class=\"col\">\n");
      out.write("                                                \n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Th??m Gi??? H??ng</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">?????c Nh??n T??m</a></h4>\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000??</p>\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\n");
      out.write("                                            <div style=\"width: 50px;\" class=\"col\">\n");
      out.write("                                                \n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Th??m Gi??? H??ng</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">?????c Nh??n T??m</a></h4>\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000??</p>\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\n");
      out.write("                                            <div style=\"width: 50px;\" class=\"col\">\n");
      out.write("                                                \n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Th??m Gi??? H??ng</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">?????c Nh??n T??m</a></h4>\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000??</p>\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\n");
      out.write("                                            <div style=\"width: 50px;\" class=\"col\">\n");
      out.write("                                                \n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Th??m Gi??? H??ng</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                         \n");
      out.write("                    </div>\n");
      out.write("                    <button style=\"margin-left: 360px;\" onclick=\"loadMore()\" class=\"btn btn-primary\">Load more</button>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--Login-->\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <!-- Footer -->\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
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
