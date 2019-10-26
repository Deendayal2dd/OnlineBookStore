import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VerifyUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String s1=request.getParameter("userid");
        String s2=request.getParameter("password");
        String s3=request.getParameter("usertype");
        
        if(s3.equals("Admin")){
            if(s1.equals("Deen") && s2.equals("Deen")){
               response.sendRedirect("adminpage.jsp");
            }else{
                out.println("Invalid Admin Account");
                out.println("<a href=index.jsp>Try-Again</a>");
            }
        }else{
            String qr="select * from user where userid=? and password=?";
            Connection con=mypkg.Data.connect();
            try{
            PreparedStatement ps=con.prepareStatement(qr);
            ps.setString(1, s1);
            ps.setString(2, s2);
            ResultSet rs=ps.executeQuery();
            boolean b=rs.next();
            if(b){
            
               //do user wants to save password?
                String choice=request.getParameter("remember");
                if(choice!=null){
                    //user wish to save passsword
                    // we will save save password using cookie
                    Cookie c1=new Cookie("userid",s1);
                    Cookie c2=new Cookie("password",s2);
                    c1.setMaxAge(60*60*24*7);;
                    c2.setMaxAge(60*60*24*7);
                    response.addCookie(c1);
                    response.addCookie(c2);
                }
                // storing userid into his session
                // storing info to session
                //fetch the session this user
                HttpSession session=request.getSession();
                session.setAttribute("user", s1);
                session.setAttribute("password",s2);
                    response.sendRedirect("customerpage.jsp");
            }else{
                out.println("Invalid Customer Account");
                out.println("<a href=index.jsp>Try-Again</a>");
                //response.sendRedirect("index.jsp");
            }
            con.close();
            }catch(Exception e){out.println(e);}
            
            
            
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
