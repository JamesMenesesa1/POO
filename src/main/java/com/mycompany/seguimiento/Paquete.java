
package com.mycompany.seguimiento;

public class Paquete {
    private String numeroSeguimiento;
    private double peso;
    private String estadoActual;
    //private Cliente cliente;

    public Paquete(String numeroSeguimiento, double peso, String estadoActual) {
        this.numeroSeguimiento = numeroSeguimiento;
        this.peso = peso;
        this.estadoActual = estadoActual;
    }

    public Paquete() {
    }
    

    public String getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(String numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }
    
    public void showInfo() {
        System.out.println("Numero de seguimiento: "+ this.getNumeroSeguimiento());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Estado actual: "+this.getEstadoActual());
        System.out.println(" ");
        
    }
    
    
    
    

   
    
}
