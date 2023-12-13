<%-- 
    Document   : AjoutEtud
    Created on : 13 déc. 2023, 21:12:59
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
        <%  
         String msg = (String) request.getAttribute("msg");
       
         if (msg!=null){
        %>
        <h1><%=msg%></h1>
        <% } %>
        
         <form method="GET" action="ajout" >
        <label>id : </label>
        <input type="text" name="id" >
        <label>nom : </label>
        <input type="text" name="nom" >
        <label>prenom : </label>
        <input type="text" name="prenom" >
       <input type="submit" value="Envoyer"> 
    </form>
        <a href="ListEtudiant.jsp">Liste Etudiant</a>
    </body>
</html>
