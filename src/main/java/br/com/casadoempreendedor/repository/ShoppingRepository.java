package br.com.casadoempreendedor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.casadoempreendedor.domain.Shopping;

@Repository
public interface ShoppingRepository extends JpaRepository<Shopping, Long>{
	
	@Query("SELECT s FROM Shopping s WHERE s.vinculo = 'Vincular' ")
	List<Shopping> listarTodos();
	
	@Query("SELECT s FROM Shopping s "
			+ "JOIN s.empresas e "
			+ "WHERE s.vinculo = 'Vincular' AND e.ramoDeAtividade = :ramoDeAtividade ")
	List<Shopping> listarRamoAtividade(@Param("ramoDeAtividade") String ramoDeAtividade);
	
	@Query(nativeQuery=true, value="SELECT DISTINCT (e.ramo_atividade) FROM shopping AS s "
			+ "JOIN empresas AS e "
			+ "ON s.id_empresa = e.id ")
	List<String> listarRamoAtividadeFiltro();
}
