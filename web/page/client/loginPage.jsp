<%--
  Created by IntelliJ IDEA.
  User: TianShuo
  Date: 14-6-21
  Time: 下午11:54
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>应用授权 - ${clientName}</title>
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
            <s:form action="loginHanlde" method="post" id="loginForm">

                <div class="oauth_content" node-type="commonlogin">
                    <p class="oauth_main_info">
                        授权 <a href="{$应用URL}" target="_blank" class="app_name">
                        <s:property value="clientName"/>
                    </a> 访问你的{$服务商名称}帐号
                    </p>

                    <!-- 登录 -->
                    <div class="oauth_login clearfix">
                        <input type="hidden" name="action" id="action" value="login"/>
                        <input type="hidden" id="display" name="display" value="default"/>
                        <input type="hidden" name="quick_auth" id="quick_auth" value="null"/>
                        <input type="hidden" name="scope" id="scope" value=""/>
                        <input type="hidden" name="ticket" id="ticket" value=""/>
                        <input type="hidden" name="isLoginSina" id="isLoginSina" value=""/>
                        <input type="hidden" name="response_type" value="code"/>
                        <input type="hidden" name="regCallback"
                               value="https%3A%2F%2Fapi.weibo.com%2F2%2Foauth2%2Fauthorize%3Fclient_id%3D2857799177%26response_type%3Dcode%26display%3Ddefault%26redirect_uri%3Dhttps%3A%2F%2Fsae.sina.com.cn%2Fssl%2F%3Fm%3Dsso%26amp%3Ba%3Dweibo_callback%26amp%3Bsccb%3Dhttp%253A%252F%252Fsae.sina.com.cn%252F%253Fm%253Duser%2526a%253Dreg_check_login%26from%3D%26with_cookie%3D"/>
                        <input type="hidden" name="redirect_uri"
                               value=""/>
                        <input type="hidden" name="client_id" value=""/>
                        <input type="hidden" name="appkey62" value="4BwIVb"/>
                        <input type="hidden" name="state" value=""/>
                        <input type="hidden" name="verifyToken" value="null"/>
                        <input type="hidden" name="from" value=""/>
                        <input type="hidden" name="switchLogin" id="switchLogin" value="0"/>

                        <div class="oauth_login_form">
                            <p class="oauth_login_01">
                                <label class="oauth_input_label">帐号：</label>
                                <s:textfield name="userId" cssClass="iptxt oauth_form_input"
                                             placeholder="GreenCMS账号"></s:textfield>
                                <s:fielderror  cssClass="oauth_tips"  fieldName="userId"/>
                            </p>

                            <p>
                                <label class="oauth_input_label">密码：</label>
                                <s:password name="passwd" cssClass="iptxt oauth_form_input"
                                            placeholder="GreenCMS密码"></s:password>
                                <s:fielderror cssClass="oauth_tips" fieldName="passwd"/>
                            </p>

                            <s:hidden name="redirect_uri_login" value="%{redirect_uri_login}" >


                             </s:hidden>

                        </div>
                        <!-- </form> -->

                    </div>
                    <div class="oauth_login_box01 clearfix">
                        <div class="oauth_login_submit">
                            <p class="oauth_formbtn">

                                <button type="submit" class="btn_login formbtn_01">登陆</button>
                                <button id="cancel" class="btn_cancel formbtn_01">取消</button>
                            </p>
                        </div>
                    </div>
                    <!-- /登录 -->
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


