/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma1;
        int suma2;
        int suma3;
        String cadena = "";
        
        for (int i = 30; i >= 10; i--) {
            
            suma1 = i + i;
            suma2 = suma1 + i;
            suma3 = suma2 + i;
            
            cadena = String.format("%s%d-%d-%d-%d\n", cadena, i, suma1, suma2, suma3);
        }
        System.out.printf("%s",cadena);
    }
            
            
}
    
    

