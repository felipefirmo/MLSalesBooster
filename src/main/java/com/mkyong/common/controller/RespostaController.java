package com.mkyong.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mkyong.common.api.Meli;
import com.mkyong.common.api.MeliException;
import com.mkyong.common.entity.Resposta;
import com.ning.http.client.FluentStringsMap;
import com.ning.http.client.Response;

@Controller
@RequestMapping(value = "/resposta")
public class RespostaController {

	@RequestMapping(method = RequestMethod.GET)
	protected ModelAndView prepare( HttpServletRequest arg0, HttpServletResponse arg1 ) throws Exception {

		ModelAndView model = new ModelAndView();

		model.addObject( "resposta", new Resposta() );

		return model;

	}

	@RequestMapping(method = RequestMethod.POST)
	public void enviarResposta( @ModelAttribute("resposta")
	Resposta resposta, BindingResult result, Model model, HttpServletRequest request ) {

		Meli m = new Meli( 4919988880929211L, "4PSBcCrFmf2A1ePEEc1bfQDBnRnW6P8f" );

		resposta.setQuestionId( 2671304820L );

		FluentStringsMap params = new FluentStringsMap();
		params.add( "access_token", request.getSession().getAttribute( "access_token" ).toString() );
		try {
			Response response = m.post( "/answers", params, "{\"question_id\" : " + resposta.getQuestionId().toString() + ", \"text\" : \"" + resposta.getText()
					+ "\"}" );
		} catch ( MeliException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
