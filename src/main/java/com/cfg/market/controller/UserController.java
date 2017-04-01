package com.cfg.market.controller;

import com.cfg.market.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import org.apache.log4j.Logger;
/**
 * Created by chengfangang on 17/4/1.
 */
@Controller
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);
    @RequestMapping("/create")
    public String Create(Model model) {
        if (logger.isDebugEnabled()) {
            logger.debug("Debug Mode enabled!");
        }
        logger.info("INFO mode enabled!");
        return "create";
    }

    @RequestMapping("/save")
    public String Save(@ModelAttribute("form")User user, Model model) {
        model.addAttribute("user", user);
        return "detail";
    }
}
