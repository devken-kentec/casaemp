package br.com.casadoempreendedor.dto;

import br.com.casadoempreendedor.domain.Empresas;

public class EmpresasDTO {
	
	private Long empresaId;
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	
	public EmpresasDTO() {
		
	}
	
	public EmpresasDTO(Empresas empresa) {
		this.empresaId = empresa.getId();
		this.nomeFantasia = empresa.getNomeFantasia();
		this.razaoSocial = empresa.getRazaoSocial();
		this.cnpj = empresa.getCnpj();
	}
	
	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "EmpresasDTO [empresaId=" + empresaId + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial
				+ ", cnpj=" + cnpj + "]";
	}

}
