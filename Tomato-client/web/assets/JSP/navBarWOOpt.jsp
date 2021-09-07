<%-- 
    Document   : navBarWOOpt
    Created on : 18 Nov, 2020, 1:26:18 PM
    Author     : SHASHANKgb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class="header-container">
    <div class="header-wrapper d-flex">
        <h3 class="text-uppercase"><a href="index.jsp">Tomato</a></h3>
        <div class="ml-auto after-login">
            <div class="login-status-container pr-3">
                <div class="login-img">
                    <img class="user-profile" src="images/profile.webp" alt="">
                </div>
                <span class="username"> <%= session.getAttribute("uname")%> </span>
            </div>
        </div>
    </div>
</header>