<%@ page import="com.innovator.model.Personne"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>

<html>
<body>
  <br>
Page 3 "c:forEach"
<br>
ce la est du jstl avec le c:
      <br>
<c:forEach var="p" items="$(x)">
$(p.nom)--$(p.prenom)--$(p.id)  <br>
</c:forEach >


<table>
                <tr>
                        <th>NOM</th>
                        <th>PRENOM</th>
                        <th>AGE</th>
                </tr>
                <c:forEach var="p" items="${x}">
                        <tr>
                                <td><c:out value="${p.nom }"/></td>
                                <td><c:out value="${p.prenom }"/></td>
                                <td><c:out value="${p.age }"/></td>
                        </tr>
                </c:forEach >
        </table>


  
</body>
</html>
