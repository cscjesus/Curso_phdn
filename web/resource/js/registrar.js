/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Registrar {
    register() {
    
        $.post(
                "register",
                $('form[name=registrar]').serialize(),
                (response) => {
                    let item = JSON.parse(reponse);
                    if(item[0]!==null){
                        if(item[0].firstName !== undefined){
                            $("#firstName").text(item[0].firstName);
                            $("#nombre").focus();
                        }else{
                            $("#firstName").text("")
                        }
                        if(item[0].lastName !== undefined){
                            $("#lastName").text(item[0].lastName);
                            $("#apellido").focus();
                        }else{
                            $("#lastName").text("")
                        }
                    }
                });
       // alert("ok");
    }
}

