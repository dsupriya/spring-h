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
<input type = "submit" value = "submit"/>

</form:form>
</body>

</html>