/*
Tres personas deciden invertir su dinero 
para fundar una empresa y cada 
una de ellas invierte una cantidad de dinero. 
Haga un algoritmo que imprima el nombre de cada persona y 
el porcentaje de participación en la empresa. 
*/

import java.util.Scanner;

class Ejercicio14{
    
    private final int N = 3;
    
    public int porcentaje(int n, int d) {
        int num = n * d / 100;
        return num;
    }
    
    public void inversion() {
        Scanner dato = new Scanner(System.in);
        
        String[] socio = new String[N];
        int[] inversion = new int[N];
        
        //Optiene datos de cada inversionista
        for(int i = 0; i <= N-1; i++){
            
            System.out.print("Nombre del inversionista "
                + (i+1) + " "
            );
            
            socio[i] = dato.next();
            
            System.out.print("¿Cuanto invierte? ");
             
            inversion[i] = dato.nextInt();
        }
        
        int inver = 0; 
        //suma de inversiones
        for(int i = 0; i <= N-1; i++){
            inver += inversion[i];
        }
        
        //imprime los valores
        for(int i = 0; i <= N-1; i++){
            System.out.print(
                "El inversionista " + socio[i] +
                " tiene un " + porcentaje(inversion[i],inver) 
                + "% de participacion \n"
            );
        }
    }
    
    public static void main(String[] args) {
        Ejercicio14 e = new Ejercicio14();
        e.inversion();
    }
}