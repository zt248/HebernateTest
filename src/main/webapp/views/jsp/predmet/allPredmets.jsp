<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Students</title>
</head>
<body>

<h1>Predmets</h1>
<c:if test="${!empty predmetList}">
    <table style="border-style: solid">
        <tr>
            <td>ID</td>
            <td>Predmet_name</td>
            <td>Update</td>
            <td>Delete</td>
        </tr>
        <c:forEach var="predmet" items="${predmetList}">
            <tr>
                <td>${predmet.id}</td>
                <td><a href="<c:url value="/predmet/readPredmetById/${predmet.id}" />"
                       target="_blank">${predmet.predmet_name}</a></td>
                <td><a href="<c:url value="/predmet/update/${predmet.id}" />">Update</a></td>
                <td><a href="<c:url value="/predmet/detelePredmetById/${predmet.id}"/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br/>
<br/>
<%--<a href="/student/addStudent"><button>New Predmets</button></a>--%>
<br/>
<br/>

<h1>Add a Predmet</h1>


<form:form method="post" commandName="predmet" action="/predmet/addPredmet">
    <table>
        <tr>
            <td>
                <i>Predmet_name</i>
            </td>
            <td>
                <form:input path="predmet_name"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Добавить Предмет">
            </td>
        </tr>
    </table>

</form:form>


</body>
</html>
