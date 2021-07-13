<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="en_US"/>
<section id="clients">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Clients List</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                        <tr>
                            <th>#</th>
                            <th>Name</th>
                            <th>Balance</th>
                            <th></th>
                        </tr>
                        </thead>
                        <c:forEach var="client" items="${clients}">
                            <tr>
                                <td>${client.idCustomer}</td>
                                <td>${client.name} ${client.lastName}</td>
                                <td><fmt:formatNumber value="${client.balance}" type="currency" /> </td>
                                <td>
                                    <a href="controller-servlet?action=edit&idCustomer=${client.idCustomer}" class="btn btn-secondary">
                                    <i class="fas fa-angle-double-right"></i> Edit
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                        <tbody>

                        </tbody>
                    </table>
                </div>
            </div>
            <!-- Total cards -->
            <div class="col-md-3">
               <div class="card text-center bg-danger text-white mb-3">
                   <div class="card-body">
                       <h3>Total Balance</h3>
                       <h4 class="display-4">
                           <fmt:formatNumber value="${totalBalance}" type="currency"/>
                       </h4>
                   </div>
               </div>

                <div class="card text-center text-white bg-success mb-3" >
                    <div class="card-body" >
                        <h3>Total Clients</h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i>
                            ${totalClients}
                        </h4>
                    </div>
                </div>

            </div>
        </div>
    </div>
</section>

<!--Add Client Modal -->
<jsp:include page="/WEB-INF/pages/client/addClient.jsp"/>
