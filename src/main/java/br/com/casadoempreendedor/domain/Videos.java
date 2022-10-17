package br.com.casadoempreendedor.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="videos")
@SuppressWarnings("serial")
public class Videos implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = true, length = 11)
	private Long id;
	
	@Column(name="titulo", nullable = true, length = 50)
	private String titulo;
	
	@Column(name="descricao", nullable = true, length = 300)
	private String descricao;
	
	@Column(name="url", nullable = true, length = 200)
	private String url;
	
	@Column(name="status_video", nullable = true, length = 15)
	private String statusVideo;
	
	public Videos() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatusVideo() {
		return statusVideo;
	}

	public void setStatusVideo(String statusVideo) {
		this.statusVideo = statusVideo;
	}

	@Override
	public String toString() {
		return "Videos [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", url=" + url
				+ ", statusVideo=" + statusVideo + "]";
	}
}
