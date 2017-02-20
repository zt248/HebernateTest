<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>New Student</h1>
<f:form method="POST" id="studForm"   action="/student/addSt">
    <table>
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
            <td><input type="submit" value="Добавить" /></td>
        </tr>
    </table>
</f:form>
<a href="<c:url value="/student/redir" />">
    <button>Back</button>
</a>

<script src="https://code.jquery.com/jquery-3.1.1.min.js">
</script>

<script>
    $("#studForm").submit(function (e) {

        var url = "<c:url value="/student/addSt-ajax"/>"; // the script where you handle the form input.

        $.ajax({
            type: "POST",
            url: url,
            data: $("#studForm").serialize(), // serializes the form's elements.
            // data: {name: "ertert",age:"33"}, // serializes the form's elements.
            success: function (data) {
                alert(data); // show response from the php script.
            }
        });

        e.preventDefault(); // avoid to execute the actual submit of the form.
    });
</script>

</body>
</html>
