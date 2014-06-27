<%--
  Created by IntelliJ IDEA.
  User: TianShuo
  Date: 14-6-22
  Time: 上午11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>应用授权页面</title>
    <link type="text/css" href="/assets/oauth2/css/oauth_web.css" rel="stylesheet"/>
    <!--<style>
        body { padding-bottom:300px; }
    </style>-->
</head>



<body class="UIbody widgets">
<div class="xline1 oauth_xline" id="outer">
    <div class="oauth_wrap">
        <div class="oauth_header clearfix">
            <h1 class="logo" title="GreenOAuth"><a href="http://oauth.njut.asia">GreenOAuth</a></h1>

            <p class="login_account">
                <!-- <a class="sign_up_link" href="" target="_blank">注册</a>-->
            </p>
        </div>
        <div class="panel oauth_main">

            <s:form action="authorizeHandle" method="post" id="loginForm">

                <s:hidden name="client_id" value="%{client_id}" />
                <s:hidden name="redirect_uri" value="%{redirect_uri}"/>

                <div class="oauth_content" node-type="commonlogin">
                    <p class="oauth_main_info">
                        授权 <a href="{$应用URL}" target="_blank" class="app_name">
                            ${clients.clientName}</a> 访问你的GreenCMS帐号
                    </p>
                </div>


                <div class="oauth_login_box01 clearfix">
                    <div class="oauth_login_submit">
                        <p class="oauth_formbtn">
                            <s:submit value="click here to authorize" cssClass="btn_login formbtn_01"
                                    cssStyle="width: 201px;"  />
                        </p>
                    </div>
                </div>


            </s:form>


        </div>
        <!-- 根据域名修改文案 -->
        <p class="oauth_tiptxt">提示：为保障帐号安全，请认准本页URL地址必须以 oauth.njut.asia 开头</p>

    </div>
</div>
<script src="/assets/js/jquery-2.0.2.min.js"></script>
<script src="/assets/js/jquery.form.js"></script>

</body>
</html>




