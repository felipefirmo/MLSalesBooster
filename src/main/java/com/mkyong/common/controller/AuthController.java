package com.mkyong.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mkyong.common.api.Meli;
import com.mkyong.common.entity.Sessao;
import com.ning.http.client.FluentStringsMap;
import com.ning.http.client.Response;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {

	@RequestMapping(method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal( HttpServletRequest arg0, HttpServletResponse arg1 ) throws Exception {

		Meli m = new Meli( 4919988880929211L, "4PSBcCrFmf2A1ePEEc1bfQDBnRnW6P8f" );

		ModelAndView model = new ModelAndView();

		String code = arg0.getParameter( "code" );

		m.authorize( code, "http://localhost:8080/mlsb/auth.htm" );
		FluentStringsMap params = new FluentStringsMap();
		
		Sessao.access_token = m.getAccessToken();

		arg0.getSession().setAttribute( "access_token", m.getAccessToken() );
		arg1.sendRedirect( "http://localhost:8080/mlsb/resposta.htm" );

		return model;

	}

}
