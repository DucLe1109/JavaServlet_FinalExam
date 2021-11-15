<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/15/2021
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<! DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title> Bootstrap 4 Login Form Example
    </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<style>
    html {
        height: 100%;
    }
    body {
        height: 100%;
    }
    .global-container {
        height: 100%;
        display: flex;
        align-items: center;
        justify-content: center;
        background-color: #f5f5f5;
    }
    form {
        padding-top: 10px;
        font-size: 14px;
        margin-top: 30px;
    }
    .card-title {
        font-weight: 300;
    }
    .btn {
        font-size: 14px;
        margin-top: 20px;
    }
    .login-form {
        width: 330px;
        margin: 20px;
    }
    .sign-up {
        text-align: center;
        padding: 20px 0 0;
    }
    .alert {
        margin-bottom: -30px;
        font-size: 13px;
        margin-top: 20px;
    }
</style>
<body>
<div class="pt-5">
    <div class="global-container">
        <div class="card login-form">
            <div class="card-body">
                <h3 class="card-title text-center"> LOGIN FORM </h3>
                <div class="card-text">
                    <form action="createUser" method="post">
                        <div class="form-group">
                            <label for="exampleInputEmail1"> Enter Username </label>
                            <input type="text" class="form-control form-control-sm" name="username" id="exampleInputEmail1" aria-describedby="emailHelp">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Enter Password </label>
                            <input type="password" class="form-control form-control-sm" name="password" id="exampleInputPassword1">
                        </div>
                        <button type="submit" class="btn btn-primary btn-block"> Submit </button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
