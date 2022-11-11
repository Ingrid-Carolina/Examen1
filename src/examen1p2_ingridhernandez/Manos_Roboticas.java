/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_ingridhernandez;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Manos_Roboticas extends Robot{
    private int Num;

    public Manos_Roboticas() {
    super();
    }

    public Manos_Roboticas(int Num) {
        this.Num = Num;
    }

    public Manos_Roboticas(int Num, int ID, int x, int y, boolean Carga, String Fecha) {
        super(ID, x, y, Carga, Fecha);
        this.Num = Num;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    @Override
    public String toString() {
        return super.toString()+"Manos_Roboticas{" + "Num=" + Num + '}';
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
