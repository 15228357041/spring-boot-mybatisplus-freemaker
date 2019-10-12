$(function () {
    var curPage = $("#pageNum").val();
    var totalPage=$("#totalPage").val();
    var type=$("#type").val();
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
                    url : basePath+'/agMessage/listMessage.json',
                    data : {pageNum:curPage,type:type},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            var newDate = new Date();
                            $.each(list,function(i,item){
                                result+='<li>'
                                    +'<a href="'+basePath+'/agMessage/detailMessage.html?msgId='+item.id+'">'
                                    +'<div class="clearfix">';
                                newDate.setTime(parseInt(item.createTime));
                                if(item.type==1){
                                    result+='<p class="f14 c333 fl"><span class="iconfont icon-tixian cyellow"></span>收益发放</p>';
                                }else if(item.type==2){
                                    result+='<p class="f14 c333 fl"><span class="iconfont icon-yaochi cyellow"></span>客户激活</p>';
                                }else if(item.type==3){
                                    result+='<p class="f14 c333 fl"><span class="iconfont icon-yujing cyellow"></span>客户预警</p>';
                                }else if(item.type==4){
                                    result+='<p class="f14 c333 fl"><span class="iconfont icon-chakan cyellow"></span>审核状态</p>';
                                }else if(item.type==5){
                                    result+='<p class="f14 c333 fl"><span class="iconfont icon-icon08 cyellow"></span>平台通知</p>';
                                }
                                result+='<p class="f12 c85 fr">'+newDate.format('yyyy-MM-dd')+'</p>'
                                    +'</div>'
                                    +'<p class="tof2 f12 c85">'+item.content+'</p>'
                                    +'</a>'
                                    +'</li>';
                            });
                            $('.droploadList').append(result);
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