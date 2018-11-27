package com.projprova2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.projprova2.model.Venda;
import com.projprova2.service.VendaService;

@Controller
public class VendaController {

	@Autowired
	private VendaService service;
	@Autowired
	private VendaService serviceVenda;

	@GetMapping("/venda/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/venda");
		mv.addObject("venda", service.findAll());

		return mv;
	}

	@GetMapping("/venda/add")
	public ModelAndView add(Venda venda) {

		ModelAndView mv = new ModelAndView("/vendaAdd");
		mv.addObject("venda", venda);
		mv.addObject("venda", serviceVenda.findAll());

		return mv;
	}

	@GetMapping("/venda/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

	@GetMapping("/venda/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/venda/save")
	public ModelAndView save(@Valid Venda venda, BindingResult result) {

		if (result.hasErrors()) {
			return add(venda);
		}

		service.save(venda);

		return findAll();
	}
}

