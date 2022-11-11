/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_ingridhernandez;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Androide extends Robot{
    private int altura;
    private int peso;

    public Androide() {
    super();
    }

    public Androide(int altura, int peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Androide(int altura, int peso, int ID, int x, int y, boolean Carga, String Fecha)  {
        super(ID, x, y, Carga, Fecha);
        this.altura = altura;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+ "Androide{" + "altura=" + altura + ", peso=" + peso + '}';
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
