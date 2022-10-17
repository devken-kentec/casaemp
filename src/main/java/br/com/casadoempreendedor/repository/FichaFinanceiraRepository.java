package br.com.casadoempreendedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.casadoempreendedor.domain.FichaFinanceira;

@Repository
public interface FichaFinanceiraRepository extends JpaRepository<FichaFinanceira, Long>{

}
