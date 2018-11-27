package com.projprova2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projprova2.model.Cliente;
import com.projprova2.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping("/cliente/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/cliente");
		mv.addObject("clientes", service.findAll());

		return mv;
	}

	@GetMapping("/cliente/add/")
	public ModelAndView add(Cliente cliente) {
		//if (cliente.login <= ) {
					ModelAndView mv = new ModelAndView("/clienteAdd");
					mv.addObject("cliente", cliente);
			//}
		return mv;
	}

	@GetMapping("/cliente/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

	@GetMapping("/cliente/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/cliente/save")
	public ModelAndView save(@Valid Cliente cliente, BindingResult result) {

		if (result.hasErrors()) {
			return add(cliente);
		}

		service.save(cliente);

		return findAll();
	}
}
