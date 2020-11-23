<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="style/css/bootstrap.min.css">
    <title>Login</title>
</head>
<body>
      <div class="container mt-4 col-lg-4" >
            <div class="card col-sm-10">
                <div class="card-body">
                  <form class="form-sign" action="Validator" method="POST">
                      <div class="form-group text-center">
                            <h3>Login</h3>
                            <img src="img/sail.jpg" alt="70" width="70">
                            <label>Welcome</label>
                      </div>
                      <div class="form-group">
                            <label>User:</label>
                            <input type="text" name="txtuser" class="form-control">
                      </div>
                      <div class="form-group">
                          <label>Password:</label>
                          <input type="password" name="txtpass" class="form-control">
                      </div>
                      <input type="submit" name="action" value="Login" class="btn btn-primary btn-block">
                  </form>
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
