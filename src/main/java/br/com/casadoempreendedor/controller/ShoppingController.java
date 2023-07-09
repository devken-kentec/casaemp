package br.com.casadoempreendedor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.casadoempreendedor.dto.ShoppingDTO;
import br.com.casadoempreendedor.service.ShoppingService;

@RestController
@RequestMapping("/casaEmpGoias/api/shopping")
public class ShoppingController {
	
	@Autowired
	private ShoppingService ss;
	
	@GetMapping()
	public ResponseEntity<Iterable<ShoppingDTO>> findAll(){
		return ResponseEntity.ok(ss.findAll());
	}
	
	@GetMapping("/editar/{id}")
	public ResponseEntity<Optional<ShoppingDTO>> findById(@PathVariable("id") Long id){
		return ResponseEntity.ok(ss.findById(id));
	}
	
	@GetMapping("/{ramoDeAtividade}")
	public ResponseEntity<Iterable<ShoppingDTO>> findAll(
										@PathVariable("ramoDeAtividade") String ramoDeAtividade){
		return ResponseEntity.ok(ss.findAllRamoAtividade(ramoDeAtividade));
	}
	
	@GetMapping("/filtroRamoDeAtividade")
	public ResponseEntity<Iterable<String>> findAllRamoAtividadeFiltro(){
		return ResponseEntity.ok(ss.findAllRamoAtividadeFiltro());
	}
	
	@GetMapping("/vinculados")
	public ResponseEntity<Iterable<ShoppingDTO>> findAllVinculados(){
		return ResponseEntity.ok(ss.findAllVinculados());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody ShoppingDTO shoppingDTO) {
		ss.create(shoppingDTO);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody ShoppingDTO shoppingDTO) {
		ss.update(shoppingDTO);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		ss.delete(id);
	}
	
}
