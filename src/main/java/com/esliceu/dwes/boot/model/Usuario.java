package com.esliceu.dwes.boot.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by xavi on 2/03/17.
 */
@Entity(name = "users") //Annotation for mark this pojo as a mapping bbdd table class
public class Usuario {

    @Id
    @Column(name = "user_name")
    private String nombre;

    @Column(name = "user_pass")
    private String contraseña;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_name",referencedColumnName = "user_name")
    private List<Rol> roles;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
