package br.com.casadoempreendedor.dto;

import java.util.Arrays;

import br.com.casadoempreendedor.domain.Shopping;

public class ShoppingDTO {
	
	private Long id;
	private String vinculo;
	private Integer posicao;
	private Long empresaId;
	private String empresa;
	private String ramoAtividade;
	private byte[] logo;
	
	public ShoppingDTO() {
		
	}
	
	public ShoppingDTO(Shopping shopping) {
		this.id = shopping.getId();
		this.empresaId = shopping.getEmpresas().getId();
		this.empresa = shopping.getEmpresas().getNomeFantasia();
		this.posicao = shopping.getPosicao();
		this.vinculo = shopping.getVinculo();
		this.ramoAtividade = shopping.getEmpresas().getRamoDeAtividade();
		this.logo = shopping.getEmpresas().getLogo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVinculo() {
		return vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
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

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "ShoppingDTO [id=" + id + ", vinculo=" + vinculo + ", posicao=" + posicao + ", empresaId=" + empresaId
				+ ", empresa=" + empresa + ", ramoAtividade=" + ramoAtividade + ", logo=" + Arrays.toString(logo) + "]";
	}	
}
