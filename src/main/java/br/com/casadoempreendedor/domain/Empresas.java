package br.com.casadoempreendedor.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="empresas")
@SuppressWarnings("serial")
public class Empresas implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome_fantasia", nullable = true, length = 100)
	private String nomeFantasia;
	
	@Column(name="razao_social", nullable = true, length = 100)
	private String razaoSocial;
	
	@Column(name="data_constituicao", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataConstituicao;
	
	@Column(name="cnpj", nullable = true, length = 14)
	private String cnpj;
	
	@Column(name="inscricao_estadual", nullable = true, length = 20)
	private String inscricaoEstadual;
	
	@Column(name="inscricao_municipal", nullable = true, length = 20)
	private String inscricaoMunicipal;
	
	@Column(name="regime_tributario", nullable = true, length = 35)
	private String regimeTributario;
	
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
	
	@Column(name="ramo_atividade", nullable = true, length = 50)
	private String ramoDeAtividade;
	
	@Column(name="telefone", nullable = true, length = 20)
	private String telefone;
	
	@Column(name="telefone_2", nullable = true, length = 20)
	private String telefone2;
	
	@Column(name="whatsapp", nullable = true, length = 20)
	private String whatsapp;
	
	@Column(name="celular", nullable = true, length = 20)
	private String celular;

	@Column(name="email", nullable = true, length = 50)
	private String email;
	
	@Column(name="web_site", nullable = true, length = 100)
	private String webSite;
	
	@Column(name="rede_social", nullable = true, length = 50)
	private String redeSocial;
	
	@Column(name="rede_social_2", nullable = true, length = 50)
	private String redeSocial2;
	
	@Column(name="rede_social_3", nullable = true, length = 50)
	private String redeSocial3;
	
	@Column(name="data_cadastro", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataCadastro;
	
	@Column(name="status_empresa", nullable = true, length = 15)
	private String statusEmpresa;
	
	@Column(name="descricao", nullable = true, length = 500)
	private String descricao;
	
	@Column
	@Lob
	public byte[] logo;
	
	public Empresas() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public LocalDate getDataConstituicao() {
		return dataConstituicao;
	}

	public void setDataConstituicao(LocalDate dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getRegimeTributario() {
		return regimeTributario;
	}

	public void setRegimeTributario(String regimeTributario) {
		this.regimeTributario = regimeTributario;
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

	public String getRamoDeAtividade() {
		return ramoDeAtividade;
	}

	public void setRamoDeAtividade(String ramoDeAtividade) {
		this.ramoDeAtividade = ramoDeAtividade;
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

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getRedeSocial() {
		return redeSocial;
	}

	public void setRedeSocial(String redeSocial) {
		this.redeSocial = redeSocial;
	}

	public String getRedeSocial2() {
		return redeSocial2;
	}

	public void setRedeSocial2(String redeSocial2) {
		this.redeSocial2 = redeSocial2;
	}

	public String getRedeSocial3() {
		return redeSocial3;
	}

	public void setRedeSocial3(String redeSocial3) {
		this.redeSocial3 = redeSocial3;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getStatusEmpresa() {
		return statusEmpresa;
	}

	public void setStatusEmpresa(String statusEmpresa) {
		this.statusEmpresa = statusEmpresa;
	}
	
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Empresas [id=" + id + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial
				+ ", dataConstituicao=" + dataConstituicao + ", cnpj=" + cnpj + ", inscricaoEstadual="
				+ inscricaoEstadual + ", inscricaoMunicipal=" + inscricaoMunicipal + ", regimeTributario="
				+ regimeTributario + ", cep=" + cep + ", endereco=" + endereco + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + ", estado=" + estado + ", municipio=" + municipio
				+ ", ramoDeAtividade=" + ramoDeAtividade + ", telefone=" + telefone + ", telefone2=" + telefone2
				+ ", whatsapp=" + whatsapp + ", celular=" + celular + ", email=" + email + ", webSite=" + webSite
				+ ", redeSocial=" + redeSocial + ", redeSocial2=" + redeSocial2 + ", redeSocial3=" + redeSocial3
				+ ", dataCadastro=" + dataCadastro + ", statusEmpresa=" + statusEmpresa + ", descricao=" + descricao
				+ ", logo=" + Arrays.toString(logo) + "]";
	}

}
