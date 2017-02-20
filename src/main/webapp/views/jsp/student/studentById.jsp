<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h1>Student ${studentId.id}</h1>
<table>
    <tr>
        <td><i>Id: </i></td>
        <td>${studentId.id}</td>
    </tr>
    <tr>
        <td><i>Name: </i></td>
        <td>${studentId.name}</td>
    </tr>
    <tr>
        <td><i>Surname: </i></td>
        <td>${studentId.surname}</td>
    </tr>
</table>

<a href="<c:url value="/student/redir"/>"><button>Back</button></a>
</body>
</html>
