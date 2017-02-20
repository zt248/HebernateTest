<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Student</h1>
<f:form method="POST" commandName="ocenka" action="/ocenka/updateOcenka">
    <table>
        <tr>
            <td>
                <form:label path="id">
                    <spring:message text="ID"/>
                </form:label>
            </td>
            <td>
                <form:input path="id" readonly="true" size="8" disabled="true"/>
                <form:hidden path="id"/>
            </td>
        </tr>
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
            <td><input type="submit" value="Обновить"/></td>
        </tr>
    </table>
</f:form>
<a href="<c:url value="/ocenka/redirect" />">
    <button>Back</button>
</a>
</body>
</html>
