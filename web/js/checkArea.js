function selecity() {
    ss("#CityID").empty();
    ss.ajax(
        {
            type: "post",
            url: "/city",
            data: { provinceID: ss('#provenceid').val()},
            success: function (msg) {
                for (var i = 0; i < msg.length; i++) {
                    var aa = ss("<option value=" + msg[i].id + ">" + msg[i].name + "</option>")
                    ss("#CityID").append(aa);
                }
            }
        })
}
function queryarea(){
    ss("#districtId").empty();
    ss.ajax(
        {
            type: "post",
            url: "/area",
            data: { "cityID":ss('#CityID').val() },
            success: function (msg) {
                for (var i = 0; i < msg.length; i++) {
                    var bb= ss("<option value=" + msg[i].id + ">" + msg[i].name + "</option>")
//                        var bb=ss("<option value=" + msg[i].id + ">" + msg[i].name + "</option>");
                    ss("#districtId").append(bb);
                }
            }
        })
}