/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double farenheit;
        double celcius;
        int i = 0;
        
        for (farenheit = 20; farenheit <= 100; farenheit +=4){
            celcius = (5./9.)*(farenheit-32);
            
            System.out.printf("Operacion(%d) Farenheit: %.2f ===> Celcius: %.2f\n",
                    i, farenheit, celcius);
            
            i++;
        }
   
    }
    
}
