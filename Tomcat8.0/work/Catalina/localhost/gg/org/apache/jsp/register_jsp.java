/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.18
 * Generated at: 2019-04-11 14:41:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import webd4201.PatelR.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 String title = "Register"; 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/header1.jsp", Long.valueOf(1554990919178L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1551388460000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("webd4201.PatelR");
    _jspx_imports_packages.add("java.util");
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

      out.write("\r\n");
      out.write("   \t");
      out.write("\r\n");
      out.write("   \t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\"> \r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/webd4201.css\" /> \r\n");
      out.write("           ");
 Student aStudent = (Student)session.getAttribute("student"); 
      out.write("\r\n");
      out.write("           ");
 Mark aMark = (Mark)session.getAttribute("mark"); 
      out.write("\r\n");
      out.write("           ");
 String errors = (String)session.getAttribute("errors");
      out.write("\r\n");
      out.write("            ");
 String id = (String)session.getAttribute("id");
                if (id == null)
                  { id = " ";
                   }
      out.write("\r\n");
      out.write("            ");
 String firstname = (String)session.getAttribute("firstname");
                  if (firstname == null)
                  { firstname = " ";
                   }
      out.write("\r\n");
      out.write("            ");
 String lastname = (String)session.getAttribute("lastname");
                   if (lastname == null)
                  { lastname = " ";
                   }
      out.write("\r\n");
      out.write("            ");
 String email = (String)session.getAttribute("email");
                    if (email == null)
                  { email = " ";
                   }
      out.write("\r\n");
      out.write("            ");
 String programCode = (String)session.getAttribute("programCode");
                  if (programCode == null)
                  { programCode = " ";
                   }
      out.write("\r\n");
      out.write("            ");
 String programName = (String)session.getAttribute("programName");
                  if (programName == null)
                  { programName = " ";
                   }
      out.write("\r\n");
      out.write("           ");
 String User = (String)session.getAttribute("aUser"); 
                  if (User == null)
                  { User = " ";
                   }
      out.write("\r\n");
      out.write("           \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
 String message = (String)session.getAttribute("message");
    if(message == null)  //there was not message
    {
        message = "";  //prevents NullPointerExceptions
    }else
    {   //there was a message, but we have a copy
    session.removeAttribute("message");  
    //clean the message so it does not redisplay on a different page
    }
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <title>");
      out.print( title );
      out.write("</title>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"topnav\">\r\n");
 if(aStudent == null)
{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <a class=\"active\" href=\"./index.jsp\">Home</a>\r\n");
      out.write("   <a href=\"./login.jsp\">Login</a>\r\n");
      out.write("   <a href=\"./register.jsp\">Register</a>\r\n");
      out.write("  ");
 } else {
      out.write("\r\n");
      out.write("   <a href=\"./update.jsp\">Update</a>\r\n");
      out.write("   <a href=\"./Logout\">Logout</a>\r\n");
      out.write("    <a href=\"./changepassword.jsp\">ChangePassword</a>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \t\t");
session.invalidate();
      out.write("\r\n");
      out.write("   \t\t");
      out.print(message);
      out.write("\r\n");
      out.write("   \t\t");
      out.print(errors);
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t<div>\r\n");
      out.write("    \t<br/>\r\n");
      out.write("          <h1>Register page</h1>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div>\r\n");
      out.write("<h4 style=\"color:#ff0000;\"><?php echo $error; ?> </h4>\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" action=\"./Register\" >\r\n");
      out.write("\t<table border=\"0\" cellpadding=\"10\" style=\"margin-left:auto; margin-right:auto;background-color:#fafad2;\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><strong>Login ID</strong></td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"user_id\" value=\"");
      out.print(id);
      out.write("\"  size=\"12\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><strong>Password</strong></td>\r\n");
      out.write("\t\t<td><input type=\"password\" name=\"passwd\"  /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><strong>Confirm Password</strong></td>\r\n");
      out.write("\t\t<td><input type=\"password\" name=\"conf_passwd\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("\t\t<td><strong>First Name</strong></td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"FirstName\" value=\"");
      out.print(firstname);
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><strong>Last Name</strong></td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"LastName\" value=\"");
      out.print(lastname);
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><strong>Email Address</strong></td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"email_address\" value=\"");
      out.print(email);
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t   <tr>\r\n");
      out.write("    \t<td><strong>Enable</strong></td>\r\n");
      out.write("    \t<td>\r\n");
      out.write("    \t\t<select name=\"enable\">\r\n");
      out.write("\t\t\t  <option >TRUE</option>\r\n");
      out.write("           </select>\r\n");
      out.write("    \t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("    \t<td><strong>User Type</strong></td>\r\n");
      out.write("    \t<td>\r\n");
      out.write("    \t\t<select name=\"selelct\">\r\n");
      out.write("\t\t\t  <option >s</option>\r\n");
      out.write("           </select>\r\n");
      out.write("    \t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("\t\t<td><strong>ProgramCode</strong></td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"ProgramCode\"  value=\"");
      out.print(programCode);
      out.write("\" size=\"6\" ></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("    </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("\t\t<td><strong>ProgramName</strong></td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"ProgramName\" value=\"");
      out.print(programName);
      out.write("\"  size=\"30\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("    </tr>\r\n");
      out.write("     \r\n");
      out.write("      <tr>\r\n");
      out.write("    \t<td><strong>Programyear</strong></td>\r\n");
      out.write("    \t<td>\r\n");
      out.write("    \t\t<select name=\"Programyear\">\r\n");
      out.write("\t\t\t  <option >1</option>\r\n");
      out.write("\t\t\t  <option >2</option>\r\n");
      out.write("\t\t\t  <option >3</option>\r\n");
      out.write("           </select>\r\n");
      out.write("    \t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table border=\"0\" cellspacing=\"15\" style=\"margin-left:auto; margin-right:auto;\" >\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td><input type=\"submit\" value = \"Register\" /></td>\r\n");
      out.write("\t<td><input type=\"reset\" value = \"Clear\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("    <br />\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\t<p><a href=\"http://validator.w3.org/check?uri=referer\"><imgstyle=\"width:88px;height:31px;position:fixed;bottom: 10px;right:50px;\"src=\"http://www.w3.org/Icons/valid-xhtml10\" alt=\"Valid XHTML 1.0 Strict\" />\r\n");
      out.write("\t</a>\r\n");
      out.write("    </p>\r\n");
      out.write("    <span>&copy;");
      out.print( (Calendar.getInstance()).get(Calendar.YEAR) );
      out.write("\t\r\n");
      out.write("\t</span>\r\n");
      out.write("\t<div class=\"botomnav\">\r\n");
      out.write("\t   <a class=\"active\" href=\"./index.jsp\">Home</a>\r\n");
      out.write("\t   <a href=\"./login.jsp\">Login</a>\r\n");
      out.write("\t   <a href=\"./register.jsp\">Register</a>\r\n");
      out.write("\t   <a href=\"./update.jsp\">Update</a>\r\n");
      out.write("\t   <a href=\"./logout.jsp\">Logout</a>\r\n");
      out.write("\t   <a href=\"http://validator.w3.org/check?uri=referer\">\r\n");
      out.write("\t\t\t\t\t<img \tstyle=\"width:88px;\r\n");
      out.write("\t\t\t\t\t\t\t\theight:31px;\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://www.w3.org/Icons/valid-xhtml10\" \r\n");
      out.write("\t\t\t\t\t\t\talt=\"Valid XHTML 1.0 Strict\" />\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("  \t\t\t   \t<a href=\"http://jigsaw.w3.org/css-validator/check/referer\">\r\n");
      out.write("\t\t\t        \t<img \tstyle=\"width:88px;\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight:31px;\"\r\n");
      out.write("        \t\t\t    \t\tsrc=\"http://jigsaw.w3.org/css-validator/images/vcss\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Valid CSS!\" />\r\n");
      out.write("    \t\t\t</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("  ");
      out.write('\r');
      out.write('\n');
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
