<%--
  Created by IntelliJ IDEA.
  User: TianShuo
  Date: 14-5-20
  Time: 上午8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>z
<html>
  <head>
    <title></title>
  </head>
  <body>

  <%
      // 重定向到新地址
      String site = new String("/index/index");
      response.setStatus(response.SC_MOVED_TEMPORARILY);
      response.setHeader("Location", site);
  %>


  </body>
</html>
