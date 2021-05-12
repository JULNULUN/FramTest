<%--
  Created by IntelliJ IDEA.
  User: 12076
  Date: 2021/5/12
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Index</title>
</head>
<body>

<h1>这是通过JDBC来验证登录的地方， 以下只是通过本地验证来走了一趟 把JDBC代码写上不要修改跳转或者重定向的页面<h1>
    <h1>注意此页面如果登录成功则跳转到index.jsp页面 否则跳转到login.jsp页面 不要更改！！！<h1>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username.equals("Jlunlun@qq.com") && password.equals("4574110aaa")){
        request.setAttribute("username", username);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }else {
        response.sendRedirect("login.jsp");
    }
%>

</body>
</html>
