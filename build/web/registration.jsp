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
           
         <form action="SaveUser" method="get">
             <center>
                 <h3 align="center">Registration Form</h3>
             <table>
                 <tr>
                     <td>User-Id</td>
                     <td><input type="text" name="uid"></td>
                 </tr>
                  <tr>
                     <td>Password</td>
                     <td><input type="password" name="pw"></td>
                 </tr>
                 <tr>
                     <td>Name</td>
                     <td><input type="text" name="unm"></td>
                 </tr>
                 <tr>
                     <td>Address</td>
                     <td><input type="text" name="adr"></td>
                 </tr>
                 <tr>
                     <td>Mobile</td>
                     <td><input type="text" name="mob"></td>
                 </tr>
                 <tr>
                     <td>Email</td>
                     <td><input type="text" name="email"></td>
                 </tr>
                  <tr>
                      <td></td>
                      <td><input type="submit" value="Save"></td>
                 </tr>
            </table>
             </center>
             <a href="index.jsp">Home</a>
          </form>

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
