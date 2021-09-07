$(document).ready(function(){
    
    $("form[name = 'signup']").validate({
            rules: {
                uname: {
                    required: true,
                    alpha: true,
                },
                email: {
                    required: true,
                    emailCustom: true,
                },
                password: {
                    required: true,
                    pwcheck: true,
                    minlength: 8,
                },
            },
            messages: {
                uname: {
                    required: "Username should not be empty!!",
                },
                email: {
                    required: "Email should not be empty!!",
                },
                password: {
                    required: "Password should not be empty!!",
                    minlength: "Password is Weak!!",
                }
            },
            errorElement: 'div',
            // errorPlacement: function(error, element) {
            //     if (element.attr('name') == "email") {
            //         $("#email-err").text(" Email id");
            //     } else if (element.attr('name') == "password") {
            //         if ($.trim($('#pass').val()) == '') {
            //             $("#pass-err").text("Password Should not be empty!!");
            //         } else {
            //             $("#pass-err").text("");
            //         }
            //     } else {
            //         error.append($('span'))
            //     }
            // }

        });

        $("form[name = 'signin-form']").validate({
            rules:{
                email:{
                    required: true
                },
                password:{
                    required: true
                },
            },
            messages:{
                email:{
                    required: "Email Should not be Empty!!",
                },
                password:{
                    required: "Password Should not be Empty!!",
                }
            },
            errorElement: 'div',
        });

        // Alpha
        $.validator.addMethod("alpha", function(value, element) {
            return this.optional(element) || /^[a-zA-Z_]+$/.test(value);
        }, "Numbers and special characters are not allowed!!")

        // Password Checker
        $.validator.addMethod("pwcheck", function(value, element, param) {
            return value.match(/^[A-Za-z0-9\d=!\-@._*()^#&%]*$/) && value.match(/[a-z]/) && value.match(/\d/);
        }, 'Password is Weak!!');

        // Email Checker
        $.validator.addMethod("emailCustom", function(value, element, param) {
            return value.match(/^[a-zA-Z0-9_\.%\+\-]+@[a-zA-Z0-9\.\-]+\.[a-zA-Z]{2,}$/);
        }, 'Invalid Email id');
        
});