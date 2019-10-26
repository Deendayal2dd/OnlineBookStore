import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BookList extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String subject=request.getParameter("subject");
        
        Cookie c1=new Cookie("pref",subject);
        c1.setMaxAge(60*60*24*7);
        response.addCookie(c1);
        
        try{
            Connection con=mypkg.Data.connect();
            String qr="select bcode,title from book where subject=?";
            PreparedStatement ps=con.prepareStatement(qr);
            ps.setString(1, subject);
            ResultSet rs=ps.executeQuery();
            out.println("<html lang=en>");
            out.println("<head><title>OnlineBookStore</title><link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\"></head>");
            out.println("<body>");
            out.println("<div id=big_wrapper>");
            out.println("<header id=top_header>");
       	    out.println("<h1>Online Book Store</h1>");
            out.println("</header>");

           out.println("<nav id=top_menu>");
       	   out.println("<ul>");
       	   out.println("<li><a href=index.jsp>Home</a></li>");
       	   out.println("<li><a href=#>Books</a></li>");
           out.println("<li><a href=#>About</a></li>");
           out.println("<li><a href=#>Contact</a></li>");
       	   out.println("</ul>");
           out.println("</nav>");

           out.println("<div id=new_div>");

           out.println("<section id=main_section>");
           
           out.println("<h3>Select Book</h3>");
            //out.println("<hr>");
            while(rs.next()){
                String s1=rs.getString(1);
                String s2=rs.getString(2);
                out.println("<a href=BookDetails?id="+s1+">");
                out.println(s2);
                out.println("</a>");
                out.println("<br>");
                
            }
            out.println("<br>");
            out.println("<h2 align=left><a href=SubjectPage>Go-Back</a></h2>");
            out.println("<h2 align=right><a href=customerpage.jsp>Customer-Home</a></h2>");
            //out.println("<br>");
            //out.println("<img src=images/selectbook.jpg width=100%>");
            out.println("</section>");

            out.println("<aside id=side_bar>");
            out.println("</aside>");

            out.println("</div>");

            out.println("<footer id=main_footer>");
       	    out.println("@Deen 2019");
            out.println("</footer>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
            
            
            
            
            
        }catch(Exception e){
            out.println(e);
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
