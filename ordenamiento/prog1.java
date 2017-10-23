/*
Entrar por pantalla 6 numeros enteros
una vez creado el vector ordenarlo de menor a mayor
por el metodo burbuja. Mostrar dicho vector.
*/

import java.util.Scanner;

class prog1{  
    
    public void programa(){
        Scanner dato = new Scanner(System.in);
        
        int aux;
        int[] array = new int[6];
        
        
        for(int i = 0; i < 6; i++){
            System.out.print("Ingresa digito "+ (i+1) + " ");
            array[i] = dato.nextInt();
        }


        for(int i = 0; i < 6; i++){
           // int  = array[i];
            for(int x = (i + 1); x < 6; x++){
                if(array[i] > array[x]){
                    aux = array[x];
                    array[x] = array[i];
                    array[i] = aux;
                }
            }
        }
        
        System.out.println("El array ordenado es: ");

        for(int i = 0; i < 6; i++){
            System.out.println(array[i]);
        }


    }

    public static void main(String[] args){
        prog1 e = new prog1();
        e.programa();
    }
}
