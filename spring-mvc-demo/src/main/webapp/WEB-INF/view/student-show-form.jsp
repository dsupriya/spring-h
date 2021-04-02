<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>
Student Info Form
</title>
</head>
	<body>
	<form:form action = "processForm" modelAttribute="student">
		FirstName : <form:input path = "firstName"/>
		<br><br>
		LastName : <form:input path = "lastName"/>
		<br><br>
		Country :
			<form:select path ="country">
				<form:options items="${student.countryOptions}"  />
			</form:select>
		<br><br>

		Fav Language :
			Java <form:radiobutton path="favLanguage" value = "Java"/>
			Python <form:radiobutton path="favLanguage" value = "Python"/>
			Scala <form:radiobutton path="favLanguage" value = "Scala"/>

		<br><br>
		<input type = "submit" value = "submit"/>
	</form:form>
</body>
</html>