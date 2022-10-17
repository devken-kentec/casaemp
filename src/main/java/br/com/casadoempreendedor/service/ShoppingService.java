package br.com.casadoempreendedor.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.casadoempreendedor.domain.Empresas;
import br.com.casadoempreendedor.domain.Shopping;
import br.com.casadoempreendedor.dto.ShoppingDTO;
import br.com.casadoempreendedor.repository.EmpresasRepository;
import br.com.casadoempreendedor.repository.ShoppingRepository;

@Service
public class ShoppingService {
	
	@Autowired
	private EmpresasRepository er;
	
	@Autowired
	private ShoppingRepository sr;
	
	public List<ShoppingDTO> findAll(){
		return sr.findAll().stream().map(ShoppingDTO::new).collect(Collectors.toList());
	}
	
	public Optional<ShoppingDTO> findById(Long id){
		return sr.findById(id).map(ShoppingDTO::new);
	}
	
	public List<ShoppingDTO> findAllVinculados(){
		return sr.listarTodos().stream().map(ShoppingDTO::new).collect(Collectors.toList());
	}
	
	public List<ShoppingDTO> findAllRamoAtividade(String ramoDeAtividade){
		return sr.listarRamoAtividade(ramoDeAtividade).stream().map(ShoppingDTO::new).collect(Collectors.toList());
	}
	
	public List<String> findAllRamoAtividadeFiltro(){
		return sr.listarRamoAtividadeFiltro();
	}
	
	public void create (ShoppingDTO shoppingDTO) {
			
		Optional<Empresas> emp = er.findById(shoppingDTO.getEmpresaId());
		
		if(emp.isPresent()) {
			Shopping shopping = new Shopping();
			shopping.setPosicao(shoppingDTO.getPosicao());
			shopping.setVinculo(shoppingDTO.getVinculo());
			shopping.setEmpresas(emp.get());
			sr.save(shopping);
		}
	}
	
	public void update(ShoppingDTO shoppingDTO) {
		
		Optional<Shopping> shopp = sr.findById(shoppingDTO.getId());
		
		if(shopp.isPresent()) {
			Optional<Empresas> emp = er.findById(shoppingDTO.getEmpresaId());
			
			if(emp.isPresent()) {
				shopp.get().setPosicao(shoppingDTO.getPosicao());
				shopp.get().setVinculo(shoppingDTO.getVinculo());
				shopp.get().setEmpresas(emp.get());
				sr.save(shopp.get());
			}
		}
	}
	
	public void delete(Long id) {
		
		Optional<Shopping> shopp = sr.findById(id);
		
		if(shopp.isPresent()) {
			sr.deleteById(id);
		}
	}
}
