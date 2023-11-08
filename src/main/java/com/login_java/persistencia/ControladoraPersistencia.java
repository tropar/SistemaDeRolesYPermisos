
package com.login_java.persistencia;

import com.login_java.logica.Rol;
import com.login_java.logica.Usuario;
import com.login_java.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    
    
    public List<Usuario> traerUsuarios() {
        List<Usuario> listaUsuario = usuarioJpa.findUsuarioEntities();
        return listaUsuario;
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario usu) {
        usuarioJpa.create(usu);
    }

    public void borrarUsuario(int id_usuario) {
        try {
            usuarioJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id_usuario) {
        return usuarioJpa.findUsuario(id_usuario);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuarioJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
