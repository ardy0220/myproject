package com.ttg.pay.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("jsp")
public class HelloController {

	private static Log log = LogFactory.getLog(HelloController.class);

	@RequestMapping("hello")
	public String hello(HttpServletRequest request,
			HttpServletResponse response,Model model) {
		// TODO Auto-generated method stub
		log.debug(">>>>>>>>>>>>hello ");
		model.addAttribute("message", "hello world");
		return "hello";
	}
}
