/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapolinomio20201;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class PracticaPolinomio20201 {

    private static PolinomioVectorF1[] arreglos = new PolinomioVectorF1[10];
    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        

        
    //}
    
    
    /*
    Método para derivar un polinomio seleccionado desde el menú principal.
    Primero el usuario seleccionará un polinomio almacenado en memoria, luego el sistema arrojará el resultado final*/
    public  void derivarPolinomio(){
        
        String indice=String.format(JOptionPane.showInputDialog("Por favor ingrese el numero del polinomio que desea derivar"));
        
        
        PolinomioVectorF1 arreglo = arreglos[Integer.parseInt(indice) - 1];
        JOptionPane.showMessageDialog(null,"El resultado de derivar es " + arreglo.Derivar());
    }
    
        /*Método que pide al usuario por teclado seleccionar 2 polinomios en memoria  y luego multiplicarlos.
    Se evaluan los grados del polinomio A y el Polinomio B, para saber cual es el menor y el mayor, y así conformar
    Un polinomio C resultado*/

    public  void multiplicarPolinomioAB() {
        
        String indiceA=String.format(JOptionPane.showInputDialog("Por favor ingrese el numero del polinomio A"));

        
        PolinomioVectorF1 arregloA = arreglos[Integer.parseInt(indiceA) - 1];
        String indiceB=String.format(JOptionPane.showInputDialog("Por favor ingrese el numero del polinomio B"));
        
        PolinomioVectorF1 arregloB = arreglos[Integer.parseInt(indiceB) - 1];
        int[] arregloAOperarMayor = arregloA.getArreglo();
        int[] arregloAOperarMenor = arregloB.getArreglo();
        try {
            Integer Grado = 0;
            Integer GradoMenor = 0;
            if(arregloA.getGrado() > arregloB.getGrado()) {
                Grado = arregloA.getGrado();
                GradoMenor = arregloB.getGrado();
            } 
            
            if(arregloA.getGrado() < arregloB.getGrado()) {
                Grado = arregloB.getGrado();
                GradoMenor = arregloA.getGrado();
                arregloAOperarMayor = arregloB.getArreglo();
                arregloAOperarMenor = arregloA.getArreglo();
            }
            
            if(arregloA.getGrado() == arregloB.getGrado()) {
                Grado = arregloB.getGrado() + arregloA.getGrado();
                GradoMenor = arregloB.getGrado() + arregloA.getGrado();
            }                       
            
            PolinomioVectorF1 polinomioC = new PolinomioVectorF1(Grado);
            Integer p = 1;
            if(!Grado.equals(GradoMenor)) {
                Integer diferencia = Grado - GradoMenor;
                for(p = 1; p < diferencia; p++) {
                    polinomioC.ingresar(arregloAOperarMayor[p], Grado - p);
                }                 
                Grado = Grado - p;
            }
            

            Integer GradoMayorVector = arregloAOperarMayor[0];
            Integer GradoMenorVector = arregloAOperarMenor[0];
            for (int j = p; j <= arregloAOperarMayor.length - 1; j++) {
                GradoMenorVector = arregloAOperarMenor[0];
                for(int i = 1; i <= arregloAOperarMenor.length - 1; i++) {
                    Integer coeficiente = arregloAOperarMayor[j] * arregloAOperarMenor[i];
                    Integer NuevoGrado = GradoMayorVector + GradoMenorVector;
                    int[] arrayPolinomioC = polinomioC.getArreglo();
                    int pos = polinomioC.getGrado() - NuevoGrado + 1;
                    polinomioC.ingresar(arrayPolinomioC[pos] + coeficiente , NuevoGrado);   
                    GradoMenorVector = GradoMenorVector -1;
                }
                GradoMayorVector = GradoMayorVector -1;
            }
            
            
            
            JOptionPane.showMessageDialog(null,"El resultado de la operacion de multiplicacion es " + polinomioC.toString());
            
        }catch(Exception e) {
            //System.out.println("Ocurrío un error en el metodo Multiplicar polinomio");
            JOptionPane.showMessageDialog(null,"Ocurrío un error en el metodo Multiplicar polinomio ");
        }
        
                
    }
    
    /*
    Método que permite seleccionar y visualizar un polinmio almacenado en memoria
    */
    public  void showPolinomioByIndex() {
         
         String indice=String.format(JOptionPane.showInputDialog("Por favor ingrese el numero del polinomio que desea ver (entre 1 y 10)"));
         PolinomioVectorF1 arreglo = arreglos[Integer.parseInt(indice) - 1];
                
         JOptionPane.showMessageDialog(null, "El polinomio es:   " + arreglo.toString());
    }
    
    /*
    Método que muestra todos los polinomios almacenados en memoria
    */
    public  void showPolinomio(){
        for(int i = 0; i < arreglos.length; i++) {
            if(arreglos[i] != null) {
            PolinomioVectorF1 arreglo = arreglos[i];
                
                
                //System.out.println("Este es el polinomio numero  " + (i+1) + ":" + arreglo.toString());
                JOptionPane.showMessageDialog(null,"Este es el polinomio numero " + (i+1) + ":  " + arreglo.toString());

            }
        }
    }
    
    /*
    En éste método se le pide al usuario que seleccione un polinomio a evaluar
    y luego que ingrese un número para que la operación se haga efectica
    */
    public  void evaluarPolinomio() {
        
        String numeroPolinomio=String.format(JOptionPane.showInputDialog("Ingrese el numero del polinomio para evaluar: "));
        String numeroEvaluar=String.format(JOptionPane.showInputDialog("Ingrese el numero con el que desea evaluar el polinomio:  "));
        
        
        PolinomioVectorF1 polinomio = arreglos[Integer.parseInt(numeroPolinomio)-1];
        
        
        JOptionPane.showMessageDialog(null,"El resultado de evaluar el polinomio es : " + String.valueOf(polinomio.evaluarPolinomio(Integer.parseInt(numeroEvaluar))));
    }
    
    /*
    En este Método el usuario va ingresando los 10 polinomios uno a uno
    Los poliinomios se deben ingrear de manera descendente, sino existirá un error.
    Cada monomio está conformado por un coefienciete, una x y un exponente.
    Ejemplo: 3x^2-6x-3
    */
    public  void addNewPolinomio() { 
        for(int i = 0; i <= 9 ; i++ ) {
            String polinomio=String.format(JOptionPane.showInputDialog("Recuerde ingresar cada polinomio de forma descendente\n. Ejemplo:3X2+3x-2\n"
                    + "Ingrese el polinomio numero:  " + (i+1)));
            
            
            char[] polinomioChar = polinomio.toCharArray();
            PolinomioVectorF1 polinomioAIngresar = new PolinomioVectorF1();
            
            for(int j = 0; j <= polinomioChar.length; j++) { 
             if(polinomioChar[j] == 'x') { 
                 if(Character.isDigit(polinomioChar[j+1])){
                 polinomioAIngresar = new PolinomioVectorF1(Integer.parseInt(String.valueOf(polinomioChar[j+ 1])));
                 } else {
                 polinomioAIngresar = new PolinomioVectorF1(1);
                 }
              j = polinomioChar.length + 1;
             }
            }
            
            for(int j = 0; j <= polinomioChar.length - 1; j++) {
                if(polinomioChar[j] == 'x') {
                    String coeficiente = "";
                    for(int k =j; k >= 1; k--) {
                        if(Character.isDigit(polinomioChar[k-1])) {
                            coeficiente = polinomioChar[k-1] + coeficiente;
                        } else {
                            coeficiente = polinomioChar[k-1] + coeficiente;
                            k = 0;
                        }
                    }
                    String exponente = String.valueOf(polinomioChar[j+1]);
                    if(coeficiente.equals("+") || coeficiente.equals("-")) {
                        coeficiente = coeficiente + "1";
                    }
                    
                    if(exponente.equals("+") || exponente.equals("-")) {
                        exponente = exponente + "1";
                    }
                    polinomioAIngresar.ingresar(Integer.parseInt(coeficiente), Integer.parseInt(exponente));
                }
                
                if(j == polinomioChar.length - 1) {
                     String coeficiente = String.valueOf(polinomioChar[j-1]) + String.valueOf(polinomioChar[j]);
                     polinomioAIngresar.ingresar(Integer.parseInt(coeficiente), 0);
                }
            }
            arreglos[i] = polinomioAIngresar;
        }
    }
    
    public  String applicationMenu() {
        
        String text = String.format(JOptionPane.showInputDialog(null, "Operando con Polinomios \n\n" +
                "1. Ingresar 10 polinomios\n"+
                "2. Mostrar todos los polinomios en pantalla\n"+
                "3. Mostrar polinomio en pantalla por número\n"+
                "4. Multiplicar polinomio A y B con un nuyevo resultado C\n"+
                "5. Derivar el polinomio, ingresando el numero del polinomio\n"+
                "6. Evaluar polinomio ingresando el valor de X y el numeor del polinomio\n"+
                "7. Volver al Menu Principal \n",JOptionPane.QUESTION_MESSAGE));
        
        return text;
    }
    
}
