package br.com.casadoempreendedor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.casadoempreendedor.domain.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

	Optional<Cartao> findByCodigo(String codigo);

}
