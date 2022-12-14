package br.com.casadoempreendedor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.casadoempreendedor.dto.UsuariosDTO;
import br.com.casadoempreendedor.service.UsuarioService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/casaEmpGoias/api/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService us;
	
	@GetMapping("/editar/{id}")
	public ResponseEntity<Optional<UsuariosDTO>> findById(@PathVariable("id") Long id){
		return  ResponseEntity.ok(us.findById(id));
	}
	
	@GetMapping()
	public ResponseEntity<Iterable<UsuariosDTO>> findAll(){
		return ResponseEntity.ok(us.findAll());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody UsuariosDTO usuarioDTO) {
		us.create(usuarioDTO);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody UsuariosDTO usuarioDTO) {
		us.update(usuarioDTO);
	}
}
