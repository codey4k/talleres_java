/*
 CREAR un vector con varios números enteros. LEER UN NUMERO, averiguar si el numero esta, 
 borrarlo todas las veces que está en el vector. Mostrar el vector resultante
*/

import java.util.Scanner;

class p {

    private static int tam;
    private static int vector[] = new int[tam];

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int elimina, i;

        System.out.print("Ingrese el tamaño del vector: ");
        tam = dato.nextInt();

        int vector[] = new int[tam];

        for(i = 0; i < tam; i++){
            System.out.print("Ingrese un numero: ");
            vector[i] = dato.nextInt();
        }

        System.out.print("Ingrese un numero que desea eliminar: ");
        elimina = dato.nextInt();

        eliminar(elimina, i);//30
    }

    public static void eliminar(int elimina, int i) {
        int eliminados = 0;

        for(i = 0; i < tam; i++){
            if(vector[i] == elimina){//37
                for(int j = i; j < tam - 1; j++){
                    vector[j] = vector[j+1];
                }
            }
            eliminados += 1;
            // i -= 1;
            tam -= 1;
        }
    }
    
        System.out.print(
            "Se elimino " + eliminados + " veces el numero " + elimina
        );
    
        for(int j = 0; j < tam; j++){
            System.out.print(vector[j]);
        }
    }
    
}
