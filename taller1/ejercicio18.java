/*
Preste $500.000 y pague $ 570.000 
Cuanto interés me cobraron. 
*/
import java.util.Scanner;

class Ejercicio18{
    
    public final int PRESTAMO = 500000;
    public final int INTERES = 570000;
    
    
    public void calculo() {
        
        System.out.println(
            "Si le prestan $" + PRESTAMO
            + " y pago $" + INTERES + "\n"
            + "Le cobraron $" + (INTERES - PRESTAMO)
            + " de interes."
        );
    }
    
    public static void main(String[] args){
        Ejercicio18 e = new Ejercicio18();
        e.calculo();
    }
}