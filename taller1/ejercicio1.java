/*
Se pide crear un algoritmo que calcule el porcentaje
 de alumnos y porcentaje de alumnas de un salón de clase.
*/

import java.util.Scanner;

class Porcentaje {
    
    public int calculo(int alumnos, int cantidad) {
        int resultado = alumnos * cantidad / 100;
        return resultado;
    }

    public void porcentaje(){
        //code
        Scanner dato = new Scanner(System.in);

        System.out.print("Dame la cantidad de alumnos ");        
        int alumnos = dato.nextInt();

        System.out.print("Cuantas chicas hay? ");
        int chicas = dato.nextInt();

        System.out.print("Cuantos chicos hay? ");
        int chicos = dato.nextInt();

        System.out.print("Hay "+alumnos+ "\n"
                + "el "+calculo(alumnos,chicas)+"% son chicas \n"
                + "el "+calculo(alumnos,chicos)+"% son chicos \n"
        );
    }
    
    public static void main(String[] args){
        Porcentaje alumno = new Porcentaje();

        alumno.porcentaje();
    }
}
