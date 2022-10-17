package br.com.casadoempreendedor.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/casaempreendedor/api/teste")
public class TesteController {
	
	@GetMapping()
	public String Teste() {
		return "Casa do Empreendedor de Goiás!";
	}
}
