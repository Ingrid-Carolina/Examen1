
package examen1p2_ingridhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Examen1P2_IngridHernandez {
static Scanner lea = new Scanner(System.in);
static ArrayList<Robot> rob = new ArrayList();
static Random r = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        int x=0,y=0;
        boolean centinela = true;
        while(centinela == true){
            System.out.println("===========Menu=================");
            System.out.println("1)Crear Robot ");
            System.out.println("2)Listar Robot");
            System.out.println("3)Simular Automaticamente" );
            System.out.println("4)Actuar Manualmente");
            System.out.println("5)Salir");
            System.out.println("================================");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion){
                case 1:{
                    int id=1 + r.nextInt(100000);
                   System.out.println("Ingrese la Posicion de X: ");
                   x = lea.nextInt();
                   System.out.println("Ingrese la Posicion de Y: ");
                   y = lea.nextInt();  
                    if(x<=0||y<0&&x>=9||y>9){
                        System.out.println("la posicion no puede ser menor que cero hasta 8");
                        System.out.println("Ingrese x:");
                        x=lea.nextInt();
                             System.out.println("Ingrese y:");
                        y=lea.nextInt();  
                    }
                    boolean var = false;
                    System.out.println("Ingrese el Ano de Fabricacion: ");
                    String ano=lea.next();
                    boolean cent = true;
                    int op=0;
                    int al=0;
                    int p=0;
                    int pe=0,num=0,cant=0,vel =0,cap = 0;
                   while(cent == true){
                       System.out.println("========Tipo de Robot=============");
                       System.out.println("1)Andride");
                       System.out.println("2)Manos Roboticas");
                       System.out.println("3)Robot Agil");
                       System.out.println("4)Robot Pesado");
                       System.out.println("==================================");
                       System.out.print("Ingrese la opcion que Robot: ");
                       op = lea.nextInt();
                       switch (op) {
                           case 1: {
                               System.out.println("Ingrese la altura del Robot: ");
                               al = lea.nextInt();
                               System.out.println("Ingrese el peso del Robot: ");
                                pe = lea.nextInt();
                                 rob.add(new Androide(al,pe,id,x,y,var,ano));
                               System.out.println("Se agrego unas robot androide");
                                 cent = false;
                           }//fin del case 1
                           break;
                           case 2: {
                               System.out.println("Ingrese Numero de Servo motores: ");
                               num=lea.nextInt();
                               rob.add(new Manos_Roboticas(num,id,x,y,var,ano));
                               System.out.println("Se agrego unas manos Roboticas");
                                cent = false;
                           }//fin del case 2
                           break;
                           case 3: {
                               System.out.println("Ingrese la Cantidad de llantas: ");
                               cant=lea.nextInt();
                               System.out.println("Ingrese la velocidad del Robot: ");
                               vel = lea.nextInt();
                               rob.add(new Robot_Agil(cant,vel,id,x,y,var,ano));
                              System.out.println("Se agrego un robot Agil");
                                cent = false;
                           }//fin del case 3
                           break;
                           case 4: {
                               System.out.println("Ingrese el peso del Robot: ");
                               p = lea.nextInt();
                               System.out.println("Ingrese la capacidad maxima: ");
                               cap = lea.nextInt();
                               rob.add(new Robot_Pesado(p,cap,id,x,y,var,ano));
                               System.out.println("Se agrego un Robot Pesado");
                                cent = false;
                           }//fin del case 4
                           break;
                            default:
                                System.out.println("No existe Otro Robot");
                        }//fin del switch interno
                    }//fin del while interno
                    
                }//fin del case 1
                break;
                case 2:{
                    String salida = "";
                                for (Robot t : rob)
                                System.out.println(t.toString());
                }//fin del case 2
                break;
                case 3:{
                    System.out.println("===============Mapa=================================");
                    int filas = 8;
                    int colum = 8;
                    char[][] matriz = new char[filas][colum];
                    matriz =LlenaTablero(8,8);
                    ImprimeMatriz(matriz,x,y);
                    System.out.println("Ingrese el angulo de va estar: ");
                    int ang =lea.nextInt();
                    System.out.println("Ingrese las instrucciones rotar la variable: ");
                    System.out.println("""
                                       A:Arriba
                                       D:Derecha
                                       I:Izquierda
                                       B:Bajo""");
                    char v = lea.next().charAt(0);
                    gir(ang, v);
                   
                    
//                   
                }//fin del case 3
                break;
                case 4: {
                  try{
                         System.out.println("===============Mapa=================================");
                    int filas = 8;
                    int colum = 8;
                    char[][] matriz = new char[filas][colum];
                    matriz = generarM(filas, colum);
                    imprimirM(matriz, 0, 0);
                    System.out.println("");
                    String ins = "";
                    System.out.println("Ingrese las instrucciones separadas por comas: ");
                    System.out.println("""
                                       u:arriba
                                       d:abajo
                                       l:izquierda
                                       r:derecha
                                       g:recoger Carga
                                       s:poner Carga""");
                    ins = lea.nextLine();
                    ins = lea.next();
                    char[] insc = ins.toCharArray();

                    //System.out.println(insc);
                    int p1 = 0;
                    int p2 = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (matriz[i][j] == 'R') {
                                p1 = i;
                                p2 = j;
                            }
                        }
                    }
                    int cont = 0;
                    //while (cont <insc.length ){
                    char[][] matriz2 = adv(matriz, insc, p1, p2);
                    //imprimirM(matriz2,0,0);
                    System.out.println("");
                    System.out.println("");
                    cont = cont + 1;     
                  }catch (Exception e){
                      System.out.println("Tienes que crear un Robot Primero!");
                  }
                }// fin del case 4
                break;
                case 5:
                    centinela = false;
                 break;
           
                default:
           System.out.println("Opcion Incorrecta");
            }//fin del switch
    }//fin while
        
    }
    public static char [][] generarM(int filas, int colum){
        char [][]matrizg= new char[filas][colum];
        for (int i = 0; i < matrizg.length; i++) {
            for (int j = 0; j < matrizg[i].length; j++) {
                matrizg[i][j]= ' ';
                if ((j == 1|| j== 5) && (i<=5)) {
                    matrizg[i][j]='X';
                    if (i== 0) {
                        matrizg[i][j]= ' ';
                    }
                }//
                if (i==4) {
                    if (j>1&&j<5) {
                        matrizg[i][j]= 'C';
                    }
                }
                if (i==5) {
                    if ((j<=5)){
                        matrizg[i][j]='X';
                    }
                    if (j== 0) {
                        matrizg[i][j]= ' ';
                    }
                }//
                if (i==7&& j ==7) {
                    matrizg[i][j]= 'R';
                }
                if (i==8 && j ==5) {
                    matrizg[i][j]= 'D';
                }
 
            }
        }
        return matrizg;
    }    
    public void rellenarTablero(char[][]tablero,int filas, int columnas) {
        Random rnd = new Random();
        //Correr por la matriz
        int numrobi = rnd.nextInt(7);
        int numrobj = rnd.nextInt(7);
        int numObstaculoi = rnd.nextInt(7);
        int numObstaculoj = rnd.nextInt(7);

        //restricciones en la colocacion del gusano
        while (numrobi> 0 && numrobj < 6 && numrobj == 1 || numrobi > 0 && numrobi
                < 6 && numrobj == 5 || numrobi == 5 && numrobj > 1 && numrobj < 5 || numrobi
                == 4 && numrobj > 1 && numrobj< 5) {

            numrobi = rnd.nextInt(7);
            numrobj = rnd.nextInt(7);
        }
        //restricciones en el obstaculo
        while (numObstaculoi > 0 && numObstaculoj < 6 && numObstaculoj == 1 || numObstaculoi > 0 && numObstaculoi
                < 6 && numObstaculoj == 5 || numObstaculoi == 5 && numObstaculoj > 1 && numObstaculoj < 5 || numObstaculoi
                == 4 && numObstaculoj > 1 && numObstaculoj < 5 || numObstaculoi == numrobi && numObstaculoj == numrobj) {
            numObstaculoi = rnd.nextInt(7);
            numObstaculoj = rnd.nextInt(7);
        }
        
        //Dentro de una matriz
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                //Colocar los obstaculos
                if (i > 0 && i < 4 && j == 1 || i > 0 && i < 4 && j == 5 || i == 5 && j > 1 && j < 5) {
                    tablero[i][j] = 'X';
                    //Colocar Manzanas
                } else if (i == 4 && j > 1 && j < 5) {
                    tablero[i][j] = 'C';
                    //Colocar el gusano
                } else if (numrobi == i && numrobj == j) {
                    tablero[i][j] = 'R';
                    //Colocar el obstaculo
                } else if (numObstaculoi == i && numObstaculoj == j) {
                    tablero[i][j] = 'D';
                }
            }
        }
    }

     public static void imprimirM(char matriz[][],int filas,int col) {
    if (filas == matriz.length - 1 && col == matriz[0].length - 1) {
        System.out.print("["+ matriz[filas][col] +"]");            
    } else {
        if (col == matriz[0].length-1) {   
            System.out.println( "["+matriz[filas][col]+"]" ); 
            imprimirM(matriz, filas+1, 0);
        } else {
            System.out.print("["+ matriz[filas][col]+"]"); 
            imprimirM(matriz, filas, col+1);
        }
    }
        
}
      public static char [][]adv(char[][]matriz, char[] ins, int p1,int p2){
        
        
        int i=0;
        while(i < ins.length){
           
            char a = ins[i];
            int cont = 0;
                if (matriz[p1][p2]=='R') {
                    if (a=='u'||a=='U') {
                        if (matriz[p1-1][p2] != 'X') {
                            matriz[p1][p2]=' ';
                        matriz[p1-1][p2] = 'R';
                        }
                        else{ 
                            System.out.println("el Robot no puede atravesar la barrera.");
                        }
                    }
                    else if (a=='d'||a=='D') {
                        if (matriz[p1+1][p2] != 'X') {
                        matriz[p1][p2]=' ';
                        matriz[p1+1][p2] = 'R';
                        }
                        else{ 
                            System.out.println("el Robot no puede atravesar la barrera.");
                        }
                    }
                    else if (a=='l'||a=='L') {
                        if (matriz[p1][p2-1] != 'X') {
                        matriz[p1][p2]=' ';
                        matriz[p1][p2-1] = 'R';
                        }
                        else{ 
                            System.out.println("el robot no puede atravesar la barrera.");
                        }
                    }
                    else if (a=='r'||a=='R') {
                        if (matriz[p1][p2+1] != 'X') {
                        matriz[p1][p2]=' ';
                        matriz[p1][p2+1] = 'R';
                        }
                        
                        else{ 
                            System.out.println("el gusanito no puede atravesar la barrera.");
                        }
                    }
                    if (a=='g'||a=='G') {
                        if (matriz[p1-1][p2] != 'X') {
                            if (matriz[p1+1][p2] == 'C') {
                                cont = cont +1;
                                matriz[p1+1][p2] = ' ';
                            }
                        
                        else{
                            System.out.println("No hay Carga por recoger.");
                        }
                        }
                        else{ 
                            System.out.println("el Robot no puede atravesar la barrera.");
                        }
                    }
                       if (a=='s'||a=='s') {
                        if (matriz[p1+1][p2] == 'O'&& cont ==3) {
                            
                            System.out.println("HA GANADO");
                        }
                        else{
                            if(cont <3){
                            System.out.println("No hay cargas suficientes.");
                            }
                            else if (matriz[p1+1][p2] != 'D') {
                                System.out.println("No puede poner la carga aqui.");
                            }
                        }
                    }
                    for (int h = 0; h < matriz.length; h++) {
                        for (int b = 0; b < matriz[h].length; b++) {   
                            if (matriz[h][b]=='R') {
                                p1= h;
                                p2 = b;
                            }
                        }
                    }
                    
                } i = i+1; 
                System.out.println("");
                System.out.println("");
                imprimirM(matriz,0,0);
            }
       // }
        return matriz;
    }
public static char[][]LlenaTablero(int fila, int col){
        char [][]matrizt = new char [fila][col];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                //Obstaculos
                matrizt[2][3] = 'X';
                matrizt[5][4] = 'X';
                matrizt[2][1] = 'X';
                matrizt[3][6] = 'X';
                matrizt[4][5] = 'X';
                
                //Cajas
                matrizt[3][4] = 'C';
                matrizt[7][1] = 'C';
                matrizt[6][2] = 'C';
                matrizt[1][3] = 'C';
                matrizt[5][7] = 'C';
                matrizt[6][5] = 'C';
                
                matrizt[i][j] = ' ';
                
            }
        }
        return matrizt;
    }
      public static void ImprimeMatriz(char [][] matriz, int x, int y){
          System.out.println(x + ""+y);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == x && j == y) {
                    System.out.print("[R] ");
                }else{
                System.out.print("["+matriz[i][j]+"] ");
                }
            }
            System.out.println();
}
}
 public static char gir (int degrees,char or){
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
        
        
        return or;
     }
}
