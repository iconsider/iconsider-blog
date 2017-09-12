/* ========== moment.html ========== */

var item = '<li class="momentItem momentItemHidden"><p>假装有内容</p></li>';


$(document).ready(function(){
	//临时添加item
	$(".addItem").click(function() {
		console.info("hi");
		
		
		$(".momentList").append(item).children(':last').animate({left:'0px',opacity:'1.0'},400);
	});
	
	//滚动条事件
	$(document).scroll(function() {
		//console.info("触发滚动事件, document的总高：" + $(document).height() + "，距离顶端有多少像素：" + $(document).scrollTop());
		if($(document).height() - $(window).height() - $(document).scrollTop() < 50) {
			console.info("滚动条滚到临界点啦");
			$(".momentList").append(item).children(':last').animate({left:'0px',opacity:'1.0'},400);
		}
	});
	
	//滚动到顶部按钮
	$(".gotoTop").click(function() {
		console.info("top");
		$('html,body').animate({scrollTop:0},'slow');
	});
	
});





