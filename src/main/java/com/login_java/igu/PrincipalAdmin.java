package com.login_java.igu;

import com.login_java.logica.Controladora;
import com.login_java.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalAdmin extends javax.swing.JFrame {

    Controladora control;
    Usuario usr;

    public PrincipalAdmin(Controladora control, Usuario usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnNuevoUsuario = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNombreUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Sistema Administrador de usuarios");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        btnNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNuevoUsuario.setText("Crear nuevo usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditar.setText("Editar usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrar.setText("Borrar usuario");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRecargar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRecargar.setText("Recargar tabla");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtNombreUser.setEditable(false);
        txtNombreUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreUser.setBorder(null);
        txtNombreUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNombreUser.setText(usr.getNombreUsuario());

        cargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void cargarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Id", "Usuario", "Rol"};

        modeloTabla.setColumnIdentifiers(titulos);

        List<Usuario> listaUsuarios = control.traerUsuarios();

        if (listaUsuarios != null) {
            for (Usuario usr : listaUsuarios) {
                Object[] objeto = {usr.getId(), usr.getNombreUsuario(), usr.getUnRol().getNombreRol()};
                modeloTabla.addRow(objeto);
            }
        }

        tablaUsuarios.setModel(modeloTabla);

    }

    private void txtNombreUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUserActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        AltasUsuarios altaUsu = new AltasUsuarios(control);
        altaUsu.setVisible(true);
        altaUsu.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        if (tablaUsuarios.getRowCount() > 0) {
            if (tablaUsuarios.getSelectedRow() != -1) {
                int id_usuario = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));

                control.borrarUsuario(id_usuario);
                mostrarMensaje("Se borró el usuario correctamente", "info", "Eliminación correcta");
                cargarTabla();                
            } else {
                mostrarMensaje("No se selecciono ningún registro", "error", "Error al borrar");
            }
        } else {
            mostrarMensaje("La tabla está vacía", "error", "Error al borrar");
        }
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (tablaUsuarios.getRowCount() > 0) {
            if (tablaUsuarios.getSelectedRow() != -1) {
                int id_usuario = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));

                EdicionUsuarios pantallaEdic = new EdicionUsuarios(control, id_usuario);
                pantallaEdic.setVisible(true);
                pantallaEdic.setLocationRelativeTo(null);
                
                
                cargarTabla();                
            } else {
                mostrarMensaje("No se selecciono ningún registro", "error", "Error al editar");
            }
        } else {
            mostrarMensaje("La tabla está vacía", "error", "Error al editar");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if(tipo.equals("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setLocationRelativeTo(null);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables
}
