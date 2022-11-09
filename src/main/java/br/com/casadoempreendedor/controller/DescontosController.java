package br.com.casadoempreendedor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.casadoempreendedor.dto.DescontosDTO;
import br.com.casadoempreendedor.service.DescontosService;

@RestController
@RequestMapping("/casaEmpGoias/api/descontos")
public class DescontosController {
		
	@Autowired
	private DescontosService ds;
	
	@GetMapping("/editar/{id}")
	public ResponseEntity<Optional<DescontosDTO>> findById(@PathVariable("id") Long id){
		return  ResponseEntity.ok(ds.findById(id));
	}
	
	@GetMapping("/calculo/{empresaId}")
	public ResponseEntity<Optional<DescontosDTO>> findByEmpresaId(@PathVariable("empresaId") Long empresaId){
		return  ResponseEntity.ok(ds.findByEmpresaId(empresaId));
	}
	
	@GetMapping()
	public ResponseEntity<Iterable<DescontosDTO>> findAll(){
		return ResponseEntity.ok(ds.findAll());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody DescontosDTO descontoDTO) {
		ds.create(descontoDTO);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody DescontosDTO descontoDTO) {
		ds.update(descontoDTO);
	}

}
