/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.18
 * Generated at: 2019-02-24 20:47:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Welcome to Bradshaw Marina</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<h1><em><font color=\"red\">Welcome to Bradshaw Marina</font></em></h1>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<img src = \"images/smallimage1.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage2.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage3.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage4.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage5.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage6.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage7.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage8.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage9.gif\">\r\n");
      out.write("\t<img src = \"images/smallimage10.gif\">\r\n");
      out.write("\t<hr></center>\r\n");
      out.write("\t<p>Bradshaw Marina is located on Clinton Lake in the rolling hills of\r\n");
      out.write("\tcentral Missouri.  Because construction near its shores is restricted\r\n");
      out.write("\tby the U.S. Army Corps of Engineers, Clinton Lake provides an ideal\r\n");
      out.write("\tnatural wildlife habitat as well as a beautiful, park-like setting for\r\n");
      out.write("\tboaters. Bradshaw Marina has slips to accommodate up to 450 sailboats\r\n");
      out.write("\tand 150 powerboats. </p>\r\n");
      out.write("\t<strong>Bradshaw Marina provides:</strong><br>\r\n");
      out.write("\t<table align=\"center\" cellspacing=\"5\" cellpadding=\"3\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><li>\r\n");
      out.write("\t\t\tDocks with electrical service only\r\n");
      out.write("\t\t</li></td>\r\n");
      out.write("\t\t<td><li>\r\n");
      out.write("\t\t\tDocks with both electrical service and water\r\n");
      out.write("\t\t</li></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><li>\r\n");
      out.write("\t\t\tCovered slips (all of which have electricity)\r\n");
      out.write("\t\t</li></td>\r\n");
      out.write("\t\t<td><li>\r\n");
      out.write("\t\t\tAnnual leases, with monthly or yearly payment options\r\n");
      out.write("\t\t</li></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<center><br>If you are a Bradshaw Marina customer, please log in.\r\n");
      out.write("\t<table align=\"center\" bgcolor=\"lightgoldenrodyellow\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"100\" align=\"Center\">\r\n");
      out.write("\t\t\t<a href=\"login.jsp\">\r\n");
      out.write("\t\t\t<strong><font size=\"+1\">Log In</font></strong></a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
