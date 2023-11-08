
package com.login_java.logica;

import java.io.Serializable;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Usuario implements Serializable {
    
    @Id
//    @GeneratedValue(strategy=GenerationType.SEQUENCE) //Necesario para poder asignar ID
    private int id;
    private String nombreUsuario;
    private String contrasenia;
    
    //Sirve para establecer la RELACIÓN BIDIRECCIONAL
    @ManyToOne
    @JoinColumn(name="fk_rol") //A través de esta columna se UNE a la otra tabla.
    private Rol unRol;

    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String contrasenia, Rol unRol) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.unRol = unRol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }
    
    
    
}
