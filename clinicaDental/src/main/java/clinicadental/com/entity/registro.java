/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicadental.com.entity;

import clinicadental.com.view.contenido;

/**
 *
 * @author jank
 */
public class registro {

    contenido datosContenido = new contenido();
    
    public String nombre;
    public String apellido;
    public String edad;
    public String cedulo;
    public String codigo;
    public String fechaRealizacion;
    public String descripcion;
    public String tipoServicio;

    public void registro(String nombre, String apellido, String edad, String cedulo, String codigo, String fechaRealizacion, String descripcion, String tipoServicio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedulo = cedulo;
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
    }

    public registro() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCedulo() {
        return cedulo;
    }

    public void setCedulo(String cedulo) {
        this.cedulo = cedulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    
    
}
