package br.com.casadoempreendedor.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shopping")
@SuppressWarnings("serial")
public class Shopping implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="vinculo", nullable = false, length = 20)
	private String vinculo;
	
	@Column(name="posicao", nullable = false, length = 10)
	private Integer posicao;
	
	@OneToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresas empresas = new Empresas();
	
	public Shopping() {
		
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

	public Empresas getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Empresas empresas) {
		this.empresas = empresas;
	}

	@Override
	public String toString() {
		return "Shopping [id=" + id + ", vinculo=" + vinculo + ", posicao=" + posicao + ", empresas=" + empresas + "]";
	}
	
	
}
