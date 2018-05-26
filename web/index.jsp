<%--
  Created by IntelliJ IDEA.
  User: zoulvzhou
  Date: 2018/5/23
  Time: 上午10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>helloworld</title>
  </head>
  <body>


  <! 指定的是post请求，那么需要使用表单提交 -->
  <form action="springmvc/testMethod" method="POST">

    <input type="submit" value="submit">

  </form>


  <a href="springmvc/testMethod">testMethod</a>


  <<br><<br>

  <a href="springmvc/testRequestMapping">testRequestMaping</a>


  <<br><<br>

  <a href="helloworld">Hello  World</a>
  </body>
</html>
