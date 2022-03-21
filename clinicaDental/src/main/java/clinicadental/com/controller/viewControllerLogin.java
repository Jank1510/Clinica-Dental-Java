/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicadental.com.controller;

import clinicadental.com.entity.registro;
import clinicadental.com.view.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jank
 */
public class viewControllerLogin implements ActionListener {

    login loginView = new login();
    viewControllerContenido contenido = new viewControllerContenido();

    public void iniciarLogin() {
        this.loginView.setTitle("Login");
        this.loginView.setLocationRelativeTo(null);
        this.loginView.setVisible(true);
        this.loginView.iniciarSession.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        registro jsson=new registro();
        String user = this.loginView.usuario.getText().toString();
        String password = this.loginView.password.getText().toString();

        if (user.equals("jank")) {
            if (password.equals("123")) {
                this.loginView.mensajeError.setText("");
                this.loginView.setVisible(false);
                this.contenido.iniciarContenido();
                
            } else {
                this.loginView.mensajeError.setText("Password Incorrecta");
            }
        } else {
            this.loginView.mensajeError.setText("Usuario Incorrecto");
        }
    }
}
