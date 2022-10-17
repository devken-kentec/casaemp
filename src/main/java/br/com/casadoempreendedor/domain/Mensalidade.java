package br.com.casadoempreendedor.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="mensalidade")
@SuppressWarnings("serial")
public class Mensalidade implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="data_pagamento", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataPagamento;
	
	@Column(name="valor", nullable = true, precision = 10, scale = 2)
	private BigDecimal valor;
	
	@Column(name="juro", nullable = true, precision = 10, scale = 2)
	private BigDecimal juro;
	
	@Column(name="desconto", nullable = true, precision = 10, scale = 2)
	private BigDecimal desconto;
	
	@Column(name="valor_total", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorTotal;
	
	@Column(name="tipo_pagamento", nullable = true, length = 15)
	private String tipoPagamento;
	
	@Column(name="status_mensalidade", nullable = true, length = 15)
	private String statusMensalidade;
	
	@Column(name="observacao", nullable = true, length = 64)
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "id_ficha_financeira", nullable = false)
	private FichaFinanceira fichaFinanceira = new FichaFinanceira(); 
	
	public Mensalidade() {
		
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

	public FichaFinanceira getFichaFinanceira() {
		return fichaFinanceira;
	}

	public void setFichaFinanceira(FichaFinanceira fichaFinanceira) {
		this.fichaFinanceira = fichaFinanceira;
	}

	@Override
	public String toString() {
		return "Mensalidade [id=" + id + ", dataPagamento=" + dataPagamento + ", valor=" + valor + ", juro=" + juro
				+ ", desconto=" + desconto + ", valorTotal=" + valorTotal + ", tipoPagamento=" + tipoPagamento
				+ ", statusMensalidade=" + statusMensalidade + ", observacao=" + observacao + ", fichaFinanceira="
				+ fichaFinanceira + ", getId()=" + getId() + ", getDataPagamento()=" + getDataPagamento()
				+ ", getValor()=" + getValor() + ", getJuro()=" + getJuro() + ", getDesconto()=" + getDesconto()
				+ ", getValorTotal()=" + getValorTotal() + ", getTipoPagamento()=" + getTipoPagamento()
				+ ", getStatusMensalidade()=" + getStatusMensalidade() + ", getObservacao()=" + getObservacao()
				+ ", getFichaFinanceira()=" + getFichaFinanceira() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
