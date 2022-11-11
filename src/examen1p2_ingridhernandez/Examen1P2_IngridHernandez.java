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
ArrayList<Robot> rob = new ArrayList();
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
     public static int idGenerator() {
        Random rnd = new Random();
        int id = rnd.nextInt(1000);
        boolean centinela = false;
        while (centinela == true) {
            int cont = 0;
            DefaultComboBoxModel lista = a.getListaJugadores();
            for (int i = 0; i < lista.getSize(); i++) {
                if (lista.getElementAt(i) instanceof Robot jugadores) {
                    if (jugadores.getID() == id) {
                        cont++;
                    }
                }
            }
            if (cont > 0) {
                id = rnd.nextInt();
            } else {
                centinela = true;
            }
        }
        return id;
    }
}
