<%-- 
    Document   : index
    Created on : Oct 20, 2020, 12:27:29 AM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html>
    
        <title>Tomato</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" ></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://fontawesome.com/how-to-use/customizing-wordpress/snippets/setup-cdn-webfont">
  <link rel="stylesheet" href="css/style.css">
    
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
          <section class="mb-wrapper">
            <form id="modal-p" action="register" method="post">
            <div class="phno" type="number" inputmode="numeric">
              <div class="phno-inner" id="go">
              <input class="phone-input" id="email" name="email" type="email" placeholder="email" autocomplete="off">
              </div>
            </div>
            <div class="phno pw" type="text" inputmode="numeric">
              <div class="phno-inner">
                <input class="phone-input" type="text" id="pd" name="pd" placeholder="Password" autocomplete="off">
                 <span style="display: block"toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
              </div>
            </div>
            <div class="otp-btn">
              <button type="submit" name="deliverylogin" class="btn btn-danger" style="margin-top:7px">Submit</button>
            </div>
            </form>
          </section>
        </div>
        <div class="modal-footer">

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
        <a class="sigcs" type="button" data-toggle="modal" data-target="#loginModal" href="">Login</a>
      </li>
    </ul>
  </nav>
  <div class="earn">
    <div class="earnw">
      <h3>Earn Weekly</h3>
      <p>join from home with us and start delivering today.</p>
    </div>
  </div>
  <div class="row">
    <div class="col-lg-4">
      <div>
        <h2 style="color:black; padding:10px; text-decoration:underline; text-decoration-color:#CB202D">Benefits</h2>
      </div>
      <div style="padding-bottom:10px;">
        <img src="Assests/weekly_payments (1).svg" style="padding-bottom:12px;">
        <div class="wekpay" style="line-height:0.3;">
          <p><b>Weekly Payments</b></p>
          <p>Weekly payout and high incentives</p>
        </div>
      </div>
      <div class="working" style="padding-bottom:10px;">
        <img src="Assests/flexible_hours.svg" style="padding-bottom:12px;">
        <div style="line-height:0.3;">
          <p>
            <b>Rewards</b></p>
          <p>
            Exciting performance-related rewards
          </p>
        </div>
      </div>
      <div class="insurance" style="padding-bottom:10px;">
        <img src="Assests/insurance.svg" style="padding-bottom:12px;">
        <div style="line-height:0.3;">
          <p><b>insurance Coverage</b>
          </p>
          <p>
            Feel safe with our accidental and medical insurance
          </p>
        </div>

      </div>
    </div>

    <div class="mdcnt col-lg-4" style="width:500px; height:300px;">
      <span></span>
    </div>
    <div class="col-lg-4">
      <div class="container-sm">
        <h3 style="color:red; padding-bottom:10px;">Join us...!</h3>

        <form id="formlg" action="register" method="post">
          <div class="form-group">
            <input type="text" placeholder="NAME" id="name"name="name" />
          </div>
          <div class="form-group">
            <input type="email" placeholder="Email" id="email1" name="email1" />
          </div>
           <div class="form-group"> 
              
                <input type="text" placeholder="Password" class="pw1" id="pw1" name="pw1"/>
                
            </div>
          <div>
            <select class="drdown" name="CITY" id="CITY" >
              <option value="">City</option>
              <option value="Davangere">Davangere</option>
              <option value="Harihar">Harihar</option>
              <option value="Banglore">Banglore</option>
              <option value="Shivamooga">Shivamooga</option>
            </select>
          </div>
          <div>
            <select class="drdown goes" name="Vehicle" id="vehicle">
              <option value="">Vehicle</option>
              <option value="bike">BIKE</option>
              <option value="cycle">CYCLE</option>
              <option value="ecycle">ECYCLE</option>
            </select>
          </div>

          <div class="check" style="margin-left:10px;margin-right:10px; padding:10px 0;">
            <input type="checkbox" id="vehicle1" name="vehicle" value="Bike">
            <span class="col-xs-10" for="confirm_permission"> Email can be used further purposes.</span>
          </div>
          <div class="bt1">
            <div class>
              <button type="submit" name="apply" disabled id="myButton" class="btn btn-light btn-lg" style="color:#CB202D;">Apply Now</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>

  <footer>
    <div class="footers">
      <div class="row m-0">
        <div class="col-lg-3">
        </div>
        <div class="col-lg-3">
          <h4 style="padding:10px;">Company</h1>
            <ul class="list-unstyled">
              <li><a href="#">About us</a></li>
              <li><a href="#">Team</a></li>
              <li><a href="#">Careers</a></li>
            </ul>
        </div>

        <div class="col-lg-3">
          <h4 style="padding:10px;">Contact</h1>
            <ul class="list-unstyled">
              <li><a href="#">FAQ</a></li>
              <li><a href="#">Help & Support </a></li>
              <li><a href="#">Partner With us</a></li>
            </ul>
        </div>
        <div class="col-lg-3">

        </div>
      </div>
    </div>
    <hr style="height:1px;background-color:#fff;width:75%;">
    <p style="text-align:center">tomato@2020</p>
  </footer>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js"></script>
  <script>
  $(document).ready(function(){
     $('#vehicle1').click(function() {
      if($(this).is(':checked')){
        $('#myButton').attr('disabled', false);
      }else{
        $('#myButton').attr('disabled', true);
      }
  });

  $("#formlg").validate({
      onSubmit:true,
      rules: {
        name: {
          required: true,
          minlength: 3,
        },
        email1: {
          required: true,
         
        },
        CITY:{
          required: true,
        },
        Vehicle:{
            required:true,
        },
        pw1:{
              required:true,
              minlength:8,
            },

      },
      messages: {
        name: {
          required: "Please enter your name",
          minlength: "enter a valid name",
        },
        email1: {
          required: "enter your email id",
        
        },
        CITY:{
          required:"please select your place",
        },
        Vehicle:{
          required:"please select your vehicle",
        },
        pd:{
              required:"Please enter your password",
              minlength:"enter atleast 8 Characters",
            },

      },
      errorElement:"div",
    });
  });
  </script>
  <script>
   $(document).ready(function(){
      $("#modal-p").validate({
          onSubmit:true,
          rules:{
            email:{
              required:true,
            },
            pd:{
              required:true,
              minlength:8,
            },
          },
          messages:{
            email:{
              required:"Please enter your id",
            },
            pd:{
              required:"Please enter your password",
              minlength:"enter atleast 8 Characters",
            },
          },
          errorElement:"div",
        });
    });
  </script>
 <% if (request.getAttribute("status") != null) {%>
        <div id="msg">  <%= request.getAttribute("status")%></div>
        <%}%>

</body>

</html>

