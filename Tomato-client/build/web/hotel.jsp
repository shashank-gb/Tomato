<%@page import="Model.fetchFoodList.restaurant"%>
<%@page import="Model.fetchFoodList"%>
<%@page import="Model.foods"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Order</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="CSS/modal.css">
        <link rel="stylesheet" href="CSS/navBar.css">
        <link rel="stylesheet" href="CSS/hotel.css">

        <style>
            .cost span:before{
                content: "$";
            }

            .sub-amt:before{
                content: "Subtotal : ";
            }
        </style>
    </head>

    <body>
        <%
            String resName = request.getParameter("resName");
            String resId = request.getParameter("resId");
            String url = "hotel.jsp?resName=" + resName+ "&resId=" +resId;
            session.setAttribute("jspName", url);
        %>
        <%@include file="assets/JSP/login.jsp" %>
        <%@include file="assets/JSP/signup.jsp" %>
        <%@include file="assets/JSP/navBar.jsp" %>
        <div class="root">
            <div class="wrapper">
                <section class="gallery">
                    <div class="gallery-container">
                        <div class="main-img">
                            <img src="images/main-img.webp" alt="">
                        </div>
                        <section class="extra-images">
                            <div class="img-container">
                                <img src="images/side-img1.webp" alt="">
                            </div>
                            <div class="img-container">
                                <img src="images/side-img2.webp" alt="">
                            </div>
                        </section>
                        <section class="extra-images">
                            <div class="img-container more">
                                <img src="images/side-img3.webp" alt="">
                                <p class="more-text">View more</p>
                            </div>
                            <div class="add-img">
                                <section class="cam-container">
                                    <div class="cam-logo">
                                        <svg xmlns="http://www.w3.org/2000/svg" fill="#FFFFFF" width="20" height="20" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 kIxlGM"><linearGradient id="ckgga95ua007y3a6gr4xdf21n" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#FFFFFF"></stop><stop offset="100%" stop-color="#FFFFFF"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>camera-add</title><path d="M8.82 7.32c-0.020 0-0.040 0-0.060 0-2.32 0-4.2 1.86-4.24 4.16v0c0.040 2.32 1.92 4.18 4.24 4.18 0.020 0 0.040 0 0.060 0v0c0 0 0.020 0 0.040 0 2.32 0 4.2-1.86 4.24-4.18v0c-0.040-2.3-1.92-4.16-4.24-4.16-0.020 0-0.040 0-0.060 0h0.020zM8.82 14.22c-0.020 0-0.020 0-0.020 0-1.52 0-2.78-1.2-2.84-2.74v0c0.040-1.52 1.26-2.74 2.8-2.74 0.020 0 0.040 0 0.060 0v0c0 0 0.020 0 0.040 0 1.54 0 2.78 1.22 2.8 2.74v0c-0.060 1.54-1.3 2.74-2.84 2.74 0 0 0 0 0 0v0zM16.66 10.42c-0.12 0-0.24 0.1-0.24 0.24v0 4.34c0 1.42-1.16 2.56-2.58 2.56 0 0 0 0 0 0h-9.82c0 0 0 0 0 0-1.42 0-2.58-1.14-2.6-2.56v-6.22c0.020-1.34 1.1-2.42 2.44-2.42 0.020 0 0.020 0 0.040 0v0h0.38c0.3 0 0.54-0.16 0.66-0.4v-0.020l0.94-1.98c0.2-0.4 0.58-0.68 1.060-0.68v0h2.32c0 0 0 0 0 0 0.48 0 0.88 0.28 1.080 0.68v0l0.94 1.98c0.12 0.26 0.36 0.42 0.66 0.42h0.44s0-0.84 0-1.080c0-0.24-0.060-0.46-0.16-0.66v0.020l-0.58-1.28c-0.42-0.9-1.34-1.52-2.38-1.52 0 0 0 0 0 0h-2.32c0 0 0 0 0 0-1.060 0-1.96 0.62-2.38 1.52v0l-0.74 1.58c-2.1 0.020-3.8 1.72-3.82 3.8v0 6.22c0 0 0 0.020 0 0.020 0 2.22 1.8 4 4.020 4 0 0 0 0 0 0h9.82c0 0 0 0 0 0 2.2 0 4-1.78 4-3.98v-4.34c0-0.14-0.1-0.24-0.22-0.24v0zM19.28 5.42h-1.9v-1.9c0-0.4-0.32-0.72-0.72-0.72s-0.7 0.32-0.7 0.72v0 1.9h-1.92c-0.38 0-0.7 0.32-0.7 0.7s0.32 0.72 0.7 0.72v0h1.92v1.9c0 0.4 0.32 0.72 0.7 0.72s0.72-0.32 0.72-0.72v0-1.9h1.9c0.4 0 0.72-0.32 0.72-0.72s-0.32-0.7-0.72-0.7v0z" fill="url(#ckgga95ua007y3a6gr4xdf21n)"></path></svg>
                                    </div>
                                    Add Photos
                                </section>
                            </div>
                        </section>
                    </div>
                </section>
            </div>
            <div class="wrapper">
                <section class="hotel-details-container">
                    <section class="hotel-details">
                        <%
                            fetchFoodList fetchFL = new fetchFoodList(session);
                            int resID = Integer.parseInt(request.getParameter("resId"));
                            restaurant res = fetchFL.getRestaurantDetails(resID);
                            String pref = "";
                            if (res.preference == 'V') {
                                pref = "Veg";
                            } else {
                                pref = "Non-veg";
                            }
                        %>
                        <h1 id="<%=request.getParameter("resId")%>" class="heading res-name"><%= res.resName%></h1>
                        <section class="details">
                            <div class="type-v"><%= pref%></div>
                            <div class="type-nv">Non-veg</div>
                            <div class="address"><%= res.address %> - <%= res.city %></div>
                        </section>
                        <section class="timing">
                            <span class="status">status</span>
                            <span class="time">10am - 9pm</span>
                        </section>
                    </section>
                    <article class="options">
                        <section role="tablist" class="opt-list">
                            <div id="tab0" tabindex="0" role="tab" class="opt order-food">
                                <span id="tab0" class="tab" tabindex="-1">
                                    <a href="" class="tab-link">Order Online</a>
                                </span>
                                <hr class="h-rule">
                            </div>
                            <div id="tab1" tabindex="0" role="tab" class="opt photos">
                                <span id="tab1" class="tab" tabindex="-1">
                                    <a href="" class="tab-link">Photos</a>
                                </span>
                                <hr class="h-rule">
                            </div>
                            <hr class="border-bottom">
                        </section>
                    </article>
                </section>
                <section class="body-container">
                    <div class="row">
                        <div role="group" class="col-sm-12 col-lg-2 px-0">
                            <div class="options">
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
                            </div>
                        </div>
                        <div class="col-sm-10 col-lg-10">
                            <section class="food-list-container">
                                <div class="heading">
                                    Order Online
                                </div>
                                <!--div class="location">
                                    <div class="location-inner">
                                        <i>
                                            <svg xmlns="http://www.w3.org/2000/svg" fill="#fff" width="16" height="16" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 kaLXAT"><linearGradient id="ckggubtmy01hs3a73y0jnitl0" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#fff"></stop><stop offset="100%" stop-color="#fff"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><g clip-path="url(#clip0)"><path d="M14.75 8.3125L9.25 13.8125C9.125 13.9375 8.9375 14.0625 8.75 14.0625C8.5625 14.0625 8.375 14 8.1875 13.8125L5.1875 10.8125C4.875 10.5 4.875 10.0625 5.1875 9.75C5.5 9.4375 5.9375 9.4375 6.25 9.75L8.75 12.1875L13.6875 7.25C14 6.9375 14.4375 6.9375 14.75 7.25C15.0625 7.5625 15.0625 8 14.75 8.3125ZM17.0625 2.9375C13.125 -1 6.8125 -1 2.9375 2.9375C-0.9375 6.8125 -0.9375 13.1875 2.9375 17.0625C6.875 21 13.1875 21 17.125 17.0625C21.0625 13.125 21 6.8125 17.0625 2.9375Z" fill="url(#ckggubtmy01hs3a73y0jnitl0)"></path></g><defs><clipPath id="clip0"><rect width="20" height="20"></rect></clipPath></defs></svg>
                                        </i> Delivering to:
                                        <span class="place">?</span>
                                    </div>
                                    <span class="change">CHANGE</span>
                                </div-->
                                <div style="height: 1.7rem"></div>
                                <%
                                    ArrayList<foods> foodList = fetchFL.getAllFoods(request.getParameter("resName"));
                                    for (foods food : foodList) {
                                %>
                                <div class="foodlist-outer">
                                    <div class="foodlist-inner">
                                        <div class="img-container">
                                            <div class="img-wrapper">
                                                <div class="img-div"></div>
                                                <img src="images/side-img1.webp" alt="">
                                            </div>
                                        </div>
                                        <div type="<%= food.getFoodPreference()%>" class="logo-container">
                                            <div class="logo"></div>
                                        </div>
                                        <div class="food-details-container">
                                            <div class="food-details-inner">
                                                <div class="food-details-wrapper">
                                                    <h4 id="<%= food.getFoodId()%>" class="heading food-name"><%=food.getFoodName()%></h4>
                                                    <div class="stars">
                                                        <img src="assets/SVG/Star.svg" alt="">
                                                        <img src="assets/SVG/Star.svg" alt="">
                                                        <img src="assets/SVG/Star.svg" alt="">
                                                        <img src="assets/SVG/Star.svg" alt="">
                                                        <img src="assets/SVG/Star-gray.svg" alt="">
                                                    </div>
                                                    <div class="cost">
                                                        <span><%=food.getFoodCost()%></span>
                                                    </div>
                                                </div>
                                                <div class="order-btn-container">
                                                    <div class="order-btn">
                                                        <input type="button" value="-" class="negative" >
                                                        <span class="add txt">Add</span>
                                                        <input type="button" class="qty add" value="0">
                                                        <input type="button" value="+" class="positive" >
                                                    </div>
                                                    <span class="customize"></span>
                                                </div>
                                            </div>
                                            <p class="description"><%= food.getFoodDescription()%></p>
                                        </div>
                                    </div>
                                </div>
                                <%
                                    }

                                %>
                                <section class="tot-amt-calculator ">
                                    <div class="tot-amt-container">
                                        <div class="amt-btn-container">
                                            <span class="sub-amt">0</span>
                                            <button role="button" class="btn btn-danger cont-btn">
                                                Continue
                                            </button>
                                        </div>
                                    </div>
                                </section>
                            </section>
                        </div>
                    </div>
                </section>

            </div>
        </div>
    </body>
    <%@include file="assets/JSP/loginSignupChecker.jsp" %>
    <script src="scripts/index.js"></script>
    <script src="scripts/orderFood.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
        $('.cont-btn').click(function () {
            var foods = [];
            $('.foodlist-outer').each(function () {
                var qtyVal = $(this).find('.qty').val();
                if (qtyVal > 0) {
                    var food = new Food($(this).find('.food-name').attr('id'), $(this).find('.food-name').text(), $(this).find('.cost span').text(), qtyVal, $(this).find('.logo-container').attr("type"));
                    foods.push(food);
                }
            });
            console.log(foods);
            window.location.href = "Verify?cartItems=" + JSON.stringify(foods) + "&resName=<%=request.getParameter("resName")%>&resId=<%=request.getParameter("resId")%>";
        });
        function Food(id, name, cost, qty, preference) {
            this.id = id;
            this.name = name;
            this.cost = cost;
            this.qty = qty;
            this.preference = preference;
        }

    </script>



    <script src="scripts/jquery.validate.js"></script>
    <script src="scripts/validation.js"></script>

</html>