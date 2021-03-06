package com.spring65.phone.controller;


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

import com.spring65.phone.model.*;
import com.spring65.phone.inf.*;


@Controller
public class PhoneController {

    private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);

    // 서비스 인스턴스 만들기
    // new == @Autowired
    @Autowired
    IServicePhone svr;

    @RequestMapping(value = "/phone/writeone", method = RequestMethod.GET)
    public String writeone(Locale locale, Model model) {
        logger.info("writeone", locale);

        return "phone/writeone";
    }

    @RequestMapping(value = "/phone/writelist", method = RequestMethod.GET)
    public String writelist(Locale locale, Model model) {
        logger.info("writelist", locale);

        return "phone/writelist";
    }

    @RequestMapping(value = "/phone/writeone1", method = RequestMethod.POST)
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

    @RequestMapping(value = "/phone/writeone2", method = RequestMethod.POST)
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

        return "phone/writeListResult";
    }

    @RequestMapping(value = "/phone/writeone3", method = RequestMethod.POST)
    public String writeone3(Locale locale, Model model, @ModelAttribute ModelPhone phone) {
        logger.info("writeone3", locale);

        // DB insert
        int insert = svr.insertPhone(phone);

        // DB select
        List<ModelPhone> select = svr.getPhoneList();

        // jsp 파일로 select 결과 보내기
        model.addAttribute("list", select);

        return "phone/writeListResult";
    }

    @RequestMapping(value = "/phone/writelist", method = RequestMethod.POST)
    public String writeListResult(Model model, @ModelAttribute RepositoryPhone phones) {
        logger.info("writeListResult");
        List<ModelPhone> list = phones.getPhoneItems();
        // DB insert
        int r = svr.insertPhoneList(list);

        model.addAttribute("list" , list);

        return "phone/writeListResult";
    }
}
