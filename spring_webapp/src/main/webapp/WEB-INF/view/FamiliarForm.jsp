<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Familiar Form</title>

</head>
<body>

<form:form action="Form2" modelAttribute="Familiar">
	
Nome: <form:input path="nome"/>
<br>
Idade: <form:input path="idade"/><br>
		
		<br><br>
		
Genero:<br>
Masculino <form:radiobutton path="genero" value="Masculino"/> <br>	
Feminino <form:radiobutton path="genero" value="Feminino"/> <br>
Outro <form:radiobutton path="genero" value="Outro"/> <br>	
	
		<br><br>
		
		Serviço Utilizado: <br>
		iFood <form:checkbox path="servicos" value="iFood"/> <br>
		Uber <form:checkbox path="servicos" value="Uber" /> <br>
		Spotfy <form:checkbox path="servicos" value="Spotfy" /> <br>
		Netflix <form:checkbox path="servicos" value="Netflix" /> <br>
		<input type="submit" value="Submit"/>
	</form:form>

</body>
</html>