$(function () {
    var curPage = $("#pageNum").val();
    var totalPage=$("#totalPage").val();
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
                    url : basePath+'/agProfitRecord/myProfit.json',
                    data : {pageNum:curPage},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            var newDate = new Date();
                            $.each(list,function(i,item){
                                var sum=typeof(item.sum)=="undefined"||item.sum==null?"0.00":item.sum;
                                var createMonth=typeof(item.createMonth)=="undefined"||item.createMonth==null?"":item.createMonth;
                                var createYear=typeof(item.createYear)=="undefined"||item.createYear==null?"":item.createYear;
                                newDate.setTime(parseInt(item.createTime));
                                result+=' <li>'
                                    +' <a href="'+basePath+'/agProfitRecord/dayProfit.html?createMonth='+createMonth+'&createYear='+createYear+'" flex="cross:center main:justify">'
                                    +'<div class="time">'
                                    +'<p class="c333 f16">'+createMonth+'月</p>'
                                    +'<p class="c85 f12">'+createYear+'年</p>'
                                    +'</div>'
                                    +'<p class="jine cyellow">'+sum.toFixed(2)+'<span class="iconfont icon-iconxiangyou "></span></p>'
                                    +'</a>'
                                    +'</li>';
                            });
                            $('.yjList').append(result);
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