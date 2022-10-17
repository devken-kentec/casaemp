package br.com.casadoempreendedor.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="acesso")
@SuppressWarnings("serial")
public class Acesso implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="role", nullable = false, length = 50)
	private String role;
	
	@Column(name="senha", nullable = false, length = 10)
	private String senha;
	
	@Column(name="status_acesso", nullable = false, length = 15)
	private String statusAcesso;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuarios usuario = new Usuarios();
	
	public Acesso() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatusAcesso() {
		return statusAcesso;
	}

	public void setStatusAcesso(String statusAcesso) {
		this.statusAcesso = statusAcesso;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Acesso [id=" + id + ", role=" + role + ", senha=" + senha + ", statusAcesso=" + statusAcesso
				+ ", usuario=" + usuario + "]";
	}
	
}
