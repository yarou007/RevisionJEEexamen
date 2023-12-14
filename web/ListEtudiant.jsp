<%-- 
    Document   : ListEtudiant
    Created on : 13 déc. 2023, 21:59:29
    Author     : 21655
--%>


<%@page import="java.lang.Object"%>
<%@page import="java.util.*"%>
<%@page  import="controllers.ListEtudiants" %>
<%@page import="models.Etudiant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArrayList<Etudiant> l = (ArrayList<Etudiant>) request.getAttribute("l");
    String msg = (String) request.getAttribute("msg");

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
            <%                if (l != null && msg == null) {
            %><tr>
                <%
               
                for (Etudiant e : l) { %>

                <td><%=e.getId()%></td>
                <td><%=e.getNom()%></td>
                <td><%=e.getPrenom()%></td>
            </tr>
            <% } %>
            <% }  else if ((l==null) && (msg!=null)) { %>
                <%=msg%>
            <% }%>
        </table>
    </body>
</html>
