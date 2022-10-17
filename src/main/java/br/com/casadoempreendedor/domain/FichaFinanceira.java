package br.com.casadoempreendedor.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="ficha_financeira")
@SuppressWarnings("serial")
public class FichaFinanceira implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="data_geracao", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataGeracao;
	
	@Column(name="dia", nullable = true, length = 2)
	private Integer dia;
	
	@Column(name="valor", nullable = true, precision = 10, scale = 2)
	private BigDecimal valor;
	
	@Column(name="status_ficha_financeira", nullable = true, length = 15)
	private String statusFichaFinanceira;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresas empresa = new Empresas();
	
	public FichaFinanceira() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getStatusFichaFinanceira() {
		return statusFichaFinanceira;
	}

	public void setStatusFichaFinanceira(String statusFichaFinanceira) {
		this.statusFichaFinanceira = statusFichaFinanceira;
	}

	public Empresas getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresas empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "FichaFinanceira [id=" + id + ", dataGeracao=" + dataGeracao + ", dia=" + dia + ", valor=" + valor
				+ ", statusFichaFinanceira=" + statusFichaFinanceira + ", empresa=" + empresa + "]";
	}
}
