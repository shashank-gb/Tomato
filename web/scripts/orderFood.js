$(document).ready(function(){
    
   $(".food-input").on("keyup", function(){
        const val = $(this).val().toLowerCase();
        $(".card").filter(function(){
            $(this).toggle($(this).text().toLowerCase().indexOf(val) > -1);
        });
    });
    
   

});