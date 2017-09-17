/* ========== moment.html ========== */




$(document).ready(function(){
	var itemNum = 0;

    var addList = function() {
        if($(document).height() - $(window).height() - $(document).scrollTop() < 50) {
            $.post("moment/getMoments", {itemNum:itemNum}, function(data,status){
                if(status == "success") {
                    itemNum++;
                    var item = '<li class="momentItem momentItemHidden"><p>' + itemNum + " - " + data["author"] + " - " + data["content"] + '</p></li>';
                    $(".momentList").append(item).children(':last').animate({left:'0px',opacity:'1.0'},400);
                    console.info("Data: " + data["content"] + "\nStatus: " + status);
                } else {
                    console.info("fail");
                }
            });
        }
    }

    addList();
    addList();
    addList();
    addList();
    addList();
    addList();

    //滚动条事件
    $(document).scroll(addList);

	//滚动到顶部按钮
	$(".gotoTop").click(function() {
		$('html,body').animate({scrollTop:0},'slow');
	});
	
});





