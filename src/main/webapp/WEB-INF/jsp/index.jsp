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
            커피 1
        </div>
        <div>
            <input name="coffre1" type="number" value="0">
        </div>
        <div>
            커피 2
        </div>
        <div>
            <input type="number" value="0">
        </div>
        <div>
            커피 3
        </div>
        <div>
            <input type="number" value="0">
        </div>
        <div>
            커피 4
        </div>
        <div>
            <input type="number" value="0">
        </div>

        <div>
            <input type="submit" value="주문 입력">
        </div>
    </div>
</form>
</body>
</html>
