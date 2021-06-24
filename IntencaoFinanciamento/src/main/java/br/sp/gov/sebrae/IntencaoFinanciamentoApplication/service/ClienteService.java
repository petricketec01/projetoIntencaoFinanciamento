package br.sp.gov.sebrae.IntencaoFinanciamentoApplication.service;

import java.util.List;

import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.dto.Cliente;

public interface ClienteService {

	List<Cliente>listaClientes();
	Cliente salvarCliente(Cliente cliente);
	Cliente editarCliente(Long id);
}
