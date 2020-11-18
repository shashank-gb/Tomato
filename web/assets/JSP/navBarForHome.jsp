<%-- 
    Document   : navBar
    Created on : 20 Oct, 2020, 3:34:42 PM
    Author     : SHASHANKgb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="navigation-bar">
    <nav id="before-login" class="navbar navbar-expand-sm">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a href="" class="navbar-brand">TOMATO</a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" type="button" data-toggle="modal" data-target="#loginModal" href="">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" type="button" data-toggle="modal" data-target="#signupModal" href="">Signup</a>
            </li>
        </ul>
    </nav>
    <nav id="after-login" class="navbar navbar-expand-sm">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a href="" class="nav-link navbar-brand">TOMATO</a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <div class="login-status-container">
                    <div class="login-img">
                        <img class="user-profile" src="images/profile.webp" alt="">
                    </div>
                    <span class="username"> <%= session.getAttribute("uname") %> </span>
                    <i class="drop-down-icon" size="18" color="#FFFFFF">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="#FFFFFF" width="18" height="18" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 ZGPg"><linearGradient id="ckfuv0gb7306k2xny0hrl10an" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#FFFFFF"></stop><stop offset="100%" stop-color="#FFFFFF"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>chevron-down</title><path d="M4.48 7.38c0.28-0.28 0.76-0.28 1.060 0l4.46 4.48 4.48-4.48c0.28-0.28 0.76-0.28 1.060 0s0.28 0.78 0 1.060l-5 5c-0.3 0.3-0.78 0.3-1.060 0l-5-5c-0.3-0.28-0.3-0.76 0-1.060z" fill="url(#ckfuv0gb7306k2xny0hrl10an)"></path></svg>
                </i>
                </div>
                <div class="user-options">
                    <div class="profile opt">
                        <a class="opt-inner" href="">Profile</a>
                    </div>
                    <div class="Order-history opt">
                        <a class="opt-inner" href="">Order History</a>
                    </div>
                    <div class="Logout opt">
                        <a class="opt-inner" href="logout">Logout</a>
                    </div>
                </div>
            </li>
        </ul>
    </nav>
</div>