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
                    url : basePath+'/agPerforRecord/honorList.json',
                    data : {pageNum:curPage},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            $.each(list,function(i,item){
                                var nickName=typeof(item.nickName)=="undefined"||item.nickName==null?"":item.nickName;
                                var cityName=typeof(item.cityName)=="undefined"||item.cityName==null?"":item.cityName;
                                var perfor=typeof(item.perfor)=="undefined"||item.perfor==null?"0.00":item.perfor;
                               result+='<tr>' +
                                       '<td>'+(i+(curPage-1)*10+1)+'</td>';
                               if(nickName!=''&&nickName.length>9){
                                   result+= '<td>'+nickName.substring(0,8)+'...'+'</td>';
                               }else{
                                   result+='<td>'+nickName+'</td>';
                               }
                                       result+='<td>'+ cityName+'</td>' +
                                       '<td>'+perfor.toFixed(2)+'</td>' +
                                       '</tr>';
                            });
                            $('.mainTb').append(result);
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