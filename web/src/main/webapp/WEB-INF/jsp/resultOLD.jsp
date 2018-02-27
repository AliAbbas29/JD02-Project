<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 13.01.2018
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SearchResult</title>
</head>
<body>
<%--${requestScope.instructors}--%>

<%--<c:if test="${requestScope.currentPage != 1}">--%>
    <%--<td><a href="${pageContext.request.contextPath}/result?page=${requestScope.currentPage - 1}">Previous</a></td>--%>
<%--</c:if>--%>

<%--<c:if test="${requestScope.currentPage lt requestScope.noOfPages}">--%>
    <%--<td><a href="${pageContext.request.contextPath}/result?page=${requestScope.currentPage + 1}">Next</a></td>--%>
<%--</c:if>--%>
<table border="1" cellpadding="5" cellspacing="5">
    <tr>
        <th>id</th>
        <th>Subject</th>
        <th>Specialization</th>
        <th>City</th>
        <th>Street</th>
        <th>Office</th>
        <th>Instructor</th>
    </tr>
<c:forEach items="${requestScope.courses}" var="course">
    <tr>
        <td>${course.id}</td>
        <td>${course.subject}</td>
        <td>${course.specialization}</td>
        <td>${course.address.city}</td>
        <td>${course.address.street}</td>
        <td>${course.address.flat}</td>
        <td>${course.instructor}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>