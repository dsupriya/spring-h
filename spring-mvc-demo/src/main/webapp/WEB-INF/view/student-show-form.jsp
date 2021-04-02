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
Country :<form:select path ="country">
<form:option value="India" label ="India" />
<form:option value="US" label ="US" />
<form:option value="UK" label ="UK" />
<form:option value="Maldives" label ="Maldives" />
</form:select>
<br><br>
<input type = "submit" value = "submit"/>



</form:form>
</body>

</html>