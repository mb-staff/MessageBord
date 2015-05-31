package jp.co.mbch.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import jp.co.mbch.logic.ResponseLogic;
import jp.co.mbch.model.ResponseModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    ResponseLogic rl;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        ResponseModel rm = new ResponseModel();
        rm.setResponseNo(1);
        rm.setResponseComment("テストコメント。導通一号");
        System.out.println(rm);
        
        rl.add(rm);
        
        
        return "home";
    }

}
