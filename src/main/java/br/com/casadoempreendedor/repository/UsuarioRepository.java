package br.com.casadoempreendedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.casadoempreendedor.domain.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{

}
