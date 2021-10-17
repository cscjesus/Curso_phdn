/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.Map;
import java.util.stream.Collectors;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import models.User;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;
import validators.RegistrarValidator;

/**
 *
 * @author Lichi
 */
@Controller
public class RegistrarController {
    private final RegistrarValidator validator;
    Map<String,String> errors;
//inyeccion de clase
    @Autowired
    public RegistrarController(RegistrarValidator validator) {
        this.validator = validator;
    }

    
    
    @RequestMapping(value="/registrar")
    public ModelAndView registrar(){
        return new ModelAndView();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    /*La anotación @ResponseBody asigna el cuerpo HttpRequest a un objeto de dominio
    o transferencia, permitiendo la deserialización automática del cuerpo HttpRequest
    entrante en un objeto Java*/
    /*@Valid verifica si los datos que envía al método son válidos*/
    /*BindingResult representa resultados vinculantes*/
    public @ResponseBody
    String register(@Valid User user, BindingResult result, HttpServletRequest request){
        //System.out.println(user);
        validator.validate(user, result);
        if(result.hasErrors()){
           errors = result.getFieldErrors().stream()
                    .collect(
                    Collectors.toMap(FieldError::getField,FieldError::getDefaultMessage)
                    );
        }else{
            
        }
        Object[] dataObj ={
        errors
        };
       return JSONObject.valueToString(dataObj);
    }
}

//https://github.com/stleary/JSON-java

