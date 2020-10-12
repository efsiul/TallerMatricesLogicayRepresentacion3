//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package matriz.listaligadaforma1;

import javax.swing.JOptionPane;
import matriz.util.Tripleta;

public class Operaciones {
    public int[] exponente = new int[3];
    public int t;
    public int[] resultados;
    public MatrizEnListaLigadaForma1 matrizCoe;

    public Operaciones() {
    }

    public void MatrizDeCoeficientes(int fil) {
        this.matrizCoe = new MatrizEnListaLigadaForma1(fil, 3);

        for(int i = 1; i <= fil; ++i) {
            for(int j = 1; j <= 3; ++j) {
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para el polinomio " + i + " y coeficiente " + j + ". \n teclee 9999 en caso de que no se ingrese más terminos"));
                if (valor == 9999) {
                    i = fil + 1;
                    j = 4;
                }

                Tripleta tr = new Tripleta(i, j, valor);
                this.matrizCoe.setCelda(tr);
            }
        }

    }

    public void arrayDeExponentes() {
        for(int i = 0; i <= 2; ++i) {
            this.exponente[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del exponente para la variable t del termino " + i));
        }

    }

    public void ingresarValorT() {
        this.t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de la variable t"));
    }

    public void ImprimirMatrizCoeficientes() {
        System.out.println("Matriz de Coeficientes \n" + this.matrizCoe);
    }

    public void ImprimirMatrizExponentes() {
        System.out.println("Matriz de exponentes \n");
        int[] var1 = this.exponente;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int valor = var1[var3];
            System.out.println(valor + " ");
        }

    }

    public void ImprimirMatrizOperacion() {
        System.out.println("Matriz Operacion: ");

        for(int filas = 1; filas <= this.matrizCoe.getFilas(); ++filas) {
            int contador = 0;

            for(int columnas = 1; columnas <= this.matrizCoe.getColumnas(); ++columnas) {
                ++contador;
                if (contador == 3) {
                    System.out.println(this.matrizCoe.getCelda(filas, columnas) + "(" + this.t + ")^" + this.exponente[columnas - 1]);
                } else {
                    System.out.print(this.matrizCoe.getCelda(filas, columnas) + "(" + this.t + ")^" + this.exponente[columnas - 1] + " +");
                }
            }
        }

    }

    public void MostarResultado() {
        this.resultados = new int[this.matrizCoe.getFilas()];
        System.out.println("Resultados de la  Operacion: ");

        int filas;
        int contador;
        for(filas = 1; filas <= this.matrizCoe.getFilas(); ++filas) {
            this.resultados[filas - 1] = 0;

            for(contador = 1; contador <= this.matrizCoe.getColumnas(); ++contador) {
                int[] var10000 = this.resultados;
                var10000[filas - 1] = (int)((double)var10000[filas - 1] + (double)this.matrizCoe.getCelda(filas, contador) * Math.pow((double)this.t, (double)this.exponente[contador - 1]));
            }
        }

        for(filas = 1; filas <= this.matrizCoe.getFilas(); ++filas) {
            contador = 0;

            for(int columnas = 1; columnas <= this.matrizCoe.getColumnas(); ++columnas) {
                ++contador;
                if (contador == 3) {
                    System.out.println(this.matrizCoe.getCelda(filas, columnas) + "(" + this.t + ")^" + this.exponente[columnas - 1] + " = " + this.resultados[filas - 1]);
                } else {
                    System.out.print(this.matrizCoe.getCelda(filas, columnas) + "(" + this.t + ")^" + this.exponente[columnas - 1] + " +");
                }
            }
        }

    }
}
