/*
 * Copyright 2019 Carlos Alejandro Escobar Marulanda ealejandro101@gmail.com
 * Permission is hereby granted, free of charge, to any person 
 * obtaining a copy of this software and associated documentation 
 * files (the "Software"), to deal in the Software without 
 * restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or 
 * sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following 
 * conditions:
 * The above copyright notice and this permission notice shall 
 * be included in all copies or substantial portions of the 
 * Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *  WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package matriz.listaligadaforma1;

import javax.swing.JOptionPane;
import matriz.util.Tripleta;

/**
 *
 * @author Luis Felipe Cadavid
 */
public class Operaciones {
    public int[] exponente=new int[3];
    public int fila;
    public  MatrizEnListaLigadaForma1 matrizOperacion= new MatrizEnListaLigadaForma1(fila,3);

    //private static final MatrizEnListaLigadaForma1 matrizExponenteGeneral=new MatrizEnListaLigadaForma1(fila,3);
    
    
    public static MatrizEnListaLigadaForma1 MatrizDeCoeficientes( int fil){
        //fila=fil;
        MatrizEnListaLigadaForma1 matrizCoe= new MatrizEnListaLigadaForma1(fil,3);
        double valor;
        Tripleta t;
        for (int i=1; i<=fil;i++){
            for (int j=1; j<=3; j++){
            valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor para el polinomio "+i+" y coeficiente "+j+". \n"
                    +" teclee 9999 en caso de que no se ingrese más terminos"));
            if (valor==9999){
                i=fil+1;
                j=4;
                }
            t = new Tripleta(i, j, valor);
            matrizCoe.setCelda(t);
            }
        }
        return matrizCoe;
    }
    
    
    public int[] arrayDeExponentes(){
        
        for (int i=0; i<=2;i++){
            this.exponente[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del exponente para la variable t del termino "+i));
        }
        return this.exponente;
    }
        
    public MatrizEnListaLigadaForma1 matrizOperacion(){
        Tripleta t;
        double valor;
        valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de la variable t"));

        for (int i=1; i<=3;i++){
            for (int j=1; j<=fila; j++){
                double resultado;
                switch (j){
                    case 1:
                       resultado=Math.pow(valor, this.exponente[0]);
                       t = new Tripleta(i, j, resultado);
                       matrizOperacion.setCelda(t);
                       break;
                    case 2:
                        resultado=Math.pow(valor, this.exponente[1]);
                        t = new Tripleta(i, j,resultado );
                        matrizOperacion.setCelda(t);
                        break;
                    case 3:
                        resultado=Math.pow(valor, this.exponente[2]);
                        t = new Tripleta( i, j, resultado);
                        break;
                }
            }
        }
            
      
        return this.matrizOperacion;
    }
/*
    public static MatrizEnListaLigadaForma1 matrizOperacion(){
        double valor;
        double termino=1;
        int expo;
        Tripleta t;
        valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de la variable t"));
        MatrizEnListaLigadaForma1 matrizOperacion= new MatrizEnListaLigadaForma1(fila,3);
        for (int i=1; i<=fila;i++){
            for (int j=1; j<=3;j++){
                expo=matrizOperacion.getCelda(i, j);

                for (int k=1; k<=expo;k++){
                    termino=termino*valor;
                }
                t=new Tripleta(i,j,termino);
                matrizOperacion.setCelda(t);
            }   
            
        }
    return matrizOperacion;
    }
  
 */   
    
    public  void ImprimirMatrizCoeficientes(int fil){
        
        System.out.println("Matriz de Coeficientes \n"+MatrizDeCoeficientes(fil));
    }    
    
    public  void ImprimirMatrizExponentes(){
        int[] array=arrayDeExponentes();
        for(int i=0; i<=2; i++){
            System.out.println("Array de Exponentes \n"+ array[i]);
        }
        
    }
   
    

    public  void ImprimirMatrizOperacion(){
        
        System.out.println("Matriz de Operaciones \n"+matrizOperacion());
   }
   
}
