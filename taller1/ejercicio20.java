/*
Dado un número natural de dos cifras, 
diseñe un algoritmo que permita mostrar el número invertido. 
Ejemplo si se ingresa 23 que se muestre 32
*/

import java.util.Scanner;

class Ejercicio20{
    
    public int invertir(int n) {
        //convierte entero en string
        String cadena = String.valueOf(n);
        //se crea un arreglo de caracteres a partir de la cadena
        char[] caracter = cadena.toCharArray();
        String newString = "";
        
        for(int i = caracter.length-1; i >= 0; i--){
            newString += caracter[i];
        }
        
        //convierte cadena devuelta a entero
        int valor = Integer.parseInt(newString); 
        return valor;
    }
    
    public void programa() {
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Ingresa entero de dos cifras ");
        int num = dato.nextInt();
        
        System.out.println(
            num + " invertido seria "
            + invertir(num) + " !" 
        );
    }
    
    public static void main(String[] args) {
        Ejercicio20 e = new Ejercicio20();
        e.programa();   
    }
}