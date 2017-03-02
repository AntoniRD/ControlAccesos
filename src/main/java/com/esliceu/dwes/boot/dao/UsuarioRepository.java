package com.esliceu.dwes.boot.dao;

import com.esliceu.dwes.boot.model.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by xavi on 2/03/17.
 */
public interface UsuarioRepository extends CrudRepository<Usuario,String> {


}
