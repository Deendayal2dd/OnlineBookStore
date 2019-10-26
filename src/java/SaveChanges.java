import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypkg.Data;

public class SaveChanges extends HttpServlet {

    Connection con; PreparedStatement ps;
    
   @Override
    public void init(){
        try{
        String qr="update user set password=?, name=?, address=?, mobile=?, email=? where userid=?";
        con=Data.connect();            
        ps=con.prepareStatement(qr);
        }catch(Exception e){
        }
    }
    @Override
    public void destroy(){
        try{
        con.close();
        }catch(Exception e){
        }
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        //reads the data
        String userid=request.getParameter("uid");
        String password=request.getParameter("pw");
        String username=request.getParameter("unm");
        String address=request.getParameter("adr");
        String mobile=request.getParameter("mob");
        String email=request.getParameter("email");
        //process
        try{
        ps.setString(1, password);
        ps.setString(2, username);
        ps.setString(3, address);
        ps.setString(4, mobile);
        ps.setString(5, email);
        ps.setString(6, userid);
        ps.executeUpdate();
        //response
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
           out.println("<h4>Profile Updated</h4>");
           out.println("<h5><a href=buyerpage.jsp>Home</a></h5>");
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
           out.print(e);
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
