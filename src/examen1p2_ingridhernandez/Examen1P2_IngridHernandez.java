/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p2_ingridhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Examen1P2_IngridHernandez {
static Scanner lea = new Scanner(System.in);
static ArrayList<Robot> rob = new ArrayList();
Robot t = new Robot();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
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
                    int id=221;
                    System.out.println("Ingrese la Posicion de X: ");
                    int x = lea.nextInt();
                    System.out.println("Ingrese la Posicion de Y: ");
                    int y = lea.nextInt();
                    boolean var = false;
                    System.out.println("Ingrese el Ano de Fabricacion: ");
                    String ano=lea.next();
                    boolean cent = true;
                   while(cent == true){
                       System.out.println("========Tipo de Robot=============");
                       System.out.println("1)Andride");
                       System.out.println("2)Manos Roboticas");
                       System.out.println("3)Robot Agil");
                       System.out.println("4)Robot Pesado");
                       System.out.println("5)Salir");
                      System.out.println("==================================");
                       System.out.print("Ingrese la opcion que Robot: ");
                       int op= lea.nextInt();
                       switch (op) {
                           case 1: {
                               
                               System.out.println("Ingrese la altura del Robot: ");
                               int al = lea.nextInt();
                               System.out.println("Ingrese el peso del Robot: ");
                               int pe = lea.nextInt();
                               rob.add(new Androide(al,pe,id,x,y,var,ano));
                                System.out.println("Se agrego unas robot androide");
                           }//fin del case 1
                           break;
                           case 2: {
                               System.out.println("Ingrese Numero de Servo motores: ");
                               int num=lea.nextInt();
                               rob.add(new Manos_Roboticas(num,id,x,y,var,ano));
                               System.out.println("Se agrego unas manos Roboticas");
                           }//fin del case 2
                           break;
                           case 3: {
                               System.out.println("Ingrese la Cantidad de llantas: ");
                               int cant=lea.nextInt();
                               System.out.println("Ingrese la velocidad del Robot: ");
                               int vel = lea.nextInt();
                               rob.add(new Robot_Agil(cant,vel,id,x,y,var,ano));
                               System.out.println("Se agrego un robot Agil");
                           }//fin del case 3
                           break;
                           case 4: {
                               System.out.println("Ingrese el peso del Robot: ");
                               int p = lea.nextInt();
                               System.out.println("Ingrese la capacidad maxima: ");
                               int cap = lea.nextInt();
                               rob.add(new Robot_Pesado(p,cap,id,x,y,var,ano));
                               System.out.println("Se agrego un Robot Pesado");
                           }//fin del case 4
                           break;

                            case 5:
                                cent = false;
                                break;
                            default:
                                System.out.println("No existe Otro Robot");
                        }//fin del switch interno
                    }//fin del while interno
                    System.out.println("Ya se agrego robot ");
                }//fin del case 1
                break;
                case 2:{
                    
                }//fin del case 2
                break;
                case 3:{
                    
                }//fin del case 3
                break;
                case 4:{
                    
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
//     public static int idGenerator() {
//        Random rnd = new Random();
//        int id = rnd.nextInt(1000);
//        boolean centinela = false;
//        while (centinela == true) {
//            int cont = 0;
//            
//            //DefaultComboBoxModel lista = a.getListaJugadores();
//            for (int i = 0; i < lista.getSize(); i++) {
//                if (lista.getElementAt(i) instanceof Robot ro) {
//                    if (ro.getID() == id) {
//                        cont++;
//                    }
//                }
//            }
//            if (cont > 0) {
//                id = rnd.nextInt();
//            } else {
//                centinela = true;
//            }
//        }
//        return id;
//    }
}
