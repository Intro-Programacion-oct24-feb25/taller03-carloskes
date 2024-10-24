/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio007;

/**
 *
 * @author utpl
 */
public class Ejercicio007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor1 = ((Math.sqrt(81) + 9)/3);
        boolean valor2 = valor1 == 9;
        boolean valor3 = valor2 || 10 < 1;
        boolean valor4 = (100/25) <= Math.sqrt(100);
        boolean valor5 = valor2 || valor3;
        boolean valor6 = valor2 || valor3 && valor4;
       
                
        
        System.out.println(valor6);
        
        
        // TODO code application logic here
    }
    
}
