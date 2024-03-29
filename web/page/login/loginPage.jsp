<%--
  Created by IntelliJ IDEA.
  User: TianShuo
  Date: 14-5-20
  Time: 上午8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html class="bg-black">
<head>
    <meta charset="UTF-8">
    <title>GreenOAUth | Log in</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- bootstrap 3.0.2 -->
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <!-- font Awesome -->
    <link href="/assets/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <!-- Theme style -->
    <link href="/assets/css/AdminLTE.css" rel="stylesheet" type="text/css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

    <style>
        .errorMessage {
            list-style-type: none;
            padding: 5px 0px 0px 15px;
            color: #c61f1b;
        }
    </style>
</head>
<body class="bg-black">

<div class="form-box" id="login-box">
    <div class="header">GreenOAUth Sign In</div>

    <s:form action="loginHandle" method="post">
        <div class="body bg-gray">
            <div class="form-group">
                <s:textfield name="userLogin.username" cssClass="form-control" placeholder="Username"></s:textfield>
                <s:fielderror fieldName="userLogin.username"/>
            </div>
            <div class="form-group">
                <s:password name="userLogin.password" cssClass="form-control" placeholder="Password"></s:password>
                <s:fielderror fieldName="userLogin.password"/>

            </div>
            <div class="form-group">
                <input type="checkbox" name="remember_me"/> Remember me
            </div>
        </div>
        <div class="footer">
            <button type="submit" class="btn bg-olive btn-block">Sign me in</button>

                <%--<p><a href="#">I forgot my password</a></p>--%>

                <%--<a href="register.html" class="text-center">RegisterAction a new membership</a>--%>
        </div>
    </s:form>

    <div class="margin text-center">


    </div>
</div>


<!-- jQuery 2.0.2 -->
<script src="/assets/js/jquery-2.0.2.min.js"></script>
<!-- Bootstrap -->
<script src="/assets/js/bootstrap.min.js" type="text/javascript"></script>

</body>
</html>