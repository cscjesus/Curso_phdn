/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import library.LUsers;
import models.User;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    Map<String, String> errors;
    private final LUsers users;
    private boolean valor;
//inyeccion de clase

    @Autowired
    public RegistrarController(RegistrarValidator validator) {
        this.validator = validator;
        users = new LUsers();
    }

    @RequestMapping(value = "/registrar", method = RequestMethod.GET)
    public ModelAndView registrar() {
        return new ModelAndView();
    }

    /*La anotación @ResponseBody asigna el cuerpo HttpRequest a un objeto de dominio
    o transferencia, permitiendo la deserialización automática del cuerpo HttpRequest
    entrante en un objeto Java*/
 /*@Valid verifica si los datos que envía al método son válidos*/
 /*BindingResult representa resultados vinculantes*/
    @RequestMapping(value = "/registrar", method = RequestMethod.POST)
    //@RequestMapping(method = RequestMethod.POST)

    public @ResponseBody
    String registrar(
   // String register(
            @Valid User user, BindingResult result, HttpServletRequest request) {
        errors=null;
        validator.validate(user, result);
        if (result.hasErrors()) {
            errors = result.getFieldErrors().stream()
                    .collect(
                            Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage)
                    );
        } else {
            valor = users.registrar(user, request);
        }
        Object[] dataObj = {
            errors,
            valor
        };

return JSONObject.valueToString(dataObj);
    }


}

//https://github.com/stleary/JSON-java

//https://vitalflux.com/make-ajax-calls-java-spring-mvc/