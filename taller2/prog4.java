/*
Un vendedor de portátiles ofrece descuento del 10%, 
si el computador cuesta $1.000.000 o más. 
Además, adicionalmente, ofrece el 5% de descuento si la marca es TLY.
Determinar cuánto pagará, con lVA incluido, 
un cliente cualquiera por la compra de un portátil.
*/

import java.util.Scanner;

class ejercicio4{

    public static void procesos(){
        Scanner dato = new Scanner(System.in);
        
        String marca;
        int n, iva;
        float costo, totalIva, total;
        float desc = 0;

        System.out.print("Clientes ");
        n = dato.nextInt();  

        for(int i = 0; i < n; i++){

            System.out.print("valor portatil: ");
            costo = dato.nextInt();

            System.out.print("Marca portatil: ");
            marca = dato.next();

            System.out.print("Porcentraje iva: ");
            iva = dato.nextInt();

            if(costo >= 1000000){
                if(marca == "tly"){
                    desc = costo * 15 / 100;
                }else{
                    desc = costo * 10 / 100;
                }
            }

            else if(costo < 1000000){
                if(marca == "tly"){
                    desc = costo * 5 / 100;
                }
                else{
                    desc = 0;
                }
            }

            totalIva = costo * iva;
            total = costo + totalIva - desc;
            System.out.print(total);

        } 
        

    }

    public static void main(String[] args){
        procesos();
    }

}
