package com.mkyong.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mkyong.common.api.Meli;

@Controller
@RequestMapping(value = "/login")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello world");
		
		Meli m = new Meli(4919988880929211L, "4PSBcCrFmf2A1ePEEc1bfQDBnRnW6P8f");
		String redirectUrl = m.getAuthUrl("http://localhost:8080/mlsb/auth.htm");
		
		response.sendRedirect( redirectUrl );
		
		return model;
	}

}