<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 13.01.2018
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SearchResult</title>
</head>
<body>
${requestScope.instructors}

<c:if test="${requestScope.currentPage != 1}">
    <td><a href="page=${requestScope.currentPage - 1}">Previous</a></td>
</c:if>

<c:if test="${requestScope.currentPage lt requestScope.noOfPages}">
    <td><a href="page=${requestScope.currentPage + 1}">Next</a></td>
</c:if>
<%--<table border="1" cellpadding="5" cellspacing="5">--%>
    <%--<tr>--%>
        <%--<th>id</th>--%>
        <%--<th>Subject</th>--%>
        <%--<th>Specialization</th>--%>
        <%--<th>City</th>--%>
        <%--<th>Name</th>--%>
        <%--<th>Flat</th>--%>
        <%--<th>Instructor</th>--%>
    <%--</tr>--%>
<%--<c:forEach items="${requestScope.instructors}" var="instructors">--%>
    <%--<tr>--%>
        <%--<td>${instructors.id}</td>--%>
        <%--<td>${instructors.subject}</td>--%>
        <%--<td>${instructors.specialization}</td>--%>
        <%--<td>${instructors.address.city}</td>--%>
        <%--<td>${instructors.address.street}</td>--%>
        <%--<td>${instructors.address.flat}</td>--%>
        <%--<td>${instructors.address.instructor}</td>--%>
    <%--</tr>--%>
<%--</c:forEach>--%>
<%--</table>--%>
</body>
</html>