$(function () {
    var curPage = $("#pageNum").val();
    var totalPage=$("#totalPage").val();
    var status=$("#status").val();
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
                    url : basePath+'/agCustomerBind/listData.json',
                    data : {pageNum:curPage,status:status},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            var newDate = new Date();
                            $.each(list,function(i,item){
                                newDate.setTime(parseInt(item.createTime));
                                result+='<li>';
                                if(item.status==0){
                                    if(item.type==2){
                                        result+='<a href="'+basePath+'/agCustomerBind/check.html?applyId='+item.id+'" class="change">';
                                    }else{
                                        result+='<a href="'+basePath+'/agCustomerBind/check.html?applyId='+item.id+'" class="">';
                                    }
                                }else{
                                    if(item.type==2){
                                        result+='<a href="'+basePath+'/agCustomerBind/detail.html?applyId='+item.id+'" class="change">';
                                    }else{
                                        result+='<a href="'+basePath+'/agCustomerBind/detail.html?applyId='+item.id+'" class="">';
                                    }
                                }
                                if(item.cate==1){
                                    result+='<p class="tof1" ><span class="iconfont icon-che1 cgreen"></span>&nbsp;'+item.facName+'</p><div class="clearfix">';
                                }else if(item.cate==2){
                                    result+='<p class="tof1" ><span class="iconfont icon-ding cyellow"></span>&nbsp;'+item.facName+'</p><div class="clearfix">';
                                }else{
                                    result+='<p class="tof1" ><span class="iconfont icon-che1 cgreen"></span>&nbsp;'+item.facName+'</p><div class="clearfix">';
                                }

                                result+='<p class="fl"><span class="iconfont icon-dailiren c85"></span>&nbsp;'+item.realName+'</p>'
                                      +'<p class="fr c85 f12">'+newDate.format('yyyy-MM-dd')+'</p>'
                                      +'</div>'
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


$('.ucTabList li').on('click', function () {
    $(this).addClass('active').siblings('.ucTabList li').removeClass('active');
    var click=$(this).html();
    $("#pageNum").val(1);
    if("待审核"==click){
        $("#status").val(0);
    }else if("已通过"==click){
        $("#status").val(1);
    }else if("已拒绝"==click){
        $("#status").val(2);
    }
    var status=$("#status").val();
    location.href=basePath+"/agCustomerBind/list.html?pageNum=1&status="+status;

});