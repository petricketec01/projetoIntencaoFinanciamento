package br.sp.gov.sebrae.IntencaoFinanciamentoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.dto.Cliente;
import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.service.impl.ClienteServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	private ClienteServiceImpl service;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home");
		List<Cliente> clientes = service.listaClientes();
		view.addObject("clientes", clientes);
		return view;
	}
}
