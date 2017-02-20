<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Students</title>
</head>
<body>

<h1>Students</h1>
<c:if test="${!empty studentList}">
    <table style="border-style: solid">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Surname</td>
            <td>Update</td>
            <td>Delete</td>
        </tr>
        <c:forEach var="student" items="${studentList}">
            <tr>
                <td>${student.id}</td>
                <td><a href="<c:url value="/student/getStudentById/${student.id}"/>">${student.name}</a></td>
                <td>${student.surname}</td>
                <td><a href="<c:url value="/student/update/${student.id}"/>">Update</a></td>
                <td><a href="<c:url value="/student/getStudentIdDelete/${student.id}"/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br/>
<br/>
<br/>

<%--<c:url var="addAction" value="/student/addStudent"/>
<form:form action="${addAction}" commandName="command">
    <table>
        <c:if test="${!empty command.name}">
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
        </c:if>
        <tr>
            <td>
                <form:label path="name">
                    <spring:message text="Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="surname">
                    <spring:message text="Surname"/>
                </form:label>
            </td>
            <td>
                <form:input path="surname"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty command.name}">
                    <input type="submit"
                           value="<spring:message text="Edit Book"/>"/>
                </c:if>
                <c:if test="${empty command.name}">
                    <input type="submit"
                           value="<spring:message text="Add Book"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>--%>


<form:form method="POST"  action="addSt">
    <table>
            <%--<tr>--%>
            <%--<td>--%>
            <%--<i>Id:</i>--%>
            <%--</td>--%>
            <%--<td>--%>
            <%--<f:input path="id"/>--%>
            <%--</td>--%>
            <%--</tr>--%>
        <tr>
            <td>
                <i>Name:</i>
            </td>
            <td>
                <f:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>
                <i>Surname:</i>
            </td>
            <td>
                <f:input path="surname"/>
            </td>
        </tr>
        </tr>
        <tr>
            <td><input type="submit"/></td>
        </tr>
    </table>
</form:form>

<br/>
<br/>
<a href="<c:url value="/student/addStudent"/>">
    <button>New Student</button>
</a>


</body>
</html>
