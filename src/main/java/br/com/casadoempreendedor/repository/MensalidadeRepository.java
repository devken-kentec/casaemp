package br.com.casadoempreendedor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.casadoempreendedor.domain.Mensalidade;

@Repository
public interface MensalidadeRepository extends JpaRepository<Mensalidade, Long> {
	
	@Query("SELECT m FROM Mensalidade m "
			+ "JOIN m.fichaFinanceira ff "
			+ " WHERE ff.id = :fichaFinanceira ")
	public List<Mensalidade> findByMensalidadeFichaFinanceiraId(@Param("fichaFinanceira") Long fichaFinanceira);
}
