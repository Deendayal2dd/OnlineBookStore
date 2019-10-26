<jsp:declaration>
        int getDiscount(int price){
        int rate=10;
        if(price>500){
            rate=20;
        }
        int discount=price*rate/100;
        return discount;
        }
</jsp:declaration>
<jsp:scriptlet>
    int code=Integer.parseInt(request.getParameter("t1"));
    String qr="select * from book where bcode=?";
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","root");
    java.sql.PreparedStatement ps=con.prepareStatement(qr);
    ps.setInt(1, code);
    java.sql.ResultSet rs=ps.executeQuery();
    rs.next();
    String s1=rs.getString(1);
    String s2=rs.getString(2);
    String s3=rs.getString(3);
    String s4=rs.getString(4);
    String s5=rs.getString(5);
    String s6=rs.getString(6);
    int dis=getDiscount(Integer.parseInt(s6));
</jsp:scriptlet>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>OnlineBookStore</title>
	<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
	<div id=big_wrapper>
       <header id="top_header">
       	  <h1>Online Book Store</h1>
       </header>

       <nav id="top_menu">
       	 <ul>
       	 	<li><a href="index.jsp">Home</a></li>
       	 	<li><a href="#">Books</a></li>
       	 	<li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
       	 </ul>
       </nav>

       <div id="new_div">

       <section id="main_section">
         <h3>Book-Details</h3>
        <br>
        <table border="3" width="2" cellspacing="2" cellpadding="2">
            <tbody>
                <tr>
                    <td>BCode</td>
                    <td><jsp:expression>s1</jsp:expression></td>
                </tr>
                <tr>
                    <td>Title</td>
                    <td><%=s2%></td>
                </tr>
                <tr>
                    <td>Author</td>
                    <td><%=s3%></td>
                </tr>
                <tr>
                    <td>Publsh</td>
                    <td><%=s4%></td>
                </tr>
                <tr>
                    <td>Subject</td>
                    <td><%=s5%></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><%=s6%></td>
                </tr>
                <tr>
                    <td>Disc</td>
                    <td><%=dis%></td>
                </tr>
            </tbody>
        </table>
        <br>
        <a href="customerpage.jsp">Go-Back</a> &nbsp;
        <a href="search.jsp">Search-More</a><br>

       </section>

       <aside id="side_bar">
         
       </aside>

       </div>

       <footer id="main_footer">
       	 @Deen 2019
       </footer>
    </div>
</body>
</html>

<%
    con.close();
%>