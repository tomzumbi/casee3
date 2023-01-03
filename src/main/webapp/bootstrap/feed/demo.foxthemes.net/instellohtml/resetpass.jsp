<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/2/2023
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from demo.foxthemes.net/instellohtml/form-login.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 29 Dec 2022 04:43:04 GMT -->
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Favicon -->
    <link href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/images/favicon.png" rel="icon" type="image/png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Basic Page Needs
    ================================================== -->
    <title>Forgot Password</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Instello - Sharing Photos platform HTML Template">

    <!-- icons
    ================================================== -->
    <link rel="stylesheet" href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/css/icons.css">

    <!-- CSS
    ================================================== -->
    <link rel="stylesheet" href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/css/uikit.css">
    <link rel="stylesheet" href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/css/style.css">
    <link rel="stylesheet" href="/bootstrap/feed/demo.foxthemes.net/instellohtml/assets/css/tailwind.css">

</head>


<body class="bg-gray-100">


<div id="wrapper" class="flex flex-col justify-between h-screen">

    <div class="bg-white py-4 shadow dark:bg-gray-800">
        <div class="max-w-6xl mx-auto">
            <div class="flex items-center lg:justify-between justify-around">
                <a href="/login">
                    <img src=" http://demo.foxthemes.net/instellohtml/assets/images/logo.png" alt="" class="w-32">
                </a>
            </div>
        </div>
    </div>
    <div style="margin-bottom: 50%">
        <div class="lg:p-12 max-w-md max-w-xl lg:my-0 my-12 mx-auto p-6 space-y-">
            <h3 class="lg:text-3xl text-xl font-semibold  mb-6">Reset Password </h3>
            <p>${mess}</p>
            <form action="/resetpass" method="post">
                <input type="text" placeholder="Username"
                       class="bg-gray-200 mb-2 shadow-none dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;"
                       name="username">
                <input type="text" placeholder="Enter your new password"
                       class="bg-gray-200 mb-2 shadow-none dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;"
                       name="password">
                <input type="text" placeholder="Enter your new password"
                       class="bg-gray-200 mb-2 shadow-none dark:bg-gray-800"
                       style="border: 1px solid #d3d5d8 !important;"
                       name="repass">
                <button type="submit" class="btn btn-light">Reset My Password</button>

            </form>
        </div>
    </div>
</div>
>
</body>
</html>