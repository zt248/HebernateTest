<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H1>Ocenka ${ocemka.id}</H1>
<table>
    <tr>
        <td><i>Id: </i></td>
        <td>${ocenka.id}</td>
    </tr>
    <tr>
        <td><i>Predmet_id: </i></td>
        <td>${ocenka.predmet_id}</td>
    </tr>

    <tr>
        <td><i>Student_id: </i></td>
        <td>${ocenka.student_id}</td>
    </tr>
    <tr>
        <td><i>Ocenka: </i></td>
        <td>${ocenka.ocenka}</td>
    </tr>
</table>

<a href="<c:url value="/ocenka/redirect" /> ">
    <button>Back</button>
</a>
</body>
</html>
