<%--
  Created by IntelliJ IDEA.
  User: TianShuo
  Date: 14-6-22
  Time: 上午11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
    <title></title>
</head>
<body>

<%--${client_id}--%>
<%--${redirect_uri}--%>

<s:form action="authorizeHandle" method="post" id="loginForm">

    <s:hidden name="client_id" >${client_id}</s:hidden>
    <br/>
    <s:hidden name="redirect_uri"  >${redirect_uri}</s:hidden>
    <s:submit value="click here to authorize"/>
</s:form>


</body>
</html>
