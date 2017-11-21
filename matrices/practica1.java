/*
Entrar por pantalla los datos de 30 pacientes: 
cedula, nombre, edad, sexo (1=mujer, 2= masculino), 
tipo de dolencia (1= bronquitis, 2=presión alta, 3=cáncer, 4=diabetes), 
estrato (1-6), y valor tratamiento. 

Se pide porcentaje de los hombres mayores de 50 anos con cancer,
total de mujeres menores de edad con bronquitis o diabetes.

Se pide mostrar valor a pagar por cada paciente, y el total recaudado 
por la EPS.

*/
import java.util.Scanner;

class Practica1 {
    
    private static final int PACIENTES = 3, COLUMNAS  = 6;

    private static String matriz[][] = new String[PACIENTES][COLUMNAS];
    
    private static String array[] = {
        "cedula",
        "nombre",
        "edad",
        "sexo (femenino=1 masculino=2)",
        "tipo de dolencia (1= bronquitis, 2=presión alta, 3=cáncer, 4=diabetes)", 
        "valor tratamiento",
        "estrato (1-6)",
        "valor del tratamiento"
    };
    
    public static void entradaDatos() {
        Scanner dato = new Scanner(System.in);
        
        for(int y = 0; y < PACIENTES; y++){
            System.out.println("Datos del paciente " + (y + 1) );
            for(int x = 0; x < COLUMNAS; x++){
                System.out.print(array[x] + ": ");
                matriz[y][x] = dato.next();
            }
        }
    }

    public static void dolencia(){
        int contH = 0, contM = 0;
        
        for(int y = 0; y < PACIENTES; y++){
            if(matriz[y][3].equals("1")){
                contM += 1;
                int edad = Integer.parseInt(matriz[y][2]);
                if(edad <= 18){
                    if(matriz[y][4].equals("1") || matriz[y][4].equals("4")){
                    
                    }
                }
            }
            else{
                contH += 1;
                int edad = Integer.parseInt(matriz[y][2]);
                if(edad > 50) {
                    if(matriz[y][4].equals("3")){
                        
                    }
                }
            }
        }
        
    }

    public static void main(String[] args) {
        entradaDatos();
    }

}
