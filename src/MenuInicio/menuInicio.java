//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package MenuInicio;
import java.awt.Component;
import javax.swing.JOptionPane;
import static practicapolinomio20201.PracticaPolinomio20201.applicationMenu;

public class menuInicio {
    int f = 0;
    int c = 3;

    public menuInicio() {
    }

    public static void main(String[] args) {
        int option;
        SubmenuMatrices menuMat = new SubmenuMatrices();
        boolean bandera = true;

        while(bandera) {
            option = Integer.parseInt(JOptionPane.showInputDialog("MENU \n1 -> Trabajemos con Polinomíos \n2 -> Trabajemos con Matrices  \n3 -> Integrantes del proyecto \n4 -> Salir \n"));
            switch(option) {
            case 1:
                applicationMenu();
                break;
            case 2:
                menuMat.menuMatrices();
                break;
            case 3:
                JOptionPane.showMessageDialog((Component)null, "\nLos integrantes son:\nLuis Felipe Cadavid\nJuan Carlos Gómez\nCristian Julio\nRodrigo Alonso Cardona\n");
                break;
            case 4:
                System.out.println("Saliendo....");
                bandera = false;
                break;
            default:
                System.out.println("Opción incorrecta, repite por favor");
            }
        }

    }
}
