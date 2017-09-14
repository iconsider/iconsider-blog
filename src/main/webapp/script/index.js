$(document).ready(function(){
    //临时添加item
    $(".ajax_test").click(function() {
        $.get("data.txt", function(data,status){
            alert("Data: " + data + "\nStatus: " + status);
        });
    });
});