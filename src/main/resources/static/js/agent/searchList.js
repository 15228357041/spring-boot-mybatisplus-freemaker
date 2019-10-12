$(function () {
    var curPage = $("#pageNum").val();
    var totalPage=$("#totalPage").val();
    var keyWord=$("#keyWord").val();
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
                    url : basePath+'/agSearchRecord/agSeachList.json',
                    data : {pageNum:curPage,keyWord:keyWord},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var res=data.data;
                            if(res!=null&&res.list!=null) {
                                $.each(res.list, function (i, item) {
                                    var realName = typeof(item.realName) == "undefined" || item.realName == null ? "" : item.realName;
                                    result += '<li>'
                                        + ' <a href="${basePath}/agUser/detail.html?userId=' + item.id + '}">'
                                        + '<img src="' + basePath + '/images/head.png" alt="">'
                                        + '<p>' + realName + '</p>'
                                        + '</a>'
                                        + '</li>';
                                });
                                $('.droploadList').append(result);
                                me.resetload();
                            }
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
