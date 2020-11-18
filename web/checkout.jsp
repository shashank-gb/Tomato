<%-- 
    Document   : checkout
    Created on : 9 Nov, 2020, 9:02:14 PM
    Author     : SHASHANKgb
--%>

<%@page import="java.util.List"%>
<%@page import="Model.cartItems"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Checkout</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="CSS/hotel.css">
        <link rel="stylesheet" href="CSS/navBar.css">
        <link rel="stylesheet" href="CSS/checkout.css">
        <link rel="stylesheet" href="CSS/modal.css">

        <style>
            .flip {
                transform: rotate(180deg) !important;
            }
            .pay-type:before{
                content: " using ";
            }
        </style>
    </head>

    <body>
        <%
            String cartItems = request.getAttribute("jsonString").toString();
            String resName = request.getAttribute("resName").toString();
            String resId = request.getAttribute("resId").toString();
            String url = "Verify?cartItems=" + cartItems + "&resName=" + resName + "&resId=" + resId;
            System.out.println(url);
            session.setAttribute("jspName", url);
        %>

        <div id="root">
            <%@include file="assets/JSP/login.jsp" %>
            <%@include file="assets/JSP/signup.jsp" %>
            <!-- Address modal -->

            <div class="modal fade" id="addressModal" tabindex="-1" aria-labelledby="signupModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered">
                    <div class="modal-content">
                        <div class="modal-header">
                            <section class="mh-wrapper">
                                <h2 class="modal-title" id="loginModalLabel">Address</h2>
                                <button type="button" class="close ml-auto" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true" class="close-btn">
                                        <svg xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="24" height="24" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 byLLrW"><linearGradient id="ckhhhxahx00s73b76avehnjd6" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#1C1C1C"></stop><stop offset="100%" stop-color="#1C1C1C"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>cross</title><path d="M11.42 10.42l3.54-3.54c0.38-0.4 0.38-1.040 0-1.42s-1.020-0.4-1.42 0l-3.54 3.54-3.54-3.54c-0.4-0.4-1.020-0.4-1.42 0s-0.38 1.020 0 1.42l3.54 3.54-3.54 3.54c-0.38 0.38-0.38 1.020 0 1.42 0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28l3.54-3.56 3.54 3.56c0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28c0.38-0.4 0.38-1.040 0-1.42l-3.54-3.54z" fill="url(#ckhhhxahx00s73b76avehnjd6)"></path></svg>
                                    </span>
                                </button>
                            </section>
                        </div>
                        <div class="modal-body">
                            <section class="mb-wrapper rform">
                                <form method="POST" action="" id="address" class="w-100">
                                    <div class="fullname" type="number" inputmode="numeric">
                                        <div class="name-inner">
                                            <input id="dno" name="dno" class="name-input" placeholder="Flat No./Door No." autocomplete="off">
                                        </div>
                                        <div style="height: 1rem;"></div>
                                        <div class="fullname-inner">
                                            <input id="street" name="street" class="mail-input" placeholder="Street" autocomplete="off">
                                        </div>
                                        <!-- <span id="email-err"></span> -->
                                        <div style="height: 1rem;"></div>
                                        <div class="pwd">
                                            <input id="city" name="city" class="pass-input"  placeholder="City" autocomplete="off">
                                        </div>
                                        <div style="height: 1rem;"></div>
                                        <!-- <span id="pass-err"></span> -->
                                        <div class="pwd">
                                            <input id="state" name="state" class="pass-input"  placeholder="State" autocomplete="off">
                                        </div>
                                        <div style="height: 1rem;"></div>
                                    </div>
                                    <div class="btn">
                                        <input id="add-address" type="submit" onclick="addAddress()" class="btn btn-danger" value="Confirm & Proceed">
                                    </div>
                                </form>
                            </section>
                        </div>
                    </div>
                </div>
            </div>
            <%@include file="assets/JSP/navBarWOOpt.jsp" %>
            <div class="wrapper">
                <h3 class="mt-4">Secure Checkout</h3>
                <div class="body-container">
                    <!-- Load when not sign-in -->
                    <div id="before-login" class="left-container">
                        <div class="card">
                            <div class="card-body">
                                <h4>Account</h4>
                                <p class="text-gray desc">It's easy to login or create an account in Tomato</p>
                                <div class="btn-container">
                                    <button class="btn btn-outline-danger login-btn" data-toggle="modal" data-target="#loginModal">Login</button>
                                    <button class="btn btn-danger signup-btn"data-toggle="modal" data-target="#signupModal">Signup</button>
                                </div>
                            </div>
                        </div>
                        <div style="height: 1rem;"></div>
                        <div class="card address-container">
                            <div class="card-body">
                                <h5>Delivery Address</h5>
                                <p class="text-gray">Login to choose address</p>
                            </div>
                        </div>
                        <div style="height: 1rem;"></div>
                        <div class="card address-container">
                            <div class="card-body">
                                <h5>Select Payment Method</h5>
                                <p class="text-gray">Login and select delivery address to select payment methods</p>
                            </div>
                        </div>
                    </div>
                    <!-- Load when Sign In -->
                    <div id="after-login" class="left-container">
                        <div class="card">
                            <div class="card-body">
                                <h4 id="<%=session.getAttribute("userId")%>"><%= session.getAttribute("uname")%></h4>
                                <p class="text-gray desc">You are Securely logged in</p>
                            </div>
                        </div>
                        <div style="height: 1rem;"></div>
                        <div class="card address-container">
                            <div class="card-body">
                                <h5>Delivery Address</h5>
                                <div class="selected-address">
                                    <div class="select-inner">
                                        <div class="tick-container">
                                            <i class="tick-logo" color="#2781E7">
                                                <svg xmlns="http://www.w3.org/2000/svg" fill="#2781E7" width="18" height="18" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img">
                                                <linearGradient id="check" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#2781E7"></stop><stop offset="100%" stop-color="#2781E7"></stop></linearGradient>
                                                <g clip-path="url(#clip0)"><path d="M14.75 8.3125L9.25 13.8125C9.125 13.9375 8.9375 14.0625 8.75 14.0625C8.5625 14.0625 8.375 14 8.1875 13.8125L5.1875 10.8125C4.875 10.5 4.875 10.0625 5.1875 9.75C5.5 9.4375 5.9375 9.4375 6.25 9.75L8.75 12.1875L13.6875 7.25C14 6.9375 14.4375 6.9375 14.75 7.25C15.0625 7.5625 15.0625 8 14.75 8.3125ZM17.0625 2.9375C13.125 -1 6.8125 -1 2.9375 2.9375C-0.9375 6.8125 -0.9375 13.1875 2.9375 17.0625C6.875 21 13.1875 21 17.125 17.0625C21.0625 13.125 21 6.8125 17.0625 2.9375Z" fill="url(#check)"></path></g>
                                                </svg>
                                            </i>
                                        </div>
                                        <div class="address-detail">
                                            <p class="address text-gray">747/4, New Masjid road Chowkipete, Davanagere, Karnataka</p>
                                        </div>
                                    </div>
                                    <p class="change">CHANGE</p>
                                </div>
                                <div class="add-address-outer">
                                    <div class="address-list-container">
                                        <!--<div>-->
                                        <div class="list-inner">
                                            <div class="tick-container">
                                                <i class="tick-logo">
                                                    <svg xmlns="http://www.w3.org/2000/svg" fill="#2781E7" width="18" height="18" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img">
                                                    <linearGradient id="check1" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#2781E7"></stop><stop offset="100%" stop-color="#2781E7"></stop></linearGradient>
                                                    <g clip-path="url(#clip0)"><path d="M14.75 8.3125L9.25 13.8125C9.125 13.9375 8.9375 14.0625 8.75 14.0625C8.5625 14.0625 8.375 14 8.1875 13.8125L5.1875 10.8125C4.875 10.5 4.875 10.0625 5.1875 9.75C5.5 9.4375 5.9375 9.4375 6.25 9.75L8.75 12.1875L13.6875 7.25C14 6.9375 14.4375 6.9375 14.75 7.25C15.0625 7.5625 15.0625 8 14.75 8.3125ZM17.0625 2.9375C13.125 -1 6.8125 -1 2.9375 2.9375C-0.9375 6.8125 -0.9375 13.1875 2.9375 17.0625C6.875 21 13.1875 21 17.125 17.0625C21.0625 13.125 21 6.8125 17.0625 2.9375Z" fill="url(#check1)"></path></g>
                                                    </svg>
                                                </i>
                                            </div>
                                            <div class="address-detail">
                                                <p class="address">747/4, New Masjid road Chowkipete, Davanagere, Karnataka</p>
                                                <div class="btn-container">
                                                    <button onclick="selectDelivery()" class="btn deliver-btn">Deliver here</button>
                                                    <!--                                                        <button class="btn edit-btn">Edit</button>-->
                                                </div>
                                            </div>
                                        </div>
                                        <!--</div>-->
                                    </div>
                                    <div class="add-address" type="button" data-toggle="modal" data-target="#addressModal">
                                        <i><svg xmlns="http://www.w3.org/2000/svg" fill="#ED5A6B" width="24" height="24" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 byLLrW"><linearGradient id="ckhalv3x300xi3b768k68z5wz" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#ED5A6B"></stop><stop offset="100%" stop-color="#ED5A6B"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>plus</title><path d="M15.5 9.42h-4.5v-4.5c0-0.56-0.44-1-1-1s-1 0.44-1 1v4.5h-4.5c-0.56 0-1 0.44-1 1s0.44 1 1 1h4.5v4.5c0 0.54 0.44 1 1 1s1-0.46 1-1v-4.5h4.5c0.56 0 1-0.46 1-1s-0.44-1-1-1z" fill="url(#ckhalv3x300xi3b768k68z5wz)"></path></svg></i>
                                        <p>Add Address</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div style="height: 1rem;"></div>
                        <div class="card payment-details">
                            <div class="card-body">
                                <h5>Select Payment Method</h5>
                                <div class="payment-options">
                                    <div class="atm-card">
                                        <h6>Credit, Debit & ATM Cards</h6>
                                        <i class="drop-down-icon flip">
                                            <svg xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="20" height="20" viewBox="0 0 20 20" aria-labelledby="icon-svg-title-ChevronDown icon-svg-desc-ChevronDown" role="img" class="rbbb40-0 kIxlGM"><title id="icon-svg-title-ChevronDown">Chevron Down icon</title><desc id="icon-svg-desc-ChevronDown">It is an icon with title Chevron Down</desc><title>chevron-down</title><path d="M4.48 7.38c0.28-0.28 0.76-0.28 1.060 0l4.46 4.48 4.48-4.48c0.28-0.28 0.76-0.28 1.060 0s0.28 0.78 0 1.060l-5 5c-0.3 0.3-0.78 0.3-1.060 0l-5-5c-0.3-0.28-0.3-0.76 0-1.060z"></path></svg>
                                        </i>
                                    </div>
                                    <div class="cash-outer">
                                        <div class="cash">
                                            <h6>Cash</h6>
                                            <i class="drop-down-icon">
                                                <svg xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="20" height="20" viewBox="0 0 20 20" aria-labelledby="icon-svg-title-ChevronDown icon-svg-desc-ChevronDown" role="img" class="rbbb40-0 kIxlGM"><title id="icon-svg-title-ChevronDown">Chevron Down icon</title><desc id="icon-svg-desc-ChevronDown">It is an icon with title Chevron Down</desc><title>chevron-down</title><path d="M4.48 7.38c0.28-0.28 0.76-0.28 1.060 0l4.46 4.48 4.48-4.48c0.28-0.28 0.76-0.28 1.060 0s0.28 0.78 0 1.060l-5 5c-0.3 0.3-0.78 0.3-1.060 0l-5-5c-0.3-0.28-0.3-0.76 0-1.060z"></path></svg>
                                            </i>
                                        </div>
                                        <div class="cash-opt">
                                            <section class="cash-opt-inner">
                                                <p>Cash On Delivery</p>
                                                <i><svg xmlns="http://www.w3.org/2000/svg" fill="#119199" width="18" height="18" viewBox="0 0 20 20" aria-labelledby="icon-svg-title-CheckCircle icon-svg-desc-CheckCircle" role="img" class="rbbb40-0 knjgIY"><title id="icon-svg-title-CheckCircle">Check Circle icon</title><desc id="icon-svg-desc-CheckCircle">It is an icon with title Check Circle</desc><path d="M1.5 10C1.5 5.3125 5.3125 1.5 10 1.5C14.6875 1.5 18.5 5.3125 18.5 10C18.5 14.6875 14.6875 18.5 10 18.5C5.3125 18.5 1.5 14.6875 1.5 10ZM0 10C0 15.5 4.5 20 10 20C15.5 20 20 15.5 20 10C20 4.5 15.5 0 10 0C4.5 0 0 4.5 0 10ZM13.75 7.25L8.75 12.1875L6.25 9.75C5.9375 9.4375 5.5 9.4375 5.1875 9.75C4.875 10 4.875 10.5 5.1875 10.8125L8.1875 13.8125C8.3125 13.9375 8.5 14.0625 8.75 14.0625C8.9375 14.0625 9.125 14 9.25 13.8125L14.75 8.3125C15.0625 8 15.0625 7.5625 14.75 7.25C14.4375 6.9375 14 6.9375 13.75 7.25Z"></path></svg></i>
                                            </section>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="right-container">
                        <div class="top">
                            <h5>Summary</h5>
                            <div class="inner-container">
                                <div class="hotel-details">
                                    <p class="ord-from">ORDER FROM</p>
                                    <p id="<% out.print(resId);%>" class="hotel-name"><% out.print(resName); %></p>
                                    <p class="address">Pending ...</p>
                                </div>

                                <div class="food-details">
                                    <%
                                        List<cartItems> cartItemsList = (List<cartItems>) request.getAttribute("cartItemsList");
                                        for (cartItems cartItem : cartItemsList) {
                                            System.out.println(cartItem.getName() + " " + cartItem.getCost() + " " + cartItem.getQty() + " " + cartItem.getPreference());

                                    %>
                                    <div class="single-food">
                                        <div type="<%=cartItem.getPreference()%>" class="outer">
                                            <div class="inner"></div>
                                        </div>
                                        <div class="food">
                                            <div class="food-inner">
                                                <p id="<%= cartItem.getId()%>" class="food-name"><%= cartItem.getName()%></p>
                                                <span class="cost"><%= cartItem.getCost()%></span>
                                            </div>
                                            <div class="order-btn-container">
                                                <div class="order-btn">
                                                    <input type="button" value="-" class="negative" >
                                                    <input type="button" min="1" class="qty add" value="<%= cartItem.getQty()%>">
                                                    <input type="button" value="+" class="positive" >
                                                </div>
                                                <p class="sub-amt"></p>
                                            </div>
                                        </div>
                                    </div>
                                    <%
                                        }
                                    %>
                                </div>
                                <div class="amt-details">
                                    <div class="sub-tot">
                                        <p>Subtotal</p>
                                        <span class="cost sub-tot"></span>
                                    </div>
                                    <div class="charges">
                                        <p>Taxes & charges</p>
                                        <span class="cost charge">10</span>
                                    </div>
                                    <hr>
                                    <div class="grand-total">
                                        <p>Grand Total</p>
                                        <span class="cost total"></span>
                                    </div>
                                </div>
                            </div>
                            <p class="warning">Orders once placed cannot be canceled and are non-refundable.</p>
                            <div class="place-order">
                                <button class="btn order-btn" onclick="callOrderServlet()">Place order <span class="pay-type"></span></button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>

    <script>

    </script>
    <script>
        $(document).ready(function () {
            var totCost = parseInt(0);
            var sum = 0;
            $('.sub-amt').each(function () {
                var subAmt = $(this);
                var incElement = subAmt.siblings('.order-btn').find('.positive');
                var decElement = subAmt.siblings('.order-btn').find('.negative');
                var qty = subAmt.parent().find('.qty').val();
                var perCost = parseInt(subAmt.parent().siblings('.food-inner').find('.cost').text());
                totCost = qty * perCost;
                subAmt.text(totCost);

                sum += parseFloat(subAmt.text());
                $('.sub-tot.cost').text(sum);
                $('.cost.total').text(sum + 10);

                $(incElement).click(function () {
                    var perCost = $(this).parent().parent().siblings('.food-inner').find('.cost').text();
                    var qty = $(this).siblings('.qty').val();
                    $(subAmt).text(perCost * ++qty);
                    sum += parseInt(perCost);
                    $('.sub-tot.cost').text(sum);
                });

                $(decElement).click(function () {
                    var perCost = $(this).parent().parent().siblings('.food-inner').find('.cost').text();
                    var qty = $(this).siblings('.qty').val();
                    $(subAmt).text(perCost * --qty);
                    sum -= parseInt(perCost);
                    $('.sub-tot.cost').text(sum);
                });


            });

            $('.sub-tot.cost').on('DOMSubtreeModified', function () {
                var subTot = parseInt($(this).text());
                var charges = parseInt(10);
                $('.cost.total').text(subTot + charges);
            });

            $("input").click(function () {
                let clickAction = $(this).val();
                let displayElement = $(this).parent().find("input.qty");
                let currentval = +$(displayElement).val();

                if (clickAction === "+") {
                    $(this).parent().find("input.qty").show();
                    $(this).parent().find(".negative").show();
                    currentval++;
                } else if (clickAction === "-") {
                    if (currentval > 1) {
                        currentval--;
                    } else {
                        currentval--;
                        $(this).parent().find("input.qty").hide();
                        $(this).parent().find("input.negative").hide();
                    }
                }
                $(displayElement).val(currentval);
            });

        });


    </script>

    <%@include file="assets/JSP/loginSignupChecker.jsp" %>
    <script src="scripts/jquery.validate.js"></script>
    <script src="scripts/validation.js"></script>

    <script>
        $('#address').submit(function (event) {
            event.preventDefault();
        });
        $('#address').validate({
            rules: {
                dno: {
                    required: true
                },
                street: {
                    required: true
                },
                city: {
                    required: true
                },
                state: {
                    required: true
                }
            },
            messages: {
                dno: {
                    required: "Flat No. should not be empty!!"
                },
                street: {
                    required: "Street should not be empty!!"
                },
                city: {
                    required: "City should not be empty!!"
                },
                state: {
                    required: "State should not be empty!!"
                }
            },
            errorElement: 'div'
        });
    </script>

    <script>
        $(document).ready(function () {
            $('.cash').click(function () {
                $('.cash-outer').find('.drop-down-icon').toggleClass('flip');
                $('.cash-opt').toggle(1000);

            });

            $('.c-box').click(function () {
                if ($(this).is(':checked')) {
                    $('#create-acc-btn').attr("disabled", false);
                } else {
                    $('#create-acc-btn').attr("disabled", true);
                }
            });

            $('.sub-tot.cost').bind('DOMSubtreeModified', function () {
                $('.order-btn').attr('disabled', false);
                if ($('.sub-tot.cost').text() === "0") {
                    $('.order-btn').attr('disabled', true);
                }
            });

            $('.add-address-outer').hide();
            $('.change').click(function () {
                $('.selected-address').hide();
                $('.add-address-outer').show();
            });


        });

        function selectDelivery() {
            var selectedAddress = $(event.target).parent().siblings('.address').text();
            $('.selected-address').find('p.address').text(selectedAddress);
            $('.selected-address').show();
            $('.add-address-outer').hide();
        }

        function addAddress() {
            var doorNo = $('#dno').val();
            var street = $('#street').val();
            var city = $('#city').val();
            var state = $('#state').val();

            var address = doorNo + ", " + street + ", " + city + ", " + state;
            var clonedEle = $('.list-inner:first-child').clone();
            $(clonedEle).find('.address').text(address);

            $('.address-list-container').append(clonedEle);

            $('#addressModal').modal('hide');
        }


        function callOrderServlet() {
            var cartItems = [];
            $('.single-food').each(function () {
                var qtyVal = $(this).find('input.qty').val();
                if (qtyVal > 0) {
                    var food = new Food($(this).find('.food-name').attr('id'), $(this).find('.food-name').text(), $(this).find('.sub-amt').text(), $(this).find('.outer').attr('type'), qtyVal);
                    cartItems.push(food);
                }
            });

            function Food(id, name, cost, preference, qty) {
                this.id = id;
                this.name = name;
                this.cost = cost;
                this.preference = preference;
                this.qty = qty;
            }
            var address = $('.selected-address').find('.address').text();
            var grandTot = parseInt($('.cost.total').text());
            window.location.href = "order?resId=<%=resId%>&cartItems=" + JSON.stringify(cartItems) + "&userId=<%=session.getAttribute("userId")%>&grandTot=" + grandTot + "&address=" + address;
        }
    </script>

    <script>
        //        history.replaceState({}, null, "/Tomato/verify");
    </script>
</html>
