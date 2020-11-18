<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<%
    String contextPath = request.getContextPath();
%>
<body>
<a href="<%=contextPath%>/test/hello.action">save</a><br/>
<a href="<%=contextPath%>/test/error.action">error</a><br/>
<a href="<%=contextPath%>/test/success.action">success</a><br/>
</body>
</html>
