package br.com.casadoempreendedor.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.casadoempreendedor.domain.FichaFinanceira;

public class FichaFinanceiraDTO {
	
	private Long id;
	private Long empresaId;
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataGeracao;
	private Integer dia;
	private BigDecimal valorMensal;
	private String statusFichaFinanceira;
	
	public FichaFinanceiraDTO() {
		
	}
	
	public FichaFinanceiraDTO(FichaFinanceira fichaFinanceira) {
		this.id = fichaFinanceira.getId();
		this.empresaId = fichaFinanceira.getEmpresa().getId(); 
		this.nomeFantasia = fichaFinanceira.getEmpresa().getNomeFantasia();
		this.razaoSocial = fichaFinanceira.getEmpresa().getRazaoSocial();
		this.cnpj = fichaFinanceira.getEmpresa().getCnpj();
		this.dataGeracao = fichaFinanceira.getDataGeracao();
		this.dia = fichaFinanceira.getDia();
		this.valorMensal = fichaFinanceira.getValor();
		this.statusFichaFinanceira = fichaFinanceira.getStatusFichaFinanceira();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate getDataGeracao() {
		return dataGeracao;
	}

	public void setDataGeracao(LocalDate dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public BigDecimal getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(BigDecimal valorMensal) {
		this.valorMensal = valorMensal;
	}

	public String getStatusFichaFinanceira() {
		return statusFichaFinanceira;
	}

	public void setStatusFichaFinanceira(String statusFichaFinanceira) {
		this.statusFichaFinanceira = statusFichaFinanceira;
	}

	@Override
	public String toString() {
		return "FichaFinanceiraDTO [id=" + id + ", empresaId=" + empresaId + ", nomeFantasia=" + nomeFantasia
				+ ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataGeracao=" + dataGeracao + ", dia=" + dia
				+ ", valorMensal=" + valorMensal + ", statusFichaFinanceira=" + statusFichaFinanceira + "]";
	}
	
}
