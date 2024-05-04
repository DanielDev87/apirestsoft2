package com.backend.apirestsoft2.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.apirestsoft2.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
