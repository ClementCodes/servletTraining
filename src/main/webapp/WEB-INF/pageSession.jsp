<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Page 2<br><hr>



<h1>
<% 
ArrayList<String> x = (ArrayList<String>)session.getAttribute("listesessionvoiture");
String txt = "Liste de voitures:<ol>";
for(int i = 0 ; i < x.size() ; i++)
	txt += "<li>" + x.get(i) + " ;</li>";
txt += "</ol>";

out.print(txt);
%>
</h1>


</body>
</html>