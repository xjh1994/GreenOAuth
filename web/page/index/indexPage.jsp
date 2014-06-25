<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>

 <s:a namespace="/login" name="index" action="login">立即登陆</s:a>
 <s:a namespace="/oauth2" name="login" action="login">oauth登陆</s:a>
</body>
</html>