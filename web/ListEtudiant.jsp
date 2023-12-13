<%-- 
    Document   : ListEtudiant
    Created on : 13 déc. 2023, 21:59:29
    Author     : 21655
--%>


<%@page import="java.util.*"%>
<%@page import="models.Etudiant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            List<Etudiant> LE = (List<Etudiant>)request.getAttribute("LE");
            
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
            <th>id</th>
            <th>nom</th>
            <th>prenom</th>
            </tr>
            <%  for(Etudiant e : LE){     %>
            <tr>
                <td> <%=e.getId()%>  </td>
                <td> <%=e.getNom()%>  </td>
                <td> <%=e.getPrenom()%>  </td>
            </tr>
            <% } %>
        </table>
    </body>
</html>
