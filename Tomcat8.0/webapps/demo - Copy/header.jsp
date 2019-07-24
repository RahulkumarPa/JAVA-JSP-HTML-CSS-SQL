<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"> 
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
	<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
</style>
	
 <%--
      session.setAttribute("student", aStudent);
      session.setAttribute("errors", "Problem logging on");
      session.setAttribute("today", new Date());
--%><title><%= title %></title>
<%@ page import = "java.util.*" %>
  <%@ page import = "webd4201.patelr.*" %>
</head>
<body>
<body id="body">
	   <%--  
        Student someStudent= (Student)session.getAttribute("student");
        String message = (String)session.getAttribute(" errors");String someDate= (Date)session.getAttribute("today");
       if(message == null)
        errorMessage="";
       if(someStudent == null)
        login = "";
     
     --%>
    <div class="navigation">
   <a class="active" href="#home">Home</a>
   <a href="./login.jsp">Login</a>
   <a href="./register.jsp">Register</a>
   <a href="./update.jsp">Update</a>
   <a href="./logout.jsp">Logout</a>
  </div>
</body>
</html>