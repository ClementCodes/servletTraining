<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<body>
<h2 >Hello World!</h2>

<h2 >page session  </h2> 
<h3 >session.getAttribute("nom") </h3> 


<%= session.getAttribute("nom")
%>
<br>
<h3 >session.getId()


A chaque fois le get id change si on est sur autre page (page prive par exemple )


c'est pour ca que l on se sert du get Attribute je pense pour se connecter et notamement pour le mot de passe  </h3> 

<%= session.getId()
%>

</body>
</html>