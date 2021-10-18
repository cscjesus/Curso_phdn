/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validators;

/**
 *
 * @author liz
 */
public class Encrypt {
    //definicion del tipo de algoritmo a utilizar (aes,des,rsa)
    private final static String alg="AES";
    //definicino del modo de cifrado a utilizar
    private final static String cI ="AES/CBC/PKCS5Padding";
    private static String key = "92AE31A79FEEB2A3";//llave
    private static String iv = "0123456789ABCDEF";//vector de inicializacion
    public static String encrypt(String clearText)throws Exception{
        
    }
}
