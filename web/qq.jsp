<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/1/5
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
    <link href="<%=request.getContextPath()%>/css/pager.jsp" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/pager.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            var page1 = new Pager(5,4);
            page1.pager();
        });
    </script>
</head>
<body>
<div class="content">
<table class="paginated">

</table>
</div>
</body>
</html>
