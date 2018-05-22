/* 输入参数的名称，获取地址中得参数得值*/
function getAddressParameter(name) {
    var url = window.location.href;
    var p = -1;
    var value = undefined;
    if (((p = Math.max(url.indexOf("&" + name + "="), url.indexOf("?" + name
            + "="))) > -1)) {
        value = url.substring(p + name.length + 2);
        if (value.indexOf("&") > -1) {
            value = value.substring(0, value.indexOf("&"));
        } else if (value.indexOf("#") > -1) {
            value = value.substring(0, value.indexOf("#"));
        }
    }
    return value;
}
