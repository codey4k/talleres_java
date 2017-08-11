/*
Realice un algoritmo que capturados dos valores por pantalla 
encuentre: La suma, la diferencia y producto de ambos números
*/

import java.util.Scanner;

class Ejercicio4 {
    
    public int suma(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }
    
    public int diferencia(int n1, int n2){
        int resultado = n1 - n2;
        return resultado;
    }
    
    public int producto(int n1, int n2){
        int resultado = n1 * n2;
        return resultado;
    }
    
    public void obtenerDatos() {
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Primer numero ");
        int n1 = dato.nextInt();
        
        System.out.print("Segundo numero ");
        int n2 = dato.nextInt();
        
        System.out.println(
            "La suma de tus numero es " + suma(n1,n2) + "\n"
            + "La diferencia es " + diferencia(n1,n2) + "\n"
            + "El producto es " + producto(n1,n2) + "\n"
        );
    }
    
    public static void main(String[] args) {
        Ejercicio4 obj = new Ejercicio4();
        obj.obtenerDatos();
    }
    
}