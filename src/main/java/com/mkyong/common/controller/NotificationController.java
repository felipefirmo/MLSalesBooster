package com.mkyong.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mkyong.common.api.Meli;
import com.mkyong.common.api.MeliException;
import com.mkyong.common.entity.Notification;
import com.mkyong.common.entity.Sessao;
import com.ning.http.client.FluentStringsMap;
import com.ning.http.client.Response;

@Controller
@RequestMapping(value = "/notification")
public class NotificationController {

	@RequestMapping(method = RequestMethod.GET)
	protected ModelAndView prepare( HttpServletRequest arg0, HttpServletResponse arg1 ) throws Exception {

		ModelAndView model = new ModelAndView();

		model.addObject( "notification", new Notification() );

		return model;

	}

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void enviarResposta( @RequestBody
	Notification notification, HttpServletRequest req ) {

		Meli m = new Meli( 4919988880929211L, "4PSBcCrFmf2A1ePEEc1bfQDBnRnW6P8f" );

		FluentStringsMap params = new FluentStringsMap();
		params.add( "access_token", Sessao.access_token );
		try {
			Response response = m.get( notification.getResource(), params );
			response.getStatusCode();
		} catch ( MeliException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
