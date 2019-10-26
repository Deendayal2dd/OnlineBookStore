<%
    String qr="select distinct subject from book order by subject";
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","root");
    java.sql.PreparedStatement ps=con.prepareStatement(qr);
    java.sql.ResultSet rs=ps.executeQuery();
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
             <img src="images/book6.jpg" width="100%">

       </section>

       <aside id="side_bar">
           
           <h3>Search-Book-By-Subject</h3><br>
        <form action="BookList">
         Subject <select name="subject">
<%
       while(rs.next()){
        String s1=rs.getString(1);
       
%>
<option><%=s1%></option>
<%
    }
%>
                
                    </select>
                <input type="submit" value="Search"/>
        </form>
<br><br><a href="customerpage.jsp">Go-Back</a>
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


