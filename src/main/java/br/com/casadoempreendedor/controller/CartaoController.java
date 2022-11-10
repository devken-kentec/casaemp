package br.com.casadoempreendedor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.casadoempreendedor.domain.Cartao;
import br.com.casadoempreendedor.dto.CartoesDTO;
import br.com.casadoempreendedor.service.CartaoService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/casaEmpGoias/api/cartoes")
public class CartaoController {
	
	@Autowired
	private CartaoService cs;
	
	@GetMapping("/editar/{id}")
	public ResponseEntity<Optional<CartoesDTO>> findById(@PathVariable("id") Long id){
		return  ResponseEntity.ok(cs.findById(id));
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Optional<CartoesDTO>> findByCodigo(@PathVariable("codigo") String codigo){
		return  ResponseEntity.ok(cs.findByCodigo(codigo));
	}
	
	@GetMapping()
	public ResponseEntity<Iterable<CartoesDTO>> findAll(){
		return ResponseEntity.ok(cs.findAll());
	}
	
	@GetMapping("/total/{id}")
	public ResponseEntity<Optional<Cartao>> findByCompletoId(@PathVariable("id") Long id){
		return  ResponseEntity.ok(cs.findByCompletoId(id)); 
	}

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Cartao create(@RequestBody CartoesDTO cartaoDTO) {
		return cs.create(cartaoDTO); 
	}

}
