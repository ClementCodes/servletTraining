<%@ page import="com.innovator.model.Personne"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>

<html>
<body>
<table>
<tr> <th>Valeur</th> <th>Cube</th>
</tr>


<c:forEach var="i" begin="0" end="7" step="1"> <tr>
<td><c:out value="${i}"/></td>
<td><c:out value="${i * i * i}"/></td> </tr>
</c:forEach> </table>
    <br>
ce la est du jstl avec le c:
<br>
Page 4 "c:Avec le for each different"
      <br>
<%-- <c:forEach var="p" items="$(x)"> --%>
<c:forEach var="p" items="${requestScope['x']}">
$(p.nom)--$(p.prenom)--$(p.id)<br>
</c:forEach>




  
</body>
</html>
