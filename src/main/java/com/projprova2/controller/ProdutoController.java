package com.projprova2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projprova2.model.Produto;
import com.projprova2.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService service;

	@GetMapping("/produto/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/produto");
		mv.addObject("produtos", service.findAll());

		return mv;
	}
	
	@GetMapping("/produto/{codigo}")
	public ModelAndView findByEstoque(@PathVariable("codigo") int codigo) {

		ModelAndView mv = new ModelAndView("/produto");
		mv.addObject("produtos", service.findByEstoque(codigo));

		return mv;
	}

	@GetMapping("/produto/add/")
	public ModelAndView add(Produto produto) {
		ModelAndView mv = new ModelAndView("/produtoAdd");
		mv.addObject("produto", produto);
		return mv;
	}

	@GetMapping("/produto/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {
		return add(service.findOne(id));
	}

	@GetMapping("/produto/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/produto/save")
	public ModelAndView save(@Valid Produto produto, BindingResult result) {

		if (result.hasErrors()) {
			return add(produto);
		}

		service.save(produto);

		return findAll();
	}
}