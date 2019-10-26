<%
    String id=(String)session.getAttribute("user");
    String qr="select * from user where userid=?";
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","root");
    java.sql.PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(1,id);
    java.sql.ResultSet rs=ps.executeQuery();
    rs.next();
    String s1=rs.getString(1);
    String s2=rs.getString(2);
    String s3=rs.getString(3);
    String s4=rs.getString(4);
    String s5=rs.getString(5);    
    String s6=rs.getString(6);    
%>

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
        <h4>Profile Update Form</h4>
        <form action="SaveChanges" method="get">
            <pre>
            Userid      <input type="text" name="uid" value="<%=s1%>" />
            Password    <input type="password" name="pw" value="<%=s2%>"/>
            Name        <input type="text" name="unm" value="<%=s3%>"/>
            Address     <input type="text" name="adr" value="<%=s4%>"/>
            Mobile      <input type="text" name="mob" value="<%=s5%>"/>
            Email       <input type="text" name="email" value="<%=s6%>"/>
                        <input type="submit" value="Update"/>
            </pre>
        </form>
        <br>
       

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