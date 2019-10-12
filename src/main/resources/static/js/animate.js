    $(function(){
    	pageInit();
    	initAnimate();
		function initAnimate() {
	        $("[data-animation]").each(function () {
	            var d = $(this),
					e = d.attr("data-animation"),
					f = d.attr("data-duration") || 500,
					g = d.attr("data-timing-function") || "ease",
					h = d.attr("data-delay") ? d.attr("data-delay") : 0,
					i = d.attr("data-iteration-count") || 1;
	            "followSlide" === e && ("horizontal" === w.direction && "forward" === o ? e = "followSlideToLeft" : "horizontal" === w.direction && "backward" === o ? e = "followSlideToRight" : "vertical" === w.direction && "forward" === o ? e = "followSlideToTop" : "vertical" === w.direction && "backward" === o && (e = "followSlideToBottom")), d.css({
	                "-webkit-animation": e + " " + f + "ms " + g + " " + h + "ms " + i + " both",
	                animation: e + " " + f + "ms " + g + " " + h + "ms " + i + " both"
	            })
	        })
	    }
	    function pageInit() {

        	var  g = 1,
	        h = $(window).width(),
	        i = $(window).height();
	        h / i >= 320 / 486 ? (g = i / 480) : (g = h / 320);

	        $("#mobileViewport").attr("content", "width=320, initial-scale=" + g + ", maximum-scale=" + g + ", user-scalable=no");

    	}
    });