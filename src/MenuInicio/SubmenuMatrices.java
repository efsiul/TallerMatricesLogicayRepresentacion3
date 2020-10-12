//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package MenuInicio;

import javax.swing.JOptionPane;
import matriz.listaligadaforma1.Operaciones;

public class SubmenuMatrices {
    public SubmenuMatrices() {
    }

    public void menuMatrices() {
        Operaciones objeto = new Operaciones();
        boolean bandera = true;
        boolean var3 = true;

        while(bandera) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("MENU MATRICES \n1 -> Ingrese los coeficientes de los polinomios \n2 -> Ingrese los exponenetes de cada termino de los polinomios \n3 -> Ingrese el valor  de  t \n4 -> Ver polinomio con resultado \n5 -> Volver al menú Principal \n"));
            switch(option) {
            case 1:
                int fil = Integer.parseInt(JOptionPane.showInputDialog("indque el número de polinomios que desea ingresar :"));
                objeto.MatrizDeCoeficientes(fil);
                objeto.ImprimirMatrizCoeficientes();
                break;
            case 2:
                objeto.arrayDeExponentes();
                objeto.ImprimirMatrizExponentes();
                break;
            case 3:
                objeto.ingresarValorT();
                objeto.ImprimirMatrizOperacion();
                break;
            case 4:
                objeto.MostarResultado();
                break;
            case 5:
                System.out.println("Volviendo al menú principal");
                bandera = false;
                break;
            default:
                System.out.println("Opción incorrecta, repite por favor");
            }
        }

    }
}
