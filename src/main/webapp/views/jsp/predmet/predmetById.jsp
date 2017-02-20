<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Predmet</title>
</head>
<body>
<H1>Predmet ${predmet.id}</H1>
<table>
    <tr>
        <td><i>Id: </i></td>
        <td>${predmet.id}</td>
    </tr>
    <tr>
        <td><i>Predmet Name: </i></td>
        <td>${predmet.predmet_name}</td>
    </tr>
</table>

</body>
</html>
