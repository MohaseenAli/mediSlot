/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-04-21 12:59:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class doctor_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>MediSlot</title>\r\n");
      out.write("<link href=\"assets/image/icon.png\" rel=\"icon\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<!-- Font Awesome for eye icon -->\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	background-color: #eaf0f6; /* Light blue background */\r\n");
      out.write("	padding-top: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container {\r\n");
      out.write("	max-width: 400px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("	background-color: rgba(255, 255, 255, 0.8);\r\n");
      out.write("	/* Semi-transparent white form background */\r\n");
      out.write("	padding: 40px;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container h2 {\r\n");
      out.write("	color: #007bff; /* Blue header text */\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container .form-group label {\r\n");
      out.write("	color: #007bff; /* Blue label text */\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container .btn-primary {\r\n");
      out.write("	background-color: #007bff; /* Blue button background */\r\n");
      out.write("	border-color: #007bff;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	transition: background-color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container .btn-primary:hover {\r\n");
      out.write("	background-color: #0056b3; /* Darker blue on hover */\r\n");
      out.write("	border-color: #0056b3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-link {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-link a {\r\n");
      out.write("	color: #007bff; /* Blue login link text */\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	transition: color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-link a:hover {\r\n");
      out.write("	color: #0056b3; /* Darker blue on hover */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"form-container\">\r\n");
      out.write("			<h2>Doctor Login</h2>\r\n");
      out.write("			");

			String error = (String) session.getAttribute("loginError");
			if (error != null) {
			
      out.write("\r\n");
      out.write("			<p style=\"color: red; display: flex; justify-content: center\">");
      out.print(error);
      out.write("</p>\r\n");
      out.write("			");

			session.removeAttribute("loginError");
			}
			
      out.write("\r\n");
      out.write("			<form method=post action=\"doctorLogin\">\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<label for=\"phone\">Phone Number</label> <input type=\"tel\"\r\n");
      out.write("						class=\"form-control\" id=\"phone\" name=\"phone\" pattern=\"[1-9]{1}[0-9]{9}\"\r\n");
      out.write("						placeholder=\"Enter your phone number (10 digits)\" required />\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("                    <label for=\"password\">Password</label>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" pattern=\".{5,}\" placeholder=\"Enter your password (min. 6 characters)\" required />\r\n");
      out.write("                        <div class=\"input-group-append\">\r\n");
      out.write("                            <span class=\"input-group-text\" id=\"togglePassword\">\r\n");
      out.write("                                <i class=\"fa fa-eye-slash\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-primary btn-block\">\r\n");
      out.write("					Login</button>\r\n");
      out.write("			</form>\r\n");
      out.write("			<div class=\"login-link\">\r\n");
      out.write("				<p>\r\n");
      out.write("					Don't have an account? <a href=\"doctor_regestration.jsp\">Register\r\n");
      out.write("						here</a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<!-- JavaScript to toggle password visibility -->\r\n");
      out.write("    <script>\r\n");
      out.write("        const togglePassword = document.querySelector('#togglePassword');\r\n");
      out.write("        const password = document.querySelector('#password');\r\n");
      out.write("\r\n");
      out.write("        togglePassword.addEventListener('click', function (e) {\r\n");
      out.write("            // toggle the type attribute\r\n");
      out.write("            const type = password.getAttribute('type') === 'password' ? 'text' : 'password';\r\n");
      out.write("            password.setAttribute('type', type);\r\n");
      out.write("            // toggle the eye slash icon\r\n");
      out.write("            this.querySelector('i').classList.toggle('fa-eye-slash');\r\n");
      out.write("            this.querySelector('i').classList.toggle('fa-eye');\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
