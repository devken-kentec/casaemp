package br.com.casadoempreendedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.casadoempreendedor.domain.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
