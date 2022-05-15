<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<body>
<h2 >Hello World!</h2>

<h2 >Hello balise!  SANS LA PARTIE sERVLET class
</h2>

<h2 >ici je recupere depuis  le formulaire  le nom de mon index.js qui passe par le servlet bien sur 
</h2>



<h3 >qui est normalement ou le fichier recupFormulaire.jsp
</h3>

<%
	
	String user = request.getParameter("user");
	String reponse ="BONJOUR "+user; 


	out.print(reponse);
%>

</body>
</html>