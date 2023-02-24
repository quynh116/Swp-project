package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.14.0/css/all.css\" integrity=\"sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc\" crossorigin=\"anonymous\">\r\n");
      out.write("         <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("         <link href=\"css/detail.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <div class=\"card bg-light mb-3\">\r\n");
      out.write("                            <div class=\"card-header bg-primary text-white text-uppercase\"><i class=\"fa fa-list\"></i> Categories</div>\r\n");
      out.write("                            <ul class=\"list-group category_block\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card bg-light mb-3\">\r\n");
      out.write("                        <div class=\"card-header bg-success text-white text-uppercase\">Last product</div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                            <h5 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("                            <p class=\"card-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            <p class=\"bloc_left_price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" $</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-9\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"card-detail\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                \r\n");
      out.write("                                <div class = \"product-imgs col-sm-5\">\r\n");
      out.write("                                    <div class = \"img-display\">\r\n");
      out.write("                                      <div class = \"img-showcase\">\r\n");
      out.write("                                        <img src = \"images/Rectangle 30.png\" alt = \"book image\">\r\n");
      out.write("                                        <img src = \"images/dacnhantam1.png\" alt = \"book image\">\r\n");
      out.write("                                        <img src = \"images/Rectangle 30.png\" alt = \"book image\">\r\n");
      out.write("                                        <img src = \"images/Rectangle 30.png\" alt = \"book image\">\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class = \"img-select\">\r\n");
      out.write("                                      <div class = \"img-item\">\r\n");
      out.write("                                        <a href = \"#\" data-id = \"1\">\r\n");
      out.write("                                          <img src = \"images/DacNhanTam.png\" alt = \"book image\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                      <div class = \"img-item\">\r\n");
      out.write("                                        <a href = \"#\" data-id = \"2\">\r\n");
      out.write("                                            <img src = \"images/dacnhantam1-1.png\" alt = \"shoe image\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                      <div class = \"img-item\">\r\n");
      out.write("                                        <a href = \"#\" data-id = \"3\">\r\n");
      out.write("                                          <img src = \"images/DacNhanTam.png\" alt = \"book image\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                      <div class = \"img-item\">\r\n");
      out.write("                                        <a href = \"#\" data-id = \"4\">\r\n");
      out.write("                                          <img src = \"images/DacNhanTam.png\" alt = \"book image\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <aside class=\"col-sm-7\">\r\n");
      out.write("                                    <article class=\"card-body p-5\">\r\n");
      out.write("                                        <h3 class=\"title mb-3\">Đắc Nhân Tâm</h3>\r\n");
      out.write("                                        <div>Nhà cung cấp: <span class=\"card-span\">First New</span></div>\r\n");
      out.write("                                        <div>Nhà xuất bản: <span class=\"card-span\">NXB Tổng Hợp TPHCM</span></div>\r\n");
      out.write("                                        <div>Tác giả: <span class=\"card-span\">Dale Carnegie</span></div>\r\n");
      out.write("                                        \r\n");
      out.write("<!--                                        <div class=\"Product-rating\">\r\n");
      out.write("                                            <i class=\"fa-icons fa-light fa-star\"></i>\r\n");
      out.write("                                            <i class=\"fa fa-light fa-star\"></i>\r\n");
      out.write("                                            <i class=\"fa fa-light fa-star\"></i>\r\n");
      out.write("                                            <i class=\"fa fa-light fa-star\"></i>\r\n");
      out.write("                                            <i class=\"fa fa-light fa-star\"></i>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <span>(4)</span>\r\n");
      out.write("                                        </div>-->\r\n");
      out.write("                                        <p class=\"price-detail\"> \r\n");
      out.write("                                            <span class=\"price- \"> \r\n");
      out.write("                                                <span class=\"\">100000</span><span class=\"\">đ</span>\r\n");
      out.write("                                            </span> \r\n");
      out.write("                                            <!--<span>/per kg</span>--> \r\n");
      out.write("                                        </p> <!-- price-detail-wrap .// -->\r\n");
      out.write("                                        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <hr>\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-sm-5\">\r\n");
      out.write("                                                <dl class=\"param param-inline\">\r\n");
      out.write("                                                    <dt>Quantity: </dt>\r\n");
      out.write("                                                    <dd>\r\n");
      out.write("                                                        <select class=\"form-control form-control-sm\" style=\"width:70px;\">\r\n");
      out.write("                                                            <option> 1 </option>\r\n");
      out.write("                                                            <option> 2 </option>\r\n");
      out.write("                                                            <option> 3 </option>\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    </dd>\r\n");
      out.write("                                                </dl>  <!-- item-property .// -->\r\n");
      out.write("                                            </div> <!-- col.// -->\r\n");
      out.write("                                            \r\n");
      out.write("                                        </div> <!-- row.// -->\r\n");
      out.write("                                        <hr>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn-price btn btn-lg btn-outline-primary text-uppercase\"> Buy now </a>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-outline-primary text-uppercase\"> <i class=\"fas fa-shopping-cart\"></i> Add to cart </a>\r\n");
      out.write("                                    </article> <!-- card-body.// -->\r\n");
      out.write("                                </aside> <!-- col.// -->\r\n");
      out.write("                            </div> <!-- row.// -->\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                        </div> <!-- card.// -->\r\n");
      out.write("                        <div class=\"title-sanpham\">\r\n");
      out.write("                            <h3>Sản phẩm liên quan</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\r\n");
      out.write("                                <div class=\"card \">\r\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\r\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\r\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">Đắc Nhân Tâm</a></h4>\r\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000đ</p>\r\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\r\n");
      out.write("                                            <div style=\"width: 50px;padding-right: 5px;\" class=\"col\">\r\n");
      out.write("                                                \r\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\r\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Thêm Giỏ Hàng</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\r\n");
      out.write("                                <div class=\"card \">\r\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\r\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\r\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">Đắc Nhân Tâm</a></h4>\r\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000đ</p>\r\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\r\n");
      out.write("                                            <div style=\"width: 50px;padding-right: 5px;\" class=\"col\">\r\n");
      out.write("                                                \r\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\r\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Thêm Giỏ Hàng</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div style=\"margin-bottom: 20px\" class=\"col-12 col-md-6 col-lg-4\">\r\n");
      out.write("                                <div class=\"card \">\r\n");
      out.write("                                    <img style=\" width: 180px;height: 220px;margin-left: 35px;margin-top: 5px;\"  class=\"card-img-top\" src=\"images/Rectangle 30.png\" alt=\"Card image cap\">\r\n");
      out.write("                                    <div style=\"margin-top: -15px;\" class=\"card-body\">\r\n");
      out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">Đắc Nhân Tâm</a></h4>\r\n");
      out.write("                                        <p style=\"color: red; font-size: 18px; font-weight: 500;margin-top: -10px;\" class=\"card-text show_txt\">100.000đ</p>\r\n");
      out.write("                                        <div style=\"margin-top: -10px;\" class=\"row\">\r\n");
      out.write("                                            <div style=\"width: 50px;padding-right: 5px;\" class=\"col\">\r\n");
      out.write("                                                \r\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-danger btn-block \">Mua Ngay</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div style=\"width: 100%; margin-left: -15px;\" class=\"col\">\r\n");
      out.write("                                                <a style=\"font-size: 13px;\" href=\"#\" class=\"btn btn-success btn-block\">Thêm Giỏ Hàng</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/detail.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ALLCate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <li class=\"list-group-item text-white\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
