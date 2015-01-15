<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>

<title>无标题文档</title>
<link href="<%=request.getContextPath()%>/css/style.jsp" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/LoginAndReg.jsp" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/GetPwd.jsp" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="box">
<!--top start -->
<div id="top">
  <a href="index.jsp"><img src="<%=request.getContextPath()%>/images/logo.gif" alt="Estimation" width="255" height="58" border="0" class="logo" /></a>
  <p class="topDiv"></p>
  <p class="navLeft"></p>
  <ul>
  <li><a href="index.jsp" class="hover">首页</a></li>
  <li><a href="#">关于我们</a></li>
  <li><a href="#">在线客服</a></li>
  <li class="chart"><a href="chart.jsp">购物车</a></li>
  </ul>
  <p class="navRight"></p>
   <p class="topDiv"></p>
<form name="serch" action="#" method="post">
   <input type="text" name="txtbox" value="购物搜索" class="txtBox" />
   <input type="submit" name="go" value="搜" class="go" />
   </form>
  </div>
<!--top end -->
<!--header start -->
<div class="nav">
  <ul>
    <li class="first"><a href="#">新品上架</a></li>
    <li><a href="#">坚果炒货</a></li>
    <li><a href="#">补血大枣</a></li>
    <li><a href="#">经典肉类</a></li>
    <li><a href="#">进口零食</a></li>
    <li><a href="#">美味糖果</a></li>
    <li><a href="#">天然干果</a></li>
    <li><a href="#">蒙古奶酪</a></li>
    <li><a href="#">台湾牛轧糖</a></li>
    <li><a href="#">蜜饯果脯</a></li>
    <li class="last">
      <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="login.jsp">登录</a><span class="Lloginfg">&nbsp;</span><a href="reg.jsp">注册</a></div>
    </li>
  </ul>
</div>
<!--header end -->
<!--guide01 start -->
<div class="guide01">
<img src="<%=request.getContextPath()%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map" />
<map name="Map" id="Map">
  <area shape="rect" coords="398,11,493,51" href="#" />
  <area shape="rect" coords="540,12,633,51" href="#" />
  <area shape="rect" coords="684,12,790,53" href="#" />
  <area shape="rect" coords="830,10,953,54" href="#" />
</map>
</div><!--guide01 end -->
<!--body start -->
<div id="body">
<div id="Login">
        <h1 align="left"><span class="h1"><img src="<%=request.getContextPath()%>/images/buttonPassword.gif" alt="找回密码" /></span></h1>
        <div class="FPaContent">
          <form name="Form1" method="post" action="GetPwdStep2_email.aspx" id="Form1">
            <div>
              <input name="__EVENTTARGET" id="__EVENTTARGET" value="" type="hidden" />
              <input name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="" type="hidden" />
              <input name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUJMjcxMDA0NzQ3DxYGHgdfdXNlcklEBQc4MTAyNzEzHgdfbTJNYWlsBRAxNzk3NzgzMThAcXEuY29tHglfY2hlY2tOdW0FJGVhYzViZWU0LTg3OTMtNDkxNy1hM2ZjLWQ5MzYzYjUyYjBmNmRk" type="hidden" />
            </div>
            <script type="text/javascript">
//<![CDATA[
var theForm = document.forms['Form1'];
if (!theForm) {
    theForm = document.Form1;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>
            </script>
            <div>
              <input name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEWAgL+lPmEAwLM9PumDw==" type="hidden" />
            </div>
            <p class="mailTi"><span class="mailTitle">我们已经把验证邮件发送至您的邮箱，请在24小时内通过邮件内的链接继续设置新的密码。</span><br />
            </p>
          </form>
          <p class="dxSty">　</p>
          <p class="textSty">如果有任何疑问，请访问口口香 <span class="color3"><a href="#" target="_blank">帮助中心</a></span>，或与口口香客服部取得联系。<br />
            客服邮箱：service@koukouxiang.com<br />
            客服热线：400-650-7099 (仅收市话费，客服工作时间：8：00-次日凌晨1：00)<br />
            客服传真：0315-83603605</p>
        </div>
</div>
<br class="spacer" />
</div>
<!--footer start -->
<div id="footer"> 
  <ul>
    <li><a href="#">首页</a>|</li>
    <li><a href="#">关于我们</a>|</li>
    <li><a href="#">新闻资讯</a>|</li>
    <li><a href="#">价单下载</a>|</li>
    <li><a href="#">联系我们</a>|</li>
  </ul>
  <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

</p>
  <p class="design"><a href="http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a></p>
</div><!--footer end -->
<!--body end -->
</div><!--box-->
</body>
</html>
