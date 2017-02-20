<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ocenki</h1>
<c:if test="${!empty ocenkaList}">
    <table style="border-style: solid">
        <tr>
            <td>ID</td>
            <td>Predmet_id</td>
            <td>Student_id</td>
            <td>ocenka</td>
            <td>Update</td>
            <td>Delete</td>
        </tr>
        <c:forEach var="ocenka" items="${ocenkaList}">
            <tr>
                <td>${ocenka.id}</td>
                <td>${ocenka.predmet_id}</td>
                <td>${ocenka.student_id}</td>
                <td><a href="<c:url value="/ocenka/readOcenkaById/${ocenka.id} " />">${ocenka.ocenka}</a></td>
                <td><a href="<c:url value="/ocenka/update/${ocenka.id}"/>">Update</a></td>
                <td><a href="<c:url value="/ocenka/deleteOcenkaById/${ocenka.id}"/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br/>
<%--<a href="/student/addStudent"><button>New Student</button></a>--%>
<h1>Add a Ocenka</h1>


<form:form method="post" commandName="ocenka" action="/ocenka/addOcenka">
    <table>
        <tr>
            <td>
                <i>Predmet_id</i>
            </td>
            <td>
                <form:input path="predmet_id"/>
            </td>
        </tr>
        <tr>
            <td>
                <i>Student_id</i>
            </td>
            <td>
                <form:input path="student_id"/>
            </td>
        </tr>
        <tr>
            <td>
                <i>Ocenka</i>
            </td>
            <td>
                <form:input path="ocenka"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Добавить Оценку">
            </td>
        </tr>
    </table>

</form:form>

</body>
</html>
