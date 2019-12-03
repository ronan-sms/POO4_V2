<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Familiar Confirmation</title>
</head>
<body>

 Familiar: ${ Familiar.nome }
	
	<br>
	
	Idade: ${ Familiar.idade }
	
	<br>
	
	Genero: ${ Familiar.genero } 
	
	<br>
	
	Servicos Utilizados
	<ul>
		<c:forEach var="serv" items="${ Familiar.servicos }">
			<li> ${ serv } </li>
		</c:forEach>
	</ul>

</body>
</html>