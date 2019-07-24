
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"> 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="./css/webd4201.css" /> 
           <% Student aStudent = (Student)session.getAttribute("student"); %>
           <% Mark aMark = (Mark)session.getAttribute("mark"); %>
           <% String errors = (String)session.getAttribute("errors");%>
            <% String id = (String)session.getAttribute("id");
                if (id == null)
                  { id = " ";
                   }%>
            <% String firstname = (String)session.getAttribute("firstname");
                  if (firstname == null)
                  { firstname = " ";
                   }%>
            <% String lastname = (String)session.getAttribute("lastname");
                   if (lastname == null)
                  { lastname = " ";
                   }%>
            <% String email = (String)session.getAttribute("email");
                    if (email == null)
                  { email = " ";
                   }%>
            <% String programCode = (String)session.getAttribute("programCode");
                  if (programCode == null)
                  { programCode = " ";
                   }%>
            <% String programName = (String)session.getAttribute("programName");
                  if (programName == null)
                  { programName = " ";
                   }%>
           <% String User = (String)session.getAttribute("aUser"); 
                  if (User == null)
                  { User = " ";
                   }%>
           
    <%--
      session.setAttribute("aUser", " ");
      session.setAttribute("errors", "Problem logging on");
      session.setAttribute("today", new Date());
    --%>

    <% String message = (String)session.getAttribute("message");
    if(message == null)  //there was not message
    {
        message = "";  //prevents NullPointerExceptions
    }else
    {   //there was a message, but we have a copy
    session.removeAttribute("message");  
    //clean the message so it does not redisplay on a different page
    }
    %>
    
    <title><%= title %></title>
  <%@ page import = "java.util.*" %>
  <%@ page import = "webd4201.PatelR.*" %>
</head>
<body>
<div class="topnav">
<% if(aStudent == null)
{ %>

   <a class="active" href="./index.jsp">Home</a>
   <a href="./login.jsp">Login</a>
   <a href="./register.jsp">Register</a>
  <% } else {%>
   <a href="./update.jsp">Update</a>
   <a href="./Logout">Logout</a>
    <a href="./changepassword.jsp">ChangePassword</a>
<% } %>

</div>
<div>


