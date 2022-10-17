package br.com.casadoempreendedor.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.casadoempreendedor.domain.Empresas;
import br.com.casadoempreendedor.domain.FichaFinanceira;
import br.com.casadoempreendedor.domain.Mensalidade;
import br.com.casadoempreendedor.dto.FichaFinanceiraDTO;
import br.com.casadoempreendedor.dto.MensalidadeDTO;
import br.com.casadoempreendedor.repository.EmpresasRepository;
import br.com.casadoempreendedor.repository.FichaFinanceiraRepository;
import br.com.casadoempreendedor.repository.MensalidadeRepository;

@Service
public class FichaFinanceiraService {
	
	@Autowired
	private EmpresasRepository er;
	
	@Autowired
	private FichaFinanceiraRepository ffr;
	
	@Autowired
	private MensalidadeRepository mr;
	
	public Iterable<FichaFinanceiraDTO> findAll(){
		return ffr.findAll().stream().map(FichaFinanceiraDTO::new).collect(Collectors.toList());
	}
	
	public Optional<FichaFinanceiraDTO > findById(Long id){
		return ffr.findById(id).map(FichaFinanceiraDTO:: new);
	}
	
	public FichaFinanceiraDTO create(FichaFinanceiraDTO fichaFinanceiraDTO) {
			
		 	FichaFinanceiraDTO fichaFinanceiraDto = null;
			
			Optional<Empresas> emp =  er.findById(fichaFinanceiraDTO.getEmpresaId());
			
			if(emp.isPresent()) {
				FichaFinanceira fichaFinanceira = new FichaFinanceira();
				fichaFinanceira.setDataGeracao(fichaFinanceiraDTO.getDataGeracao());
				fichaFinanceira.setDia(fichaFinanceiraDTO.getDia());
				fichaFinanceira.setValor(fichaFinanceiraDTO.getValorMensal());
				fichaFinanceira.setStatusFichaFinanceira(fichaFinanceiraDTO.getStatusFichaFinanceira());
				fichaFinanceira.setEmpresa(emp.get());
				fichaFinanceiraDto = new FichaFinanceiraDTO(ffr.save(fichaFinanceira));
			}
		return fichaFinanceiraDto;
	}
	
	public void update(FichaFinanceiraDTO fichaFinanceiraDTO) {
		
		Optional<FichaFinanceira> ff = ffr.findById(fichaFinanceiraDTO.getId());
		
		if(ff.isPresent()) {
			ff.get().setDataGeracao(fichaFinanceiraDTO.getDataGeracao());
			ff.get().setDia(fichaFinanceiraDTO.getDia());
			ff.get().setValor(fichaFinanceiraDTO.getValorMensal());
			ff.get().setStatusFichaFinanceira(fichaFinanceiraDTO.getStatusFichaFinanceira());
			ffr.save(ff.get());
		}
	}
	
	public void createMensalidade(MensalidadeDTO mensalidadeDTO) {
		
		Optional<FichaFinanceira> ff = ffr.findById(mensalidadeDTO.getFichaFinanceira());
		
		Mensalidade m = new Mensalidade();
		
		m.setDataPagamento(mensalidadeDTO.getDataPagamento());
		m.setDesconto(mensalidadeDTO.getDesconto());
		m.setJuro(mensalidadeDTO.getJuro());
		m.setValor(mensalidadeDTO.getValor());
		m.setValorTotal(mensalidadeDTO.getValorTotal());
		m.setTipoPagamento(mensalidadeDTO.getTipoPagamento());
		m.setStatusMensalidade(mensalidadeDTO.getStatusMensalidade());
		m.setObservacao(mensalidadeDTO.getObservacao());
		m.setFichaFinanceira(ff.get());
		
		mr.save(m);
	}
	
	public void updateMensalidade(MensalidadeDTO mensalidadeDTO) {
		
		Optional<Mensalidade> m = mr.findById(mensalidadeDTO.getId());
		
		if(m.isPresent()) {
			m.get().setDataPagamento(mensalidadeDTO.getDataPagamento());
			m.get().setDesconto(mensalidadeDTO.getDesconto());
			m.get().setJuro(mensalidadeDTO.getJuro());
			m.get().setValor(mensalidadeDTO.getValor());
			m.get().setValorTotal(mensalidadeDTO.getValorTotal());
			m.get().setTipoPagamento(mensalidadeDTO.getTipoPagamento());
			m.get().setStatusMensalidade(mensalidadeDTO.getStatusMensalidade());
			m.get().setObservacao(mensalidadeDTO.getObservacao());
			mr.save(m.get());
		}
	}
	
	public void remove(Long id) {
		
		Optional<Mensalidade> m = mr.findById(id);
		
		if(m.isPresent()) {
			mr.deleteById(id);
		}
	}
	
	
	public List<MensalidadeDTO> findByMensalidadeFichaFinanceiraId(Long fichaFinanceira){
		return mr.findByMensalidadeFichaFinanceiraId(fichaFinanceira).stream().map(MensalidadeDTO::new).collect(Collectors.toList());
	}

	
}
