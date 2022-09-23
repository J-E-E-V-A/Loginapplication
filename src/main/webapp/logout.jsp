<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout page</title>
<link type="text/css" rel="stylesheet" href="NewFile.css">
</head>
<center><body style="text-align: center"></center>
    <%
    session.removeAttribute("empid");
    session.invalidate();
    %>
   <h1 style="text-align:center">Login  successfully</h1>
   <center><span><a href="front.jsp"> Login again </a></span><br></center>
    
 
</body>
</html>