/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuAplicacion;
import aplicacionMatrices.MarizListaLigada;
import polinomioRepresentadoVectorForma1.PolinomioRepresentadoVectorForma1;
import java.util.Scanner;
/**
 *
 * @author Luis Felipe Cadavid
 */
public class MenuAplicacion {
    private static Scanner sc;
    public static void main(String[] args){
            boolean bandera=false;
            sc = new Scanner(System.in);
            do{
                
                System.out.println(""
                        + "|***********************************MENU INICIO******************************************|"
                        + "|                                                                                        |"
                        + "| 1 -> Trabajo con Polinomíos                                                            |"
                        + "| 2 -> Trabajo con Matrices                                                              |"
                        + "| 3 -> Integrantes del proyecto                                                          |"
                        + "| 4 -> Salir del programa                                                                |"
                        + "|****************************************************************************************|");
                int option = sc.nextInt();
                switch (option)
                {   
                    
                    case 1:
                        //sentencia de polinomio
                    case 2:
                        //sentencia de Matrices
                    case 3:
                        System.out.println(""
                                + "Los integrantes son:"
                                + "Luis Felipe Cadavid"
                                + "Juan Carlos Gómez"
                                + "Cristian Julio"
                                + "Rodrigo Alonso Cardona");
                    case 4:
                        System.out.println("Saliendo....");
                        bandera=true;
                        break;
                    default:
                        System.out.println("Opción incorrecta, repite por favor");
                 }
                   
                        
                        
        }while(bandera);
        
        
    }
    
}
    

