import java.util.Scanner;

class Ejercicio8{
    
    public int porcentaje(int n) {
        int num = 8 * n / 100;
        return num;
    }
    
    public void obtenerDato() {
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Ingrese un dato ");
        int n = dato.nextInt();
        
        System.out.print("El 8% de " + n + " es: " +
         porcentaje(n) + "\n" 
         );
    }
    
    public static void main(String[] args){
        Ejercicio8 e = new Ejercicio8();
        
        e.obtenerDato();
    }
}