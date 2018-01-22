package com.spring66.test.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring66.test.inf.*;
import com.spring66.test.model.*;


@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	IServicePhone svr;

    @RequestMapping(value = "/test/writeone", method = RequestMethod.GET)
    public String writeone(Locale locale, Model model) {
        logger.info("writeone", locale);

        return "test/writeone";
    }
    
/*    @RequestMapping(value = "/test/writeone1", method = RequestMethod.POST)
    public String writeone1(Locale locale, Model model, HttpServletRequest request) {
        logger.info("writeone1", locale);

        String name = request.getParameter("name");
        String manufacturer = request.getParameter("manufacturer");
        Integer price = Integer.valueOf(request.getParameter("price"));

        ModelPhone phone = new ModelPhone(name, manufacturer, price);

        // DB insert
        int insert = svr.insertPhone(phone);

        // DB select
        List<ModelPhone> select = svr.getPhoneList();

        // jsp 파일로 select 결과 보내기
        model.addAttribute("list", select);

        return "phone/writeListResult";
    }
    
    @RequestMapping(value = "/test/writeone2", method = RequestMethod.POST)
    public String writeone2(Locale locale, Model model, @RequestParam(value = "name", defaultValue = "") String name,
            @RequestParam(value = "manufacturer", defaultValue = "") String manufacturer,
            @RequestParam(value = "price", defaultValue = "0") Integer price) {
        logger.info("writeone2", locale);

        ModelPhone phone = new ModelPhone(name, manufacturer, price);

        // DB insert
        int insert = svr.insertPhone(phone);

        // DB select
        List<ModelPhone> select = svr.getPhoneList();

        // jsp 파일로 select 결과 보내기
        model.addAttribute("list", select);

        return "test/writeListResult";
    }

    @RequestMapping(value = "/test/writeone3", method = RequestMethod.POST)
    public String writeone3(Locale locale, Model model, @ModelAttribute ModelPhone phone) {
        logger.info("writeone3", locale);

        // DB insert
        int insert = svr.insertPhone(phone);

        // DB select
        List<ModelPhone> select = svr.getPhoneList();

        // jsp 파일로 select 결과 보내기
        model.addAttribute("list", select);

        return "test/writeListResult";
    }*/
}
