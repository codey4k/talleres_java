/*
Dado un número entero, elaborar un programa 
que muestre su raíz cuadrada 
y el cuadrado de dicho número 
*/

import java.util.Scanner;

class Ejercicio6{
    
    public int raizCuadrada(int n) {
        int resultado = n * 1 / 2;
        return resultado;
    }
    
    public int cuadrado(int b,int e) {
        if(e == 0) {
            return 1;
        }
        else if(e == 1){
            return b;
        }
        else {
            return b * cuadrado(b,e-1);
        }
    }
    
    public void obtenerDatos() {
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Ingresa un entero ");
        int n = dato.nextInt();
        
        System.out.print(
            "La raiz cuadrada es " + raizCuadrada(n) + "\n"
            + "El cuadrado es " + cuadrado(n, 2) + "\n"
        );
    }
    
    public static void main(String[] args){
        Ejercicio6 entero = new Ejercicio6();
        
        entero.obtenerDatos();
    }
}