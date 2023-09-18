
package com.mycompany.seguimiento;

public class Estado_Envio {

    private String fecha;
    private String ciudad;
    private String descripcion;

    public Estado_Envio(String fecha, String ciudad, String descripcion) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
  
    
}
