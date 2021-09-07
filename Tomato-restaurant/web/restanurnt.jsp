<%-- 
    Document   : restanurnt
    Created on : Oct 20, 2020, 1:07:43 AM
    Author     : prajwal
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.locIdLocCity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" ></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/stile.css">
    </head>
    <body>
        <div class="modal fade" id="loginModal" tabindex="-1" aria-labelledby="loginModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <section class="mh-wrapper">
                            <h2 class="modal-title" id="loginModalLabel">Login</h2>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true" class="close-btn">
                                    <svg xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="24" height="24" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 byLLrW">
                                    <linearGradient id="ckfdyhhzr00c93b6h353wmd90" x1="0" x2="100%" y1="0" y2="0">
                                    <stop offset="0" stop-color="#1C1C1C"></stop>
                                    <stop offset="100%" stop-color="#1C1C1C"></stop>
                                    </linearGradient>
                                    <title id="icon-svg-title-"></title>
                                    <desc id="icon-svg-desc-">It is an icon with title </desc>
                                    <title>cross</title>
                                    <path
                                        d="M11.42 10.42l3.54-3.54c0.38-0.4 0.38-1.040 0-1.42s-1.020-0.4-1.42 0l-3.54 3.54-3.54-3.54c-0.4-0.4-1.020-0.4-1.42 0s-0.38 1.020 0 1.42l3.54 3.54-3.54 3.54c-0.38 0.38-0.38 1.020 0 1.42 0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28l3.54-3.56 3.54 3.56c0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28c0.38-0.4 0.38-1.040 0-1.42l-3.54-3.54z"
                                        fill="url(#ckfdyhhzr00c93b6h353wmd90)"></path>
                                    </svg>
                                </span>
                            </button>
                        </section>
                    </div>
                    <div class="modal-body">
                        <form id="formmdw" role="form" action="register" method="post">
                            <section class="mb-wrapper">
                                <div class="phno" type="number" inputmode="numeric">
                                    <div class="phno-inner" id="go">
                                        <input class="phone-input" type="text" id="pnum" name="pnum" placeholder="userid" autocomplete="off">
                                    </div>
                                </div>
                                <div class="phno pw" type="text" inputmode="numeric">
                                    <div class="phno-inner">
                                        <input class="phone-input" type="password" id="pwd" name="pwd" placeholder="Password" autocomplete="off">
                                    </div>
                                </div>
                                <div class="otp-btn">
                                    <button type="submit" class="btn btn-success">Submit</button>
                                </div>
                            </section>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <nav class=" navbar navbar-dark">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <h3 style="font-size:3rem">Tomato</h3>
                </li>
            </ul>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="sigcs" href="" id="profile">User</a>
                    <a class="sigcs" style="color:black" href="" id='<%=session.getAttribute("uname")%>'><%=session.getAttribute("uname")%></a>
                </li>
            </ul>
        </nav>



        <div class="container-fluid register">
            <div class="row">
                <div class="col-md-4" style="margin-top:50px;">
                    <div class="banner_txt text-center">
                        <p style="font-weight:bold">Sign up for lightning fast delivery to your customers</p>
                    </div>

                    <img src="image.jfif" alt="image.jfif" style="width:400px;height:500px;">
                </div>
                <div class="col-md-8 register-right">
                    <div class="part">
                        <h3 class="register-heading">Partner with us</h3>
                    </div>


                    <!-- <div id="DivContent"></div> -->

                    <!-- <form class="form-horizontal needs-validation" id="my-form" role="form" action="" method="post"> -->
                    <form id="formlg" role="form" action="register" method="post">
                        <div class="row register-form userDetails ">
                            <div class="col-md-12 fillContentSwiggy" id="fillContentBody">
                                <div class="row register-moredetail">
<!--                                    <div class="col-md-6">
                                        <div class="form-group" style="margin-bottom: 8px;">
                                            <label>1.Restaurant Name <span style="color:red">*</span></label>
                                            <input type="text" class="form-control" id="restaurant_name" name="restaurant_name" placeholder="Restaurant Name" value="" required="" name="restaurant_name" />
                                        </div>
                                    </div>-->
                                    <div class="col-md-6">
                                        <div class="form-group" style="margin-bottom: 8px;">
                                            <label>1.Owner Name <span style="color:red">*</span></label>
                                            <input type="text" class="form-control" id="owner_name" name="owner_name" placeholder="Owner Name" value="" required="">

                                        </div>
                                    </div>

                                    <div class="col-md-6">
                                        <div class="form-group" style="margin-bottom: 8px;">
                                            <label>2.Owner Contact Number <span style="color:red">*</span></label>
                                            <input type="text" id="contact_number" name="contact_number" class="form-control" placeholder="Owner Contact Number*" value="" required="">
                                        </div>
                                    </div>

                                    <div class="col-md-6">
                                        <div class="form-group" style="margin-bottom: 8px;">
                                            <label>3.Restaurant City <span style="color:red">*</span></label>
                                            <select class="form-control" id="restaurant_city" name="restaurant_city" tabindex="-1" aria-hidden="true">
                                                <option>Please Select City</option>
                                                <%
                                                    ArrayList<locIdLocCity> cityLists = (ArrayList)request.getAttribute("cityNames");
                                                    for(locIdLocCity city: cityLists){
                                                %>
                                                <option value="<%= city.getId() %>"><%= city.getCity()+" - "+city.getId() %></option>
                                                <%}%>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group" style="margin-bottom: 8px;">
                                            <label>4.State<span style="color:red">*</span></label>
                                            <input type="text" id="state" name="state" class="form-control" placeholder="State*" value="" required="">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group" style="margin-bottom: 8px;">
                                            <label>5.GSTIN <span style="color:red">*</span></label>
                                            <input type="text" id="GSTIN" name="GSTIN" class="form-control" placeholder="GSTIN*" value="" required="">
                                        </div>
                                    </div>

                                    <div class="col-md-6 pref">
                                        <label >6.Preferences </label>
                                        <div class="form-check check1">
                                            <input name="pref" class="form-check-input" type="radio" value="veg" id="defaultCheck1">
                                            <label class="form-check-label" for="defaultCheck1">
                                                Veg
                                            </label>
                                        </div>
                                        <div class="form-check check2">

                                            <input name="pref" class="form-check-input" type="radio" value="nonveg" id="defaultCheck2">
                                            <label class="form-check-label" for="defaultCheck2">
                                                Non-veg
                                            </label>
                                        </div>
                                         <div class="form-check check2">

                                            <input name="pref" class="form-check-input" type="radio" value="Both" id="defaultCheck2">
                                            <label class="form-check-label" for="defaultCheck2">
                                                Both
                                            </label>
                                        </div>
                                    </div>
<!--                                    <div class="col-md-6 ">
                                        <div class="form-group" style="margin-bottom: 8px;">
                                            <label>8.GSTIN FILE<span style="color:red">*</span></label>
                                            <input type="file" class="form-control-file" id="GSTINF" name="GSTINF" value="" placeholder="GSTIN *">
                                        </div>
                                    </div>-->

                                    <div class="col-md-12">
                                        <div class="form-group" style="margin-bottom: 8px;">
                                            <label>8.Complete Address <span style="color:red">*</span></label>
                                            <input type="text" id="Complete_Address" name="Complete_Address" class="form-control" placeholder="Complete Address" value="" required="">
                                        </div>
                                    </div>


                                    <div class="col-md-12 sbt">
                                        <button type="submit" name="restsubmit" class="btn btn-success">Submit</button>
                                    </div>

                                </div>
                            </div>

                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>

    <footer>

    </footer>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js"></script>
    <script>
 $(document).ready(function(){
     $('#profile').hide();
     $('#<=%session.getAttribute("uname")%>').hide();
   <%if(session.getAttribute("uname").equals(null)){%>
           $('#profile').show();
          <%}else{%> 
              $('#<%=session.getAttribute("uname")%>').show();
          <%}%>
 });
        
    </script>
    <script>

        $(document).ready(function () {
            $("#formmdw").validate({
                rules: {
                    pnum: {
                        required: true
                    },
                    pwd: {
                        required: true
                    },
                },
                messages: {
                    pnum: {
                        required: "Please enter your userid"
                    },
                    pwd: {
                        required: "Enter your Password"
                    },
                },
                errorElement: "div",
            });
        });
    </script>
    <script>
        $(document).ready(function () {
            $("#formlg").validate({
                rules: {
                    restaurant_name: {
                        required: true,
                    },
                    owner_name: {
                        required: true

                    },
                    contact_number: {
                        maxlength: 10,
                        required: true
                    },
                    email_id: {
                        required: true
                    },
                    restaurant_city: {
                        required: true
                    },
                    state: {
                        required: true
                    },
                    GSTINF: {
                        required: true
                    },
                    GSTIN: {
                        required: true
                    },
                    Complete_Address: {
                        required: true
                    },
                    pwd: {
                        required: true
                    },

                    pnum: {
                        required: true
                    },
                },
                messages: {
                    restaurant_name: {
                        required: "Please enter your restaurant name"
                    },
                    owner_name: {
                        required: "Please Enter a owner name"
                    },
                    contact_number: {
                        required: "Please Enter your contact number"
                    },
                    email_id: {
                        required: "Please enter your email id"
                    },
                    restaurant_city: {
                        required: "Please enter your city"
                    },
                    state: {
                        required: "Please enter your state"
                    },
                    GSTINF: {
                        required: "Please enter your GSTINF"
                    },
                    GSTIN: {
                        required: "Please enter your GSTIN"
                    },
                    Complete_Address: {
                        required: "Please enter your Complete Address"
                    },
                },
                errorElement: "div",
            });
        });
    </script>
</body>

</html>
