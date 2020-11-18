<%-- 
    Document   : loginSignupChecker
    Created on : 9 Nov, 2020, 9:55:48 PM
    Author     : SHASHANKgb
--%>

<%@page import="Model.registerModel"%>
<script>

    $(window).on('load', function () {

        $('.rform-success').hide();
        $('.rform-unsuccess').hide();
        $('.rform-existed').hide();
        $('#after-login').hide();
        $('.login-unsuccess').hide();
        $('.order-btn').attr('disabled', true);
        $('.pay-type').hide();

    <% if (session.getAttribute("regStatus") == registerModel.Status.success) {%>

        $('#signupModal').modal('show');
        $('.rform').hide();
        $('#signupModal .modal-footer').hide();
        $('.rform-success').show();

    <% } else if (session.getAttribute("regStatus") == registerModel.Status.existed) { %>

        $('#signupModal').modal('show');
        $('.rform').hide();
        $('#signupModal .modal-footer').hide();
        $('.rform-existed').show();

    <%}%>
    
    <% if ((session.getAttribute("loginStatus") == registerModel.Status.success)) {%>

        $('#before-login').hide();
        $('#after-login').show();
        $('.order-btn').attr('disabled', false);
        $('.pay-type').show();
        $('.pay-type').text('cash');

    <% } else if (session.getAttribute("loginStatus") == registerModel.Status.failure) { %>

        $('#loginModal').modal('show');
        $('.login-unsuccess').show();
        $('.phone-input').addClass('error');

    <%}%>

    });
</script>