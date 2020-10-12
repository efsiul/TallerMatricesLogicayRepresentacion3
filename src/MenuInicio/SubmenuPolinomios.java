/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuInicio;

import javax.swing.JOptionPane;
import practicapolinomio20201.PracticaPolinomio20201;


/**
 *
 * @author Luis Felipe Cadavid
 */
public class SubmenuPolinomios {
    
    public SubmenuPolinomios(){
        
    }
    
    public void menuPolinomios() {
            PracticaPolinomio20201 objeto = new PracticaPolinomio20201();
            String optionSelect = "";
            while(!"7".equals(optionSelect)) {
                optionSelect = objeto.applicationMenu();
                 switch (optionSelect)
                {
                 case "1":
                     objeto.addNewPolinomio();
                     break;
                 case "2":
                    objeto.showPolinomio();
                    break;
                 case "3":
                    objeto.showPolinomioByIndex();
                 break;
                 case "4":
                    objeto.multiplicarPolinomioAB();
                break;
                 case "5":
                     objeto.derivarPolinomio();
                 break;
                 case "6":
                     objeto.evaluarPolinomio();
                break;
                 case "7":
                break;
                 default:
                     JOptionPane.showMessageDialog(null,"La opción ingresada no es valida");

               break;
                } 
            } 
    
    }   
}
