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
            <form action="MainController" method="post">
                <div class="card-body">
                    <div class="form-group">
                        <label>Client Data</label>
                    </div>
                    <div class="form-group d-flex">
                        <div class="col-sm-6 d-flex">
                            <input type="text" name="clientCod" class="form-control" placeholder="Code">
                            <input type="submit" name="action" value="Search" class="btn btn-outline-info">
                        </div>

                        <div class="col-sm-6">
                            <input type="text" name="clientName" class="form-control" >
                        </div>

                    </div>
                    <div class="form-group">
                        <label>Product Data</label>
                    </div>
                    <div class="form-group d-flex">

                        <div class="col-sm-6 d-flex">
                            <input type="text" name="productCod" class="form-control" placeholder="Code">
                            <input type="submit" name="action" value="Search" class="btn btn-outline-info">
                        </div>

                        <div class="col-sm-6">
                            <input type="text" name="productName" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group d-flex">
                        <div class="col-sm-6 d-flex">
                            <input type="text" name="quantity" class="form-control" placeholder="S/.0.00">
                        </div>

                        <div class="col-sm-3 d-flex">
                            <input type="number" name="price" class="form-control" >
                        </div>

                        <div class="col-sm-3">
                            <input type="text" name="stock" placeholder="Stock" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group" >
                            <input type="submit" name="action" value="Add" class="btn btn-outline-info">
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
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
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