package br.com.casadoempreendedor.dto;

import java.time.LocalDate;

import br.com.casadoempreendedor.domain.Usuarios;

public class UsuariosDTO {
	
	private Long id;
	private String nome;
	private String login;
	private String cpf;
	private LocalDate dataDeNascimento;
	private String sexo;
	private String estadoCivil;
	private String cep;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String estado;
	private String municipio;
	private String telefone;
	private String telefone2;
	private String whatsapp;
	private String celular;
	private String email;
	private String statusUsuario;
	private Long empresaId; 
	private String empresa;
	
	public UsuariosDTO() {
		
	}
	
	public UsuariosDTO(Usuarios usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.login = usuario.getLogin();
		this.cpf = usuario.getCpf();
		this.dataDeNascimento = usuario.getDataDeNascimento();
		this.sexo = usuario.getSexo();
		this.estadoCivil = usuario.getEstadoCivil();
		this.cep = usuario.getCep();
		this.endereco = usuario.getEndereco();
		this.numero = usuario.getNumero();
		this.complemento = usuario.getComplemento();
		this.bairro = usuario.getBairro();
		this.estado = usuario.getEstado();
		this.municipio = usuario.getMunicipio();
		this.telefone = usuario.getTelefone();
		this.telefone2 = usuario.getTelefone2();
		this.whatsapp = usuario.getWhatsapp();
		this.celular = usuario.getCelular();
		this.email = usuario.getEmail();
		this.statusUsuario = usuario.getStatusUsuario();
		this.empresaId = usuario.getEmpresa().getId(); 
		this.empresa = usuario.getEmpresa().getNomeFantasia();
	}

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(String statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "UsuariosDTO [id=" + id + ", nome=" + nome + ", login=" + login + ", cpf=" + cpf + ", dataDeNascimento="
				+ dataDeNascimento + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", cep=" + cep + ", endereco="
				+ endereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", estado="
				+ estado + ", municipio=" + municipio + ", telefone=" + telefone + ", telefone2=" + telefone2
				+ ", whatsapp=" + whatsapp + ", celular=" + celular + ", email=" + email + ", statusUsuario="
				+ statusUsuario + ", empresaId=" + empresaId + ", empresa=" + empresa + "]";
	}
	
	
}
