$(function () {
    var curPage = $("#pageNum").val();
    var totalPage=$("#totalPage").val();
    var isNew=$("#isNew").val();
    var isBind=$("#isBind").val();
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
                    url : basePath+'/agCustomer/agentLib.json',
                    data : {pageNum:curPage,isNew:isNew,isBind:isBind},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            $.each(list,function(i,item){
                                var customerName=typeof(item.customerName)=="undefined"||item.customerName==null?"":item.customerName;
                                var contactName=typeof(item.contactName)=="undefined"||item.contactName==null?"":item.contactName;
                                var contactTel=typeof(item.contactTel)=="undefined"||item.contactTel==null?"暂无":item.contactTel;
                                if(item.isNew==1){
                                result+=' <li>'
                                    +'<a href="'+basePath+'/agCustomer/bindCustomer.html?customerId='+item.id+'" flex="cross:center main:justify">'
                                    +'<div class="kehu">'
                                    +'<p class="tof1 c333"><span class="iconfont icon-che1 cgreen"></span>&nbsp;'+customerName+'</p>'
                                    +'<p class="f12 c85"><span class="iconfont icon-rengezhongxin f12"></span>&nbsp;'+contactName+'&nbsp;&nbsp;<span class="iconfont icon-shoujihao f12"></span>&nbsp;'+contactTel+'</p>'
                                    +'</div>'
                                    +'<span  class="qiang newKh"></span>'
                                    +'</a>'
                                    +'</li>';
                                }
                                if(item.isNew==0){
                                result+=' <li>'
                                    +'<a href="'+basePath+'/agCustomer/reBindCustomer.html?customerId='+item.id+'" flex="cross:center main:justify">'
                                    +'<div class="kehu">'
                                    +'<p class="tof1 c333"><span class="iconfont icon-che1 cgreen"></span>&nbsp;'+customerName+'</p>'
                                    +'<p class="f12 c85"><span class="iconfont icon-rengezhongxin f12"></span>&nbsp;'+contactName+'&nbsp;&nbsp;<span class="iconfont icon-shoujihao f12"></span>&nbsp;'+contactTel+'</p>'
                                    +'</div>'
                                    +'<span  class="qiang "></span>'
                                    +'</a>'
                                    +'</li>';
                                }
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



$('.ucTabList li').on('click', function () {
    $(this).addClass('active').siblings('.ucTabList li').removeClass('active');
    var click=$(this).html();
    $("#pageNum").val(1);
    if("全部"==click){
        $("#isBind").val(0);
        $("#isNew").val(null);
    }else if("新客户"==click){
        $("#isBind").val(0);
        $("#isNew").val(1);
    }else if("不活跃"==click){
        $("#isBind").val(0);
        $("#isNew").val(0);
    }
    var isNew=$("#isNew").val();
    var isBind=$("#isBind").val();
    location.href=basePath+"/agCustomer/customerLib.html?pageNum=1&isNew="+isNew+"&isBind="+isBind;
});