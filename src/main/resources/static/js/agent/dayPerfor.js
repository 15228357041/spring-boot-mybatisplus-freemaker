$(function () {
    var curPage = $("#pageNum").val();
    var totalPage=$("#totalPage").val();
    var startTime=$("#startTime").val();
    var endTime=$("#endTime").val();
    var createYear=$("#createYear").val();
    var createMonth=$("#createMonth").val();
    // dropload
    var dropload = $('.droploadWarp').dropload({
        scrollArea: $('.droploadWarp'),
        domDown: {
            domClass: 'dropload-down',
            domRefresh: '<div class="dropload-refresh">上拉加载更多</div>',
            domLoad: '<div class="dropload-load"><span class="loading"></span>加载中...</div>',
            domNoData: '<hr class="dropload-noData"></hr>'
        },
        loadDownFn: function (me) {
            setTimeout(function () {
                if (curPage==totalPage||totalPage==0) {
                    me.resetload();
                    me.lock();
                    me.noData();
                    me.resetload();
                    return;
                }
                curPage++;
                $("#pageNum").val(curPage);
                var result = '';
                $.ajax({
                    url : basePath+'/agWaterRecord/dayPerfor.json',
                    data : {pageNum:curPage,startTime:startTime,endTime:endTime,createMonth:createMonth,createYear:createYear},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            var newDate = new Date();
                            $.each(list,function(i,item){
                                newDate.setTime(parseInt(item.createTime));
                                var waterAmount=typeof(item.waterAmount)=="undefined"||item.waterAmount==null?"0.00":item.waterAmount;
                                var orderNo=typeof(item.orderNo)=="undefined"||item.orderNo==null?"":item.orderNo;
                                var customerName=typeof(item.customerName)=="undefined"||item.customerName==null?"":item.customerName;
                                if(customerName!=''&&customerName.length>5){
                                    customerName= customerName.substring(0,5)+'...';
                                }
                                result+=' <li flex="cross:center">'
                                    +'<div class="left">'
                                    +'<p class="f14 tof1"><span class="iconfont  cyellow"></span>'+orderNo+'</p>'
                                +'<p class="f12 c85">'
                                +' <span class="iconfont  f12"></span>'+newDate.format('yyyy-MM-dd hh:mm:ss')+''
                                +'</p>'
                                +'  </div>'
                                +'  <div class="right">'
                                +' <p class=" f14">'+customerName+'</p>'
                                +' <p class="f12 c85 cyellow">￥'+waterAmount.toFixed(2)+'</p>'
                                +'</div>'
                                +'</li>';
                            });
                            $('.shouyiList').append(result);
                            me.resetload();
                        }else{
                            showMsg(data.msg);
                        }
                    },
                    error : function() {
                        //alert("异常！");
                    }
                });
            }, 500);
        }
    });
});
//日期格式化
Date.prototype.format = function(format) {
    var date = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate(),
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3)
    };
    if (/(y+)/i.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + '').substr(4 - RegExp.$1.length));
    }
    for (var k in date) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1
                ? date[k] : ("00" + date[k]).substr(("" + date[k]).length));
        }
    }
    return format;
}