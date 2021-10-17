/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import library.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Lichi
 */
@Controller
public class HomeController {
    @RequestMapping(value="/home")
    public ModelAndView home(){
        return new ModelAndView();
    }
    @RequestMapping(value="/home/*")
    private void error(HttpServletResponse res){
        try {
            res.sendRedirect(Configuration.URL+"error");
        } catch (IOException ex) {
        }
    }
}
