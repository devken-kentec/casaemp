package br.com.casadoempreendedor.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="usuarios")
@SuppressWarnings("serial")
public class Usuarios implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = true, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 100)
	private String nome;
	
	@Column(name="login", nullable = true, length = 50)
	private String login;
	
	@Column(name="cpf", nullable = true, length = 11)
	private String cpf;
	
	@Column(name="data_de_nascimento", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataDeNascimento;
	
	@Column(name="sexo", nullable = true, length = 10)
	private String sexo;
	
	@Column(name="estado_civil", nullable = true, length = 15)
	private String estadoCivil;
	
	@Column(name="cep", nullable = true, length = 8)
	private String cep;
	
	@Column(name="endereco", nullable = true, length = 100)
	private String endereco;
	
	@Column(name="numero", nullable = true, length = 5)
	private String numero;
	
	@Column(name="complemento", nullable = true, length = 100)
	private String complemento;
	
	@Column(name="bairro", nullable = true, length = 50)
	private String bairro;
	
	@Column(name="estado", nullable = true, length = 50)
	private String estado;
	
	@Column(name="municipio", nullable = true, length = 50)
	private String municipio;
	
	@Column(name="telefone", nullable = true, length = 20)
	private String telefone;
	
	@Column(name="telefone_2", nullable = true, length = 20)
	private String telefone2;
	
	@Column(name="whatsapp", nullable = true, length = 20)
	private String whatsapp;
	
	@Column(name="celular", nullable = true, length = 20)
	private String celular;
	
	@Column(name="email", nullable = true, length = 100)
	private String email;
	
	@Column(name="status_usuario", nullable = true, length = 15)
	private String statusUsuario;
	
	@Column(name="web_site", nullable = true, length = 50)
	private String webSite;
	
	@Column(name="rede_social", nullable = true, length = 50)
	private String redeSocial;
	
	@Column(name="rede_social_2", nullable = true, length = 50)
	private String redeSocial2;
	
	@Column(name="rede_social_3", nullable = true, length = 50)
	private String redeSocial3;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresas empresa = new Empresas();
	
	public Usuarios() {
		
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

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
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

	public Empresas getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresas empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nome=" + nome + ", login=" + login + ", cpf=" + cpf + ", dataDeNascimento="
				+ dataDeNascimento + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", cep=" + cep + ", endereco="
				+ endereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", estado="
				+ estado + ", municipio=" + municipio + ", telefone=" + telefone + ", telefone2=" + telefone2
				+ ", whatsapp=" + whatsapp + ", celular=" + celular + ", email=" + email + ", statusUsuario="
				+ statusUsuario + ", empresa=" + empresa + "]";
	}
}
