<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="style/css/bootstrap.min.css">
    <title>Sales</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">

    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">Home</a>
            </li>
            <li class="nav-item">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="MainController?menu=product" target="myFrame">Products</a>
            </li>
            <li class="nav-item">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="MainController?menu=employer&action=List" target="myFrame">Employers</a>
            </li>
            <li class="nav-item">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="MainController?menu=clients" target="myFrame">Clients</a>
            </li>
            <li class="nav-item">
                <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="MainController?menu=saleRegister" target="myFrame">New sale</a>
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
                <a class="dropdown-item" href="#">${user.getName()}</a>
                <a class="dropdown-item" href="#">E-mail</a>
                <div class="dropdown-divider"></div>
                <form action="Validator" method="post">
                    <button name="action" value="Logout" class="dropdown-item" href="#">Logout</button>
                </form>

            </div>
        </div>

</nav>
<div class="m-4" style="height: 650px">
    <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
</div>
<script src="style/js/jquery-3.5.1.min.js"></script>
<script src="style/js/popper.js"></script>
<script src="style/js/bootstrap.bundle.min.js"></script>
<script src="style/js/bootstrap.min.js"></script>
<script src="style/js/bootstrap.js"></script>
<script src="style/js/bootstrap.bundle.js"></script>


</body>
</html>
