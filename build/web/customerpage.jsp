<%
    //int n=session.getMaxInactiveInterval();
    String uid=(String)session.getAttribute("user");
    if(uid==null){
    response.sendRedirect("index.jsp");
    }
    //long val=session.getCreationTime();
    //java.util.Date dt=new java.util.Date(val);
%>

<!--        <h5>Your Session Was Created On <=dt%></h5>
        <h4>If you remain idle for <=n%> seconds your session will expire</h4>-->

<!--<%@include  file="header.jsp" %> -->
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
         <img src="images/book5.jpg" width="100%">

       </section>

       <aside id="side_bar">
           <h3 align="center">Welcome <%=uid%></h3><br>
          <table>
                 <tr>
                     <td><a href="SubjectPage">Explore-Store</a></td>
                 </tr>
                  <tr>
                     <td><a href="search.jsp">Search-Book-By-Id</a></td>
                 </tr>
                 <tr>
                     <td><a href="subsearch.jsp">Search-Book-By-Subject</a></td>
                 </tr>
                 <tr>
                     <td><a href="DisplayCart">View-Cart</a></td>
                 </tr>
                 <tr>
                     <td><a href="updateform.jsp">Profile-Update</a></td>
                 </tr>
                 <tr>
                     <td><a href="EndSession">Logout</a></td>
                 </tr>
             </table>
          <h3 align="right"><a href="EndSession">Logout</a></h3>
       </aside>

       </div>

       <footer id="main_footer">
       	 @Deen 2019
       </footer>
    </div>
</body>
</html>