<html>
<#include "../common/header.ftl">
<body>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-form-title" style="background-image: url(/sell/image/bg-01.jpg);">
                <span class="login100-form-title-1">登 录</span>
            </div>

            <form class="login100-form validate-form">
                <div class="wrap-input100 validate-input m-b-26" data-validate="用户名不能为空">
                    <span class="label-input100">用户名</span>
                    <input class="input100" type="text" name="username" placeholder="请输入用户名">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input m-b-18" data-validate="密码不能为空">
                    <span class="label-input100">密码</span>
                    <input class="input100" type="password" name="pass" placeholder="请输入用户名">
                    <span class="focus-input100"></span>
                </div>
                
                <div class="container-login100-form-btn">
                    <button class="login100-form-btn">登 录</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.bootcss.com/jquery/3.3.0/jquery.min.js"></script>
<script>
    (function ($) {
        "use strict";

        /*==================================================================
        [ Focus Contact2 ]*/
        $('.input100').each(function () {
            $(this).on('blur', function () {
                if ($(this).val().trim() != "") {
                    $(this).addClass('has-val');
                } else {
                    $(this).removeClass('has-val');
                }
            })
        })

        /*==================================================================
        [ Validate ]*/
        var input = $('.validate-input .input100');

        $('.validate-form').on('submit', function () {
            var check = true;

            for (var i = 0; i < input.length; i++) {
                if (validate(input[i]) == false) {
                    showValidate(input[i]);
                    check = false;
                }
            }

            return check;
        });


        $('.validate-form .input100').each(function () {
            $(this).focus(function () {
                hideValidate(this);
            });
        });

        function validate(input) {
            if ($(input).attr('type') == 'email' || $(input).attr('name') == 'email') {
                if ($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
                    return false;
                }
            } else {
                if ($(input).val().trim() == '') {
                    return false;
                }
            }
        }

        function showValidate(input) {
            var thisAlert = $(input).parent();

            $(thisAlert).addClass('alert-validate');
        }

        function hideValidate(input) {
            var thisAlert = $(input).parent();

            $(thisAlert).removeClass('alert-validate');
        }


    })(jQuery);
</script>

<div style="display: none"><a href="http://www.dowebok.com/">dowebok</a></div>
</body>

</html>