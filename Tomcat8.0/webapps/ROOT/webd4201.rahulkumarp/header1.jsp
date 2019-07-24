
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"> 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="./css/webd4201.css" /> <% String User = (String)session.getAttribute("aUser");
        String errorMessage = (String)session.getAttribute("errors");  %>
    <%--
      session.setAttribute("User", aUser);
      session.setAttribute("errors", "Problem logging on");
      session.setAttribute("today", new Date());
    --%>
    <title><%= title %></title>
  <%@ page import = "java.util.*" %>
  <%@ page import = "webd4201.patelr.*" %>
</head>
<body>

<% if(((Student) session.getAttribute("aStudent") != null){ %>
<div class="topnav">
   <a class="active" href="./index.jsp">Home</a>
   <a href="./Login.jsp">Login</a>
   <a href="./register.jsp">Register</a>
  <% } else {%>
   <a href="./update.jsp">Update</a>
   <a href="./Logout.jsp">Logout</a>
</div>
<% } %>


