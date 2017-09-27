/*
Realice un programa en donde cierta empresa de
 telecomunicaciones ofrece a los usuarios escoger
uno de tres servicios: internet, television, telefonia
Los datos de entrada son: nombre, cedula, el estrato (1 -6)
y la direccion. Hay un descuento de acuerdo a su estrato
1 tiene descuento de 20%, si es estrato 2 descuento de 15%
y si es estrato 3 tiene descuento del 10%
si es estrato 4, 5 o 6 no tendra descuento

Si escoge internet tendra dos opciones
Plan internet casa = 30.000
Plan interner empresarial 100.000

Si escoge Television hay dos opciones
Plan televicion analoga 30.00
Plan television digital 70.000

Si escoge Telefonia hay dos opciones
Telefonia ilimitada 50.000
Telefonia 100min 20.000

Mostrar el valor a pagar del usuario.
*/

import java.util.Scanner;


class programa1 {

    public void evaluacion(int estrato, int servicio){
        Scanner dato = new Scanner(System.in);

        int internet, tv, telef;
        double valor = 0, descuento, total;

        switch(servicio){
            case 1:
                System.out.print("Ingrese el paquete de internet que desea: ");
                internet = dato.nextInt();

                if(internet == 1){
                    valor = 30000;
                }
                else{
                    valor = 100000;
                }
                break;
            case 2:
                System.out.print("Ingrese el paquete de tv que desea: ");
                tv = dato.nextInt();
                if(tv == 1){
                    valor = 30000;
                }
                else{
                    valor = 70000;
                }
                break;
            case 3:
                System.out.print("Ingrese el paquete de telefonia que desea: ");
                telef = dato.nextInt();
                if(telef == 1){
                    valor = 50000;
                }
                else{
                    valor = 20000;
                }
                break;
            default:
                System.out.println("Nada ");
                break;
        }
     
        if(estrato == 1){
            descuento = valor * 0.20;
        }
        else if(estrato == 2){
            descuento = valor * 0.15;
        }
        else if(estrato == 3){
            descuento = valor * 0.10;
        }
        else{
            descuento = 0;
        }

        total = valor - descuento;
        System.out.println("Paga en total " + total);

    }

    public void proceso(){
        Scanner dato = new Scanner(System.in);

        String nombre;
        int cedula, estrato, servicio;
        

        System.out.print("Ingrese nombre ");
        nombre = dato.next();

        System.out.print("Ingrese cedula ");
        cedula = dato.nextInt();

        System.out.print("Ingrese estrato ");
        estrato = dato.nextInt();

        System.out.print("Ingrese servicio ");
        servicio = dato.nextInt();

       
        evaluacion(estrato, servicio);

    }

    public static void main(String[] args){
        programa1 e = new programa1();
        e.proceso();
    }
}



