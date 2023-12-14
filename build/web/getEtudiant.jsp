<%-- 
    Document   : getEtudiant
    Created on : 14 déc. 2023, 09:36:49
    Author     : 21655
--%>

<%@page import="models.Etudiant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Etudiant e = (Etudiant) request.getAttribute("e");
            String msg = (String) request.getAttribute("msg");
            if (e != null) {
        %>
        <%=e.getNom()%>
        <%=e.getId()%>
        <%=e.getPrenom()%>
        <% } else if(e==null && msg!=null) {
               
          %>
        <%=msg%>
        <% } %>
        <form method="GET" action="getEtudiant">
            <label>id</label>
            <input type="text" name="id">
            <input type="submit" value="Recherche">

        </form>
    </body>
</html>
