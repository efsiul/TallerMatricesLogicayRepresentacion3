/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuInicio;

import javax.swing.JOptionPane;
import matriz.listaligadaforma1.Operaciones;

/**
 *
 * @author Luis Felipe Cadavid
 */
public class SubmenuMatrices {
    
    
    public void menuMatrices(){
        
    Operaciones objeto = new Operaciones();
    boolean bandera = true;
    int option=-1;
            
    
    while(bandera==true){
        option = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU MATRICES \n"
                + "1 -> Ingrese los coeficientes de los polinomios \n"
                + "2 -> Ingrese los exponenetes de cada termino de los polinomios \n"
                + "3 -> Ingrese el valor  de  t \n"
                + "4 -> Volver al menú Principal \n"));
        //JOptionPane.showMessageDialog(null, "Hello " + name);

            switch (option)
            {   

            case 1:
                
                int fil = Integer.parseInt(JOptionPane.showInputDialog("indque el número de polinomios que desea ingresar :"));
                objeto.ImprimirMatrizCoeficientes(fil);
                break;
            case 2:
                objeto.ImprimirMatrizExponentes();
                break;

            case 3:
                objeto.ImprimirMatrizOperacion();
                break;
            case 4:
                System.out.println("Volviendo al menú principal");
                bandera=false;
                break;
            default:
                System.out.println("Opción incorrecta, repite por favor");
            }
        }
    }
   
}
