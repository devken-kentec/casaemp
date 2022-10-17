package br.com.casadoempreendedor.service;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.casadoempreendedor.domain.Cartao;
import br.com.casadoempreendedor.domain.Usuarios;
import br.com.casadoempreendedor.dto.CartoesDTO;
import br.com.casadoempreendedor.repository.CartaoRepository;
import br.com.casadoempreendedor.repository.UsuarioRepository;

@Service
public class CartaoService {
	
	@Autowired
	private UsuarioRepository ur;
	
	@Autowired
	private CartaoRepository cr;
	
	public Long gerarCodigo() {
		Random aletorio = new Random();
		Long codigo = null; 
		Long codigoMaior = aletorio.nextLong();
		if(codigoMaior < 1) {
			codigoMaior = codigoMaior * -1;
		}
		String tamanho = codigoMaior.toString().substring(0,10);
		codigo = Long.parseLong(tamanho);
		return codigo;
	}
	
	public Optional<CartoesDTO> findByCodigo(String codigo){
		return cr.findByCodigo(codigo).map(CartoesDTO::new);
	}
	
	public Optional<CartoesDTO> findById(Long id) {
		return cr.findById(id).map(CartoesDTO::new);
	}
	
	public Optional<Cartao> findByCompletoId(Long id) {
		return cr.findById(id);
	}
	
	public Iterable<CartoesDTO> findAll() {
		return cr.findAll().stream().map(CartoesDTO::new).collect(Collectors.toList());
	}
	
	public Cartao create(CartoesDTO cartaoDTO) {
		
		Cartao cartaoRetorno = null;
			
		Optional<Usuarios> user = ur.findById(cartaoDTO.getUsuarioId());
		
		if(user.isPresent()) {
			Optional<Cartao> cart = cr.findByCodigo(cartaoDTO.getCodigo());
				
				if(cart.isEmpty()) {
					Cartao cartao = new Cartao();
					cartao.setCodigo(cartaoDTO.getCodigo());
					cartao.setValidade(cartaoDTO.getValidade());
					cartao.setStatusCartao(cartaoDTO.getStatusCartao());
					cartao.setUsuario(user.get());
					cr.save(cartao);
				} else if(cart.isPresent()) {
					cartaoRetorno = cart.get();
				}
		}
		return cartaoRetorno;
	}
}
