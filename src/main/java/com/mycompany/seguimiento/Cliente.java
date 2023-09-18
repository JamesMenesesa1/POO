
package com.mycompany.seguimiento;

public class Cliente {
  private String nombre;
  private String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void showInfo(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Direccion: "+this.getDireccion());
       
    }  
  
    
}
