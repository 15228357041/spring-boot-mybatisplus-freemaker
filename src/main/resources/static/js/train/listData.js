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
                    url : basePath+'/agTrain/listData.json',
                    data : {pageNum:curPage},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            var newDate = new Date();
                            $.each(list,function(i,item){
                                newDate.setTime(parseInt(item.createTime));
                                result+='<li>'
                                    +'<a href="'+basePath+'/agTrain/detail.html?trainId='+item.id+'">';
                                if(item.attType==1){
                                    result+='<p class="f16 c333 tof1"><span class="iconfont icon-word"></span>'+item.title+'</p>';
                                }else if(item.attType==2){
                                    result+='<p class="f16 c333 tof1"><span class="iconfont icon-excle"></span>'+item.title+'</p>';
                                }else if(item.attType==3){
                                    result+='<p class="f16 c333 tof1"><span class="iconfont icon-ppt"></span>'+item.title+'</p>';
                                }else if(item.attType==4){
                                    result+='<p class="f16 c333 tof1"><span class="iconfont icon-video"></span>'+item.title+'</p>';
                                }

                                result+='<p class="f12 c85">'+newDate.format('yyyy-MM-dd')+'</p>'
                                +' </a>'
                                +' </li>';
                            });
                            $('.droploadList').empty();
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