<%-- 
    Document   : signup.jsp
    Created on : 9 Nov, 2020, 9:42:13 PM
    Author     : SHASHANKgb
--%>
<div class="modal fade" id="signupModal" tabindex="-1" aria-labelledby="signupModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <section class="mh-wrapper">
                    <h2 class="modal-title" id="loginModalLabel">Signup</h2>
                    <button type="button" class="close ml-auto" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true" class="close-btn">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="#1C1C1C" width="24" height="24" viewBox="0 0 20 20" aria-labelledby="icon-svg-title- icon-svg-desc-" role="img" class="rbbb40-0 byLLrW"><linearGradient id="ckffaz1c7018x3b6hcvre3s9h" x1="0" x2="100%" y1="0" y2="0"><stop offset="0" stop-color="#1C1C1C"></stop><stop offset="100%" stop-color="#1C1C1C"></stop></linearGradient><title id="icon-svg-title-"></title><desc id="icon-svg-desc-">It is an icon with title </desc><title>cross</title><path d="M11.42 10.42l3.54-3.54c0.38-0.4 0.38-1.040 0-1.42s-1.020-0.4-1.42 0l-3.54 3.54-3.54-3.54c-0.4-0.4-1.020-0.4-1.42 0s-0.38 1.020 0 1.42l3.54 3.54-3.54 3.54c-0.38 0.38-0.38 1.020 0 1.42 0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28l3.54-3.56 3.54 3.56c0.2 0.18 0.46 0.28 0.72 0.28s0.5-0.1 0.7-0.28c0.38-0.4 0.38-1.040 0-1.42l-3.54-3.54z" fill="url(#ckffaz1c7018x3b6hcvre3s9h)"></path></svg>
                    </span>
                </button>
                </section>
            </div>
            <div class="modal-body">
                <section class="mb-wrapper rform">
                    <form method="POST" action="register" name="signup">
                        <div class="fullname" type="number" inputmode="numeric">
                            <div class="name-inner">
                                <input type="text" name="uname" class="name-input" placeholder="Fullname" autocomplete="off">
                            </div>
                            <div style="height: 1rem;"></div>
                            <div class="fullname-inner">
                                <input name="email" class="mail-input" type="email" placeholder="Email" autocomplete="off">
                            </div>
                            <!-- <span id="email-err"></span> -->
                            <div style="height: 1rem;"></div>
                            <div class="pwd">
                                <input name="password" class="pass-input" type="password" placeholder="Password" autocomplete="off">
                            </div>
                            <!-- <span id="pass-err"></span> -->
                            <div style="height: 1rem;"></div>
                        </div>
                        <div class="terms-condition">
                            <label for="" class="cb-wrapper">
                        <input class="c-box" type="checkbox" aria-checked="false">
                    </label>
                            <span class="tc-text">
                        I agree to Tomato's 
                        <a href="">Terms of Service</a>, <a href="">Privacy Policy</a> and <a href="">Content Policies</a>
                    </span>
                        </div>
                        <div class="btn">
                            <input id="create-acc-btn" type="submit" name="submit" class="btn btn-danger" disabled value="Create account">
                        </div>
                    </form>
                    <div class="hr-text">
                        <hr class="divider">
                        <span>or</span>
                    </div>
                    <div class="g-login">
                        <div class="g-login-inner">
                            <svg width="24" height="24" viewBox="0 0 22 22" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M4.87566 13.2946L4.10987 16.1534L1.31093 16.2126C0.474461 14.6611 0 12.886 0 10.9997C0 9.17565 0.443609 7.45552 1.22994 5.94092H1.23054L3.72238 6.39776L4.81396 8.87465C4.5855 9.54071 4.46097 10.2557 4.46097 10.9997C4.46106 11.8072 4.60732 12.5808 4.87566 13.2946Z" fill="#FBBB00"></path><path d="M21.8082 8.94507C21.9345 9.61048 22.0004 10.2977 22.0004 11C22.0004 11.7875 21.9176 12.5557 21.7598 13.2967C21.2243 15.8183 19.8252 18.0201 17.8869 19.5782L17.8863 19.5776L14.7477 19.4175L14.3035 16.6445C15.5896 15.8902 16.5947 14.7098 17.1242 13.2967H11.2422V8.94507H17.21H21.8082Z" fill="#518EF8"></path><path d="M17.8865 19.5778L17.8871 19.5784C16.002 21.0937 13.6073 22.0002 11.0006 22.0002C6.81152 22.0002 3.16945 19.6588 1.31152 16.2132L4.87625 13.2952C5.8052 15.7744 8.19679 17.5392 11.0006 17.5392C12.2057 17.5392 13.3348 17.2134 14.3036 16.6447L17.8865 19.5778Z" fill="#28B446"></path><path d="M18.0208 2.53241L14.4573 5.44981C13.4546 4.82307 12.2694 4.46102 10.9996 4.46102C8.13229 4.46102 5.69596 6.30682 4.81356 8.87494L1.23009 5.9412H1.22949C3.06022 2.41154 6.74823 0 10.9996 0C13.6686 0 16.1158 0.950726 18.0208 2.53241Z" fill="#F14336"></path></svg>
                            <span>Continue with Google</span>
                        </div>
                    </div>
                    <div class="mt-4"></div>
                    <div class="f-login">
                        <div class="f-login-inner">
                            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M22.675 0h-21.35c-.732 0-1.325.593-1.325 1.325v21.351c0 .731.593 1.324 1.325 1.324h11.495v-9.294h-3.128v-3.622h3.128v-2.671c0-3.1 1.893-4.788 4.659-4.788 1.325 0 2.463.099 2.795.143v3.24l-1.918.001c-1.504 0-1.795.715-1.795 1.763v2.313h3.587l-.467 3.622h-3.12v9.293h6.116c.73 0 1.323-.593 1.323-1.325v-21.35c0-.732-.593-1.325-1.325-1.325z" fill="#3b5998"/></svg>
                            <span>Continue with Facebook</span>
                        </div>
                    </div>
                </section>
                <section class="mb-wrapper rform-success">
                    <p>Successfully Registered</p>
                    <span>Click here to <span class="pink-small-span" type="button" data-toggle="modal" data-dismiss="modal" data-target="#loginModal">Login</span></span>
                </section>
                <section class="mb-wrapper rform-unsuccess">
                    <p>Registration Failed</p>
                    <p>Try After Some time...</p>
                </section>
                <section class="mb-wrapper rform-existed">
                    <p>Email or username is already taken...</p>
                    <span>Click here to <span class="pink-small-span" type="button" data-toggle="modal" data-dismiss="modal" data-target="#loginModal">Login</span></span>
                </section>
            </div>
            <div class="modal-footer">
                <p>Already have an account? <span class="pink-small-span" type="button">Login</span></p>
            </div>
        </div>
    </div>
</div>