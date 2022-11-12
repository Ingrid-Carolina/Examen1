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
