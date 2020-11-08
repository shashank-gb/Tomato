<%@page import="Model.shops"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order food online</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

    <link rel="stylesheet" href="CSS/order-food-online.css">
</head>

<body>
    <div class="root">
        <header class="header-container">
            <div class="header-wrapper">
                <h3 class="text-uppercase"><a href="index.jsp">Tomato</a></h3>
            </div>
        </header>
        <div class="wrapper" style="height: 4rem;"></div>
        <section>
            <div id="main-frame" class="wrapper">
                <div class="header mb-5">
                    <h1>Order food online</h1>
                </div>
                <div class="row">
                    <div role="group" class="col-sm-12 col-lg-2 px-0">
                        <div class="options mt-0 ">
                            <div class="header">
                                Filters
                            </div>
                            <div class="divider"></div>
                            <div class="filters-tab">
                                <div class="header">
                                    Quick Filters
                                </div>
                                <div class="content-container">
                                    <div class="content">
                                        <div class="filters-container">
                                            <form id="" action="">
                                                <div class="search-filters">
                                                    <span class="checkbox">
                                                        <input type="checkbox" class="c-box" aria-checked="false">
                                                        <span>Pure Veg</span>
                                                    </span>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="divider"></div>
                            <div class="filters-tab">
                                <div class="header">
                                    Sort by
                                </div>
                                <div class="content-container">
                                    <div class=" content ">
                                        <div class="filters-container ">
                                            <a href=" ">
                                                <div class="search-filters sort ">
                                                    <span>
                                                    Rating<span class="text-gray "> - high to low</span>
                                                    </span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="content">
                                        <div class="filters-container ">
                                            <a href=" ">
                                                <div class="search-filters sort ">
                                                    <span>
                                                    Price<span class="text-gray "> - low to high</span>
                                                    </span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="divider"></div>
                            <div class="filters-tab">
                                <div class="header">
                                    Cuisine
                                </div>
                                <div class="content-container">
                                    <div class=" content ">
                                        <div class="filters-container ">
                                            <a href=" ">
                                                <div class="search-filters cuisine ">
                                                    North Indian
                                                    <span class="float-right text-gray">
                                                    ?
                                                    </span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="content">
                                        <div class="filters-container ">
                                            <a href=" ">
                                                <div class="search-filters cuisine ">
                                                    South Indian
                                                    <span class="float-right text-gray">
                                                    ?
                                                    </span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="content">
                                        <div class="filters-container ">
                                            <a href=" ">
                                                <div class="search-filters cuisine ">
                                                    Fast Food
                                                    <span class="float-right text-gray">
                                                    ?
                                                    </span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="content">
                                        <div class="filters-container ">
                                            <a href=" ">
                                                <div class="search-filters cuisine ">
                                                    Pizza
                                                    <span class="float-right text-gray">
                                                    ?
                                                    </span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="content">
                                        <div class="filters-container ">
                                            <a href=" ">
                                                <div class="search-filters cuisine ">
                                                    Burger
                                                    <span class="float-right text-gray">
                                                    ?
                                                    </span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="content">
                                        <div class="filters-container ">
                                            <a href=" ">
                                                <div class="search-filters cuisine ">
                                                    Desserts
                                                    <span class="float-right text-gray">
                                                    ?
                                                    </span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-10 px-4">
                        <div class="searchbar">
                            <div class="row">
                                <div class="col-lg-4">
                                    <div class="header">Searching in...</div>
                                    <div class="location-search">
                                        <div class="float-left input">
                                            <i class="arrow-icon">
                                                <svg class="arrow-icon" xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 18 18">
                                                    <path id="ic_near_me_24px" d="M21,3,3,10.53v.98l6.84,2.65L12.48,21h.98Z" transform="translate(-3 -3)"/>
                                                  </svg>                                                  
                                            </i>
                                            <input type="text" class="address-input" placeholder="Please select your delivery location" autocomplete="off">
                                            <button class="detect-location">
                                                <i class="icon">
                                                    <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" viewBox="0 0 22 22">
                                                        <path id="ic_my_location_24px" d="M12,8a4,4,0,1,0,4,4A4,4,0,0,0,12,8Zm8.94,3A8.994,8.994,0,0,0,13,3.06V1H11V3.06A8.994,8.994,0,0,0,3.06,11H1v2H3.06A8.994,8.994,0,0,0,11,20.94V23h2V20.94A8.994,8.994,0,0,0,20.94,13H23V11H20.94ZM12,19a7,7,0,1,1,7-7A6.995,6.995,0,0,1,12,19Z" transform="translate(-1 -1)"/>
                                                      </svg>                                                      
                                                </i>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-8 pl-5">
                                    <div class="header">Searching for...</div>
                                    <div class="row">
                                        <div class="input">
                                            <input type="text" class="food-input" placeholder="Search for restaurants or cuisines..." autocomplete="off">
                                            <i class="search-icon">
                                                <svg class="search-icon" xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 17.49 17.49">
                                                    <path id="ic_search_24px" d="M15.5,14h-.79l-.28-.27a6.51,6.51,0,1,0-.7.7l.27.28v.79l5,4.99L20.49,19Zm-6,0A4.5,4.5,0,1,1,14,9.5,4.494,4.494,0,0,1,9.5,14Z" transform="translate(-3 -3)"/>
                                                </svg>                                                      
                                            </i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- <div class="col-sm-12 col-lg-6 px-0"> -->
                        <div class="row">
                            <form id="hotel" action="hotel" method="POST" class="w-100">
                            <section class="col-lg-12 results-container px-0">
                                <div id="search-list" class="cards">
                                    
                                    <%
                                        ArrayList<shops> shopList = (ArrayList<shops>)request.getAttribute("shopList");
                                        for(shops shop: shopList){
                                    %>
                                        <div class="card col-lg-6 col-sm-12 px-0">
                                            <div class="content">
                                                <div class="search-result">
                                                    <div class="col-sm-5 col-md-4">
                                                        <div class="img-container"></div>
                                                    </div>
                                                    <div class="col-sm-7 col-md-8 float-right">
                                                        <div class="details row">
                                                            <h3 class="shop-name"><%= shop.getRes_name() %></h3>
                                                            <div class="rating">
                                                                <div class="stars">
                                                                    <div class="star">
                                                                        <img src="assets/SVG/Star.svg" alt="">
                                                                    </div>
                                                                    <div class="star">
                                                                        <img src="assets/SVG/Star.svg" alt="">
                                                                    </div>
                                                                    <div class="star">
                                                                        <img src="assets/SVG/Star.svg" alt="">
                                                                    </div>
                                                                    <div class="star">
                                                                        <img src="assets/SVG/Star.svg" alt="">
                                                                    </div>
                                                                    <div class="star">
                                                                        <img src="assets/SVG/Star-gray.svg" alt="">
                                                                    </div>
                                                                </div>
                                                                <div class="rating-value"><%=shop.getRating()%></div>
                                                            </div>
                                                            <div class="desc">
                                                                <div class="cuisine-type text-gray"><%= shop.getRes_type() %></div>
                                                                <div class="min-cost">Min $<%=shop.getMin_cost()%></div>
                                                                <div class="payment-opt"><%= shop.getLocation() %></div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="btn-container">
                                                <button type="submit" onclick="callAjax()" name="<%= shop.getRes_id() %>" class="search-btn px-3 py-2">
                                                    Order Online 
                                                    <i class="icon">
                                                        <svg class="right-angle" xmlns="http://www.w3.org/2000/svg" width="7.41" height="10" viewBox="0 0 7.41 12" fill="#fff">
                                                            <path id="ic_keyboard_arrow_right_24px" d="M8.59,16.34l4.58-4.59L8.59,7.16,10,5.75l6,6-6,6Z" transform="translate(-8.59 -5.75)"/>
                                                        </svg>                                                      
                                                    </i>
                                                </button>
                                            </div>
                                        </div>
                                    <%}%> 
                                </div>
                            </section>
                            </form>
                        </div>
                        <!-- </div> -->
                    </div>
                </div>
            </div>
        </section>
    </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
    
    function callAjax(){

        window.location.href = "hotel?resName="+$(event.target).parent().siblings().find('.shop-name').text();
    }
    
</script>
<script src="scripts/orderFood.js"></script>
<script>
    
    $(".address-input").on("keyup", function() {
        var text = $(this).val().toLowerCase();

        $(".payment-opt").parentsUntil('.cards').hide();

        $(".payment-opt").filter(function () {
            return $(this).text().toLowerCase().indexOf(text) > -1;
        }).parentsUntil('cards').show();
    });
    
</script>
</body>

</html>