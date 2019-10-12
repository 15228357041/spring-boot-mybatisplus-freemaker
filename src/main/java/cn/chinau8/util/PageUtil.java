package cn.chinau8.util;

/**
 * Created by Administrator on 2017/5/5.
 */
public class PageUtil {
    public static String getPageString(long total,int pageSize,int curPage){
        String result="";
        if(total==0){
            return result;
        }
        /*计算总页码数*/
        int totalNum=Integer.parseInt(total+"");
        int totalPage=totalNum/pageSize;
        if(totalNum%pageSize>0){
            totalPage++;
        }
        /*计算当前页开始序号*/
        int startNum=(curPage-1)*pageSize+1;
        /*计算当前页结束序号*/
        int endNum=curPage*pageSize;
        /*当前页是最后页时，取上一页尾序号+最后页摩尔数*/
        if(curPage==totalPage&&totalNum%pageSize!=0){
            endNum=(curPage-1)*pageSize+totalNum%pageSize;
        }
        String previousDisabled="";
        int previousPage=1;
        String nextDisabled="";
        String previousPageJs="";
        String nextPageJs="";
        int nextPage=totalPage;
        if(curPage==1){
            previousDisabled="disabled";
        }else{
            previousPage=curPage-1;
            previousPageJs="onclick='goPageTo("+previousPage+")'";
        }
        if(curPage==totalPage){
            nextDisabled="disabled";
        }else{
            nextPage=curPage+1;
            nextPageJs="onclick='goPageTo("+nextPage+")'";
        }
        int startPage=1; /*总页数小于5页的默认值*/
        int endPage=totalPage;
        if(totalPage>5){/*总页数大于5页额外处理*/
            if(curPage>3){/*当前页大于第三页*/
                if(totalPage-curPage>=2){
                    startPage=curPage-2;/*当前页离结束页 起码还有两页*/
                    endPage=curPage+2;
                }else{
                    int tempNum=totalPage-curPage-1;
                    startPage=curPage-(5-tempNum);/*当前页离结束页不足两页  开始页往前退，补到5个页码*/
                }
            }else{
                endPage=5;/*当前页在前三页 末页数固定为5*/
            }
        }

            result+="<div class='row'>" ;
                result+="<div class='col-sm-6'>" ;
                    result+="<div class='dataTables_info'  role='alert' aria-live='polite' aria-relevant='all'>" ;
                    result+="显示 "+startNum+" 到 "+endNum+" 项，共 "+totalNum+" 项" ;
                    result+="</div>" ;
                result+="</div>" ;
                result+="<div class='col-sm-6'>" ;
                    result+="<div class='dataTables_paginate paging_simple_numbers'>" ;
                        result+="<ul class='pagination'>" ;
                            result+= "<li class='paginate_button previous "+previousDisabled+"' aria-controls='DataTables_Table_0' tabindex='0'>" ;
                            result+="<a href='javascript:void(0);' "+previousPageJs+">上一页</a>" ;
                            result+="</li>";
                            for(int i=startPage;i<=endPage;i++){
                                String active="";
                                if(curPage==i){
                                    active="active";
                                }
                                result+="<li class='paginate_button "+active+"' aria-controls='DataTables_Table_0' tabindex='"+i+"'>" ;
                                result+="<a href='javascript:void(0);' onclick='goPageTo("+i+")'>"+i+"</a>" ;
                                result+="</li>" ;
                            }
                            result+="<li class='paginate_button next "+nextDisabled+"' aria-controls='DataTables_Table_0' tabindex='0'>" ;
                            result+="<a href='javascript:void(0);' "+nextPageJs+">下一页</a>" ;
                            result+="</li>" ;
                        result+="</ul>" ;
                    result+="</div>" ;
                result+="</div>" ;
            result+="</div>";
        return result;
    }



}
