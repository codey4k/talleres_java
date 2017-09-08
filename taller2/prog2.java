/*
Una frutería ofrece las manzanas con descuento según la siguiente tabla:
No. de manzanas compradas   % descuento
0 – 2                   0%
3 – 10                  10%
Más de 10               15%
Determinar cuánto pagará una persona que compre manzanas en esa frutería
*/
import java.util.Scanner;

class Ejercicio2 {
    


    public void calculo(){
        Scanner dato = new Scanner(System.in);
        int descuento, total, manzanas;     

        System.out.print("Cuanto cuestan las manzanas ");
        int valor = dato.nextInt();        

        System.out.print("Cuantos clientes hay? ");
        int clientes = dato.nextInt();


        for(int i = 0; i < clientes; i++){
            System.out.print("Cuantas manzanas compra cliente? " +
                (i+1)+" "
            );
            manzanas = dato.nextInt();

            int calculo = manzanas * valor;
            
            if(manzanas > 10){
                descuento = (calculo * 15) / 100;
            }
            else if(manzanas >= 3 && manzanas <= 10){
                descuento = (calculo * 10) / 100;
            }
            else {
                descuento = 0;
            }
            
            total = calculo - descuento;
            System.out.println("Cliente "+(i+1)+" Debe pagar "+total);
        }
    }

    public static void main(String[] args) {
        Ejercicio2 e = new Ejercicio2();
        e.calculo();
    }

}
