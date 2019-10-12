$(function () {
    var curPage = $("#pageNum").val();
    var totalPage=$("#totalPage").val();
    var cate=$("#cate").val();
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
                    url : basePath+'/agCustomer/myList.json',
                    data : {pageNum:curPage,cate:cate},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            var newDate = new Date();
                            $.each(list,function(i,item){
                                var activeValue=typeof(item.activeValue)=="undefined"||item.activeValue==null?"0":item.activeValue;
                                var customerName=typeof(item.customerName)=="undefined"||item.customerName==null?"":item.customerName;
                                var contactName=typeof(item.contactName)=="undefined"||item.contactName==null?"":item.contactName;
                                var contactTel=typeof(item.contactTel)=="undefined"||item.contactTel==null?"暂无":item.contactTel;
                                result+=' <li>'
                                    +'<a href="'+basePath+'/agCustomer/customerDetail.html?customerId='+item.id+'" flex="cross:center ">'
                                    +'<img src="'+basePath+'/images/head.png" alt="">'
                                    +'<div class="con">'
                                    +'<p class="f14 c333">'+customerName+'</p>'
                                    +'<p class="f12 c85"><span class="iconfont icon-rengezhongxin f12"></span>&nbsp;'+contactName+'&nbsp;&nbsp;<span class="iconfont icon-shoujihao f12"></span>&nbsp;'+contactTel+'</p>'
                                    +'</div>'
                                    +'<div class="hydu cgreen f12">'
                                    +'<span class="iconfont icon-huoyuedu f12"></span>'+activeValue
                                    +' </div>'
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
    if("全部"==click){
        $("#cate").val(0);
    }else if("车队"==click){
        $("#cate").val(1);
    }else if("订车方"==click){
        $("#cate").val(2);
    }
    var cate=$("#cate").val();
    location.href=basePath+"/agCustomer/myCustomer.html?pageNum=1&cate="+cate;

});