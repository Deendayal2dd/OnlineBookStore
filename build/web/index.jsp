<%
  String v1="",v2="";
  //fetch cookies
  Cookie ck[]=request.getCookies();
  if(ck!=null)
  {
    for(Cookie c:ck){
      String name=c.getName();
      if(name.equals("userid")){
          v1=c.getValue();
      }
      else if(name.equals("password")){
          v2=c.getValue();
      }
    }
  }  
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
        <!--  <img src="images/header_books.gif" width="30px" align="left"> -->
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
         <img src="images/book3.jpg" width="100%">

       </section>

       <aside id="side_bar">
       	<div id="container">
        <h3 align="center">Login Form</h3>
        <form action="VerifyUser" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="userid" value="<%=v1%>">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" value="<%=v2%>">
            <label for="usertype">Usertype:</label>&nbsp     
            <select name="usertype"><option>Admin</option><option>Customer</option></select>

            <div id="lower">
                <input type="checkbox" name="remember"><label class="check" for="checkbox">Remember me</label>
                <input type="submit" value="Login">
            </div><!--/ lower-->
        </form>
        <label>Create An Account! &nbsp<a href="registration.jsp">New-user</a></label>
        </div>
       </aside>

       </div>

       <footer id="main_footer">
       	 @Deen 2019
       </footer>
    </div>
</body>
</html>