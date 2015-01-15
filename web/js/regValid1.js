/**
 * Created by Administrator on 2014/12/25.
 */
submitValid=function(){
  var Email=document.getElementById("Email").value;
    if(Email.length<1||Email==null){
        alert("邮箱不能为空");
        return
    }
    var UserName=document.getElementById("UserName").value;
    if(UserName.length<1||UserName==null){
        alert("用户名不能为空");
        return
    }
    if(!ChangePassword()){
        alert("密码不合法");
        return
    }
    if(!Check_Email()){
        alert("邮箱地址格式不正确请重新输入");
        return
    }

    if(!Check_RePassWord()){
        alert("两次密码不唯一");
        return
    }
//    var NewUserName=document.getElementById("NewUserName").value;
//    if(NewUserName.length<1||NewUserName==null){
//        alert("姓名不能为空");
//        return
//    }
    if(!CheckValidateCode()){
        alert("验证码不能为空");
        return
    }
    var regform =document.getElementById("regform");
    regform.submit();

};
Check_Email=function(){
    var Email=document.getElementById("Email").value;
    var span_CheckEmail=document.getElementById("span_CheckUsername");
    var reg =/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.(?:com|cn)$/;
    if(reg.test(Email)){
        span_CheckEmail.innerHTML="√";
        return true;
    }
    span_CheckEmail.innerHTML="请填写有效的 Email地址作为下次登录的用户名,同时我们也会给这个地址发送您的帐户信息、订单通知等";
    return false;
};
ChangePassword=function(){
    var Email=document.getElementById("PassWord").value;
    var span_CheckEmail=document.getElementById("CheckRePassWord");
    var reg =/^([a-zA-Z\d+]{6,16})$/;
    if(reg.test(Email)){
        span_CheckEmail.innerHTML="√";
        return true;
    }
    span_CheckEmail.innerHTML="密码请设为6-16位字母或数字";
    return false;
};
Check_RePassWord=function(){
    var RexPassWord=document.getElementById("RexPassWord").value;
    var PassWord=document.getElementById("PassWord").value;
    var ReCheckRePassWord=document.getElementById("ReCheckRePassWord");
    if(RexPassWord==PassWord){
        ReCheckRePassWord.innerHTML="√";
        return true;
    }
    ReCheckRePassWord.innerHTML="两次密码不一致";
    return false;
};
CheckValidateCode=function() {
    var Validate_Code = document.getElementById("Validate_Code").value;
    var CheckValidateCode = document.getElementById("CheckValidateCode");
    if (Validate_Code.length < 1 || Validate_Code == null) {
        CheckValidateCode.innerHTML = "验证码不能为空";
        return false;
    }
    return true;
};
    Checkusername1=function(){
        var Validate_Code=document.getElementById("UserName").value;
        var CheckValidateCode=document.getElementById("CheckNewUserName");
        if(Validate_Code.length<1||Validate_Code==null){
            CheckValidateCode.innerHTML="昵称不能为空";
            return false;
        }
            ReCheckRePassWord.innerHTML = "√";
            return true;

        };