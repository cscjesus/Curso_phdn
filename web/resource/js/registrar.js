/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
URL = "/Curso/";
class Registrar {
    register() {
        $.post(
                "registrar",
                //"register",
                $('#registrar').serialize(),
                (response) => {

            let item = JSON.parse(response);
            if (item[0] !== null) {
                if (item[0].firstName !== undefined) {
                    $("#firstName").text(item[0].firstName);
                    $("#nombre").focus();
                } else {
                    $("#firstName").text("");
                }
                if (item[0].lastName !== undefined) {
                    $("#lastName").text(item[0].lastName);
                    $("#apellido").focus();
                } else {
                    $("#lastName").text("");
                }
                if (item[0].email !== undefined) {
                    $("#email1").text(item[0].email);
                    $("#email").focus();
                } else {
                    $("#email1").text("");
                }
                if (item[0].password !== undefined) {
                    $("#password").text(item[0].password);
                    $("#pass").focus();
                } else {
                    $("#password").text("");
                }
            } else {
                if (item[1]) {
                    window.location.href = URL + "principal";
                } else {
                    $("#mensaje").text("Email registrado");
                }
            }
            console.log(item);
        });
        return false;


    }
}

/*
 * https://ozenero.com/integrate-jquery-ajax-post-get-spring-boot-web-service
 */