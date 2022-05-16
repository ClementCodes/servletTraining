<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="com.innovator.model.Personne2"%>

<!DOCTYPE html>

<html>
<body>


<h1 > TOUT VA Béné</h1>



<h4> Prmeier h4 avec service application </h4>


<%

ArrayList<Personne2> listep = (ArrayList<Personne2>) application.getAttribute("listeServiceApplication");

String txt = "Liste de personne Applicative getContext:<ol>";

for(int i = 0 ; i < listep.size() ; i++)
	txt += "<li>" + listep.get(i) + " ;</li>";
txt += "</ol>";
 	out.print(txt);
%>

<form action="../project_servlet/servletformulaire" method="post">
     <label >Nom :</label>
     <input type="text" name="nom">
       <label >Prénom :</label>
     <input type="text" name="prenom">
        <input type="submit" value="clickosse">
</form>

    <br>
        <br>    <br>    <br>
<form action="../project_servlet/servletpersonne" method="post">
     <label >Direction vers la page personne.jsp</label>

        <input type="submit" value="clickosse">
</form>
    <br>
        <br>
        <br>    <br>    <br>
        
<form action="servletsession" method="post"> 
   <label >ServlettSession</label>
<input type="submit" value="submit">

</form>

    <br>

        <br>    <br>    <br>
<form action="../project_servlet/voitures" method="post">
     <label >Direction vers  le servlette requette voiture</label>

        <input type="submit" value="clickosse">
</form>

    <br>    <br>    <br>
<form action="../project_servlet/voituresliste" method="post">
     <label >Direction vers le servlette requette Sessionvoitures   lsites </label>

        <input type="submit" value="clickosse">
</form>


   <br>    <br>    <br>
<form action="../project_servlet/servletapplicationcontext" method="post">
     <label >Direction vers le listenerApplicatif </label>

        <input type="submit" value="clickosse">
</form>



   <br>    <br>    <br>
<form action="../project_servlet/servletpersonnecfor" method="post">
     <label >Direction vers le ltestPAGE 3 jsp cforeach </label>

        <input type="submit" value="clickosse">
</form>
   <br>    <br>    <br>
<form action="../project_servlet/servletpersonnecfor2" method="post">
     <label >Direction vers le ltestPAGE 4 jsp cforeach </label>

        <input type="submit" value="clickosse">
</form>
</body>
</html>
