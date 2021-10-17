/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validators;

import models.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Lichi
 */
public class RegistrarValidator implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return User.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName",
                "required.firstName","El campo nombre es obligatorio");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"lastName",
                "required.lastName","El campo apellido es obligatorio");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email",
                "required.email","El campo email es obligatorio");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password",
                "required.password","El campo password es obligatorio");
        
        User user =(User)o;
        if(!IsEmail.isEmail(user.getEmail())&&!user.getEmail().isEmpty()){
            errors.rejectValue("email", "required.email","Proporciones un email válido.");
        }
    }
    
}
