
package practica4;
import java.util.Scanner;

public class Practica4 {

 
    public static void main(String[] args) {
     Scanner Practica4 = new Scanner (System.in);
     
        System.out.println(" Ingresa una cantidad en pesos ");
         int cantidad = Practica4.nextInt ();
             
         Practica4.nextLine();
         
         double dolar = (cantidad / 17.13);
         double euro = (cantidad / 18.29);
        
         System.out.println(" Conversion a dolares: " + dolar ) ;
        System.out.println(" Conversion a euro: " + euro );
        
            
    }
    
}
