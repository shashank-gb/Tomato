<%-- 
    Document   : navBar
    Created on : 11 Nov, 2020, 1:49:26 AM
    Author     : SHASHANKgb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class="header-container">
    <div class="header-wrapper">
        <div id="before-login" class="navbar navbar-expand-sm p-0">
            <h3 class="text-uppercase"><a href="index.jsp">Tomato</a></h3>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" type="button" data-toggle="modal" data-target="#loginModal" href="">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" type="button" data-toggle="modal" data-target="#signupModal" href="">Signup</a>
                </li>
            </ul>
        </div>
        <div id="after-login" class="navbar navbar-expand-sm p-0">
            <h3 class="text-uppercase"><a href="index.jsp">Tomato</a></h3>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <div class="login-status-container">
                        <div class="login-img">
                            <img class="user-profile" src="images/profile.webp" alt="">
                        </div>
                        <span class="username"> <%= session.getAttribute("uname") %> </span>
                        <i class="drop-down-icon" size="18" color="#000000">
                            <svg xmlns="http://www.w3.org/2000/svg" width="12" height="12" viewBox="0 0 12 7.41">
                                <path id="ic_expand_more_24px" d="M16.59,8.59,12,13.17,7.41,8.59,6,10l6,6,6-6Z" transform="translate(-6 -8.59)"/>
                            </svg>
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
        </div>
    </div>
</header>