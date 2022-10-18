<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align = "center"> Delete Book View</h1>
<br> <br> <br>
<%if(request.getAttribute("successmsg")!=null){ %>
<%= request.getAttribute("successmsg") %>
<%} %>
<br> <br> <br>
<form action="DeleteBookController" method = "post">
<label>Name Of Book</label>
<input name = "nameOfBook" type = "text">
<br> <br> <br>
<input name = "deleteBook" type = "submit">
<br> <br> <br>

</form>

</body>
</html>