<%@page import="java.util.ArrayList"%>
<%@page import="Model.registerModel"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=1098, initial-scale=1.0">
        <title>Tomato</title>



        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>


        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css" integrity="sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc" crossorigin="anonymous">
        <link type="text/css" rel="stylesheet" href="CSS/style.css">
        <link type="text/css" rel="stylesheet" href="CSS/modal.css">
        <!-- transform="matrix(1.7463 -0.5529 0.5362 1.3418 120.1196 265.1868)" -->
    </head>

    <body>
        <%
            response.setHeader("cache-control", "no-cache, no-store");
            response.setHeader("pragma", "no-cache");
            response.setHeader("Expires", "0");
        %>
        <%
            session.setAttribute("jspName", "index.jsp");
        %>
        <!-- Login modal -->
        <%@include file="assets/JSP/login.jsp" %>
        <!-- Sign Up Modal -->
        <%@include file="assets/JSP/signup.jsp" %>

        <header>
            <!-- Navigation Bar for index-->
            <%@include file="assets/JSP/navBarForHome.jsp" %>
            <!--  Title + Search Bar -->
            <div class="wrapper">
                <div class="head">
                    <div class="heading">
                        <h1 class="text-uppercase"><span class="text-danger">Tom</span><span class="text-success">ato</span></h1>
                        <h2>Discover the best food & drinks in <span>location</span></h2>
                    </div>
                    <!--                    <div class="search-bar">
                                            <div class="search-inner">
                                                <div class="custom-dropdown">
                                                    <i class="location-mark">
                                                        <svg xmlns="http://www.w3.org/2000/svg" fill="#F57082" width="20" height="20" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 kIxlGM"><linearGradient id="ckfco2tsd008c3b6086g2ez9v" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#F57082"></stop><stop offset="100%" stop-color="#F57082"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>location-fill</title><path d="M10.2 0.42c-4.5 0-8.2 3.7-8.2 8.3 0 6.2 7.5 11.3 7.8 11.6 0.2 0.1 0.3 0.1 0.4 0.1s0.3 0 0.4-0.1c0.3-0.2 7.8-5.3 7.8-11.6 0.1-4.6-3.6-8.3-8.2-8.3zM10.2 11.42c-1.7 0-3-1.3-3-3s1.3-3 3-3c1.7 0 3 1.3 3 3s-1.3 3-3 3z" fill="url(#ckfco2tsd008c3b6086g2ez9v)"></path></svg>
                                                    </i>
                                                    <input class="location-input" name='selectedLoc' type="text" placeholder="Location">
                                                    <i class="down-triangle toggle-down">
                                                        <svg xmlns="http://www.w3.org/2000/svg" fill="#4F4F4F" width="12" height="12" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 fQZfgq"><linearGradient id="ckfcqt1f000pd3b60pyata5y6" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#4F4F4F"></stop><stop offset="100%" stop-color="#4F4F4F"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>down-triangle</title><path d="M20 5.42l-10 10-10-10h20z" fill="url(#ckfcqt1f000pd3b60pyata5y6)"></path></svg>
                                                    </i>
                                                    
                    <%@include file="assets/JSP/connection.jsp" %>
                    
                    <div class="dropdown-options found">
                    <%                                
                            st = con.createStatement();

                            st = con.createStatement();

                            String locQuery = "SELECT city FROM location GROUP BY city";

                            rs = st.executeQuery(locQuery);

                            while (rs.next()) {
                    %>
                    <div class="opt">
                        <span class="opt-inner"><%=rs.getString("city")%></span>
                    </div>
                            
                    <%  }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    %>
                    
                </div>
                <div class="dropdown-options not-found">
                    <div class="opt">
                        <span class="opt-inner">Oops! No matches</span>
                    </div>
                </div>
            </div>
            <div class="vertical-hr"></div>
            <div class="custom-search">
                <input class="search-input" type="text" placeholder="Search for restaurant, cuisine or a dish">
                <div class="search-icon-container">
                    <i class="search-icon">
                        <svg class="s-icon" xmlns="http://www.w3.org/2000/svg" fill="#828282" width="18" height="18" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 ZGPg"><linearGradient id="ckfcqt1f200pk3b600mbaxvok" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#828282"></stop><stop offset="100%" stop-color="#828282"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>Search</title><path d="M19.78 19.12l-3.88-3.9c1.28-1.6 2.080-3.6 2.080-5.8 0-5-3.98-9-8.98-9s-9 4-9 9c0 5 4 9 9 9 2.2 0 4.2-0.8 5.8-2.1l3.88 3.9c0.1 0.1 0.3 0.2 0.5 0.2s0.4-0.1 0.5-0.2c0.4-0.3 0.4-0.8 0.1-1.1zM1.5 9.42c0-4.1 3.4-7.5 7.5-7.5s7.48 3.4 7.48 7.5-3.38 7.5-7.48 7.5c-4.1 0-7.5-3.4-7.5-7.5z" fill="url(#ckfcqt1f200pk3b600mbaxvok)"></path></svg>
                    </i>
                    <div class="restaurant-options">
                    <%@include file="assets/JSP/connection.jsp" %>
                    
                    <%                                        st = con.createStatement();

                        String locQuery = "SELECT rname, city FROM restaurant INNER JOIN location ON restaurant.l_id = location.l_id and city = '" + "';";

                        rs = st.executeQuery(locQuery);

                        while (rs.next()) {
                    %>
                        <div class="opt">
                            <span class="opt-inner"><%=rs.getString("rname")%>, <%=rs.getString("city")%></span>
                        </div>
                    <%  }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    %>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>-->
                </div>
        </header>
        <!-- Order Options -->
        <div class="body-container">
            <section class="options-container">
                <div class="options-wrapper">
                    <div class="options order-food">
                        <a class="opt-link" href="Shops">
                            <div class="image-container">
                                <div class="image-wrapper"></div>
                                <img src="images/ezgif.com-webp-to-png.png" loading="lazy" alt="">
                            </div>
                            <div class="image-title">
                                <p class="title-text">Order Food Online</p>
                            </div>
                        </a>
                    </div>

                    <div class="options pro">
                        <a class="opt-link" href="">
                            <div class="image-container">
                                <div class="image-wrapper"></div>
                                <img src="images/ezgif.com-webp-to-png (1).png" loading="lazy" alt="">
                            </div>
                            <div class="image-title">
                                <p class="title-text">Tomato Pro</p>
                            </div>
                        </a>
                    </div>
                </div>
            </section>
            <section class="delivery-work">
                <h1>How does Tomato&trade; Work?</h1>
                <div class="work-img-container">
                    <img src="assets/SVG/howDeliveryWorks-final.svg" alt="">
                </div>
            </section>
            <div class="subscribe-container">
                <div class="left-container">
                    <div class="title-container">
                        <h4 class="title">Special Offers & News</h4>
                        <p class="sub-title">Subscribe now for news, promotions and more delivered right to your inbox</p>
                    </div>
                    <div class="input-container">
                        <input class="sub-input" type="email" autocomplete="off">
                        <button class="btn btn-sm btn-danger sub-btn">Subscribe</button>
                    </div>
                </div>
                <div class="right-container">
                </div>
            </div>
        </div>
        <!-- footer -->
        <footer class="">
            <div class="footer-container">
                <section class="title">
                    <h2 class="text-uppercase">Tomato</h2>
                </section>
                <div class="content">
                    <div name="company" class="content-inner">
                        <h6 class="sub-title">COMPANY</h6>
                        <nav>
                            <a href="">
                                <p class="text">Who we Are</p>
                            </a>
                            <a href="">
                                <p class="text">Report Fraud</p>
                            </a>
                            <a href="">
                                <p class="text">Contact</p>
                            </a>
                        </nav>
                    </div>
                    <div name="For Foodies" class="content-inner">
                        <h6 class="sub-title">FOR FOODIES</h6>
                        <nav>
                            <a href="">
                                <p class="text">Code of Conduct</p>
                            </a>

                            <a href="">
                                <p class="text">Developers</p>
                            </a>

                        </nav>
                    </div>
                    <div name="For Restaurants" class="content-inner">
                        <h6 class="sub-title">FOR RESTAURANTS</h6>
                        <nav>
                            <a href="">
                                <p class="text">Add Restaurant</p>
                            </a>
                            <a href="">
                                <p class="text">Claim your Listing</p>
                            </a>

                        </nav>
                    </div>
                    <div name="For You" class="content-inner">
                        <h6 class="sub-title">FOR YOU</h6>
                        <nav>
                            <a href="">
                                <p class="text">Privacy</p>
                            </a>
                            <a href="">
                                <p class="text">Terms</p>
                            </a>
                            <a href="">
                                <p class="text">Security</p>
                            </a>

                        </nav>
                    </div>
                    <div name="Social Links" class="content-inner social-links">
                        <h6 class="sub-title">SOCIAL LINKS</h6>
                        <nav>
                            <a class="social-media" href="">
                                <svg class="social-icon" xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="22" height="22" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img"><linearGradient id="ckfmh6i8pmj4f34pw7zi6901y" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#1C1C1C"></stop><stop offset="100%" stop-color="#1C1C1C"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><path d="M0 10C0 4.5 4.5 0 10 0C15.5 0 20 4.5 20 10C20 15.5 15.5 20 10 20C4.5 20 0 15.5 0 10ZM10.75 15.4375V10.1875H12.1875L12.375 8.375H10.75V7.5C10.75 7.0625 10.8125 6.8125 11.5 6.8125H12.375V5H10.9375C9.1875 5 8.625 5.875 8.625 7.3125V8.375H7.5V10.1875H8.5625V15.4375C8.5625 15.4375 10.75 15.4375 10.75 15.4375Z" fill="url(#ckfmh6i8pmj4f34pw7zi6901y)"></path></svg>
                                <p class="text">Facebook</p>
                            </a>
                            <a class="social-media" href="">
                                <svg class="social-icon" xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="22" height="22" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img"><linearGradient id="ckfmh6i8qmj4h34pw26sa6ou4" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#1C1C1C"></stop><stop offset="100%" stop-color="#1C1C1C"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><path d="M0 10C0 4.5 4.5 0 10 0C15.5 0 20 4.5 20 10C20 15.5 15.5 20 10 20C4.5 20 0 15.5 0 10ZM10.0625 8.125V8.5L9.6875 8.4375C8.3125 8.25 7.125 7.6875 6.125 6.6875L5.625 6.1875L5.5 6.5625C5.25 7.375 5.375 8.25 5.9375 8.8125C6.25 9.125 6.1875 9.1875 5.6875 9C5.5 8.9375 5.375 8.875 5.3125 8.9375C5.25 9 5.4375 9.6875 5.5625 9.9375C5.75 10.3125 6.1875 10.6875 6.5625 10.875L6.9375 11.0625H6.5C6.0625 11.0625 6.0625 11.0625 6.125 11.25C6.3125 11.75 6.875 12.25 7.5625 12.5L8 12.6875L7.625 12.9375C7 13.3125 6.3125 13.5 5.625 13.5C5.3125 13.5 5 13.5625 5 13.5625C5 13.625 5.9375 14.0625 6.4375 14.25C8.0625 14.75 9.9375 14.5 11.375 13.6875C12.375 13.0625 13.375 11.875 13.875 10.75C14.125 10.125 14.375 9 14.375 8.5C14.375 8.1875 14.4375 8.125 14.8125 7.6875C15.0625 7.4375 15.3125 7.1875 15.3125 7.0625C15.375 6.9375 15.375 6.9375 15 7.0625C14.375 7.3125 14.25 7.25 14.625 6.875C14.875 6.625 15.125 6.1875 15.125 6.0625C15.125 6.0625 15 6.0625 14.875 6.125C14.75 6.1875 14.4375 6.3125 14.1875 6.375L13.8125 6.5L13.5 6.25C13.3125 6.125 13 5.9375 12.875 5.9375C12.5 5.8125 11.9375 5.8125 11.5625 6C10.5625 6.25 10 7.1875 10.0625 8.125Z" fill="url(#ckfmh6i8qmj4h34pw26sa6ou4)"></path></svg>
                                <p class="text">Twitter</p>
                            </a>
                            <a class="social-media" href="">
                                <svg class="social-icon" xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="22" height="22" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img"><linearGradient id="ckfmh6i8qmj4j34pwdvpmefj8" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#1C1C1C"></stop><stop offset="100%" stop-color="#1C1C1C"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><path d="M0 10C0 4.5 4.5 0 10 0C15.5 0 20 4.5 20 10C20 15.5 15.5 20 10 20C4.5 20 0 15.5 0 10ZM10.1875 5C8.8125 5 8.625 5 8.0625 5C7.5 5.0625 7.125 5.125 6.8125 5.25C6.5 5.375 6.1875 5.5625 5.875 5.875C5.5625 6.1875 5.375 6.4375 5.25 6.8125C5.125 7.125 5 7.5 5 8.0625C5 8.625 5 8.75 5 10.1875C5 11.625 5 11.8125 5.0625 12.375C5.0625 12.9375 5.1875 13.3125 5.3125 13.625C5.4375 13.9375 5.625 14.25 5.9375 14.5625C6.1875 14.8125 6.5 15 6.875 15.1875C7.1875 15.3125 7.5625 15.4375 8.125 15.4375C8.6875 15.4375 8.875 15.5 10.25 15.5C11.6875 15.5 11.875 15.5 12.4375 15.4375C13 15.375 13.375 15.3125 13.6875 15.1875C14 15.0625 14.3125 14.875 14.625 14.5625C14.9375 14.25 15.125 14 15.25 13.625C15.375 13.3125 15.5 12.875 15.5 12.375C15.5625 11.8125 15.5625 11.625 15.5625 10.1875C15.5625 8.75 15.5625 8.625 15.5 8.0625C15.5 7.5 15.375 7.125 15.25 6.8125C15.125 6.4375 14.9375 6.1875 14.625 5.875C14.375 5.625 14.0625 5.4375 13.6875 5.25C13.375 5.125 12.9375 5.0625 12.4375 5C11.8125 5 11.625 5 10.1875 5ZM9.75 5.9375C9.875 5.9375 10.0625 5.9375 10.1875 5.9375C11.5625 5.9375 11.75 5.9375 12.3125 5.9375C12.8125 5.9375 13.0625 6.0625 13.25 6.125C13.5 6.25 13.6875 6.375 13.875 6.5C14.0625 6.625 14.1875 6.8125 14.25 7.125C14.3125 7.3125 14.4375 7.5625 14.4375 8.0625C14.5 8.625 14.5 8.8125 14.5 10.1875C14.5 11.5625 14.5 11.75 14.4375 12.3125C14.4375 12.8125 14.3125 13.125 14.25 13.3125C14.1875 13.5625 14.0625 13.6875 13.875 13.9375C13.6875 14.125 13.5 14.1875 13.25 14.3125C13.0625 14.375 12.8125 14.5 12.3125 14.5C11.75 14.5 11.5625 14.5625 10.1875 14.5625C8.8125 14.5625 8.625 14.5625 8.0625 14.5C7.5625 14.5 7.3125 14.375 7.125 14.3125C6.875 14.1875 6.6875 14.125 6.5 13.9375C6.3125 13.75 6.1875 13.5625 6.125 13.3125C6.0625 13.125 6 12.875 5.9375 12.3125C5.9375 11.75 5.9375 11.625 5.9375 10.1875C5.9375 8.8125 5.9375 8.625 5.9375 8.0625C6 7.5625 6.0625 7.3125 6.125 7.125C6.25 6.875 6.375 6.6875 6.5 6.5C6.625 6.3125 6.875 6.1875 7.125 6.125C7.3125 6.0625 7.5625 5.9375 8.0625 5.9375C8.5625 5.9375 8.75 5.9375 9.75 5.9375ZM13 6.8125C12.6875 6.8125 12.375 7.0625 12.375 7.4375C12.375 7.8125 12.625 8.0625 13 8.0625C13.375 8.0625 13.625 7.8125 13.625 7.4375C13.625 7.0625 13.3125 6.8125 13 6.8125ZM10.1875 7.5C8.75 7.5 7.5 8.6875 7.5 10.1875C7.5 11.6875 8.6875 12.875 10.1875 12.875C11.6875 12.875 12.875 11.6875 12.875 10.1875C12.875 8.6875 11.6875 7.5 10.1875 7.5ZM10.1875 8.4375C11.125 8.4375 11.9375 9.1875 11.9375 10.1875C11.9375 11.1875 11.1875 11.9375 10.1875 11.9375C9.25 11.9375 8.4375 11.1875 8.4375 10.1875C8.4375 9.1875 9.25 8.4375 10.1875 8.4375Z" fill="url(#ckfmh6i8qmj4j34pwdvpmefj8)"></path></svg>
                                <p class="text">Instagram</p>
                            </a>
                        </nav>
                    </div>
                </div>
                <div class="copyright-container">
                    <p>Copyright &copy; 2020 Tomato&trade; Pvt. Ltd. All rights reserved.</p>
                </div>
            </div>
        </footer>

        <!-- Scripts -->

        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>-->

        <%@include file="assets/JSP/loginSignupChecker.jsp" %>

        <script src="scripts/index.js"></script>

        <script>

        </script>


        <script src="scripts/jquery.validate.js"></script>
        <script src="scripts/validation.js"></script>

    </body>

</html>