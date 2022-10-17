package br.com.casadoempreendedor.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="operacao")
@SuppressWarnings("serial")
public class Operacao implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = true, length = 11)
	private Long id;
	
	@Column(name="codigo", nullable = true, length = 20)
	private String codigoCartao;
	
	@Column(name="desconto", nullable = true, precision = 10, scale = 2)
	private BigDecimal desconto;
	
	@Column(name="milhas", nullable = true, length = 20)
	private Long milhas;
	
	@Column(name="valor", nullable = true, precision = 10, scale = 2)
	private BigDecimal valor;
	
	@Column(name="valor_desconto", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorComDesconto;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuarios usuario = new Usuarios();
	
	public Operacao() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoCartao() {
		return codigoCartao;
	}

	public void setCodigoCartao(String codigoCartao) {
		this.codigoCartao = codigoCartao;
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(BigDecimal valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Operacao [id=" + id + ", codigoCartao=" + codigoCartao + ", desconto=" + desconto + ", milhas=" + milhas
				+ ", valor=" + valor + ", valorComDesconto=" + valorComDesconto + ", usuario=" + usuario + "]";
	}
	
}
