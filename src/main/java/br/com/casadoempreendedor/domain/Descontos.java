package br.com.casadoempreendedor.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="desconto")
@SuppressWarnings("serial")
public class Descontos implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="desconto", nullable = true, precision = 10, scale = 2)
	private BigDecimal desconto;
	
	@Column(name="milhas", nullable = true, length = 20)
	private Long milhas;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresas empresas = new Empresas();
	
	public Descontos() {
		
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

	public Empresas getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Empresas empresas) {
		this.empresas = empresas;
	}

	@Override
	public String toString() {
		return "Descontos [id=" + id + ", desconto=" + desconto + ", milhas=" + milhas + ", empresas=" + empresas + "]";
	}
}
