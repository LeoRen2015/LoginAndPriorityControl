
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    pageContex.setAttribute("basePath",basePath);
%>

<%@include file="bootstrap.jsp" %>