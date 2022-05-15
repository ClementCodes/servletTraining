<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<body>
<h2 >Hello World!</h2>

<h2 >page session voiture  liste   </h2> 






<% 
ArrayList<String> listevoiture = (ArrayList<String>)session.getAttribute("listeVoitures");
String txt = "Liste de voitures:<ol>";
for(int i = 0 ; i < listevoiture.size() ; i++)
	txt += "<li>" + listevoiture.get(i) + " ;</li>";
txt += "</ol>";

out.print(txt);
%>

</body>
</html>