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
         <img src="images/book1.jpg" width="100%">

       </section>

       <aside id="side_bar">
       	   <h3>Search-Book</h3>
         <form action="ShowBook.jsp">
             <table>
                 <tr>
                     <td>BookCode:</td>
                 </tr>
                  <tr>
                     <td><input type="text" name="t1"></td>
                 </tr>
                 <tr>
                     <td><input type="submit" value="Search"></td>
                 </tr>
             </table>
             <br><a href="customerpage.jsp">Go-Back</a>
          </form>
       </aside>

       </div>

       <footer id="main_footer">
       	 @Deen 2019
       </footer>
    </div>
</body>
</html>