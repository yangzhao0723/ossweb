/**
 * Created by Administrator on 2014/12/25.
 */
submitValid=function(){

    var UserName=document.getElementById("username1").value;
    if(UserName.length<1||UserName==null){
        alert("登陆名不能为空");
        return
    }

//    var NewUserName=document.getElementById("NewUserName").value;
//    if(NewUserName.length<1||NewUserName==null){
//        alert("姓名不能为空");
//        return
//    }
    var pwd=document.getElementById("pwd1").value;
    if(pwd.length<1||pwd==null){
        alert("密码不能为空");
        return
    }
    var regform =document.getElementById("loginform");
    regform.submit();

};
