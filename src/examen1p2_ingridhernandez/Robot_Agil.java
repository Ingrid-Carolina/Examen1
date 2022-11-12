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

    public Robot_Agil(int cantidadLLantas, int velocidad, int ID, int x, int y, boolean Carga, String Fecha)  {
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
    @Override
     public void gir (int degrees,char or){
         if(degrees== 90 && or == 'I'){//viendo para la izquierda
              or ='A';
             
        }else if(degrees ==90&& or == 'D'){//viendo para la derecha
            or= 'B';
        }else if(degrees == 90 && or == 'A' ){//viendo para arriba
            or = 'D';
            
        }else if(degrees ==90 && or == 'B'){ // viendo para abajo
            or = 'I';
            
            
            
            
        }if(degrees== 180 && or == 'I'){//viendo para la izquierda
              or ='D';
             
        }else if(degrees ==180&& or == 'D'){//viendo para la derecha
            or= 'I';
        }else if(degrees == 180 && or == 'A' ){//viendo para arriva
            or = 'B';
            
        }else if(degrees ==180 && or == 'B'){ // viendo para abajo
            or = 'A';
            
            
            
            
            
        }if(degrees== 270 && or == 'I'){//viendo para la izquierda
              or ='B';
             
        }else if(degrees ==270&& or == 'D'){//viendo para la derecha
            or= 'A';
        }else if(degrees == 270 && or == 'A' ){//viendo para arriva
            or = 'I';
            
        }else if(degrees ==270&& or == 'B'){ // viendo para abajo
            or = 'D';
        }
        
        
        
     }
    
}
