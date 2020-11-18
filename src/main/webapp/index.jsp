<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<%
    String contextPath = request.getContextPath();
%>
<body>
<h2>Hello World!</h2>
<a href="<%=contextPath%>/test/hello.action">save</a><br/>
<a href="<%=contextPath%>/test/error.action">error</a><br/>
<a href="<%=contextPath%>/test/success.action">success</a><br/>
<a href="<%=contextPath%>/test/helloMap.action">helloMap</a><br/>
</body>
</html>
