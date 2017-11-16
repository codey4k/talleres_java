/*
 CREAR un vector con varios números enteros. LEER UN NUMERO, averiguar si el numero esta, 
 borrarlo todas las veces que está en el vector. Mostrar el vector resultante
*/

import java.util.Scanner;

class Eliminador {

    private static int tam, elimina;
    
    private static int vector[];

    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
            
        System.out.print("Ingrese el tamaño del vector: ");
        tam = dato.nextInt();
        vector[] = new int[tam] 

        for(int i = 0; i < tam; i++){
            System.out.print("Ingrese un numero: ");
            vector[i] = dato.nextInt();
        }

        System.out.print("Ingrese un numero que desea eliminar: ");
        elimina = dato.nextInt();
    }


    public static void eliminarEl(int elimina) {
        int eliminados = 0;

        for(int i = 0; i < tam; i++){
            if(vector[i] == elimina){//37
                for(int j = i; j < tam - 1; j++){
                    vector[j] = vector[i+1];
                }
            }
            eliminados += 1;
            i -= 1;
            tam -= 1;
        }
        
        mostrar(eliminados);
    }//fin de metodo
       
    public static void mostrar(int eliminados){
        System.out.println(
            "Se elimino " + eliminados + " veces el numero" + elimina
        );
        
        for(int i = 0; i < tam; i++){
            System.out.println(vector[i]);
        }
    }// fin del metodo

}
