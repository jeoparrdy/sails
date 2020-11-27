<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style/css/bootstrap.min.css">
    <title>Title</title>
</head>
<body>
<div class="d-flex">
    <div class="card col-sm-4">
        <div class="card">
            <div class="card-body">
                <form action="MainController?menu=employer" method="post">
                    <div class="form-group">
                        <label>Number</label>
                        <input type="text" value="${employer.getNumber()}" name="txtNumber" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Name</label>
                        <input type="text"  value="${employer.getName()}" name="txtName" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Phone</label>
                        <input type="text" value="${employer.getPhone()}" name="txtPhone" maxlength="9" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>State</label>
                        <input type="text" value="${employer.getState()}" name="txtState" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>User</label>
                        <input type="text" value="${employer.getUser()}" name="txtUser" class="form-control">
                    </div>
                    <input type="submit" name="action" value="Add" class="btn btn-info">
                    <input type="submit" name="action" value="Update" class="btn btn-success">
                </form>
            </div>
        </div>
    </div>
    <div class="col-sm-8">
        <div class="card">
            <div class="card-body">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NUM</th>
                            <th>NAME</th>
                            <th>PHONE</th>
                            <th>STATE</th>
                            <th>USER</th>
                            <th>ACTIONS</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="employer" items="${employers}">
                            <tr>
                                <td>${employer.getId()}</td>
                                <td>${employer.getNumber()}</td>
                                <td>${employer.getName()}</td>
                                <td>${employer.getPhone()}</td>
                                <td>${employer.getState()}</td>
                                <td>${employer.getUser()}</td>
                                <td>
                                    <a class="btn btn-warning" href="MainController?menu=employer&action=Edit&id=${employer.getId()}">Edit</a>
                                    <a class="btn btn-danger" href="MainController?menu=employer&action=Delete&id=${employer.getId()}">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<script src="style/js/jquery-3.5.1.min.js"></script>
<script src="style/js/popper.js"></script>
<script src="style/js/bootstrap.bundle.min.js"></script>
<script src="style/js/bootstrap.min.js"></script>
<script src="style/js/bootstrap.js"></script>
<script src="style/js/bootstrap.bundle.js"></script>
</body>
</html>