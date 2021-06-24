package br.sp.gov.sebrae.IntencaoFinanciamentoApplication.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.dto.Cliente;
import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.entity.ClienteEntity;
import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.repository.ClienteRepository;
import br.sp.gov.sebrae.IntencaoFinanciamentoApplication.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listaClientes() {
		List<ClienteEntity> lista = repository.findAll();
		List<Cliente> cliente = fromTo(lista);
		return cliente;
	}
	
	@Override
	public Cliente salvarCliente(Cliente cliente) {
		ClienteEntity entity = fromTo(cliente);
		entity = repository.save(entity);
		Cliente clienteRetorno = fromTo(entity);
		return clienteRetorno;
	}
	
	@Override
	public Cliente editarCliente(Long id) {
		ClienteEntity entity = repository.findById(id).get();		
		return fromTo(entity);
	}

	private List<Cliente> fromTo(List<ClienteEntity> lista) {
		List<Cliente> listaDto = new ArrayList<>();
		for (ClienteEntity clienteEntity : lista) {
			Cliente dto = new Cliente();
			dto.setId(clienteEntity.getId());
			dto.setNome(clienteEntity.getNome());
			dto.setEndereco(clienteEntity.getEndereco());
			dto.setEnderecoN(clienteEntity.getEnderecoN());
			dto.setCidade(clienteEntity.getCidade());
			dto.setEstado(clienteEntity.getEstado());
			dto.setCep(clienteEntity.getEstado());
			dto.setCpf(clienteEntity.getCpf());
			dto.setRg(clienteEntity.getRg());
			dto.setDataNascimento(clienteEntity.getDataNascimento());
			dto.setEmail(clienteEntity.getEmail());
			dto.setTelefone(clienteEntity.getTelefone());
			dto.setCelular(clienteEntity.getCelular());
			dto.setTipoFinanciamento(clienteEntity.getTipoFinanciamento());
			dto.setQuantidadeParcelamento(clienteEntity.getQuantidadeParcelamento());
			dto.setValorIntencao(clienteEntity.getValorIntencao());
			dto.setSalario(clienteEntity.getSalario());
			listaDto.add(dto);
		}
		return listaDto;
	}
	
	private ClienteEntity fromTo(Cliente cliente) {
		ClienteEntity entity = new ClienteEntity();
		entity.setId(cliente.getId());
		entity.setNome(cliente.getNome());
		entity.setEndereco(cliente.getEndereco());
		entity.setEnderecoN(cliente.getEnderecoN());
		entity.setCidade(cliente.getCidade());
		entity.setEstado(cliente.getEstado());
		entity.setCep(cliente.getCep());
		entity.setCpf(cliente.getCpf());
		entity.setRg(cliente.getRg());
		entity.setDataNascimento(cliente.getDataNascimento());
		entity.setEmail(cliente.getEmail());
		entity.setTelefone(cliente.getTelefone());
		entity.setCelular(cliente.getCelular());
		entity.setTipoFinanciamento(cliente.getTipoFinanciamento());
		entity.setQuantidadeParcelamento(cliente.getQuantidadeParcelamento());
		entity.setValorIntencao(cliente.getValorIntencao());
		entity.setSalario(cliente.getSalario());
		
		return entity;
	}

	private Cliente fromTo(ClienteEntity entity) {
		Cliente cliente = new Cliente();
		cliente.setId(entity.getId());
		cliente.setNome(entity.getNome());
		cliente.setEndereco(entity.getEndereco());
		cliente.setEnderecoN(entity.getEnderecoN());
		cliente.setCidade(entity.getCidade());
		cliente.setEstado(entity.getEstado());
		cliente.setCep(entity.getCep());
		cliente.setCpf(entity.getCpf());
		cliente.setRg(entity.getRg());
		cliente.setDataNascimento(entity.getDataNascimento());
		cliente.setEmail(entity.getEmail());
		cliente.setTelefone(entity.getTelefone());
		cliente.setCelular(entity.getCelular());
		cliente.setTipoFinanciamento(entity.getTipoFinanciamento());
		cliente.setQuantidadeParcelamento(entity.getQuantidadeParcelamento());
		cliente.setValorIntencao(entity.getValorIntencao());
		cliente.setSalario(entity.getSalario());
		
		
		return cliente;
	}
}
