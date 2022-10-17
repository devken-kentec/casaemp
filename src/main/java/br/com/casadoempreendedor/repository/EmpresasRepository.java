package br.com.casadoempreendedor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.casadoempreendedor.domain.Empresas;

public interface EmpresasRepository extends JpaRepository<Empresas, Long>{
	
	public Optional<Empresas> findByCnpj(String cnpj);
}
