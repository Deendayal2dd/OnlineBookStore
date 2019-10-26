import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplayCart extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        ArrayList<String> list=(ArrayList<String>) session.getAttribute("cart");
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
          
        if(list==null){
        out.println("<h3>Your Cart Is Empty</h3>");
        out.println("<h5><a href=SubjectPage>Start-Buying</a></h5>");
        }else{
        out.println("<h4>YourCart</h4>");
        String qr="select * from book where bcode in "+list;
        qr=qr.replace('[', '(');
        qr=qr.replace(']', ')');
        //out.println(qr);
        try{
            Connection con=mypkg.Data.connect();
            PreparedStatement ps=con.prepareStatement(qr);
            ResultSet rs=ps.executeQuery();
            out.println("<table border=2>");
            out.println("<tr>");
            out.println("<td>BCode</td>");
            out.println("<td>Title</td>");
            out.println("<td>Author</td>");
            out.println("<td>Publsh</td>");
            out.println("<td>Subject</td>");
            out.println("<td>Price</td>");
            out.println("</tr>");
            int sum=0;
            while(rs.next()){
                String s1=rs.getString(1);
                String s2=rs.getString(2);
                String s3=rs.getString(3);
                String s4=rs.getString(4);
                String s5=rs.getString(5);
                String s6=rs.getString(6);
                sum=sum+Integer.parseInt(s6);
            out.println("<tr>");
            out.println("<td>"+s1+"</td>");
            out.println("<td>"+s2+"</td>");
            out.println("<td>"+s3+"</td>");
            out.println("<td>"+s4+"</td>");
            out.println("<td>"+s5+"</td>");
            out.println("<td align=right>"+s6+"</td>");
            out.println("<td><a href=RemoveBook?id="+s1+">[Delete]</a></td>");
            out.println("</tr>");
            }
            out.println("<tr>");
            out.println("<td></td>");
            out.println("<td></td>");
            out.println("<td></td>");
            out.println("<td></td>");
            out.println("<td>Total</td>");
            out.println("<td>"+sum+"</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<br>");
            out.println("<a href=#>Buy-Now</a> &nbsp &nbsp &nbsp");
            out.println("<a href=SubjectPage>Buy-More</a><br><br>");
            out.println("<h2 align=right><a href=customerpage.jsp>Customer-Home</a></h2>");
            con.close();
        }catch(Exception e){
            out.println(e);
        }
        }
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
