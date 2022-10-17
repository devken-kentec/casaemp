package br.com.casadoempreendedor.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.casadoempreendedor.domain.Descontos;
import br.com.casadoempreendedor.domain.Empresas;
import br.com.casadoempreendedor.dto.DescontosDTO;
import br.com.casadoempreendedor.repository.DescontosRepository;
import br.com.casadoempreendedor.repository.EmpresasRepository;

@Service
public class DescontosService {
	
	@Autowired
	private EmpresasRepository er;
	
	@Autowired
	private DescontosRepository dr;
	
	public Optional<DescontosDTO> findById(Long id){
		return dr.findById(id).map(DescontosDTO::new);
	}
	
	public List<DescontosDTO> findAll(){
		return dr.findAll().stream().map(DescontosDTO::new).collect(Collectors.toList());
	}
	
	public Optional<DescontosDTO> findByEmpresaId(Long empresaId){
		return dr.findByEmpresaId(empresaId).map(DescontosDTO::new);
	}
	
	public void create(DescontosDTO descontoDTO) {
		 	
		Optional<Empresas> emp = er.findById(descontoDTO.getEmpresaId());
		
		if(emp.isPresent()) {
				Descontos desconto = new Descontos();
				desconto.setDesconto(descontoDTO.getDesconto());
				desconto.setMilhas(descontoDTO.getMilhas());
				desconto.setEmpresas(emp.get());
				dr.save(desconto);
			}
		
	}

	public void update(DescontosDTO descontoDTO) {
		Optional<Descontos> desc = dr.findById(descontoDTO.getId());
		
		if(desc.isPresent()) {
			Optional<Empresas> emp = er.findById(descontoDTO.getEmpresaId());
			
			if(emp.isPresent()) {
				desc.get().setDesconto(descontoDTO.getDesconto());
				desc.get().setMilhas(descontoDTO.getMilhas());
				desc.get().setEmpresas(emp.get());
				dr.save(desc.get());
			}
		}
	}

}
