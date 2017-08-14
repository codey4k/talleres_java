/*
Leer dos números enteros, almacenarlos en dos variables 
e intercambiar el contenido de ambas variables 
sin utilizar otra variable auxiliar. 
*/

import java.util.Scanner;

class Ejercicio22 {
    
    public void cambiarValor() {
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Ingrese primer dato ");
        int n1 = dato.nextInt();
        
        System.out.print("Ingrese segundo dato ");
        int n2 = dato.nextInt();
        
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        
        System.out.print(
            "El primer dato ahora vale " + n1 + "\n"
            + "El segundo dato ahora vale "  + n2
            + "\n"
        );
        
    }
    
    public static void main(String[] args) {
        Ejercicio22 e = new Ejercicio22();
        e.cambiarValor();
    }
    
}