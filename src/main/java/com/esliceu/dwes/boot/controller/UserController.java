package com.esliceu.dwes.boot.controller;

import com.esliceu.dwes.boot.dao.UsuarioRepository;
import com.esliceu.dwes.boot.model.Usuario;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xavi on 23/02/17.
 */
@RestController
public class UserController {

    @Autowired
    private BeanFactory beanFactory;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/usuarios")
    public List<Usuario> usuarios(){
        return (List<Usuario>) usuarioRepository.findAll();
    }

}
