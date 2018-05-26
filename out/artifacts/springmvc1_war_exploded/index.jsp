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



<a href="springmvc/testSessionAttribuates">testSessionAttribuates</a>


<<br><<br>



<a href="springmvc/testMap">testMap</a>


<<br><<br>


<h4>Success</h4>

time: ${requestScope.time}

<<br><<br>


<a href="springmvc/testServletAPI">testServletAPI</a>


<<br><<br>


<form action="springmvc/testPojo" method="POST">

    username: <input type="text" name="username">
    <br>
    password: <input type="password" name="password">
    <br>
    email: <input type="text" name="email">
    <br>
    city: <input type="text" name="address.city">
    <br>
    province: <input type="text" name="address.province">
    <br>
    <input type="submit" value="Submit">

</form>


<<br><<br>


<a href="springmvc/testCookieValue">testCookieValue</a>


<<br><<br>


<a href="springmvc/testPathVariable/1">testPathVariable</a>


<<br><<br>


<a href="springmvc/testAntPath/xxx/yyy/testAntPath">testAntPath</a>


<<br><<br>


<a href="springmvc/testParamsAndHeaders?username=zou&age=11">testParamsAndHeaders</a>


<<br><<br>


<! 指定的是post请求，那么需要使用表单提交 -->
<form action="springmvc/testMethod" method="POST">

    <input type="submit" value="submit">

</form>


<a href="springmvc/testMethod">testMethod</a>


<<br><<br>

<a href="springmvc/testRequestMapping">testRequestMaping</a>


<<br><<br>

<a href="helloworld">Hello World</a>
</body>
</html>
