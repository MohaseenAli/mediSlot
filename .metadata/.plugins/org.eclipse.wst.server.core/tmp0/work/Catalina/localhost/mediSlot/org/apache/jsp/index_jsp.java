/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-04-21 12:21:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>MediSlot</title>\r\n");
      out.write("<link href=\"assets/image/icon.png\" rel=\"icon\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" />\r\n");
      out.write("<style>\r\n");
      out.write("/* Custom CSS styles */\r\n");
      out.write("body {\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".outBanner {\r\n");
      out.write("	background-color: #2b92ff;\r\n");
      out.write("	height: 300px;\r\n");
      out.write("	clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 100%, 70% 95%, 23% 100%, 0 95%, 0 0\r\n");
      out.write("		);\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner {\r\n");
      out.write("	color: rgb(255, 255, 255);\r\n");
      out.write("	font-family: cursive;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("	background-color: #2b92ff;\r\n");
      out.write("	height: 55px;\r\n");
      out.write("	border-bottom: 2px solid #93c7ff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-brand {\r\n");
      out.write("	font-size: 35px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #ffffff !important;\r\n");
      out.write("	justify-content: left;\r\n");
      out.write("	align-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-nav .nav-link {\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	color: #ffffff !important;\r\n");
      out.write("	border: 1px solid rgb(242, 242, 242);\r\n");
      out.write("	border-radius: 0.6rem;\r\n");
      out.write("	padding: 0.2rem;\r\n");
      out.write("	margin: 1rem;\r\n");
      out.write("	transition: transform 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-nav .nav-link:hover {\r\n");
      out.write("	border-color: rgba(56, 75, 179, 0.5); /* Change border color on hover */\r\n");
      out.write("	transform: translateY(-3px); /* Move link up slightly */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".lead {\r\n");
      out.write("	font-size: 24px;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("	padding-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feature {\r\n");
      out.write("	background-color: #ffffff;\r\n");
      out.write("	padding: 20px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feature h2 {\r\n");
      out.write("	color: #007bff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feature p {\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("	line-height: 1.6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("	background-color: #2b92ff;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 20px 0;\r\n");
      out.write("	margin-top: auto; /* Push to bottom */\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("			<p class=\"navbar-brand\"\r\n");
      out.write("				style=\"font-family: cursive; margin-top: 16px\">MediSlot</p>\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"navbar-collapse\">\r\n");
      out.write("					<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("							href=\"patient_login.jsp\">Patient Login</a></li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("							href=\"doctor_login.jsp\">Doctor Login</a></li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"about.jsp\">About\r\n");
      out.write("								Us</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"outBanner\">\r\n");
      out.write("		<div class=\"banner\">\r\n");
      out.write("			<h1>Welcome to MediSlot</h1>\r\n");
      out.write("			<p class=\"lead\">Your trusted partner in healthcare</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"about\" class=\"feature\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-6\" style=\"padding-top: 8px\">\r\n");
      out.write("					<img src=\"assets/image/Index_image.jpg\" alt=\"Our Services\"\r\n");
      out.write("						class=\"img-fluid rounded\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-6\">\r\n");
      out.write("					<h2>Our Services</h2>\r\n");
      out.write("					<p style=\"text-align: justify\">Welcome to MediSlot, your\r\n");
      out.write("						premier destination for seamless healthcare access. At MediSlot,\r\n");
      out.write("						we pride ourselves on revolutionizing the way you book\r\n");
      out.write("						appointments with healthcare professionals. Our comprehensive\r\n");
      out.write("						suite of services encompasses everything you need for convenient\r\n");
      out.write("						and efficient healthcare management.With MediSlot, you can say\r\n");
      out.write("						goodbye to long wait times and tedious phone calls. Our intuitive\r\n");
      out.write("						platform allows you to browse a wide range of healthcare\r\n");
      out.write("						providers, specialties, and appointment slots, all from the\r\n");
      out.write("						comfort of your own home.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"services\" class=\"feature\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-6\" style=\"padding-top: 15px\">\r\n");
      out.write("					<h2>Appointment Booking</h2>\r\n");
      out.write("					<p style=\"text-align: justify\">At MediSlot, we believe that\r\n");
      out.write("						access to quality healthcare should be effortless. That's why\r\n");
      out.write("						we've developed a cutting-edge appointment booking feature that\r\n");
      out.write("						puts you in control of your healthcare journey. Gone are the days\r\n");
      out.write("						of waiting on hold or struggling to find a suitable appointment\r\n");
      out.write("						time. With our user-friendly interface, booking appointments is as\r\n");
      out.write("						easy as 1-2-3. Simply log in to your account, select your\r\n");
      out.write("						preferred healthcare provider, and choose from a range of\r\n");
      out.write("						available appointment slots that fit your schedule.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-6\">\r\n");
      out.write("					<img src=\"assets/image/index_image1.png\" alt=\"Appointment Booking\"\r\n");
      out.write("						class=\"img-fluid rounded\" />\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<div class=\"container\" style=\"display: flex; justify-content: center\">\r\n");
      out.write("			<span>&copy; 2024 MediSlot. All rights reserved.</span>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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