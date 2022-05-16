<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
	
	String nom = request.getParameter("nom");
	String prenom = request.getParameter("prenom");
	String reponse ="BONJOUR "+nom + " " + prenom; 


	out.print(reponse);
%>

</body>
</html>