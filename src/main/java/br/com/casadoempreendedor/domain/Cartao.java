package br.com.casadoempreendedor.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="cartao")
@SuppressWarnings("serial")
public class Cartao implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = true, length = 11)
	private Long id;
	
	@Column(name="codigo", nullable = true, length = 20)
	private String codigo;
	
	@Column(name="validade", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate validade;
	
	@Column(name="status_cartao", nullable = true, length = 15)
	private String statusCartao;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuarios usuario = new Usuarios();
		
	public Cartao() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public String getStatusCartao() {
		return statusCartao;
	}

	public void setStatusCartao(String statusCartao) {
		this.statusCartao = statusCartao;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Cartao [id=" + id + ", codigo=" + codigo + ", validade=" + validade + ", statusCartao=" + statusCartao
				+ ", usuario=" + usuario + "]";
	}
	
}
