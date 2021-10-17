/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import library.Configuration;

/**
 *
 * @author Lichi
 */
@Controller
public class IndexController {
    @RequestMapping(method=RequestMethod.GET)
    public void procesar(HttpServletRequest req,HttpServletResponse res){
       String[] dataUrl = req.getRequestURI().split("/");
        try {
            if(dataUrl.length==2){
                res.sendRedirect(Configuration.URL+"home");
            }else{
                res.sendRedirect(Configuration.URL+"error");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
