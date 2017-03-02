package com.esliceu.dwes.boot;

import com.esliceu.dwes.boot.model.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by xavi on 23/02/17.
 */
@Configuration
public class BeanConfig {

    @Bean
    @Scope(value = "prototype")
    public Usuario user(){
        return new Usuario("Xavi", "Torrens");
    }
}
