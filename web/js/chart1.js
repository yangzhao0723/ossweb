var ss = $.noConflict();
var MerAdd = function(id,recman,address,postcode,tel){
    this.id = id;
    this.postcode = postcode;
    this.recaddress = postcode;
    this.recman = recman;
    this.tel = tel;
}
ss(document).ready(function(){

    ss("[name='newaddressid']").click(function(){
        ss(this).parent().css("background","#FF6100").siblings().css("background","none");
    });

//        ss(":input").click(function(){
//            ss(".aaa").show();
//        });

    ss("#Name").blur(function(){
        if((ss(this).val()==="")){
            ss("#errorName").text("收货人姓名不能为空");
            ss(this).focus();
        }else{
            ss("#errorName").text("");
        }
    });

    ss("#Zip").blur(function(){
        if((ss(this).val()==="")){
            ss("#errorPostal").text("邮政编码不能为空");
            ss(this).focus();
        }else{
            ss("#errorPostal").text("");
        }
    });

    ss("#Address").blur(function(){
        if((ss(this).val()==="")){
            ss("#errorAddress").text("收货地址不能为空");
            ss(this).focus();
        }else{
            ss("#errorAddress").text("");
        }
    });

    ss("#Mobile").blur(function(){
        if((ss(this).val()==="")){
            ss("#errorMobile").text("联系电话不能为空");
            ss(this).focus();
        }else{
            if(!ss(this).val().match(/(\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$/)){
                ss("#errorMobile").text("联系电话不合法");
            }else{
                ss("#errorMobile").text("");
            }
        }
    });
});
function updateclick(msg,recname,recaddress,postcode,tel){
    ss.colorbox({
        html :
            "<table style='border-collapse:separate; border-spacing:10px;width: 453px;height: 354px' id='table1'>"+
            "<tbody>"+
            "<tr>"+
            "<td style='background: #808080;width: 0;height: 46px'>请输入新的发货地址</td>"+
            "</tr>"+
            "<tr>"+
            "<td style='margin: 0'>"+
            "<form id='formid' action='/updateadress' method='post'>"+
            "<input  type='text' value="+msg+" name='id' style='visibility: hidden'/>"+
            "<ul style='border-collapse:separate; border-spacing:10px;margin: 10px 92px 30px 92px' id='newul'>"+
            "<li style='margin-left: 15px'>"+
            "<label >收货人:</label><input name='recman' value="+recname+" type='text'/>"+
            "</li></br>"+
            "<li>"+
            "<label >收货地址:</label><input name='recaddress' value="+recaddress+" type='text'/>"+
            "</li></br>"+
            "<li>"+
            "<label >邮政编码:</label><input name='postcode' value="+postcode+" type='text'/>"+
            "</li></br>"+
            "<li>"+
            "<label >联系电话:</label><input name='tel' value="+tel+" type='text'/>"+
            "</li></br>"+
            "<li>"+
            "<input type='submit' style='margin-left: 105px;width: 95px;background: red'/>"+
            "</li>"+
            "</ul>"+
            "</form>"+
            "</td>"+
            "</tr>"+
            "</tbody>"+
            "</table>"
    })
}
////删除
//function deletemeradd(msg){
//    ss.ajax({
//        type : "POST",
//        url :_path+"/shop/delememaddr",
//        data : {id : msg},
//        dataType : "Text",
//        success : function(msg){
//            alert(msg);
//            window.location = _path+"/shop/01chart"
//        },
//        error : function(msg){
//            alert(msg)
//        }
//    })
//}

//将选中的地址添加到session中
function meradd(){
    var id = "";
    ss("#changeAdd input[type=radio]:checked").each(function(){
        id = ss(this).attr("id");
    });
    ss.ajax({
        type : "POST",
        url : "/addrsession",
        data : {meraddid:id},
        dataType : "Text",
        success : function(){
            window.location = "/02chart";
        },
        error : function(){
          window.location ="/jiesuan";

        }

    })
};
//session失效跳转