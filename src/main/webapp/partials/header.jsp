<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 class="header">WEB TODO</h1>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/default.css">
<p>
<c:choose>
    <c:when test="${sessionScope.user == null}">
        Sorry not logged in!
    </c:when>
    <c:otherwise>
        Logged in as: ${sessionScope.user}
        <form action="${pageContext.request.contextPath}/fc" method="post">
            <input type="hidden" name="action" value="logout" />
            <button type="submit" name="logout" value="logout" class="btn-link">Logout</button>
        </form>
    </c:otherwise>
</c:choose>
</p>
