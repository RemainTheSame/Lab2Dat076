<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/partials/head.jsp"/>
    </head>
    <body>
        <jsp:include page="/partials/header.jsp"/>
        <jsp:useBean id="bean" scope="request" class="mvc.beans.ViewModel"/>
        <p> Edit ${param.id}</p>
        <!-- Form action -->
        <form action="${pageContext.request.contextPath}/fc" method="post">
            <!-- Inputs -->
            <input type="hidden" name="action" value="update">
            <input type="hidden" name="id" value="${param.id}">
            <table>
                <tr>
                    <td>
                        <input type="text" name="id" value="${param.id}" disabled>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="text" value="${bean.getById(param.id).text}">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="date" value="${bean.getById(param.id).dateTime}" disabled>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" name="submit" value="Update">
                    </td>
                </tr>
            </table>
        </form>
        

       
        <a href="${pageContext.request.contextPath}/list.jsp"> Cancel</a>
        <jsp:include page="/partials/footer.jsp"/>
    </body>

</html>

