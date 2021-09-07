<%@page import="model.fooddetails"%>
<%@page import="model.getfoodsf"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/Alterfood.css">
        <title>JSP Page</title>
    </head>

    <body>
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
                            <a class="nav-link my" href="" id="<%=session.getAttribute("rid")%>" style="color:red"><%=session.getAttribute("uname")%></a>
                        </li>
                        <li class="nav-item">
                            <a class="button nav-link my" href="index_1.jsp">
                                <div class="logout" style="color:red">Logout</div>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>

        <div class="" style="text-align: center">
            <h1><%=session.getAttribute("uname")%></h1>
            <h6>In partner with Tomato</h6>
        </div>
        <div class="wrapper-d">
            <div class="foodbody">

                <div class="row">
                    <%
                        fooddetails food = new fooddetails(session);
                        ArrayList<getfoodsf> fooddetailslist = food.getfooddetails();
                        for (getfoodsf foods : fooddetailslist) {
                    %>
                    <div class="col-lg-6 card1" data-target="#mymodal" data-toggle="modal">
                        <div class="row">
                            <div class="col-lg-4">
                                <div class="img-container">
                                    <img class="w-100" src="side-img1.webp" alt="food">
                                </div>
                            </div>
                            <div class="col-lg-8">
                                <div id="<%= foods.getFood_id()%>" class="f-id" ><%= foods.getF_name()%></div>
                                <div>RS <%= foods.getCost()%></div>
                                <div>Veg</div>
                                <div><%= foods.getDescription()%></div>
                            </div>

                        </div>
                    </div>
                    <%}%>
                </div>
                <div class="addfood btn btn-success btn-lg" data-target="#mymodals" data-toggle="modal">
                    <a class="btn btn-success btn-lg" name="submitbt">Add Food</a>
                </div>
            </div>
        </div>
  <div class="modal fade" id="mymodals" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
  <div class="modal-content">
      <div class="modal-header">
      <h5 class="modal-title">ADD NEW FOOD</h5>
      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
      </button>
      </div>
      <div class="modal-body">
          <form method="POST" action="register" name="add">
              <div style="height: 0.7rem;"></div>
              <div>
                  <input class="food_name" type="text" name="f_name" placeholder="Food name" autocomplete="off">
              </div>
             <div style="height: 0.7rem;"></div>
              <div>
            <select class="drdown food_name" name="preferences" id="CITY" >
              <option value="">Preference</option>
              <option value="V">Veg</option>
              <option value="N">Non-Veg</option> 
            </select>
            </div>
             <div style="height: 0.7rem;"></div>
              <div> 
                  <input class="food_name" type="number" placeholder="cost" name="cost" autocomplete="off">
              </div>
             <div style="height: 0.7rem;"></div>
              <div>
                  <input class="food_name" type="text" name="desc"  placeholder="Descrption" autocomplete="off">
              </div>
             <div style="height: 0.7rem;"></div>
         
      
      <div class="modal-footer">
        
        <button type="submit" name="confirmfood" class="btn btn-primary">Submit</button>
      </div>
       </form>
    </div>
  </div>
</div>
  </div>
        <div class="modal fade" id="mymodal" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Food Details</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <table class="table table-borderless">
                            <tbody>
                                <tr>
                            <div style="display:none" class="f-id"></div>
                            <th scope="row"></th>
                            <td><b>Food name</b></td>
                            <td class="f-name"></td>
                            <td><div class="svg1"><img class="w-100" src="assessts/edit.svg" alt=""></img></div></td>
                            </tr>
                            <tr>
                                <th scope="row"></th>
                                <td><b>Preferences</b></td>
                                <td class="preference"></td>
                                <td><div class="svg1"><img class="w-100" src="assessts/edit.svg" alt=""></img></div></td>
                            </tr>
                            <tr>
                                <th scope="row"></th>
                                <td><b>Cost</b></td>
                                <td>RS <span class="cost"></span></td>
                                <td><div class="svg1"><img class="w-100" src="assessts/edit.svg" alt=""></img></div></td>
                            </tr>
                            <tr>
                                <th scope="row"></th>
                                <td><b>Descrption</b></td>
                                <td class="description"></td>
                                <td><div class="svg1"><img class="w-100" src="assessts/edit.svg" alt=""></img></div></td>
                            </tr>
                            </tbody>
                        </table>

                        <div class="modal-footer">
                            <div class="btnsub">
                                <a class="btn btn-danger" name="deletebt" href="deletefood?button=delete">Delete</a>
                                <a class="btn btn-success" name="submitbt" href="deletefood?button=submit">Submit</a>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

            <script>
                $(document).ready(function () {
//                    $.noConflict();
                    $('.card1').click(function () {
                        var foodId = $(this).find('.f-id').attr('id');
                        $.get("modelfood?fId=" + foodId + "&resId=<%=session.getAttribute("rid")%>", function (responseJson) {
                            $.each(responseJson, function (key, value) {
                                $('.modal-dialog .' + key).text(value);
                            });
                        });
                    });

                    $('.modal-dialog .btn-danger').click(function () {
                        var foodId = $(this).parentsUntil('.modal').find('.f-id').text();
                        $(this).attr('href', 'deletefood?button=delete&fId='+foodId);
                    });
                });
            </script>
    </body>

</html>
