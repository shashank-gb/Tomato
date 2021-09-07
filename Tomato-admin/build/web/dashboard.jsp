<%@page import="Model.acceptReject.Result"%>
<%@page import="Model.resAndDelReq"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.resAndDelPartner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

        <link rel="stylesheet" href="CSS/navBar.css">
        <link rel="stylesheet" href="CSS/dashboard.css">

    </head>
    <body>
        <div id="root">
            <%@include file="assets/JSP/dynamicModal.jsp" %>
            <%@include file="assets/JSP/messages.jsp" %>
            <div class="modal fade" id="resDetailModal" tabindex="-1" aria-labelledby="resDetailModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title res-name"></h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true" class="close-btn">
                                    <svg xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="24" height="24" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 byLLrW"><linearGradient id="ckfdyhhzr00c93b6h353wmd90" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#1C1C1C"></stop><stop offset="100%" stop-color="#1C1C1C"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>cross</title><path d="M11.42 10.42l3.54-3.54c0.38-0.4 0.38-1.040 0-1.42s-1.020-0.4-1.42 0l-3.54 3.54-3.54-3.54c-0.4-0.4-1.020-0.4-1.42 0s-0.38 1.020 0 1.42l3.54 3.54-3.54 3.54c-0.38 0.38-0.38 1.020 0 1.42 0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28l3.54-3.56 3.54 3.56c0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28c0.38-0.4 0.38-1.040 0-1.42l-3.54-3.54z" fill="url(#ckfdyhhzr00c93b6h353wmd90)"></path></svg>
                                </span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <table class="table table-borderless table-sm m-0">
                                <tbody>
                                    <tr>
                                        <th scope="row">Token Number</th>
                                        <td class="res-id">11111</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Owner Name</th>
                                        <td class="owner-name"></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Preference</th>
                                        <td class="preference"></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">City</th>
                                        <td class="city"></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">State</th>
                                        <td class="state"></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Complete Address</th>
                                        <td class="address"></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">GSTIN</th>
                                        <td class="gst"></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Contact</th>
                                        <td class="contact"></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="modal-footer">
                            <button name="resReject" id="res-reject" class="btn btn-danger">Reject</button>
                            <button name="resAccept" id="res-accept" class="btn btn-success">Accept</button>
                        </div>
                    </div>
                </div>
            </div>
            <%@include file="assets/JSP/navBar.jsp" %>
            <div class="wrapper">
                <section class="top">
                    <div class="heading">
                        <h3>Requests</h3>
                    </div>
                    <nav>
                        <div class="nav nav-tabs" id="nav-tab" role="tablist">
                            <a class="nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-restaurant" role="tab" aria-controls="nav-home" aria-selected="true">Restaurants</a>
                        </div>
                    </nav>
                </section>
                <div class="tab-content" id="nav-tabContent">
                    <div class="tab-pane fade show active" id="nav-restaurant" role="tabpanel" aria-labelledby="nav-home-tab">
                        <div class="row">
                            <%
                                int adminId = Integer.parseInt(session.getAttribute("adminId").toString());
                                resAndDelReq resReq = new resAndDelReq(session);

                                ArrayList<resAndDelPartner> resRequestList = resReq.getResRequests(adminId);
                                for (resAndDelPartner radps : resRequestList) {
                            %>
                            <div class="col-lg-4">
                                <div  class="card res mt-3" data-toggle="modal" data-target="#resDetailModal">
                                    <div class="card-body p-0">
                                        <div class="details">
                                            <table class="table table-borderless table-sm m-0">
                                                <tbody>
                                                    <tr>
                                                        <th scope="row">Token Number</th>
                                                        <td><span class="res-id"><%= radps.getResId()%></span></td>
                                                    </tr>
                                                    <tr>
                                                        <th scope="row">Restaurant Name</th>
                                                        <td><span class="res-name"><%= radps.getResName()%></span></td>
                                                    </tr>
                                                    <tr>
                                                        <th scope="row">Owner Name</th>
                                                        <td><span class="owner-name"><%= radps.getResOwner()%></span></td>
                                                    </tr>
                                                    <tr>
                                                        <th scope="row">City</th>
                                                        <td><span id="<%= radps.getResPinCode()%>" class="city"><%= radps.getResCity()%></span></td>
                                                    </tr>
                                                    <tr>
                                                        <th scope="row">Contact</th>
                                                        <td><span class="contact"><%= radps.getResContact()%></span></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <% } %>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="scripts/jquery.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        
        <script>
//            jQuery.noConflict();
            $(document).ready(function () {
//                $.noConflict();
                // rejecting delivery partner
                $('.del-reject').click(function () {
                    delId = $(this).parent().siblings('.details').find('.del-id').text();
                    var delName = $(this).parent().siblings('.details').find('.del-name').text();

                    $('#resultModal .modal-title').text('Delivery Partner');
                    $('#resultModal .modal-body').html('<p>Do you Really want to reject <b>' + delName + '</b> as a delivery partner ?</p>');
                    $('#resultModal').modal('show');

                });

                $('#resultModal a').click(function () {
                    btnVal = $(this).text();
                    $('#resultModal').modal('hide');
                    if (btnVal === "Yes") {
                        $(this).attr('href', 'acceptReject?status=delReject&dId=' + delId);
                    }
                });

                //accepting delivery partner
//                $('.del-accept').click(function () {
//                    delId = $(this).parent().siblings('.details').find('.del-id').text();
//                    var delName = $(this).parent().siblings('.details').find('.del-name').text();
//                    $(this).attr('href', 'acceptReject?status=delAccept&dId=' + delId);
//                    setSuccesMessage(delName);
//
//                });
//                
                $('#nav-delivery-partner a').click(function () {
                    var clickedElement = $(this).text();
                    var delId = $(this).parent().siblings('.details').find('.del-id').text();
                    var delName = $(this).parent().siblings('.details').find('.del-name').text();
                    if (clickedElement === "Accept") {
                        $.get("acceptReject?status=delAccept&dId=" + delId, function (response) {
                            if (response === "duplicate") {
                                alert(delName+" is already working!!");
//                                $('#messagesModal .modal-body').html('<span>Duplicate</span>');
//                                $('#messagesModal').modal('show');
//                                setTimeout(function () {
//                                    $('#messagesModal').modal('hide');
//                                }, 2500);
                            }else if (response === "reject"){
                                alert(delName+" Rejected!!");
                            }
                        });
                    }
                    else {
                        $(this).attr('href', 'acceptReject?status=delReject&dId=' + delId);
                    }

                });
            });
        </script>


        <script>
            var btnVal;
            var delId;
            var message;

            $(document).ready(function () {
                $.noConflict();
                $('.message').hide();

                // ajax to call Modal
                $('.card.res').click(function () {
                    var resId = $(this).find('.res-id').text();
                    $.get("getResDetails?resId=" + resId, function (responseJson) {
                        $.each(responseJson, function (key, value) {
                            $(".modal-dialog ." + key).text(value);
                        });
                    });
                });
                
                $('#res-accept').click(function(){
                    var resId = $(this).parent().parent().find('.res-id').text();
                    window.location.href = "acceptReject?task=accept&resId="+resId;
                });
                
                $('#res-reject').click(function(){
                    
                    var resId = $(this).parent().parent().find('.res-id').text();
                    window.location.href = "acceptReject?task=reject&resId="+resId;
                });
                
            });

            function setSuccesMessage(delName) {

                message = delName + " is a new Delivery Partner";
//                alert(message);

            }

        </script>
    </body>
</html>
