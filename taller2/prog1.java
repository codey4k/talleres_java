/*Un almacén de escritorios hace los siguientes descuentos:
si el cliente compra menos de X unidades se le da un descuento
del Y% sobre la compra;
si el número de unidades es mayor o igual a X pero menos de Z
se le otorga un 2Y% y
si son z o más se le da un 4Y%.
Hacer un algoritmo que determine cuánto debe pagar un cliente
si el valor de cadaescritorio es de $A.*/

import java.util.Scanner;

class Ejercicio1{

    static final int A = 1000000;
    static final int X = 5;
    static final int Y = 8;
    static final int Z = 10;

    public static void procesos(){
        Scanner dato = new Scanner(System.in);

        int descuento = 0;
        
        System.out.print("Cuantos clientes se atenderan? ");
        int n = dato.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.print("Cuantas unidades compra el cliente "+(i+1)+" ");
            int unidades = dato.nextInt();

            int calculo = unidades * A;
            
            if(unidades < X){
                descuento = calculo * Y / 100;
            }
            else if(unidades >= X && unidades < Z){
                descuento = (calculo * Y / 100) * 2;
            }
            else if(unidades >= Z){
                descuento = (calculo * Y / 100) * 4;
            }
            

            double total = calculo - descuento;
            System.out.println(total);
        }

    }

    public static void main(String[] args){
       Ejercicio1 e = new Ejercicio1();
       e.procesos();
    }
}
