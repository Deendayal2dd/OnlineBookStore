import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypkg.Data;

public class SaveUser extends HttpServlet {

    Connection con; PreparedStatement ps;
    
   @Override
    public void init(){
        try{
        String qr="insert into user values(?,?,?,?,?,?)";
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
        ps.setString(1, userid);
        ps.setString(2, password);
        ps.setString(3,username);
        ps.setString(4, address);
        ps.setString(5, mobile);
        ps.setString(6, email);
        ps.executeUpdate();
        //response
        out.println("<html>");
        out.println("<body>");
        out.println("<h4>Registration Completed</h4>");
        out.println("<h5><a href=index.jsp>Login-Now</a></h5>");
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
