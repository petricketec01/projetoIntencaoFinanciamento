package br.sp.gov.sebrae.IntencaoFinanciamentoApplication.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.dto.Cliente;
import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.service.impl.ClienteServiceImpl;

@Controller
public class ClienteController {

	@Autowired
	ClienteServiceImpl service;
	
	@GetMapping("novo-cliente")
	public ModelAndView homeCliente() {
		ModelAndView view = new ModelAndView("cliente");
		view.addObject(new Cliente());
		return view;
	}
	
	@PostMapping("salvar-cliente")
	public String salvarCliente(@Valid Cliente cliente, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(cliente);
			return "cliente";
		}
		service.salvarCliente(cliente);
		return "redirect:/";
	}
	
	@GetMapping("/cliente/{id}")
	public ModelAndView editarCliente(@PathVariable Long id) {
		ModelAndView view = new ModelAndView("cliente");
		Cliente cliente = service.editarCliente(id);
		view.addObject("cliente",cliente);
		return view;
	}
}
