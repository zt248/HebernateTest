<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Student</h1>
<f:form method="POST" action="/predmet/updatePredmet">
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
                <i>Name:</i>
            </td>
            <td>
                <f:input path="predmet_name"/>
            </td>
        </tr>

        <tr>
            <td><input type="submit" value="Обновить"/></td>
        </tr>
    </table>
</f:form>
<a href="<c:url value="/predmet/redir" />">
    <button>Back</button>
</a>
</body>
</html>
