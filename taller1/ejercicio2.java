/*
Hacer un algoritmo  que pida que se ingresen 2 números 
para sumarlos y un número por el cual se desea 
dividir dicha suma
*/
import java.util.Scanner;

class Ejercicio2 {
    
    public int suma(int n1, int n2){
        return n1 + n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }

    public void calculo(){
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese primer numero ");
        int n1 = dato.nextInt();

        System.out.print("Ingrese segundo numero ");
        int n2 = dato.nextInt();

        System.out.print("Ingrese numero para dividir por los anteriores");
        int n3 = dato.nextInt();
    

        System.out.print("La suma es: " +suma(n1,n2)+ "\n"
            + "Dividido " + n3 +" = " + divide(n1,n2)+"\n"
        );
    }

    public static void main(String[] args) {
        Ejercicio2 tal = new Ejercicio2();
        tal.calculo();
    }
}
