
class ejercicio2 {
    
    //constantes
    static final int CREDITOPRE = 50000, //credito pregrado
                     CREDITOPOS = 300000; //credito posgrado
                     
    static final String PREGRADO = "pregrado",
                        POSGRADO = "posgrado";

    public void proceso() {
        Scanner dato = new Scanner(System.in);
        

        //lectura de datos
        System.out.print("Ingrese programa ");
        String programa = dato.nextLine();
        
        System.out.print("Ingrese promedio ");
        double promedio = dato.nextDouble();
        
        int descuento = 0,
            creditos = 0;

        //condicionales
        if(programa.equals(PREGRADO)){
            if(promedio >= 4.5){ //primera
                creditos = 28;
                descuento = (CREDITOPRE * creditos * 25) / 100;
            }
            else if(promedio >= 4.0){//segunda
            
                if(promedio < 4.5){
                    creditos = 25;
                    descuento = CREDITOPRE * creditos * 10 / 100;
                }
            }

            else if(promedio > 3.5){ //tercero
            
                if(promedio < 4.0){
                    creditos = 20;
                    descuento = 0;
                }
            }
            else if(promedio >= 2.5){ //cuarta
                if(promedio < 3.5){
                    creditos = 15;
                    descuento = 0;
                }
            }
            else if(promedio < 2.5){ //quinta
                creditos = 0;
                descuento = 0;
            }
        }
        else if(programa.equals(POSGRADO)){
            if(promedio >= 4.5){
                creditos = 20;
                descuento = 20;
            }
            else if(promedio < 4.5){
                creditos = 10;
                descuento = 0;
            }
        }


        System.out.println("Debe pagar " + descuento +
                           " registra " + creditos
        );
        
    }


    public static void main(String[] args) {
        ejercicio2 e = new ejercicio2();
        e.proceso();
    }
}
