package br.com.casadoempreendedor.dto;

import java.math.BigDecimal;

import br.com.casadoempreendedor.domain.Descontos;


public class DescontosDTO {
	
	private Long id;
	private BigDecimal desconto;
	private Long milhas;
	private Long empresaId;
	private String empresa;
	
	public DescontosDTO() {
		
	}
	
	public DescontosDTO(Descontos desconto) {
		this.id = desconto.getId();
		this.empresa = desconto.getEmpresas().getNomeFantasia();
		this.desconto = desconto.getDesconto();
		this.milhas = desconto.getMilhas();
		this.empresaId = desconto.getEmpresas().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public Long getMilhas() {
		return milhas;
	}

	public void setMilhas(Long milhas) {
		this.milhas = milhas;
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
		return "DescontosDTO [id=" + id + ", desconto=" + desconto + ", milhas=" + milhas + ", empresaId=" + empresaId
				+ ", empresa=" + empresa + "]";
	}
}	
