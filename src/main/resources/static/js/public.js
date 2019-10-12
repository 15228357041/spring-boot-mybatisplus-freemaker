$(function(){

	$(document).on("click",".showImgLayer",function(){
		$(this).fadeOut().remove()
	});

	//switchBtn

	$(".switchBtn .radioBtn").click(function(){
		if(!$(this).is(".on")){
			$(this).addClass("on").siblings().removeClass("on")
		}
	});

});
	function showMsg(msg){
	    var div = $("<div/>").appendTo($("body"));
	    var p = $("<p/>").appendTo(div);

	    div.css({"position":"fixed","z-index":"10000000","top":"45%","left":"0","right":"0","display":"none","color":"#fff","font-size":"16px","text-align":"center"})
	    p.css({"display":"inline-block","padding":"15px","border-radius":"5px","background":"rgba(0,0,0,.6)"});
	    p.html(msg);
	    div.fadeIn();
	    setTimeout(function(){
	        div.fadeOut(300,function(){
	          div.remove();
	        });
	    },2000);
	}
	function showImg(src){
		var div = $("<div class='showImgLayer'/>").appendTo($("body"));
		var div2 =  $("<div/>").appendTo(div);
		div.css({"display":"none","position":"fixed","z-index":"10000000","top":"0","left":"0","right":"0","bottom":"0","background":"rgba(0,0,0,.5)"})
		div2.css({"position":"absolute","z-index":"100","top":"0","left":"0","right":"0","bottom":"0","background":"url("+src+") center no-repeat ","background-size":"contain"})
		
		div.fadeIn();
	}