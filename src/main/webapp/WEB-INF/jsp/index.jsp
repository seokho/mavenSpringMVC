<%--
  Created by IntelliJ IDEA.
  User: ODOL
  Date: 2017. 5. 1.
  Time: PM 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h2>음료 주문</h2>
</div>
<form action="orderBeverage" method="get">

    <div>
        <div>
            에스프레소 2분
        </div>
        <div>
            <input name="espresso" type="number" value="0">
        </div>
        <div>
            아메리카노 3분
        </div>
        <div>
            <input name="americano" type="number" value="0">
        </div>
        <div>
            과일 주스 5분
        </div>
        <div>
            <input name="fruitjuice" type="number" value="0">
        </div>
        <div>
            카페라테 4분
        </div>
        <div>
            <input name="cafelatte" type="number" value="0">
        </div>

        <div>
            <input type="submit" value="주문 입력">
        </div>
    </div>
</form>
</body>
</html>
