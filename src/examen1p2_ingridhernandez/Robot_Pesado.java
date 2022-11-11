/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_ingridhernandez;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Robot_Pesado extends Robot{
    private int peso;
    private int capacidad;

    public Robot_Pesado() {
    super();
    }

    public Robot_Pesado(int peso, int capacidad) {
        this.peso = peso;
        this.setCapacidad(capacidad); 
    }

    public Robot_Pesado(int peso, int capacidad, int ID, int x, int y, boolean Carga, String Fecha) {
        super(ID, x, y, Carga, Fecha);
        this.peso = peso;
        this.capacidad = capacidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if(capacidad >5){
            this.capacidad = capacidad; 
        }
       
    }

    @Override
    public String toString() {
        return "Robot_Pesado{" + "peso=" + peso + ", capacidad=" + capacidad + '}';
    }
    
}
