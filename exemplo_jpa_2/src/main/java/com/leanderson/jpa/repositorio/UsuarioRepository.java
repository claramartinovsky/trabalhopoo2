package com.leanderson.jpa.repositorio;

import com.leanderson.jpa.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    List<Usuario> findAllByOrderByNomeCompletoAsc();
}
