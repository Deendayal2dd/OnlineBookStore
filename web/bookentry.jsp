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
         <form action="SaveBook" method="get">
             <center>
             <table>
                  <tr>
                      <td><h3>Book Entry Form</h3></td>
                 </tr>
                 <tr>
                     <td>Title</td>
                     <td><input type="text" name="title"></td>
                 </tr>
                  <tr>
                     <td>Author</td>
                     <td><input type="text" name="author"></td>
                 </tr>
                 <tr>
                     <td>Publisher</td>
                     <td><input type="text" name="publisher"></td>
                 </tr>
                  <tr>
                     <td>Subject</td>
                     <td><select name="subject">
                             <option>Computer</option>
                             <option>Maths</option>
                             <option>English</option>
                             <option>Physics</option>
                             <option>Chemistry</option>
                             <option>Others</option>
                         </select></td>
                 </tr>
                  <tr>
                     <td>Price</td>
                     <td><input type="text" name="price"></td>
                 </tr>
                  <tr>
                     <td></td>
                     <td><input type="submit" value="Save"></td>
                 </tr>
                
             </table>
            </center>
            <a href="adminpage.jsp">Go-Back</a>
          </form>
       </aside>

       </div>

       <footer id="main_footer">
       	 @Deen 2019
       </footer>
    </div>
</body>
</html>