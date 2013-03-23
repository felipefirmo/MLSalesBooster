<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href="bootstrap.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">
    <link href="bootstrap-responsive.css" rel="stylesheet">

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MercadoLivre Sales Booster</title>
</head>
<body>
	<h1>MercadoLivre Sales Booster</h1>
	
	<form:form method="post" commandName="resposta" accept-charset="UTF-8">
		<form:input path="text" type="textarea" class="span4 applied" id="txtText"/>
		<input type="submit"/>
	</form:form>
		
	
</body>
</html>