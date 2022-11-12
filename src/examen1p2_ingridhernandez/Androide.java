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

    /**
     *
     * @param degrees
     * @param or
     */
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
