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
         <img src="images/book2.jpg" width="100%">

       </section>

       <aside id="side_bar">
          <center>
            <div id="adminprofile"></div>
   	  </center>
           <h3 align="center">Welcome Admin</h3><br>
             <table>
                 <tr>
                     <td><a href="bookentry.jsp">Add-New-Book</a></td>
                 </tr>
                  <tr>
                     <td><a href="">Modify-Book-Details</a></td>
                 </tr>
                 <tr>
                     <td><a href="">Remove-A-Book</a></td>
                 </tr>
                 <tr>
                     <td><a href="">View-Orders</a></td>
                 </tr>
                 <tr>
                     <td><a href="index.jsp">Logout</a></td>
                 </tr>
             </table>
        <h3 align="right"><a href="index.jsp">Logout</a></h3>
       </aside>

       </div>

       <footer id="main_footer">
       	 @Deen 2019
       </footer>
    </div>
</body>
</html>
