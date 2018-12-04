package com.projprova2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projprova2.model.Estoque;
import com.projprova2.service.EstoqueService;

@Controller
public class EstoqueController {

	@Autowired
	private EstoqueService service;

	@GetMapping("/estoque/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/estoque");
		mv.addObject("estoques", service.findAll());

		return mv;
	}

	@GetMapping("/estoque/add/")
	public ModelAndView add(Estoque estoque) {
		ModelAndView mv = new ModelAndView("/estoqueAdd");
		mv.addObject("estoque", estoque);
		return mv;
	}

	@GetMapping("/estoque/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

	@GetMapping("/estoque/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/estoque/save")
	public ModelAndView save(@Valid Estoque estoque, BindingResult result) {

		if (result.hasErrors()) {
			return add(estoque);
		}

		service.save(estoque);

		return findAll();
	}

	@GetMapping("/estoque/editProd/{id}")
	public ModelAndView editProd(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

}