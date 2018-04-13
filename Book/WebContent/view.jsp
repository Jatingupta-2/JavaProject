<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><right>
<%
 String name=(String)request.getParameter("name"); %>

You are Logged in as <%=name %></right><br><br>
<center>
<a href="<%=request.getContextPath()%>/BookServlet?view=1">View Books</a></center>
<BR><BR><BR><a href="<%=request.getContextPath() %>/index.jsp">LogOut</a>
</body>
</html>