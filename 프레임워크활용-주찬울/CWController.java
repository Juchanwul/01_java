package com.spring99.exam;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CWController {

    private static final Logger logger = LoggerFactory.getLogger(CWController.class);

    @RequestMapping(value = "/jstl/jstl11", method = RequestMethod.GET)
    public String jstl11(Model model, @RequestParam(defaultValue = "-1") Integer val) {

        logger.info("/jstl/jstl11");

        model.addAttribute("val", val);

        return "jstl11";
    }

    @RequestMapping(value = "/jstl/jstlforeach", method = RequestMethod.GET)
    public String jstlforeach(Model model) {
        logger.info("jstlforeach");

        String[] foods = { "순두부", "된장찌개", "제육덮밥" };
        model.addAttribute("foods", foods);

        return "jstlforeach";
    }

}
