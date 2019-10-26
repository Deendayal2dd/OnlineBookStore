package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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


  String v1="",v2="";
  //fetch cookies
  Cookie ck[]=request.getCookies();
  if(ck!=null)
  {
    for(Cookie c:ck){
      String name=c.getName();
      if(name.equals("userid")){
          v1=c.getValue();
      }
      else if(name.equals("password")){
          v2=c.getValue();
      }
    }
  }  
 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>OnlineBookStore</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=big_wrapper>\n");
      out.write("       <header id=\"top_header\">\n");
      out.write("        <!--  <img src=\"images/header_books.gif\" width=\"30px\" align=\"left\"> -->\n");
      out.write("       \t  <h1>Online Book Store</h1>\n");
      out.write("       </header>\n");
      out.write("\n");
      out.write("       <nav id=\"top_menu\">\n");
      out.write("       \t <ul>\n");
      out.write("       \t \t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("       \t \t<li><a href=\"#\">Books</a></li>\n");
      out.write("       \t \t<li><a href=\"#\">About</a></li>\n");
      out.write("                <li><a href=\"#\">Contact</a></li>\n");
      out.write("       \t </ul>\n");
      out.write("       </nav>\n");
      out.write("\n");
      out.write("       <div id=\"new_div\">\n");
      out.write("\n");
      out.write("       <section id=\"main_section\">\n");
      out.write("         <img src=\"images/book3.jpg\" width=\"100%\">\n");
      out.write("\n");
      out.write("       </section>\n");
      out.write("\n");
      out.write("       <aside id=\"side_bar\">\n");
      out.write("       \t<div id=\"container\">\n");
      out.write("        <h3 align=\"center\">Login Form</h3>\n");
      out.write("        <form action=\"VerifyUser\" method=\"post\">\n");
      out.write("            <label for=\"username\">Username:</label>\n");
      out.write("            <input type=\"text\" id=\"username\" name=\"userid\" value=\"");
      out.print(v1);
      out.write("\">\n");
      out.write("            <label for=\"password\">Password:</label>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" value=\"");
      out.print(v2);
      out.write("\">\n");
      out.write("            <label for=\"usertype\">Usertype:</label>&nbsp     \n");
      out.write("            <select name=\"usertype\"><option>Admin</option><option>Customer</option></select>\n");
      out.write("\n");
      out.write("            <div id=\"lower\">\n");
      out.write("                <input type=\"checkbox\" name=\"remember\"><label class=\"check\" for=\"checkbox\">Remember me</label>\n");
      out.write("                <input type=\"submit\" value=\"Login\">\n");
      out.write("            </div><!--/ lower-->\n");
      out.write("        </form>\n");
      out.write("        <label>Create An Account! &nbsp<a href=\"registration.jsp\">New-user</a></label>\n");
      out.write("        </div>\n");
      out.write("       </aside>\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("       <footer id=\"main_footer\">\n");
      out.write("       \t @Deen 2019\n");
      out.write("       </footer>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
