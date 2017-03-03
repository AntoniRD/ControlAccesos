package com.esliceu.dwes.boot.dao;

import com.esliceu.dwes.boot.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by xavi on 2/03/17.
 */
public interface UsuarioRepository extends CrudRepository<Usuario,String> {

    List<Usuario> findByNombre(String nombre);

    List<Usuario> findByNombreAndContraseña(String nombre, String contraseña);

    @Query(value = "SELECT * FROM auth.user_roles,auth.users where users.user_name=user_roles.user_name and user_pass = ?1", nativeQuery = true)
    List<Usuario> findUser(String password);
}
