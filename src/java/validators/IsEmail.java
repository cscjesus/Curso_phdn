/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lichi
 */
public class IsEmail {
    public static boolean isEmail(String correo){
        Pattern pat;
        Matcher mat;
        pat = Pattern.compile("^[_a-z0-9-]+(.[a-z0-9-]+)@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");
        mat = pat.matcher(correo);
        return mat.find();
    }
}
