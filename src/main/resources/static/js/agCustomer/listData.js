/**
 * Created by Administrator on 2017/12/12.
 */
$(function () {
    var curPage=$("#pageNum").val();//当前页码
    var totalPage=$("#totalPage").val();//总页码
    var isBind=$("#isBind").val();//是否绑定
    //dropload 下拉加载
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
                if (curPage==totalPage || totalPage==0) {
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
                    url : basePath+'/agCustomer/listData.json',
                    data : {pageNum:curPage,isBind:isBind},
                    type : 'post',
                    cache : false,
                    dataType : 'json',
                    success : function(data) {
                        if (data.code == 10000) {
                            var list=data.data.list;
                            $.each(list,function(i,item){
                                var aV=typeof(item.activeValue)=="undefined"?"0":item.activeValue;
                                var cN=typeof(item.customerName)=="undefined"?"-":item.customerName;
                                var rN=typeof(item.realName)=="undefined"?"-":item.realName;
                                if(item.isBind==1){//已绑定
                                    result+= '<tr>';
                                    if(cN!=null&&cN!=''&&cN.length>5){
                                        result+= '<td>'+cN.substring(0,5)+'...'+'</td>';
                                    }else{
                                        result+='<td>'+cN+'</td>';
                                    }
                                    result+=' <td>'+rN+'</td>'
                                        +' <td>'+aV+'</td>'
                                        +' <td><a href="'+basePath+'/agCustomer/customerDetail.html?customerId='+item.id+'" onclick="defaultPageNum();" class="cyellow">详情</a></td>'
                                        +' </tr> ';
                                }
                                if(item.isBind==0){//未绑定
                                    result+= '<tr>';
                                    if(cN!=null&&cN!=''&&cN.length>5){
                                        result+= '<td>'+cN.substring(0,5)+'...'+'</td>';
                                    }else{
                                        result+='<td>'+cN+'</td>';
                                    }
                                    result+=' <td><a href="tel:'+item.contactTel+'" class="c65">'+item.contactName+'}&nbsp;<span class="iconfont icon-dianhua f12 cgreen"></span></a></td>';
                                      if(item.isInto==0){
                                          result+='<td>否</td>';
                                      }else{
                                          result+='<td>是</td>';
                                      }
                                    result+=' <td><a href="#" id="delete" class="delete cyellow" data-id="'+item.id+'" onclick="deleteRecord(this)">删除</a></td>'
                                        +' </tr> ';
                                }
                            });
                            $('.mainTb').append(result);
                            me.resetload();
                        }else{
                            showMsg(data.msg);
                        }
                    },
                    error : function() {
                        showMsg("异常！");
                    }
                });
            }, 500);
        }
    });

    $('.ucTabList li').on('click', function () {
        $(this).addClass('active').siblings('.ucTabList li').removeClass('active');
        var click=$(this).html();
        $("#pageNum").val(1);
        if("已绑定"==click){
            $("#isBind").val(1);
        }else if("待绑定"==click) {
            $("#isBind").val(0);
        }
        var isBind=$("#isBind").val();
        location.href=basePath+"/agCustomer/list.html?pageNum=1&isBind="+isBind;
    });
});
//设置默认页码1
function defaultPageNum(){
    $("#pageNum").val(1);
}
//删除提示窗
$('.delete').on('click', function () {
    $(".popUpMask").show();
    $(".delName").html( $(this).data('name'));
    $('.btnSubmit').data('id', $(this).data('id'));
})

  function deleteRecord(obj){
      $(".popUpMask").show();
      $(".delName").html( $(obj).data('name'));
      $('.btnSubmit').data('id', $(obj).data('id'));
  }


//隐藏删除提示窗
$('.btnCancel').on('click', function () {
    $(".popUpMask").hide();
})
//删除
$('.btnSubmit').on('click', function () {
    var cId=$(this).data('id');
    $.ajax({
        type:"POST",
        url:basePath+"/agCustomer/deleteCustomer.json",
        data:{customerId:$(this).data('id')},
        dataType:'json',
        cache:false,
        success:function(data){
            if (data.code == 10000) {
                showMsg("删除成功");
                $("tr[id="+cId+"]").remove();
                $(".popUpMask").hide();
            }else{
                showMsg(data.Msg);
            };
        }
    });
})

