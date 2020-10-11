/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuInicio;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Felipe Cadavid
 */
public class menuInicio {
        int f=0, c = 3;
        SubmenuMatrices menuMat = new SubmenuMatrices();

	public static void main(String[] args) {
            int option=-1;

            boolean bandera = true;
            while(bandera ==true)  {
    
		option = Integer.parseInt(JOptionPane.showInputDialog(
                        "MENU \n"
                        + "1 -> Trabajemos con Polinomíos \n"
                        + "2 -> Trabajemos con Matrices  \n"
                        + "3 -> Integrantes del proyecto \n"
                        + "4 -> Salir \n"));
		//JOptionPane.showMessageDialog(null, "Hello " + name);
                
                switch (option)
                {   
                    
                    case 1:
                        //sentencia de polinomio
                        break;
                    case 2:
                        
                        //menuMat.menuMatrices();
                        
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null,"\n"
                                + "Los integrantes son:\n"
                                + "Luis Felipe Cadavid\n"
                                + "Juan Carlos Gómez\n"
                                + "Cristian Julio\n"
                                + "Rodrigo Alonso Cardona\n");
                        break;
                    case 4:
                        System.out.println("Saliendo....");
                        bandera=false;
                        break;
                    default:
                        System.out.println("Opción incorrecta, repite por favor");
                 }
        }
                   
                
                
    }

}
