<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align = "center"> Welcome to Home View</h1>

<%if(request.getAttribute("successMsg")!=null){ %>
<%=request.getAttribute("successMsg") %>
<%} %>

<br> <br> <br>
<form action = = "post">
<label>Book Name</label>
<input name = "BookName" type = "text">
<br> <br> <br>
<input type = "submit">

</form>
</body>
</html>