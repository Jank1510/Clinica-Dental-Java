/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicadental.com.controller;


import clinicadental.com.entity.registro;
import clinicadental.com.view.contenido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jank
 */
public class viewControllerContenido implements ActionListener{
     contenido contenido=new contenido();
     registro generarRegistro =new registro();
     
     public void iniciarContenido(){
         this.contenido.setTitle("Clinica Dentista");
         this.contenido.setVisible(true);
         this.contenido.setLocationRelativeTo(null);
         this.contenido.registrar.addActionListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("REGISTRAR")){
            
            generarRegistro.registro(contenido.nombreNew.getText(), contenido.apellidoNew.getText(),
                    contenido.edadNew.getText(), contenido.cedulaNew.getText(), contenido.codigoNew.getText(),
                    contenido.fechaRealizacionNew.getText(), contenido.descripcionNew.getSelectedItem().toString(), contenido.tipoServicioNew.getSelectedItem().toString());
            
            String []arrayRegistro =new String[8];
            arrayRegistro[0]=generarRegistro.getNombre();
            arrayRegistro[1]=generarRegistro.getApellido();
            arrayRegistro[2]=generarRegistro.getEdad();
            arrayRegistro[3]=generarRegistro.getCedulo();
            arrayRegistro[4]=generarRegistro.getCodigo();
            arrayRegistro[5]=generarRegistro.getFechaRealizacion();
            arrayRegistro[6]=generarRegistro.getDescripcion();
            arrayRegistro[7]=generarRegistro.getTipoServicio();
            
            contenido.modelo.addRow(arrayRegistro);

        }
        //error en traer datos de el jframe por que spy tonto y no eh puesto el gettext
    }
}
