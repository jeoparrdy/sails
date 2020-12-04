<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style/css/bootstrap.min.css">
    <title>Sales</title>
</head>
<body>
<div class="d-flex">
    <div class="col-sm-4">

        <div class="card">
            <form action="MainController?menu=saleRegister" method="POST">
                <div class="card-body">
                    <div class="form-group">
                        <label>Client Data</label>
                    </div>
                    <div class="form-group d-flex">
                        <div class="col-sm-6 d-flex">
                            <input type="text" name="clientCode" value="${client.getNumber()}" class="form-control" placeholder="Code">
                            <button type="submit" name="action" value="searchClient" class="btn btn-outline-info">Search</button>
                        </div>

                        <div class="col-sm-6">
                            <input type="text" name="clientName" value="${client.getName()}" class="form-control" >
                        </div>

                    </div>
                    <!-----------PRODUCT DATA--------------->
                    <div class="form-group">
                        <label>Product Data</label>
                    </div>
                    <div class="form-group d-flex">
                        <div class="col-sm-6 d-flex">
                            <input type="text" name="productCode" value="${product.getId()}" class="form-control" placeholder="Code">
                            <button type="submit" name="action" value="searchProduct" class="btn btn-outline-info">Search</button>
                        </div>

                        <div class="col-sm-6">
                            <input type="text" name="productName" value="${product.getName()}" placeholder="Product Data" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group d-flex">
                        <div class="col-sm-6 d-flex">
                            <input type="text" name="price" value="${product.getPrice()}" class="form-control" placeholder="S/.0.00">
                        </div>

                        <div class="col-sm-3 d-flex">
                            <input type="number" name="quantity" value="1"  class="form-control" >
                        </div>

                        <div class="col-sm-3">
                            <input type="text" name="stock" value="${product.getStock()}" placeholder="Stock" class="form-control" >
                        </div>
                    </div>
                    <!---New sale after button pressing--->
                    <div class="form-group" >
                        <div class="col-sm">
                            <button type="submit" name="action" value="addProduct" class="btn btn-outline-info">Add product</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <div class="col-sm-7">
        <div class="card">
            <div class="card-body">
                <div class="d-flex col-sm-5 ml-auto" >
                    <label>Sale number</label>
                    <input type="text" name="seriesNom" class="form-control">
                </div>
                <br>
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Num</th>
                            <th>Code</th>
                            <th>Description</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="sales" items="${saleList}">
                            <tr>
                                <td>${sales.getItem()}</td>
                                <td>${sales.getIdProduct()}</td>
                                <td>${sales.getDescription()}</td>
                                <td>${sales.getPrice()}</td>
                                <td>${sales.getQuantity()}</td>
                                <td>${sales.getSubtotal()}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="card-footer">
                <input type="submit" name="action" value="New Sale" class="btn btn-success">
                <input type="submit" name="action" value="Cancel" class="btn btn-danger">
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