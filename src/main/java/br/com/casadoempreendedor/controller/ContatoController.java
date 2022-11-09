package br.com.casadoempreendedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.casadoempreendedor.domain.Contato;
import br.com.casadoempreendedor.service.ContatoService;

@RestController
@RequestMapping("/casaEmpGoias/api/contato")
public class ContatoController {
	
	@Autowired
	private ContatoService cs; 
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void enviarMensagem(@RequestBody Contato contato) {
		System.out.println(contato);
		cs.inserirMensagem(contato);
	}
	
}
