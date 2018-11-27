package com.projprova2.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projprova2.model.Fornecedor;
import com.projprova2.service.FornecedorService;

@Controller
public class FornecedorController {

	@Autowired
	private FornecedorService service;

	@GetMapping("/fornecedor/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/fornecedor");
		mv.addObject("fornecedores", service.findAll());

		return mv;
	}

	@GetMapping("/fornecedor/add/")
	public ModelAndView add(Fornecedor fornecedor) {
		//if (cliente.login <= ) {
					ModelAndView mv = new ModelAndView("/fornecedorAdd");
					mv.addObject("fornecedor", fornecedor);
			//}
		return mv;
	}

	@GetMapping("/fornecedor/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

	@GetMapping("/fornecedor/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/fornecedor/save")
	public ModelAndView save(@Valid Fornecedor fornecedor, BindingResult result) {

		if (result.hasErrors()) {
			return add(fornecedor);
		}

		service.save(fornecedor);

		return findAll();
	}
}