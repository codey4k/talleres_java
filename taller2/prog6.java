/*
Pedir el mes, dia y el año de una fecha correcta.
Mostrar la fecha del dia siguiente.
*/

//OMG! LO LOGRÉ, QUE FELICIDAD! 11:23 P.M 
//VALIO LA PENA EL CANCANCIO!!
//ME ENORGULLECES CHIQUITA!!
//AYYYY!! ME AMOO, ME AMO!!!
//SOY LA MEJOR, SABIA QUE PODIA LOGRARLO!!
//KISSES PARA MI MUACKS MUACKS!! <3
//KISSES PARA MI EN EL XOXO!! 
//UFFF ME ENAMORÉ DE MI
//UTUTUIII MAMASITA Y HACKER!! YO ME CASO CON YO!!

import java.util.Scanner;

class prog6 {

    public void programa() {
        Scanner dato = new Scanner(System.in);


        System.out.print("Ingresa dia ");
        int dia = dato.nextInt();

        System.out.print("Ingresa mes ");
        int mes = dato.nextInt();

        System.out.print("Ingresa anio ");
        int anio = dato.nextInt();

        if(mes > 12 || dia > 31){           //validar fecha
            System.out.println("Que pan de ajo eres fecha incorrecta");
        }

        else {
            if(mes <= 7){                   //primer semestre
                if(mes % 2 == 0){           //meses pares
                    if(dia > 30){
                        System.out.println("La fecha es incorrecta");
                    }                       
                    else{
                        if(dia <= 30){          
                            if(dia <= 29){
                                dia += 1;
                            }  
                            else{
                                dia -= 29; 
                                mes += 1;
                            }
                        }
                        System.out.println("La fecha siguiente sera " +
                            dia + "/" + mes + "/" + anio
                        );
                    }
                }                               //cierre meses pares
                else{                           //meses impares
                    if(dia <= 30){          
                        dia += 1;
                    }
                    else {
                        dia -= 30;
                        mes += 1;
                    }
                    System.out.println("La fecha siguiente sera " +
                        dia + "/" + mes + "/" + anio
                    );
                }                               //cierre meses impares
            }                                   //cierre primer semestre
            
            else {                              //segundo semestre                   
                if(mes % 2 == 0){               //meses pares
                    if(mes == 12){              //mes Diciembre
                        if(dia <= 31){
                            if(dia <= 30){
                                dia += 1;
                            }                   
                            else{               //año nuevo
                                dia -= 30;
                                mes -= 11;
                                anio += 1;
                            }                   //cierre año nuevo
                        }                       
                        
                    }                           //cierre Diciembre                    
                   // else{
                   //     System.out.print("Error");
                   // }
                   else{                         
                        if(dia <= 31){
                            if(dia <= 30){
                                dia += 1;
                            }
                            else{
                                dia -= 30;
                                mes += 1;
                            }
                    
                        }
                    }
                    System.out.println("La fecha siguiente sera " +
                        dia + "/" + mes + "/" + anio
                    );
                }                           //cierre meses pares                   
                
                else{                       // meses impares
                    if(dia > 30){
                        System.out.println("La fecha es incorrecta");
                    }
                    else{
                        if(dia <= 30){
                            if(dia <= 29){
                                dia += 1;
                            }
                            else{
                                dia -= 29;
                                mes += 1;
                            }
                        }
                        System.out.println("La fecha siguiente sera " +
                            dia + "/" + mes + "/" + anio
                        );
                    }
                }//cierre meses impares 

           // System.out.println("La fecha siguiente sera " +
           //         dia + "/" + mes + "/" + anio
           //     );
            }
        }
    }

    public static void main(String[] args) {
        prog6 e = new prog6();
        e.programa();
    }
}
