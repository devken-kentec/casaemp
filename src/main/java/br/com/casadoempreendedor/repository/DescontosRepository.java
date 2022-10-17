package br.com.casadoempreendedor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.casadoempreendedor.domain.Descontos;

@Repository
public interface DescontosRepository extends JpaRepository<Descontos, Long>{
	
	@Query("SELECT d FROM Descontos d "
			+ "JOIN d.empresas e "
			+ "WHERE e.id = :empresaId ")
	public Optional<Descontos> findByEmpresaId(@Param("empresaId") Long empresaId);
}
