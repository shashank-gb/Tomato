<%-- 
    Document   : restaurantfood
    Created on : Oct 19, 2020, 6:47:24 PM
    Author     : prajwal
--%>

<%@page import="model.orderDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/restaurant.css">
        <title>Restaurant</title>
    </head>
    <body>
        <%
            orderDetails ordDet = new orderDetails(session);
            ordDet.getOrderDetails();
        %>
        <div class="first">
            <div class="header">     
                <nav class="navbar navbar-expand-lg ">
                    <div class="collapse navbar-collapse" id="navbarText">
                        <ul class="navbar-nav mr-auto">
                            <li class="nav-item active">
                                <a class="nav-links">Tomato <span class="sr-only"></span></a>
                            <li>
                        </ul>
                        <ul class="navbar-nav">

                            <li class="nav-item">
                                <a class="nav-link my" href="Alterfood.jsp?resId=<%=session.getAttribute("rid") %>" style="color:red">Alter foods </a>
                            </li>
                            <li class="nav-item">
                                <!--        <a class="nav-link my" href="" style="color:red"></a>-->
                                <a class="nav-link nav-item sigcs" style="color:red" href="" id='<%=session.getAttribute("uname")%>'><%=session.getAttribute("uname")%></a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>

            <div class="bodies">     
                <div class="body1">
                    <h1 class="goess"><%=session.getAttribute("uname")%></h1>
                </div>
                <div class="body2">
                    <h1>Partner with Tomato</h1>
                </div> 
            </div>
        </div> 

        <div class="left">

            <div class="card">

                <div class="card-body">
                    <!--                    <h4> Ordered items</h4>-->
                    <h4 class="mb-4">Ordered Items</h4>
                    <div>
                        <h6>ChocoLavaCake</h6>   
                    </div>
                    <div>
                        <h6>Panner Masala</h6>
                    </div>
                    <!--                <a href="#" class="btn btn-primary">Accept</a>-->
                    <div class="orby"> ordered by : ?????</div>
                </div>
            </div>
            <div class="card">

                <div class="card-body">
                    <!--                    <h4> Ordered items</h4>-->
                    <h4>Ordered items</h4>
                    <div>
                        <h6>ChocoLavaCake</h6>

                    </div>
                    <div><h6>Panner Masala</h6></div>
                    <!--                <a href="#" class="btn btn-primary">Accept</a>-->
                    <div class="orby"> ordered by : ?????</div>
                </div>
            </div>
        </div>


    </body>
</html>
