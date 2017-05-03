package mavenSpringMVC.common.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by odol on 2017-04-29.
 */

@Controller

public class MainController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(path = "/orderBeverage", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) throws IOException {
        int espresso = Integer.parseInt(request.getParameter("espresso"));
        int americano = Integer.parseInt(request.getParameter("americano"));
        int fruitjuice = Integer.parseInt(request.getParameter("fruitjuice"));
        int cafelatte = Integer.parseInt(request.getParameter("cafelatte"));
        ModelAndView mv = new ModelAndView("index");

        System.out.println("test");
        return mv;
    }


}


