package br.com.casadoempreendedor.dto;

import java.time.LocalDate;

import br.com.casadoempreendedor.domain.Cartao;

public class CartoesDTO {
	
	private Long id;
	private String codigo;
	private LocalDate validade;
	private String statusCartao;
	private Long usuarioId;
	private String usuario;
	private Long empresaId;
	private String empresa;
	
	public CartoesDTO() {
		
	}
	
	public CartoesDTO(Cartao cartao) {
		this.id = cartao.getId();
		this.codigo = cartao.getCodigo();
		this.validade = cartao.getValidade();
		this.statusCartao = cartao.getStatusCartao();
		this.usuarioId = cartao.getUsuario().getId();
		this.usuario = cartao.getUsuario().getLogin();
		this.empresaId = cartao.getUsuario().getEmpresa().getId();
		this.empresa = cartao.getUsuario().getEmpresa().getNomeFantasia();	
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

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "CartoesDTO [id=" + id + ", codigo=" + codigo + ", validade=" + validade + ", statusCartao="
				+ statusCartao + ", usuarioId=" + usuarioId + ", usuario=" + usuario + ", empresaId=" + empresaId
				+ ", empresa=" + empresa + "]";
	}
}
