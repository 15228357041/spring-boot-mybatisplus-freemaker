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
                    url : basePath+'/agWaterRecord/myPerfor.json',
                    data : {pageNum:curPage},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            $.each(list,function(i,item){
                                var sum=typeof(item.sum)=="undefined"||item.sum==null?"0.00":item.sum;
                                var createMonth=typeof(item.createMonth)=="undefined"||item.createMonth==null?"":item.createMonth;
                                var createYear=typeof(item.createYear)=="undefined"||item.createYear==null?"":item.createYear;
                                result+=' <li>'
                                       +' <a href="'+basePath+'/agWaterRecord/dayPerfor.html?createMonth='+createMonth+'&createYear='+createYear+'" flex="cross:center main:justify">'
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
