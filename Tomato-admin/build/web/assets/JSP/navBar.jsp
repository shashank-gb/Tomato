<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class="navbar">
    <h1 class="text-uppercase"><a class="nav-link p-0" href="index.jsp">Tomato</a></h1>
    <div class="profile">
        <div class="profile-photo">
            <img src="images/1.png" alt="image">
        </div>
        <span id="<%= session.getAttribute("adminId")%>" class="admin"><%= session.getAttribute("adminName")%></span>
    </div>
    <div class="options-container">
        <div class="opt profile">Profile</div>
        <div class="opt logout">Logout</div>
    </div>
</header>

    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>

    $(document).ready(function () {

        $('.options-container').hide();
        $('.profile').click(function () {

            $('.options-container').slideToggle(300);
        });

        $(document).on('click', function (ev) {

            var $optionsTrigger = $('.profile');
            if ($optionsTrigger !== ev.target && !$optionsTrigger.has(ev.target).length)
                $('.options-container').hide();
        });

        $('.logout').click(function () {
            window.location.href = 'logout';
        });
    });
</script>