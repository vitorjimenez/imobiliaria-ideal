package com.imobiliariaIdeal.GoTech.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.imobiliariaIdeal.GoTech.Class.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Long> {
    @Override
    Optional<Usuario> findById(Long aLong);
}
