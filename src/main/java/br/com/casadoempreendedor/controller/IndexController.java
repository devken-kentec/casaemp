package br.com.casadoempreendedor.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping()
	public String get() {
		return "API Teste Casa do Empreendedor de Goiás";
	}  
}