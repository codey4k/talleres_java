/*
Escriba un algoritmo que 
permita conocer el área de un triángulo 
a partir de la base y la altura. 
*/

import java.util.Scanner;

class Ejercicio3 {
    
    public int area(int base,int altura){
        int resultado = base * altura;
        return resultado;
    }
    
    public void obtenerDatos() {
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Dame la base ");
        int base = dato.nextInt();
        
        System.out.print("Dame la altura ");
        int altura = dato.nextInt();
        
        System.out.println("El area del triangulo es " + area(base,altura));
    }
    
    public static void main(String[] args) {
        Ejercicio3 triangulo = new Ejercicio3();
        
        triangulo.obtenerDatos();
    }
}
