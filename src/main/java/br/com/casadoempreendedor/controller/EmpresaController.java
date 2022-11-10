package br.com.casadoempreendedor.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.Part;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.casadoempreendedor.domain.Empresas;
import br.com.casadoempreendedor.dto.EmpresasDTO;
import br.com.casadoempreendedor.service.EmpresasService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/casaEmpGoias/api/empresas")
public class EmpresaController {
	
		@Autowired
		private EmpresasService es;
		
		@GetMapping()
		public ResponseEntity<List<Empresas>> findAll(){
			return ResponseEntity.ok(es.findAll());
		}
		
		@GetMapping("/editar/{id}")
		public ResponseEntity<Optional<Empresas>> findById(@PathVariable("id") Long id){
			return  ResponseEntity.ok(es.findById(id));
		}
		
		@GetMapping("/buscar/{cnpj}")
		public ResponseEntity<Optional<EmpresasDTO>> buscarCnpj(@PathVariable("cnpj") String cnpj){
			return ResponseEntity.ok(es.findByCnpj(cnpj));
		}
		
		@PostMapping()
		@ResponseStatus(HttpStatus.CREATED)
		public void create(@RequestBody Empresas empresa) {
			es.create(empresa);
		}
		
		@PutMapping()
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void update(@RequestBody Empresas empresa) {
			es.update(empresa);
		}
		
		@PutMapping("/arquivo/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void adicionarLogo(@RequestParam("arquivo") Part arquivo, @PathVariable("id") Long id) {
			es.adicionarLogo(arquivo, id);
		}
}
