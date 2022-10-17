package br.com.casadoempreendedor.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.casadoempreendedor.domain.Mensalidade;

public class MensalidadeDTO {
	
	private Long id;
	private LocalDate dataPagamento;
	private BigDecimal valor;
	private BigDecimal juro;
	private BigDecimal desconto;
	private BigDecimal valorTotal;
	private String tipoPagamento;
	private String statusMensalidade;
	private String observacao;
	private Long fichaFinanceira;
	private Integer dia;
	private BigDecimal valorMensal;
	private String nomeFantasia;
	private String cnpj;
	private String razaoSocial;
	private String statusFichaFinanceira;
	
	public MensalidadeDTO() {
		
	}
	
	public MensalidadeDTO(Mensalidade m) {
		this.id = m.getId();
		this.dataPagamento = m.getDataPagamento();
		this.valor = m.getValor();
		this.juro = m.getJuro();
		this.desconto = m.getDesconto();
		this.valorTotal = m.getValorTotal();
		this.tipoPagamento = m.getTipoPagamento();
		this.statusMensalidade = m.getStatusMensalidade();
		this.observacao = m.getObservacao();
		this.fichaFinanceira = m.getFichaFinanceira().getId();
		this.dia = m.getFichaFinanceira().getDia();
		this.valorMensal = m.getFichaFinanceira().getValor();
		this.nomeFantasia = m.getFichaFinanceira().getEmpresa().getNomeFantasia();
		this.cnpj = m.getFichaFinanceira().getEmpresa().getCnpj();
		this.razaoSocial = m.getFichaFinanceira().getEmpresa().getRazaoSocial();
		this.statusFichaFinanceira = m.getFichaFinanceira().getStatusFichaFinanceira();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getJuro() {
		return juro;
	}

	public void setJuro(BigDecimal juro) {
		this.juro = juro;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getStatusMensalidade() {
		return statusMensalidade;
	}

	public void setStatusMensalidade(String statusMensalidade) {
		this.statusMensalidade = statusMensalidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Long getFichaFinanceira() {
		return fichaFinanceira;
	}

	public void setFichaFinanceira(Long fichaFinanceira) {
		this.fichaFinanceira = fichaFinanceira;
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

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getStatusFichaFinanceira() {
		return statusFichaFinanceira;
	}

	public void setStatusFichaFinanceira(String statusFichaFinanceira) {
		this.statusFichaFinanceira = statusFichaFinanceira;
	}

	@Override
	public String toString() {
		return "MensalidadeDTO [id=" + id + ", dataPagamento=" + dataPagamento + ", valor=" + valor + ", juro=" + juro
				+ ", desconto=" + desconto + ", valorTotal=" + valorTotal + ", tipoPagamento=" + tipoPagamento
				+ ", statusMensalidade=" + statusMensalidade + ", observacao=" + observacao + ", fichaFinanceira="
				+ fichaFinanceira + ", dia=" + dia + ", valorMensal=" + valorMensal + ", nomeFantasia=" + nomeFantasia
				+ ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", statusFichaFinanceira=" + statusFichaFinanceira
				+ "]";
	}
	
}