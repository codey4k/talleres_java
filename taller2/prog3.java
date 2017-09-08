/*
Determinar el precio de un pasaje de ida y vuelta por avión, 
si se sabe la distancia a recorrer, el número de días de 
estancia y sabiendo que, si la distancia es superior a 1.000 km, 
y el número de días de estancia es superior a 7, 
la línea aérea le hace un descuento del 30%. 
El precio por kilómetro es de $100.
*/
import java.util.Scanner;

class ejercicio3{

    public static void procesos(){
        Scanner dato = new Scanner(System.in);
        int dias;
        double dist, precio, total;
        double desc = 0;

        System.out.print("Ingrese la camtidad de usuarios: ");
        int n = dato.nextInt();

        for(int i = 0; i < n; i++){

             System.out.print("Ingrese la distancia que va a recorrer: ");
             dist = dato.nextInt();

             System.out.print("Ingrese los dias de estadia: ");
             dias = dato.nextInt();
        
             double calculo = dist * 100  * 2;

             if((dist > 1000) && (dias > 7)){
                desc = calculo * 30 / 100;
            }
            else{
                desc = 0;
            }

            total = calculo - desc;
            System.out.println(total);
        
        }
        

        
    }

    public static void main(String[] args){
        procesos();
    }

}
