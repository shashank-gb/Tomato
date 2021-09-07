$(document).ready(function() {
    
    //   Terms and Condition
    
    
    $('.c-box').click(function() {
        if ($(this).is(':checked')) {
            $('#create-acc-btn').attr("disabled", false);
        } else {
            $('#create-acc-btn').attr("disabled", true);
        }
    });

    //    User options

    $('.login-status-container').click(function() {
        $(".drop-down-icon").toggleClass('flip');
        $(".user-options").toggle(100);
    });
    
    $('.custom-dropdown').click(function(){
       $(".toggle-down").toggleClass('flip');
       $(".dropdown-options.found").toggle(100);
    });
    
    $('.custom-search').click(function(){
       $(".restaurant-options").toggle(100);
    });

    $(document).on("click", function(event){
        var $userOptTrigger = $(".login-status-container");
        var $dropdownOptTrigger = $(".custom-dropdown");
        var $resOptTrigger = $(".custom-search");
        
        if($userOptTrigger !== event.target && !$userOptTrigger.has(event.target).length){
            $(".user-options").hide();
            $(".drop-down-icon").removeClass('flip');
        } 
        
        if($dropdownOptTrigger !== event.target && !$dropdownOptTrigger.has(event.target).length){
            $(".dropdown-options.found").hide();
            $(".toggle-down").removeClass('flip');
        }
        
        if($resOptTrigger !== event.target && !$resOptTrigger.has(event.target).length){
            $(".restaurant-options").hide();
        }
    });
    
    
    //    Set options to input
    
    $('.dropdown-options.found').click(function(e){
        const clickedLoc = $(e.target).text();
        console.log(clickedLoc);
        $('.location-input').focus();
        $('.location-input').val(clickedLoc);
    });
    
    //    Search Filters
    
    $(".location-input").on("keyup", function(){
        
        const val = $(this).val().toLowerCase();
        let found = false;
        $(".dropdown-options.found .opt").filter(function(){
            $(this).toggle($(this).text().toLowerCase().indexOf(val) > -1)
            
            if ($(this).text().toLowerCase().indexOf(val) > -1) {
                $('.not-found').hide();
                found = true;
             }
            
            if(!found){
                $('.not-found').show();
            }
        });
    });
                
    $(".search-input").on("keyup", function(){
        const val = $(this).val().toLowerCase();
        $(".restaurant-options .opt").filter(function(){
            $(this).toggle($(this).text().toLowerCase().indexOf(val) > -1)
        });
    });
    
    //    Increment Decrement Quantity Button
    
    if ($('.qty').val() == 0) {
        $('.negative').hide();
        $('.txt').show();
        $('.qty.add').hide();
    }
    $("input").click(function() {
        let clickAction = $(this).val();
        let displayElement = $(this).parent().find("input.qty");
        let currentval = +$(displayElement).val();

        if (clickAction === "+") {
            $(this).parent().find("input.qty").show();
            $(this).parent().find(".negative").show();
            $(this).parent().find(".txt").hide();
            currentval++;
        } else if (clickAction === "-") {
            if (currentval > 1) {
                currentval--;
            } else {
                currentval--;
                console.log(currentval);
                $(this).parent().find("input.qty").hide();
                $(this).parent().find("input.negative").hide();
                $(this).parent().find(".txt").show();
            }
        }
        $(displayElement).val(currentval);
    });
        

    //  Amount Calculator in foodOrder.jsp 
    
    $('.tot-amt-calculator').hide();
        
        var totCost = parseInt(0);
        $('.positive').click(function(){
            $('.tot-amt-calculator').show();
            var perCost = $(this).parent().parent().siblings('.food-details-wrapper').find('span').text();
            
            totCost = totCost + parseInt(perCost);
            $('.sub-amt').text(totCost);
        });
        
        $('.negative').click(function(){
            var perCost = $(this).parent().parent().siblings('.food-details-wrapper').find('span').text();
            
            totCost = totCost - parseInt(perCost);
            $('.sub-amt').text(totCost);
            
            if($('.sub-amt').text() === "0"){
                $('.tot-amt-calculator').hide();
            }
        });

    
});