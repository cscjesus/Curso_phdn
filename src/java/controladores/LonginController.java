/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Lichi
 */
@Controller
public class LonginController {
    @RequestMapping(value="/login")
    public ModelAndView principal(){
        return new ModelAndView();
    }
}
