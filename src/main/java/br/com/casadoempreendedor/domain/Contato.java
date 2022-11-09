package br.com.casadoempreendedor.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contato")
@SuppressWarnings("serial")
public class Contato implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 20)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 60)
	private String nome;
	
	@Column(name="telefone", nullable = true, length = 12)
	private String telefone;
	
	@Column(name="email", nullable = true, length = 120)
	private String email;
	
	@Column(name="mensagem", nullable = true, length = 500)
	private String mensagem;
	
	@Column(name="respondido", nullable = true)
	private Boolean respondido;
	
	public Contato() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Boolean getRespondido() {
		return respondido;
	}

	public void setRespondido(Boolean respondido) {
		this.respondido = respondido;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", mensagem="
				+ mensagem + ", respondido=" + respondido + "]";
	}
}
