<%@page import="Model.loginChecker.Status"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tomato - Admin</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="CSS/navBar.css">
        <link rel="stylesheet" href="CSS/style.css">
    </head>

    <body>
        <div class="root">
            <%@include file="assets/JSP/navBar.jsp" %>
            <div class="row wrapper">
                <div class="col-md-6">
                    <h2 class="">Sign in</h2>
                    <div class="form-container">
                        <form name="signin" action="checkLogin" method="POST" class="form-group">
                            <div class="email-container">
                                Email/Tomato username
                                <input name="username" type="text" class="form-control">
                                <div class="err-msg"></div>
                            </div>
                            <div class="password-container">
                                Password
                                <input name="password" type="password" class="form-control">
                                <div class="err-msg"></div>
                            </div>
                            <div class="error-container">
                                <p class="error">Email and Password doesn't Match!!</p>
                            </div>
                            <button type="submit" name="login" onclick="" class="btn btn-danger login-btn">Login</button>
                        </form>
                    </div>
                </div>
            </div>
            <footer class="sticky-footer">
                <p class="copyright">Copyright &copy; 2020 Tomato&trade; Pvt. Ltd. All rights reserved.</p>
            </footer>
        </div>
    </body>
    <!-- Scripts -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
        $(window).on('load', function () {

            $('.profile').hide();
            $('.error-container').hide();
        <% if ((request.getAttribute("loginStatus") == Status.success)) {%>

            $('.profile').show();
        <% } else if (request.getAttribute("loginStatus") == Status.failure){ %>

            $('.profile').hide();
            $('.error-container').show();
        <%}%>

        });
    </script>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js"></script>

    <!-- Validation -->
    <script>
            $(document).ready(function () {
                $("form[name = 'signin']").validate({
                    rules: {
                        username: {
                            required: true,
                            email: true
                        },
                        password: {
                            required: true
                        }
                    },
                    messages: {
                        username: {
                            required: "Username Should not be empty!!"
                        },
                        password: {
                            required: "Password Should not be empty!!"
                        }
                    },
                    errorElement: 'div'
                });

                $.validator.addMethod("alpha", function (value, element) {
                    return this.optional(element) || /^[a-zA-Z_]+$/.test(value);
                }, "Numbers and special characters are not allowed!!");
            });
    </script>

</html>