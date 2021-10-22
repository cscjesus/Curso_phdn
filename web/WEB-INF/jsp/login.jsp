<%-- 
    Document   : login
    Created on : 22 oct 2021, 9:05:38
    Author     : Lichi
--%>

<jsp:include page="head.jsp" flush="true"/>

<div class="container p-4">
    <div class="row">
        <div class="col-md-4 mx-auto">
            <div class="card text-center">
                <div class="card-header">
                    <h3>Login</h3>    
                </div>
                <div class="card-body">
                    <form method="post">
                        <div class="form-group">
                            <input type="email" name="email" placeholder="Email" class="form-control" autofocus="">
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" placeholder="password" class="form-control" >
                        </div>
                        <button class="btn btn-primary btn-block">
                            SingIn
                        </button>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp" flush="true"/>