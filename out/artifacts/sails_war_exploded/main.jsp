<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="style/css/bootstrap.min.css">
    <title>Hello!!!</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">

    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">Home</a>
            </li>
            <li class="nav-item">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">Products</a>
            </li>
            <li class="nav-item">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">Employers</a>
            </li>
            <li class="nav-item">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">Clients</a>
            </li>
            <li class="nav-item">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">New sale</a>
            </li>
        </ul>
        </div>
        <div class="dropdown" >
            <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                ${user.getName()}
            </button>
            <div class="dropdown-menu dropdown-menu-right text-center">
                <a class="dropdown-item" href="#">
                    <img src="img/user.png" alt="60" width="60"/>
                </a>
                <a class="dropdown-item" href="#">Username</a>
                <a class="dropdown-item" href="#">E-mail</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Logout</a>
            </div>
        </div>

</nav>

<script src="style/js/jquery-3.5.1.min.js"></script>
<script src="style/js/popper.js"></script>
<script src="style/js/bootstrap.bundle.min.js"></script>
<script src="style/js/bootstrap.min.js"></script>
<script src="style/js/bootstrap.js"></script>
<script src="style/js/bootstrap.bundle.js"></script>


</body>
</html>
