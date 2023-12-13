<%-- 
    Document   : editerEtudiant
    Created on : 13 déc. 2023, 22:25:20
    Author     : 21655
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String msg = (String)request.getAttribute("msg");
           if(msg!=null){
        %>
        <%=msg%>
        <% } %>
        <form method="GET" action="edit" >
        <label>id : </label>
        <input type="text" name="id" >
        <label>nom : </label>
        <input type="text" name="nom" >
        <label>prenom : </label>
        <input type="text" name="prenom" >
       <input type="submit" value="Editer"> 
    </form>
    </body>
</html>
