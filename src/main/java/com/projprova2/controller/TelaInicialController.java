package com.projprova2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TelaInicialController {

	@GetMapping("telaInicial/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/TelaInicial");

		return mv;
	}

}