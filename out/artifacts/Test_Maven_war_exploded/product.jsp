<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: anhtran
  Date: 11/5/21
  Time: 6:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ABC</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<div class="container" style="padding: 50px;text-align: center">
    <h1 style="margin-bottom: 15px">List Product</h1>
    <a href="/Test_Maven_war_exploded/logout"
       style="text-decoration: none; font-size: 18px">Logout</a>
    <c:if test="${products != null}">
        <table style="margin-top: 10px">
            <tr>
                <th>Name</th>
                <th>Amount</th>
                <th>Price</th>
            </tr>

            <c:forEach var="p" items="${products}">
                <tr>
                    <td>${p.name}</td>
                    <td>${p.amount}</td>
                    <td>${p.price}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <c:if test="${products == null}">
        <p class="alert">Product is null</p>
    </c:if>
</div>


</body>
</html>
