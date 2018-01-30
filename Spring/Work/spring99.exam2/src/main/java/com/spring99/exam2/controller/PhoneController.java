package com.spring99.exam2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring99.exam2.inf.IServicePhone;
import com.spring99.exam2.model.ModelPhone;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PhoneController {

    private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);

    @Autowired
    IServicePhone svr;

    @RequestMapping(value = "/phone/writeone", method = RequestMethod.GET)
    public String writeone(Model model) {
        logger.info("/phone/writeone");

        return "phone/writeone";
    }

    @RequestMapping(value = "/phone/writeoneresult", method = RequestMethod.POST)
    public String writeoneresult(Model model, HttpServletRequest request) {
        logger.info("/phone/writeoneresult");

        String phname = request.getParameter("phname");
        String phfactory = request.getParameter("phfactory");
        Integer phprice = Integer.valueOf(request.getParameter("phprice"));

        ModelPhone phone = new ModelPhone(phname, phfactory, phprice);

        int insert = svr.insertPhone(phone);

        List<ModelPhone> list = svr.getPhoneList();

        model.addAttribute("phone", list);

        return "phone/writeoneresult";
    }

    @RequestMapping(value = "/phone/writeonelist", method = RequestMethod.GET)
    public String writeonelist(Model model) {
        logger.info("/phone/writeonelist");

        List<ModelPhone> list = svr.getPhoneList();

        model.addAttribute("phone", list);

        return "phone/writeoneresult";
    }

}
