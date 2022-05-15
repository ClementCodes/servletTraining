<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<body>


<h1 > TOUT VA Béné</h1>
<h1 > page index.jsp</h1>
<h2 > En fait la page index.jsp est la page automatique du dossier   intitulé  : http://localhost:8080/project_servlet/ </h2>



<form action="../project_servlet/servletformulaire" method="post">
     <label >Nom :</label>
     <input type="text" name="user">
        <input type="submit" value="clickosse">
</form>

    <br>
        <br>    <br>    <br>
<form action="../project_servlet/servletpersonne" method="post">
     <label >Direction vers la page personne.jsp</label>

        <input type="submit" value="clickosse">
</form>
    <br>

        <br>    <br>    <br>
<form action="../project_servlet/voitures" method="post">
     <label >Direction vers le servlettSession voiture</label>

        <input type="submit" value="clickosse">
</form>

    <br>    <br>    <br>
<form action="../project_servlet/voituresliste" method="post">
     <label >Direction vers le servlettSessionvoitures   lsites </label>

        <input type="submit" value="clickosse">
</form>


   <br>    <br>    <br>
<form action="../project_servlet/pageListenerApplicatif.jsp" method="post">
     <label >Direction vers le listenerApplicatif </label>

        <input type="submit" value="clickosse">
</form>


   <br>    <br>    <br>
<form action="../project_servlet/pageListenerApplicatif2.jsp" method="post">
     <label >Direction vers le listenerApplicatif2 </label>

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
