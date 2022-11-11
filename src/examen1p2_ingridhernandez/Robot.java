/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_ingridhernandez;

/**
 *
 * @author ADMINISTRADOR1
 */
public abstract class Robot implements comportamiento {
    private int ID;
    private int x;
    private int y;
    private boolean Carga;
    private String Fecha;

    public Robot() {
    }

    public Robot(int ID, int x, int y, boolean Carga, String Fecha)  {
        this.ID = ID;
        this.setX(x);
        this.setY(y);
        this.Carga = Carga;
        this.Fecha = Fecha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
        if(x>0&&x<9){
         this.x = x;   
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y){
        if(y>0&&y<9){
        this.y = y;
        } 
    }

    public boolean isCarga() {
        return Carga;
    }

    public void setCarga(boolean Carga) {
        this.Carga = Carga;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Robot{" + "ID=" + ID + ", x=" + x + ", y=" + y + ", Carga=" + Carga + ", Fecha=" + Fecha + '}';
    }
    
}
