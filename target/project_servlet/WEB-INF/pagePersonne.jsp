<%@ page import="com.innovator.model.Personne"%>
<%@ page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<body>
<h2 >page Peronne recupré depuis la basse de donnée avec mon DaoPersonne 

Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi-db1", "root", "28121987");
ne pas oublier de changer les mots de passe si tp </h2>


<% ArrayList <Personne> personnes =(ArrayList) request.getAttribute("x");
for (Personne p :personnes){out.print(p + "<br>" + "<br>");}

%>
</body>
</html>
