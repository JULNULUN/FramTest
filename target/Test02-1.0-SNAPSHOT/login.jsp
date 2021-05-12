<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!--
 * @Author: Chuyan
 * @Date: 2021-04-27 18:20
 * @LastEditors: Chuyan
 * @LastEditTime: 2021-05-10 10:57
 * @FilePath: \login.jsp
 * @Description: 
-->
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]>      <html class="no-js"> <!--<![endif]-->
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="login.css">
        <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
    </head>
    <body>
      
        <!--[if lt IE 7]>
            <p class="browsehappy"> 你正在使用<strong>低版本过时的</strong> 浏览器. 请<a href="#">升级</a> </p>
        <![endif]-->

        <div class="login-box">
            <div class="lb-header">
                <a href="#" class="active" id="login-box-link">登录</a>
                <a href="#" id="signup-box-link">注册</a>
            </div>
    <form class="email-login">
      <div class="u-form-group">
        <input type="email" placeholder="用户名"/>
      </div>
      <div class="u-form-group">
        <input type="password" placeholder="密码"/>
      </div>
      <div class="u-form-group">
        <button>登录</button>
      </div>
      <div class="u-form-group">
        <a href="#" class="forgot-password">忘记密码?</a>
      </div>
    </form>
    <form class="email-signup">
      <div class="u-form-group">
        <input type="email" placeholder="邮箱"/>
      </div>
      <div class="u-form-group">
        <input type="password" placeholder="密码"/>
      </div>
      <div class="u-form-group">
        <input type="password" placeholder="确认密码"/>
      </div>
      <div class="u-form-group">
        <button>注册</button>
      </div>
    </form>
  </div>
  <script src="login.js"></script>
    </body>
</html>