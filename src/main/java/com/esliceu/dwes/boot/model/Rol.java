package com.esliceu.dwes.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xavi on 2/03/17.
 */
@Entity(name = "user_roles")
public class Rol {
    @Id
    @Column(name = "user_name")
    private String usuario;

    @Id
    @Column(name = "user_rol")
    private String rol;


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
