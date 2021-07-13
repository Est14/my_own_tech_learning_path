<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!-- Icons -->
    <script src="https://kit.fontawesome.com/48656e21c6.js" crossorigin="anonymous"></script>
    <title>Edit client</title>
</head>
<body>
<!-- Header -->
<jsp:include page="/WEB-INF/pages/common/header.jsp"/>

<form action="controller-servlet?action=modify&idClient=${client.idCustomer}" method="POST"
      class="was-validated">
    <!-- Bottom Nav -->
    <jsp:include page="/WEB-INF/pages/common/bottomNav.jsp"/>

    <section id="details">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            <h4>Edit Client</h4>
                        </div>
                        ${client}
                        <div class="card-body">
                            <div class="form-group">
                                <label class="form-label">
                                    <span>Name: </span>
                                    <input type="text" class="form-control" name="name" required value="${client.name}">
                                </label>
                            </div>
                            <div class="form-group">
                                <label class="form-label">
                                    <span>Last Name: </span>
                                    <input type="text" class="form-control" name="lastName" required value="${  client.lastName}">
                                </label>
                            </div>
                            <div class="form-group">
                                <label class="form-label">
                                    <span>email: </span>
                                    <input type="email" class="form-control" name="email" required value="${client.email}">
                                </label>
                            </div>
                            <div class="form-group">
                                <label class="form-label">
                                    <span>Phone: </span>
                                    <input type="tel" class="form-control" name="phone" required value="${client.phone}">
                                </label>
                            </div>
                            <div class="form-group">
                                <label class="form-label">
                                    <span>Balance: </span>
                                    <input type="number" class="form-control" name="balance" required value="${client.balance}">
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</form>

<!-- Footer -->
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>

<!-- Option 2: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>

</body>
</html>
