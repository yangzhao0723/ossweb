<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/29
  Time: 8:29
  To change this template use File | Settings | File Templates.
--%>
%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<% session.invalidate();
    response.sendRedirect(request.getContextPath()+"/login");%>
</body>
</html>
