/**
 * Created by Administrator on 2014/12/25.
 */
submitValid=function(){
    var Name=document.getElementById("Name").value;
    if(Name.length<1||Name==null){
        alert("收货人不能为空");
        return
    }
    var adresss=document.getElementById("Address").value;
    if(adresss.length<1||adresss==null){
        alert("地址不能为空");
        return
    }
    var Tel=document.getElementById("Tel").value;
    var Mobile1=document.getElementById("Mobile").value;
    if(Tel==null&&Mobile1==null){
        alert("电话手机至少写一个");
        return
    }
    if(!Check_dianhua()){
        alert("电话不合法");
        return
    }
    if(!Check_phone()){
        alert("手机格式不正确请重新输入");
        return
    }
    if(!Check_youbian()){
        alert("邮编不正确请重新输入");
        return
    }


//    var NewUserName=document.getElementById("NewUserName").value;
//    if(NewUserName.length<1||NewUserName==null){
//        alert("姓名不能为空");
//        return
//    }


    var dingdanform =document.getElementById("dingdan");
    dingdanform.submit();

};
Check_phone=function(){
    var Email=document.getElementById("Mobile").value;
    var span_CheckEmail=document.getElementById("errorMobile");
    var reg =/^1[3|4|5|8][0-9]\d{4,8}$/;
    if(reg.test(Email)){
        span_CheckEmail.innerHTML="√";
        return true;
    }
    span_CheckEmail.innerHTML="请填写有效的手机";
    return false;
};
Check_Name=function(){
    var Email=document.getElementById("Name").value;
    var span_CheckEmail=document.getElementById("Name1");
    if(Email.length<1||Email==null){
        span_CheckEmail.innerHTML="请输入收货人";
        return true;
    }
    span_CheckEmail.innerHTML="√";
    return false;
};



Check_dianhua=function(){
    var Email=document.getElementById("Tel").value;
    var span_CheckEmail=document.getElementById("PhoneCode");
    var reg =/^(0[0-9]{2,3}\-)?([2-9][0-9]{6,7})+(\-[0-9]{1,4})?$/;
    if(reg.test(Email)){
        span_CheckEmail.innerHTML="√";
        return true;
    }
    span_CheckEmail.innerHTML="请填写有效的电话";
    return false;
};

Check_youbian=function(){
    var Email=document.getElementById("Zip").value;
    var span_CheckEmail=document.getElementById("SetPostalCode");
    var reg =/^[a-zA-Z0-9 ]{3,12}$/;
    if(reg.test(Email)){
        span_CheckEmail.innerHTML="√";
        return true;
    }
    span_CheckEmail.innerHTML="请填写有效的邮编";
    return false;
};

Check_adresss=function(){
    var Email=document.getElementById("Address").value;
    var span_CheckEmail=document.getElementById("dizhi1");
    if(Email.length<1||Email==null){
        span_CheckEmail.innerHTML="请输入地址";
        return true;
    }
    span_CheckEmail.innerHTML="√";
    return false;
};

