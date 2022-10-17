package br.com.casadoempreendedor.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.casadoempreendedor.domain.Empresas;
import br.com.casadoempreendedor.domain.Usuarios;
import br.com.casadoempreendedor.dto.UsuariosDTO;
import br.com.casadoempreendedor.repository.EmpresasRepository;
import br.com.casadoempreendedor.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository ur;
	
	@Autowired
	private EmpresasRepository er;
	
	public Optional<UsuariosDTO> findById(Long id){
		return ur.findById(id).map(UsuariosDTO::new);
	}
	
	public List<UsuariosDTO> findAll(){
		return ur.findAll().stream().map(UsuariosDTO::new).collect(Collectors.toList());
	}
	
	public void create(UsuariosDTO usuarioDTO) {
		
		Optional<Empresas> emp = er.findById(usuarioDTO.getEmpresaId());
		
		if(emp.isPresent()) {
			Usuarios usuario = new Usuarios();
			usuario.setNome(usuarioDTO.getNome());
			usuario.setLogin(usuarioDTO.getLogin());
			usuario.setDataDeNascimento(usuarioDTO.getDataDeNascimento());
			usuario.setCpf(usuarioDTO.getCpf());
			usuario.setSexo(usuarioDTO.getSexo());
			usuario.setEstadoCivil(usuarioDTO.getEstadoCivil());
			usuario.setCep(usuarioDTO.getCep());
			usuario.setEndereco(usuarioDTO.getEndereco());
			usuario.setNumero(usuarioDTO.getNumero());
			usuario.setComplemento(usuarioDTO.getComplemento());
			usuario.setBairro(usuarioDTO.getBairro());
			usuario.setMunicipio(usuarioDTO.getMunicipio());
			usuario.setEstado(usuarioDTO.getMunicipio());
			usuario.setTelefone(usuarioDTO.getTelefone());
			usuario.setTelefone2(usuarioDTO.getTelefone2());
			usuario.setWhatsapp(usuarioDTO.getWhatsapp());
			usuario.setCelular(usuarioDTO.getWhatsapp());
			usuario.setEmail(usuarioDTO.getEmail());
			usuario.setStatusUsuario(usuarioDTO.getStatusUsuario());
			usuario.setEmpresa(emp.get());	
			ur.save(usuario);
		}	
	}
	
	public void update(UsuariosDTO usuarioDTO) {
			
		Optional<Usuarios> usuario = ur.findById(usuarioDTO.getId());
		
		if(usuario.isPresent()){
			Optional<Empresas> emp = er.findById(usuarioDTO.getEmpresaId());
			
			if(emp.isPresent()) {
				usuario.get().setNome(usuarioDTO.getNome());
				usuario.get().setLogin(usuarioDTO.getLogin());
				usuario.get().setDataDeNascimento(usuarioDTO.getDataDeNascimento());
				usuario.get().setCpf(usuarioDTO.getCpf());
				usuario.get().setSexo(usuarioDTO.getSexo());
				usuario.get().setEstadoCivil(usuarioDTO.getEstadoCivil());
				usuario.get().setCep(usuarioDTO.getCep());
				usuario.get().setEndereco(usuarioDTO.getEndereco());
				usuario.get().setNumero(usuarioDTO.getNumero());
				usuario.get().setComplemento(usuarioDTO.getComplemento());
				usuario.get().setBairro(usuarioDTO.getBairro());
				usuario.get().setMunicipio(usuarioDTO.getMunicipio());
				usuario.get().setEstado(usuarioDTO.getEstado());
				usuario.get().setTelefone(usuarioDTO.getTelefone());
				usuario.get().setTelefone2(usuarioDTO.getTelefone2());
				usuario.get().setWhatsapp(usuarioDTO.getWhatsapp());
				usuario.get().setCelular(usuarioDTO.getWhatsapp());
				usuario.get().setEmail(usuarioDTO.getEmail());
				usuario.get().setStatusUsuario(usuarioDTO.getStatusUsuario());
				usuario.get().setEmpresa(emp.get());	
				ur.save(usuario.get());
				
			}	
		}
	}
}
