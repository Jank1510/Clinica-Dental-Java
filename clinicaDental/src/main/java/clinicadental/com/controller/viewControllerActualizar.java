/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicadental.com.controller;

import clinicadental.com.entity.registro;
import clinicadental.com.view.actualizar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jank
 */
public class viewControllerActualizar implements ActionListener {
    
    actualizar datosActualizar = new actualizar();
    //viewControllerContenido contenidoController=new viewControllerContenido();
    
    public boolean señalDeactualizacion=false;

    public void inicializarActualizar() {
        this.datosActualizar.setTitle("Actualizar");
        this.datosActualizar.setVisible(true);
        this.datosActualizar.setLocationRelativeTo(null);
        this.datosActualizar.btncerrar.addActionListener(this);
        this.datosActualizar.btnActualizar.addActionListener(this);

    }

    public void enviarDatosActualizar(String nombre, String apellido, String edad, String cedula, String codigo,
            String fecha, String descripcion, String servicio, String precio) {
        datosActualizar.nombretxt.setText(nombre);
        datosActualizar.apellidotxt.setText(apellido);
        datosActualizar.edadtxt.setText(edad);
        datosActualizar.cedulatxt.setText(cedula);
        datosActualizar.codigotxt.setText(codigo);
        datosActualizar.fechatxt.setText(fecha);
        datosActualizar.descripciontxt.setText(descripcion);
        datosActualizar.serviciotxt.setText(servicio);
        datosActualizar.preciotxt.setText(precio);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("CERRAR")) {
            this.datosActualizar.setVisible(false);
        }
        if (ae.getActionCommand().equals("ACTUALIZAR")) {
            //System.out.println(contenidoController.getRegistroActualizar());
        }
    }
}
