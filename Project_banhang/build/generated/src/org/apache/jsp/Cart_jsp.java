package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"css/Cartcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"shopping-cart\">\r\n");
      out.write("                <div class=\"px-4 px-lg-0\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"pb-5\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-lg-12 p-5 bg-white rounded shadow-sm mb-5\">\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Shopping cart table -->\r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        <table class=\"table\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th scope=\"col\" class=\"border-0 bg-light\">\r\n");
      out.write("                                                        <div class=\"p-2 px-3 text-uppercase\">Sản Phẩm</div>\r\n");
      out.write("                                                    </th>\r\n");
      out.write("                                                    <th scope=\"col\" class=\"border-0 bg-light\">\r\n");
      out.write("                                                        <div class=\"py-2 text-uppercase\">Đơn Giá</div>\r\n");
      out.write("                                                    </th>\r\n");
      out.write("                                                    <th scope=\"col\" class=\"border-0 bg-light\">\r\n");
      out.write("                                                        <div class=\"py-2 text-uppercase\">Số Lượng</div>\r\n");
      out.write("                                                    </th>\r\n");
      out.write("                                                    <th scope=\"col\" class=\"border-0 bg-light\">\r\n");
      out.write("                                                        <div class=\"py-2 text-uppercase\">Xóa</div>\r\n");
      out.write("                                                    </th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                            \r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th scope=\"row\">\r\n");
      out.write("                                                        <div class=\"p-2\">\r\n");
      out.write("                                                            <img src=\"images/DacNhanTam.png\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\r\n");
      out.write("                                                            <div class=\"ml-3 d-inline-block align-middle\">\r\n");
      out.write("                                                                <h5 class=\"mb-0\"> <a href=\"#\" class=\"text-dark d-inline-block\">Đắc nhân tâm</a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </th>\r\n");
      out.write("                                                    <td class=\"align-middle\"><strong>100000<span>đ</span></strong></td>\r\n");
      out.write("                                                    <td class=\"align-middle\">\r\n");
      out.write("                                                        <form action=\"mainController\" method=\"post\">\r\n");
      out.write("                                                            <input type=\"hidden\" name=\"txtid\" value=\"\"> \r\n");
      out.write("                                                            <input class=\"quantity-num\" type=\"number\" value=\"1\" min=\"1\" max=\"10\" name=\"txtquantity\">\r\n");
      out.write("                                                            <input class=\"quantity-update\"type=\"submit\" value=\"Update\" name=\"action\"/>\r\n");
      out.write("                                                            \r\n");
      out.write("                                                        </form>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td class=\"align-middle\"><a href=\"#\" class=\"text-dark\">\r\n");
      out.write("                                                            <button type=\"button\" class=\"btn btn-danger\">Delete</button>\r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr> \r\n");
      out.write("                                            \r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- End -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row py-5 p-4 bg-white rounded shadow-sm\">\r\n");
      out.write("                            <div class=\"col-lg-6\">\r\n");
      out.write("                                <div class=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Thông tin giao hàng</div>\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    \r\n");
      out.write("                                        <from action=\"#\" method=\"post\" >\r\n");
      out.write("                                            <br/><input class=\"info_product-input\" type=\"text\" name=\"txtemail\" placeholder=\"Tên\" required=\"\"/>\r\n");
      out.write("                                            <br/><input class=\"info_product-input\" type=\"tel\" name=\"txtphone\" placeholder=\"Số ĐT\" required=\"\"/>\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                                <select class=\"info_product-select form-select form-select-sm mb-3\" id=\"city\" aria-label=\".form-select-sm\">\r\n");
      out.write("                                                <option value=\"\" selected>Chọn tỉnh thành</option>           \r\n");
      out.write("                                                </select>\r\n");
      out.write("\r\n");
      out.write("                                                <select class=\"info_product-select1 form-select form-select-sm mb-3\" id=\"district\" aria-label=\".form-select-sm\">\r\n");
      out.write("                                                <option value=\"\" selected>Chọn quận huyện</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("\r\n");
      out.write("                                                <select class=\"info_product-select2 form-select form-select-sm\" id=\"ward\" aria-label=\".form-select-sm\">\r\n");
      out.write("                                                <option  value=\"\" selected>Chọn phường xã</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                                 </div>    \r\n");
      out.write("                                            <input class=\"info_product-input\" type=\"text\" name=\"txtAddres\" placeholder=\"Địa chỉ\" required=\"\"/>\r\n");
      out.write("                                            <br/><input class=\"info_product-submit\" type=\"submit\" value=\"Lưu\" name=\"action\"/>\r\n");
      out.write("                                        </from>\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div><h6>Huynh pham</h6></div>\r\n");
      out.write("                                <div>Địa chỉ: <span>11 tran phu</span>,<span>phường 8</span>,<span>Quận 5</span>,<span>Hồ Chí Minh</span></div>\r\n");
      out.write("                                <div>Số ĐT: <span>0975099899</span></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-6\">\r\n");
      out.write("                                <div class=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Thành tiền</div>\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <ul class=\"list-unstyled mb-4\">\r\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Tổng tiền hàng</strong><strong>100000đ</strong></li>\r\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Phí vận chuyển</strong><strong>0đ</strong></li>\r\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">VAT</strong><strong>0đ</strong></li>\r\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Tổng thanh toán</strong>\r\n");
      out.write("                                            <h5 class=\"font-weight-bold\">100000đ</h5>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul><a href=\"#CartProduct\" class=\"btn btn-dark rounded-pill py-2 btn-block\">Mua hàng</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-profile modal-overlay\" id=\"CartProduct\">\r\n");
      out.write("            <a href=\"#\" class=\"overlay-close\"></a>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"modal_profile-body\">\r\n");
      out.write("                <a class=\"modal_close-btn\" href=\"#\">&times;</a>\r\n");
      out.write("                <div class=\"modal-childBody\">\r\n");
      out.write("                    <div class=\"modal-left\">\r\n");
      out.write("                        <div class=\"modal-delivery\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-pay\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-right\">\r\n");
      out.write("                        <div class=\"modal-address\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-order\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/axios/0.21.1/axios.min.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("        <script src=\"js/cartjs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
}