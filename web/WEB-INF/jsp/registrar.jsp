<%-- 
    Document   : registrar
    Created on : 10 oct 2021, 7:26:07
    Author     : Lichi
--%>

<jsp:include page="head.jsp" flush="true"/>
<div class="container p-4">
    <div class="row">
        <div class="col-md-4 mx-auto">
            <div class="card text-center">
                <div class="card-header"><h3>Registrarse</h3></div>
                <div class="card-body">
                    
                    <form id="registrar" method="post" action="/Curso/profile">
      
      <div class="form-group">
          <input type="text" name="firstName" id="nombre" placeholder="Nombre" class="form-control" autofocus required/>
                            <span id="firstName" class="mensaje"/>
                        </div>
                        <div class="form-group">
                            <input type="text" id="apellido" name="lastName" placeholder="Apellido" class="form-control" required/>
                            <span id="lastName" class="mensaje"/>
                        </div>
                        <div class="form-group">
                            <input type="text" id="email"name="email" placeholder="Email" class="form-control" required/>
                            <span id="email1" class="mensaje"/>
                        </div>
                        <div class="form-group">
                            <input type="password" id="pass" name="password" placeholder="Password" class="form-control" required/>
                            <span id="password" class="mensaje"/>
                        </div>
                        <!--button onclick="new Registrar().register()" class="btn btn-primary btn-block"-->
                        <button onclick="return new Registrar().register()" class="btn btn-primary btn-block">
                            SingIn
                        </button>
                         <span id="mensaje" class="mensaje"/>
    

      
 
<div>
         <!--button type="submit" name="submit">Submit</button-->
     </div>
 
 
</form>
                    
                    <!--form name="registrar">
                        <div class="form-group">
                            <input type="text" name="firstName" placeholder="Nombre" class="form-control" autofocus required/>
                            <span id="firstName" class="mensaje"/>
                        </div>
                        <div class="form-group">
                            <input type="text" name="lastName" placeholder="Apellido" class="form-control" required/>
                            <span id="lastName" class="mensaje"/>
                        </div>
                        <div class="form-group">
                            <input type="text" name="email" placeholder="Email" class="form-control" required/>
                            <span id="email" class="mensaje"/>
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" placeholder="Password" class="form-control" required/>
                            <span id="password" class="mensaje"/>
                        </div>
                        <button onclick="" class="btn btn-primary btn-block">
                            SingIn
                        </button>
                         <span id="mensaje" class="mensaje"/>
                    </form-->
                </div>
            </div> 
        </div>
    </div>
</div>




<script>
    $(document).ready(function() {
    
    });
</script>
<jsp:include page="footer.jsp" flush="true"/>
