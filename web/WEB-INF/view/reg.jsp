<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>

<title>无标题文档</title>
 <script src="<%=request.getContextPath()%>/js/regValid1.js"></script>
<link href="<%=request.getContextPath()%>/css/style.jsp" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/LoginAndReg.jsp" rel="stylesheet" type="text/css" />

</head>

<body>
<div id="box">
<!--top start -->
<div id="top">
  <a href="index.jsp"><img src="<%=request.getContextPath()%>/images/logo.gif" alt="Estimation" width="255" height="58" border="0" class="logo" /></a>
  <p class="topDiv"></p>
  <p class="navLeft"></p>
  <ul>
  <li><a href=""class="hover">首页</a></li>
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
      <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="<%=request.getContextPath()%>/login">登录</a><span class="Lloginfg">&nbsp;</span>
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
        <h1 align="left"><img src="<%=request.getContextPath()%>/images/pic_title.gif"></h1>
    <form:form modelAttribute="user"  action="${ctx}/reg" method="post" id="regform">
  <table width="800" border="0" align="center" cellpadding="0" cellspacing="0" class="lineJL">
            <tbody><tr>
            <td class="sty03" valign="top"  align="right">请填写您的Email地址：</td>
            <td class="sty01" valign="top"><form:input path="email"  onblur="Check_Email()" id="Email" /><form:errors path="email" cssClass="errorClass"></form:errors></td>
            <td class="sty04" valign="top" align="left">　<span class="Reginput" id="span_CheckUsername"></span></td>
                        </tr>
                        <tr>
            <td class="sty03" valign="top" align="right">请设定密码：</td>
            <td class="sty01" valign="top"><form:password path="pwd" id="PassWord"   onblur="ChangePassword()"/><form:errors path="pwd" cssClass="errorClass"></form:errors></td>
            <td class="sty03 sty04" valign="top" align="left"></td>
      <td><span id="CheckRePassWord" class="Reginput"></span></td>
                        </tr>
                        <tr>
            <td class="sty03" valign="top" align="right">请再次输入设定密码：</td>
            <td class="sty01" valign="top"><input id="RexPassWord" name="RexPassWord" maxlength="16" onblur="Check_RePassWord()" value="" type="password"></td>
            <td align="left"><span id="ReCheckRePassWord" class="Reginput"></span>　</td>
                        </tr>
                        <tr>
                         <td class="sty03" valign="top" align="right">昵称：</td>
                          <td class="sty01" valign="top"><form:input path="username"  id="UserName"  onblur="Checkusername1()"/><form:errors path="username" cssClass="errorClass"></form:errors></td>
                        <td class="sty03 sty04" valign="top" align="left"><span id="CheckNewUserName" class="Reginput"></span></td>
                        </tr>
                        <tr>
                            <td class="sty03" valign="top" align="right">请输入验证码：</td>
                            <td class="sty02" colspan="2" valign="top"><input name="Validate_Code" id="Validate_Code"
                                                                              class="inputSty01"
                                                                              onblur="CheckValidateCode()"
                                                                              style="width:100px;" type="text">
                                <img width="80" height="25"
                                                                                                                    id="Img1" style="vertical-align: top; padding: 0pt 0pt 0pt 8px;"
                                                                                                                    src="<%=request.getContextPath()%>/js/validCode.jsp"
                                                                                                                    onclick="this.src='/PublicControls/NewValidateCode.aspx?height=25&amp;width=100&amp;codeLen=5&amp;photoType=2&amp;t='+new Date().getTime()"
                                                                                                                    border="0">

                            </td>
                            <td> <span class="Reginput" id="CheckValidateCode" style="width: 220px;"></span></td>
                        </tr>
                        <tr>
            <td>　</td>
            <td align="right">
                    <input type="submit" class="btn_sub" value="登 录" onclick="return submitValid();"/>
                <%--<input src="<%=request.getContextPath()%>/images/submit.gif" style="width:91px; height:25px; border:0;" alt="完成注册" type="image" onclick="return submitValid()"> </td>--%>
            <td>　</td>
                        </tr>
                        <tr>
                          <td colspan="3">&nbsp;</td>
                        </tr>
                    </tbody>
  </table>
   </form:form>

    <%--<form:form modelAttribute="user" action="${ctx}/user/reg" method="post" >--%>
        <%--<table>--%>
            <%--<tr>--%>
              <%--<td> <label >用户名：</label> </td>--%>
              <%--<td> <form:input path="username" /></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--< <td> <label >密码：</label> </td>--%>
                <%--<td><form:password path="pwd" /></td>--%>
            <%--</tr>--%>
        <%--</table>--%>
        <%--<input type="submit" value="申请注册"  />--%>
        <%--<input type="reset" value="重置" />--%>
    <%--</form:form>--%>
    <%--${msg}--%>
    <%--<form:form modelAttribute="user" action="${ctx}/user/reg" method="post">--%>
        <%--<label>用户名:</label> <form:input path="username" /><form:errors path="username" cssClass="errorClass"></form:errors>--%>
        <%--&lt;%&ndash;<label>密码:</label> <form:password path="pwd" /><form:errors path="pwd" cssClass="errorClass"></form:errors>&ndash;%&gt;--%>

        <%--<input type="submit" value="提交"/>--%>
    <%--</form:form>--%>

<%--<form action="<%=request.getContextPath()%>/user/reg" method="post">--%>
        <%----%>
        <%--<label>用户</label><input type="text" name="userpass"/>--%>
        <%--<label>密码</label><input type="text" name="pwd"/>--%>
        <%--<input type="submit" value="提交"/>--%>
    <%--</form>--%>

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
