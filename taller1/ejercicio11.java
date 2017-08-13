/*
Teniendo como dato de entrada el salario 
mínimo actual de Colombia. Haga un algoritmo 
para saber el porcentaje qué deberá aumentar, 
para que el próximo año el salario mínimo sea $795.000 
*/
import java.util.Scanner;

class Ejercicio11{
    
    private final int SALARIO = 759000;
    
    public int calculo(int x) {
        int resta = SALARIO - x;
        int resultado = (resta * 10) / SALARIO;
        return resultado;
    }
    
    public void programa() {
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Ingrese salario actual ");
        int salMinActual = dato.nextInt();
        
        System.out.println(
            "El salario debe subir un " +
            calculo(salMinActual) + "% para llegar a " +
            SALARIO + "\n"        
        );
    }
    
    public static void main(String[] args) {
        Ejercicio11 salario = new Ejercicio11();
        salario.programa();
    }
}