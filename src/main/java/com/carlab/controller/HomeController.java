package com.carlab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jack Kim on 2017-03-01.
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger("HomeController");

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap model) {

//        logger.debug("logback example - debug level");
//        logger.info("logback example - info level");
//        logger.warn("logback example - warn level");
//        logger.error("logback example - error level");

        return "home.jsp";
    }
}
