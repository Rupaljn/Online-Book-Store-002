<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align = "center"> Admin Profile View </h1>
<%if(request.getAttribute("errorMsg")!=null){ %>
<%=request.getAttribute("errorMsg") %>
<%} %>
<br> <br> <br>
<a href = "AddBookView.jsp" > Add Book</a>
<br> <br> <br>
<a href = "ViewBook.jsp"> View Book</a>
<br> <br> <br>
<a href = "BookRecordUpdateView.jsp"> Book Record Update </a>
<br> <br> <br>
<a href = UpdateBookDetailView.jsp> Update Book Detail </a>
<br> <br> <br>
<a href = DeleteBookView.jsp> Delete Book </a>
</body>
</html>