package mavenSpringMVC.common.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by odol on 2017-04-29.
 */

@Controller

public class MainController {



    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/orderBeverage")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        System.out.println("test");
        return mv;
    }


}


