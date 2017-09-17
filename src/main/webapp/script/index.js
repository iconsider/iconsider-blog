$(document).ready(function(){
    //临时添加item
    $(".ajax_test").click(function() {
        $.post("testController/test1", {age:250}, function(data,status){
            alert("Data: " + data + "\nStatus: " + status);
        });
    });
});