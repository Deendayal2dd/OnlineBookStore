import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BookDetails extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        int id=Integer.parseInt(request.getParameter("id"));
        try{
            Connection con=mypkg.Data.connect();
            String qr="select * from book where bcode=?";
            PreparedStatement ps=con.prepareStatement(qr);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            rs.next();
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            String s3=rs.getString(3);
            String s4=rs.getString(4);
            String s5=rs.getString(5);
            String s6=rs.getString(6);
            
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
          
            out.println("<h3>Book-Details</h3>");
            out.println("<br>");
            out.println("<table border=2>");
            out.println("<tr>");
            out.println("<td>Code</td>");
            out.println("<td>"+s1+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Title</td>");
            out.println("<td>"+s2+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Author</td>");
            out.println("<td>"+s3+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Publsh</td>");
            out.println("<td>"+s4+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Subject</td>");
            out.println("<td>"+s5+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Price</td>");
            out.println("<td>"+s6+"</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<br>");
            out.println("<a href=AddToCart?id="+s1+">Buy-Now</a> &nbsp");
            out.println("<a href=AddToCart?id="+s1+">Add-To-Cart</a><br><br>");
            out.println("<h2 align=left><a href=SubjectPage>Go-Back</a></h2>");
            out.println("<h2 align=right><a href=customerpage.jsp>Customer-Home</a></h2>");
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
