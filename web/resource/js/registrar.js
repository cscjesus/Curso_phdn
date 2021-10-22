/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    URL="/Curso/";
class Registrar {
    register() {

        $('#registrar').submit(
                function (event) {

                    var data = $("#registrar").serialize();
                    $.ajax({
                        //url: $("#registrar").attr("action"),
                        url: "registrar",
                        data: data,
                        type: "POST",

                        success: function (response) {
                            let item = JSON.parse(response);
                            //alert(item);
                            if (item.agregado) {
                                //window.location.href = "http://localhost:8080/Curso/principal";
                                window.location.href = URL+ "principal";
                            } else {
                                $("#mensaje").text("Email ya registrado");
                            }
                        },
                        error: function (xhr, status, error) {
                            alert(xhr.responseText);
                        }
                    });
                    return false;
                });
        
    }
}

/*
 * https://ozenero.com/integrate-jquery-ajax-post-get-spring-boot-web-service
 */