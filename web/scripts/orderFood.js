$(document).ready(function(){
    
   $(".food-input").on("keyup", function(){
        const val = $(this).val().toLowerCase();
        $(".card").filter(function(){
            $(this).toggle($(this).text().toLowerCase().indexOf(val) > -1);
        });
    });
  
    
    $(".address-input").on("keyup", function() {
        var text = $(this).val().toLowerCase();

        $(".payment-opt").parentsUntil('.cards').hide();

        $(".payment-opt").filter(function () {
            return $(this).text().toLowerCase().indexOf(text) > -1;
        }).parentsUntil('cards').show();
    });
  
});