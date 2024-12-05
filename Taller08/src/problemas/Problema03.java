/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 5;

        for (int i = 1; i <= contador; i++) {
            for (int variable = 1; variable <= i; variable++) {
                System.out.print("*");
            }
              System.out.println();
        }
        
        for (int i = contador - 1; i >= 1; i--) {
            for (int variable = 1; variable <= i; variable++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
