package mavenSpringMVC.common.controller;

import mavenSpringMVC.common.model.BeverageOrder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    BeverageOrder order;

    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(path = "/orderBeverage", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) throws IOException {
        order.setEspresso(Integer.parseInt(request.getParameter("espresso")));
        order.setAmericano(Integer.parseInt(request.getParameter("americano")));
        order.setFruitJuice(Integer.parseInt(request.getParameter("fruitjuice")));
        order.setCafeLatte(Integer.parseInt(request.getParameter("cafelatte")));


        ModelAndView mv = new ModelAndView("index");
        mv.addObject("order", order);
        System.out.println(order.getEspresso());
        System.out.println(order.getAmericano());
        System.out.println(order.getFruitJuice());
        System.out.println(order.getCafeLatte());
        System.out.println("test");
        return mv;
    }


}


