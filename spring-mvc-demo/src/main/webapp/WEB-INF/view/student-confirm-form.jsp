<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>
			Student Confirmation Form
	</title>
	</head>
	<body>
		<h1>
			Student is confirmed : ${student.firstName}  ${student.lastName}  
		</h1>
		<h2>
			Country : ${student.country}
		</h2>
		<h2>
			Fav Lang : ${student.favLanguage}
		</h2>
		<h2>
			OS :
			<ul>
				<c:forEach var ="temp" items= "${student.OS}" >
				<li> ${temp} </li>
				</c:forEach>
			</ul>
		</h2>
		

	</body>
</html>
