package br.com.casadoempreendedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.casadoempreendedor.domain.Contato;
import br.com.casadoempreendedor.repository.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository cr;
	
	public void inserirMensagem(Contato contato) {
		contato.setRespondido(false);
		cr.save(contato);
	}
}
