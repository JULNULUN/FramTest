/**
 * @Author: Chuyan
 * @Date: 2021-04-27 10:49
 * @LastEditors: Chuyan
 * @LastEditTime: 2021-05-10 10:58
 * @FilePath: \login.js
 * @Description: 
 */
 $(".email-signup").hide();
 $("#signup-box-link").click(function(){
   $(".email-login").fadeOut(100);
   $(".email-signup").delay(100).fadeIn(100);
   $("#login-box-link").removeClass("active");
   $("#signup-box-link").addClass("active");
 });
 $("#login-box-link").click(function(){
   $(".email-login").delay(100).fadeIn(100);;
   $(".email-signup").fadeOut(100);
   $("#login-box-link").addClass("active");
   $("#signup-box-link").removeClass("active");
 });