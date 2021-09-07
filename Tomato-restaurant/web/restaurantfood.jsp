<%@page import="model.acceptOrder"%>
<%@page import="java.util.List"%>
<%@page import="model.order"%>
<%@page import="java.util.Map"%>
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
        <style>
            .card, td{
                padding: .5rem 1rem !important;
            }
            .details{
                display: flex;
                justify-content: space-around;
            }
            .details div{
                text-align: center;
            }
            .details .btn-sm{
                max-width: 8%;
            }
        </style>
    </head>
    <body>
        <%
            acceptOrder ord = new acceptOrder(request.getSession());
            String resReqstatus = ord.checkResStatus(Integer.parseInt(session.getAttribute("rid").toString()));
            if (resReqstatus == "accept") {
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
                                <a class="nav-link my" href="Alterfood.jsp?resId=<%=session.getAttribute("rid")%>" style="color:red">Alter foods </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link nav-item sigcs" style="color:red" href="" id='<%=session.getAttribute("uname")%>'><%=session.getAttribute("uname")%></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link nav-item" style="color:red" href="index_1.jsp">Logout</a>
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
                <div class="card-body p-0">
                    <div class="details">
                        <div class="o-id col-lg-1">ID</div>
                        <div class="f-name col-lg-2">Food</div>
                        <div class="qty col-lg-1">Qty</div>
                        <div class="u-name col-lg-2">Client</div>
                        <div class="mobile col-lg-2">Mobile No</div>
                        <div class="address col-lg-2">Address</div>
                    </div>
                </div>
            </div>
            <%
                orderDetails ordDetails = new orderDetails(session);
                Map<Integer, List<order>> map = (Map) ordDetails.getOrderDetails();
                for (Map.Entry<Integer, List<order>> o : map.entrySet()) {
            %>
            <div class="card">
                <%
                    for (order o1 : o.getValue()) {
                %>
                <div class="card-body p-0">
                    <div class="details">
                        <input id="oId" hidden value="<%=o.getKey()%>">
                        <div class="o-id col-lg-1"><%= o.getKey()%></div>
                        <div class="f-name col-lg-2"><%= o1.getFoodName()%></div>
                        <div class="qty col-lg-1"><%= o1.getQty()%></div>
                        <div class="u-name col-lg-2"><%= o1.getuName()%></div>
                        <div class="mobile col-lg-2"><%=o1.getPhoneNumber()%></div>
                        <div class="address col-lg-2"><%=o1.getAddress()%></div>
                    </div>
                </div>
                <%}%>
                <%
                    boolean status = ord.checkForDone(o.getKey());
                    if (status == true) {
                %>
                <button id="<%=o.getKey()%>" class="btn btn-primary">Done</button>
                <%} else {%>
                <button id="<%=o.getKey()%>" class="btn btn-success" disabled>Completed</button>
                <% }%>
                <script>
                    $('button#<%=o.getKey()%>').click(function () {
                        var oId = $(this).parent().find('#oId').val();
                        window.location.href = 'orderAccept?oId=' + oId;
                    });
                </script>
            </div>
            <%}%>
        </div>
        <%
        } else if (resReqstatus == "pending") {
        %>
        <h3>Your Request is not yet Accepted by Admin. Please Wait</h3>

        <button type="button" class="btn btn-success"><a href="index_1.jsp">Return To Main Page</a></button>
        <%
        } else {
        %>
        <h3>Sorry Your Request is Rejected</h3>
        <%}%>
    </body>
</html>