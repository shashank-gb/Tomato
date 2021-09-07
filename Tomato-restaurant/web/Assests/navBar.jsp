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
</div>