package br.com.casadoempreendedor.controller;

import java.util.List;
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

import br.com.casadoempreendedor.dto.FichaFinanceiraDTO;
import br.com.casadoempreendedor.dto.MensalidadeDTO;
import br.com.casadoempreendedor.service.FichaFinanceiraService;

@RestController
@RequestMapping("/casaEmpGoias/api/fichaFinanceira")
public class FichaFinanceiraController {
	
	@Autowired
	private FichaFinanceiraService ffs;
	
	@GetMapping("/editar/{id}")
	public ResponseEntity<Optional<FichaFinanceiraDTO>> findById(@PathVariable("id") Long id){
		return ResponseEntity.ok(ffs.findById(id));
	}
	
	@GetMapping()
	public ResponseEntity<Iterable<FichaFinanceiraDTO>> findAll(){
		return ResponseEntity.ok(ffs.findAll());
	}
	
	@GetMapping("/mensalidadeFichaFinanceira/{fichaFinanceira}")
	public ResponseEntity<List<MensalidadeDTO>> findByMensalidadeFichaFinanceiraId(@PathVariable("fichaFinanceira") Long fichaFinanceira){
		return ResponseEntity.ok(ffs.findByMensalidadeFichaFinanceiraId(fichaFinanceira));
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public FichaFinanceiraDTO create(@RequestBody FichaFinanceiraDTO fichaFinanceiraDTO) {
		return ffs.create(fichaFinanceiraDTO);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody FichaFinanceiraDTO fichaFinanceiraDTO) {
		 ffs.update(fichaFinanceiraDTO);
	}
	
	@PostMapping("/mensalidade")
	@ResponseStatus(HttpStatus.CREATED)
	public void createMensalidade(@RequestBody MensalidadeDTO mensalidadeDTO) {
		ffs.createMensalidade(mensalidadeDTO);
	}
	
	@PutMapping("/mensalidade")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateMensalidade(@RequestBody MensalidadeDTO mensalidadeDTO) {
		ffs.updateMensalidade(mensalidadeDTO);
	}
	
	@DeleteMapping("/mensalidade/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(@PathVariable("id") Long id) {
		ffs.remove(id);
	}
}
