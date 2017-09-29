/*
La universidad requiere un programa que le calcule
la liquidacion del pago de matricula del primer semestre
de sus estudiantes de facultad de ingeieria. La universidad
dice cuantos estudiantes van para el primer semestre y tambien dice
para cada uno los siguentes datos, identificacion, nombre
tipo de coleguio donde termino el bachillerato, estrato socio economico,
y sezo, valor de liquidacion del semestre anterior.

La universidad cobrar un valor constante para cada estudiante de
$AAA y presenta las siguientes alternativas.

Si el patrimonio es mayor que 15000000 y el estrato superrior de 3
se le incrementa un porcentaje de 3% al valor de la matricula
en el semestre, si estudio en un colegio privado se la incrementa un 
porcentaje del 10% sobre el valor de la matricula del semestre.

La universidad requiere saber el nombre del estudiantel lo que debe
pagar en total por matricula, tambien toto lo que recaudara por 
concepto de matricula y el total de estudiantes que pagan solo el 
valor constante, tambien se sabe el patrimonio del estudiante
*/

import java.util.Scanner;

class programa2 {
    
    public void programa(){
        Scanner dato = new Scanner(System.in);
        
        String id, nombre, tipC, sexo;
        int n, edad, estrato, soloConst = 0, valorConst = 600000;
        double promedio, 
               VLSA, 
               patrimonio,
               incrementop, 
               incrementoM, 
               incremento,
               totalEstu,
               totalTodos = 0;
        
        System.out.print("Ingrese el numero de estudiantes: ");
        n = dato.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Ingrese la identificacion del estudiante: ");
            id = dato.next();
    
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = dato.next(); 
    
            System.out.print(
                "Ingrese el tipo de colegio en que termino el bachillerato: "
            );
            tipC = dato.next(); 
    
            System.out.print("Ingrese el sexo del estudiante: ");
            sexo = dato.next(); 
    
            System.out.print("Ingrese la edad del estudiante: ");
            edad = dato.nextInt(); 
    
            System.out.print("Ingrese el estrato del estudiante: ");
            estrato = dato.nextInt(); 
    
            System.out.print("Ingrese el promedio anterior: ");
            promedio = dato.nextDouble(); 
    
            System.out.print(
                "Ingrese el valor de liquidacion del semestre anterior: "
            );
            VLSA = dato.nextDouble(); 
    
            System.out.print("Ingrese el patrimonio: ");
            patrimonio = dato.nextDouble();
            
            
            if(patrimonio > 15000000 && estrato > 3){
                incrementop = valorConst * 0.3;
            }
            else{
                incrementop = 0;
            }
    
            if(tipC.equals("privado")){
                incrementoM = valorConst * 0.10;
            }
            else{
                incrementoM = 0;
            }
        
            
        
            incremento = incrementop + incrementoM;
            totalEstu = valorConst - incremento;

            if(incremento == 0){
                soloConst += 1;
            }

            System.out.println(
                "El estudiante pagara un total de: " + 
                totalEstu
            );

            totalTodos += totalEstu ;
        }
  
        System.out.println(
            "El total recaudado por matricula es: " + totalTodos
        );
        System.out.println(
            "El total de estudiantes"+
            " que solo paga el valor constante es: " + soloConst
        ); 
    }

    public static void main(String[] args){
        programa2 e = new programa2();
        e.programa();
    }

}
