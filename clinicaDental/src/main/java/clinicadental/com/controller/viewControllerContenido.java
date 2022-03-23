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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jank
 */
public class viewControllerContenido implements ActionListener {

    contenido contenido = new contenido();
    registro generarRegistro = new registro();
    viewControllerVer actualizar = new viewControllerVer();

    public int registroActualizar;

    public void iniciarContenido() {
        this.contenido.setTitle("Clinica Dentista");
        this.contenido.setVisible(true);
        this.contenido.setLocationRelativeTo(null);
        this.contenido.registrar.addActionListener(this);
        this.contenido.eliminar.addActionListener(this);
        this.contenido.btnBuscarCedula.addActionListener(this);
        this.contenido.actualizar.addActionListener(this);
        this.contenido.ver.addActionListener(this);
        this.contenido.salir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("REGISTRAR")) {

            if (contenido.nombreNew.getText().equals("")
                    || contenido.apellidoNew.getText().equals("")
                    || contenido.edadNew.getText().equals("")
                    || contenido.codigoNew.getText().equals("")
                    || contenido.cedulaNew.getText().equals("")
                    || contenido.fechaRealizacionNew.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Los campos de entrada son obligatorios", "Error al guardar el registro", JOptionPane.WARNING_MESSAGE);

            } else {
                generarRegistro.registro(contenido.nombreNew.getText(), contenido.apellidoNew.getText(),
                        contenido.edadNew.getText(), contenido.cedulaNew.getText(), contenido.codigoNew.getText(),
                        contenido.fechaRealizacionNew.getText(), contenido.descripcionNew.getSelectedItem().toString(), contenido.tipoServicioNew.getSelectedItem().toString());

                String[] arrayRegistro = new String[9];
                arrayRegistro[0] = generarRegistro.getNombre();
                arrayRegistro[1] = generarRegistro.getApellido();
                arrayRegistro[2] = generarRegistro.getEdad();
                arrayRegistro[3] = generarRegistro.getCedulo();
                arrayRegistro[4] = generarRegistro.getCodigo();
                arrayRegistro[5] = generarRegistro.getFechaRealizacion();
                arrayRegistro[6] = generarRegistro.getDescripcion();
                arrayRegistro[7] = generarRegistro.getTipoServicio();
                if (generarRegistro.getTipoServicio() == "Higiene Dental(profilaxis)_50000$") {
                    arrayRegistro[8] = "50.000$";
                } else {
                    if (generarRegistro.getTipoServicio() == "Resina de fotocurado_70000$") {
                        arrayRegistro[8] = "70.000$";
                    } else {
                        arrayRegistro[8] = "30.000$";
                    }
                }
                contenido.modelo.addRow(arrayRegistro);

                contenido.nombreNew.setText("");
                contenido.apellidoNew.setText("");
                contenido.edadNew.setText("");
                contenido.codigoNew.setText("");
                contenido.cedulaNew.setText("");
                contenido.fechaRealizacionNew.setText("");
            }

        }
        if (ae.getActionCommand().equals("ELIMINAR")) {
            int registroEliminar = contenido.tabla.getSelectedRow();
            if (registroEliminar >= 0) {
                int resp = JOptionPane.showConfirmDialog(null, "Confirme nuevamente para eliminar el registro", "Alerta!", JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    contenido.modelo.removeRow(registroEliminar);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione el registro para eliminar");
            }
        }

        if (ae.getActionCommand().equals("OK")) {
            int fila = contenido.tabla.getRowCount();
            int i;
            List<String> cedulasAray = new ArrayList<String>();
            for (i = 0; i < fila; i++) {
                String valor = (String) contenido.tabla.getValueAt(i, 3);
                cedulasAray.add(valor);
            }

            boolean coincidencia = false;
            for (int j = 0; j < cedulasAray.size(); j++) {
                if (cedulasAray.get(j).equals(contenido.cedulaBuscador.getText())) {
                    contenido.tabla.changeSelection(j, 1, false, false);
                    coincidencia = true;
                }
            }
            if (coincidencia == false) {
                contenido.tabla.clearSelection();
                JOptionPane.showMessageDialog(null, "No existe un registro con ese dato");
            }
        }

        if (ae.getActionCommand().equals("VER")) {
            registroActualizar = contenido.tabla.getSelectedRow();

            if (registroActualizar != -1) {
                int columna = contenido.tabla.getColumnCount();

                int i;
                List<String> filaAray = new ArrayList<String>();
                for (i = 0; i < columna; i++) {
                    String valor = (String) contenido.tabla.getValueAt(registroActualizar, i);
                    filaAray.add(valor);
                }
                String nombre = filaAray.get(0);
                String apellido = filaAray.get(1);
                String edad = filaAray.get(2);
                String cedula = filaAray.get(3);
                String codigo = filaAray.get(4);
                String fecha = filaAray.get(5);
                String descripcion = filaAray.get(6);
                String servicio = filaAray.get(7);
                String precio = filaAray.get(8);

                actualizar.inicializarVer();
                actualizar.enviarDatosVer(nombre, apellido, edad, cedula, codigo, fecha, descripcion, servicio, precio);

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para ver");

            }
        }
        if (ae.getActionCommand().equals("ACTUALIZAR")) {
            int resp = JOptionPane.showConfirmDialog(null, "Al continuar su registro se eliminara y se cargara en las entradas para editarlo", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                registroActualizar = contenido.tabla.getSelectedRow();

                if (registroActualizar != -1) {
                    int columna = contenido.tabla.getColumnCount();

                    int i;
                    List<String> filaAray = new ArrayList<String>();
                    for (i = 0; i < columna; i++) {
                        String valor = (String) contenido.tabla.getValueAt(registroActualizar, i);
                        filaAray.add(valor);
                    }
                    String nombre = filaAray.get(0);
                    String apellido = filaAray.get(1);
                    String edad = filaAray.get(2);
                    String cedula = filaAray.get(3);
                    String codigo = filaAray.get(4);
                    String fecha = filaAray.get(5);
                    String descripcion = filaAray.get(6);
                    String servicio = filaAray.get(7);
                    contenido.nombreNew.setText(nombre);
                    contenido.apellidoNew.setText(apellido);
                    contenido.edadNew.setText(edad);
                    contenido.codigoNew.setText(codigo);
                    contenido.cedulaNew.setText(cedula);
                    contenido.fechaRealizacionNew.setText(fecha);
                    contenido.descripcionNew.setSelectedItem(descripcion);
                    contenido.tipoServicioNew.setSelectedItem(servicio);

                    contenido.modelo.removeRow(registroActualizar);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un registro para actualizar");

                }
            }
        }
        if (ae.getActionCommand().equals("SALIR")) {
            System.exit(0);
        }
    }
}
