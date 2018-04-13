<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*" %>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<table border="1">
<form name="bookManagement" action="<%=request.getContextPath()%>/BookServlet" method="post">
<tr><td>Search Book<input type="text" name= search></td></tr>
<tr><td colspan=2 align="center"><input type="submit" name=search value=Search><input type="reset" name=reset value=Reset>
</form>
</table><br><br><br>
<table border="1">
<% ArrayList<Book> arrb=(ArrayList<Book>)request.getAttribute("array"); 
if(arrb.isEmpty()){
%>
Sorry. No Books Found
<%} %>
<%
for(Book b:arrb){
%>
<tr><td><%=b.getId() %></td>
<td><%=b.getName() %></td>
<td><%=b.getPrice() %></td>
<td><a href="<%=request.getContextPath()%>/BookServlet?id=<%=b.getId()%>">Delete</a></td></tr>
<%} %>

</table>
<BR><BR><BR><a href="<%=request.getContextPath() %>/index.jsp">LogOut</a>
</center>
</body>
</html>