/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_ingridhernandez;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Robot_Agil extends Robot{
    private int cantidadLLantas;
    private int velocidad;

    public Robot_Agil() {
    super();
    }

    public Robot_Agil(int cantidadLLantas, int velocidad) {
        this.cantidadLLantas = cantidadLLantas;
        this.velocidad = velocidad;
    }

    public Robot_Agil(int cantidadLLantas, int velocidad, int ID, int x, int y, boolean Carga, String Fecha) {
        super(ID, x, y, Carga, Fecha);
        this.cantidadLLantas = cantidadLLantas;
        this.velocidad = velocidad;
    }

    public int getCantidadLLantas() {
        return cantidadLLantas;
    }

    public void setCantidadLLantas(int cantidadLLantas) {
        this.cantidadLLantas = cantidadLLantas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Robot_Agil{" + "cantidadLLantas=" + cantidadLLantas + ", velocidad=" + velocidad + '}';
    }
     public int adv(int x,int y,int x2,int y2){
        return 0; 
     }
    public void chr(){
       
    }
     public void dmnt(){
         
     }
     public int gir (int degrees,char or){
          return 0;
     }
    
}
