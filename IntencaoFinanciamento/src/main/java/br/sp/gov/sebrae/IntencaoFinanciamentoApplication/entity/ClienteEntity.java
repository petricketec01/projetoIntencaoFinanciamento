package br.sp.gov.sebrae.IntencaoFinanciamentoApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "tb_cliente")
public class ClienteEntity {

	@Id
	@Column(name = "ID_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEG_CLIENTE")
	@SequenceGenerator(name = "SEG_CLIENTE", sequenceName = "SEG_CLIENTE")
	private Long id;
	private String nome;
	private String endereco;
	private String enderecoN;
	private String cidade;
	private String estado;
	private String cep;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String email;
	private String telefone;
	private String celular;
	private String tipoFinanciamento;
	private String quantidadeParcelamento;
	private String valorIntencao;
	private String salario;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEnderecoN() {
		return enderecoN;
	}
	public void setEnderecoN(String enderecoN) {
		this.enderecoN = enderecoN;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTipoFinanciamento() {
		return tipoFinanciamento;
	}
	public void setTipoFinanciamento(String tipoFinanciamento) {
		this.tipoFinanciamento = tipoFinanciamento;
	}
	public String getQuantidadeParcelamento() {
		return quantidadeParcelamento;
	}
	public void setQuantidadeParcelamento(String quantidadeParcelamento) {
		this.quantidadeParcelamento = quantidadeParcelamento;
	}
	public String getValorIntencao() {
		return valorIntencao;
	}
	public void setValorIntencao(String valorIntencao) {
		this.valorIntencao = valorIntencao;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
