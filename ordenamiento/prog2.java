import java.util.Scanner;

class Shell {

    static int[] vector = new int[4];

    private static int salto, aux, j, k;

    public void programa(){
        Scanner dato = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.print("Ingrese un numero entero: ");
            vector[i] = dato.nextInt();
        }
    }      

    public void ordenS(){
        salto = 4 / 2; //devuelve un 2
        
        while(salto > 0){
            for(int i = salto + 1; salto <= 4; i++){
                j = i - salto;// 1
                
                while(j > 0){
                    k = j + salto; //3
                        
                    if(vector[j] < vector[k]){
                        j = 1;
                    }
                    else{
                        aux = vector[j];
                        vector[j] = vector[k];
                        vector[k] = aux;
                    }
                    
                    j = j - salto; //control del while
                } //fin del while
            }//fin del for
            salto = salto / 2;//control del while
        }//fin del while

    }// fin de la funcion
    

    public void mejorado(){
        
        for(int x = 0; x < 4; x += 2){
            for(int y = 2; y < 4; y += 2){
                
                if(vector[x] > vector[y]){
                    aux = vector[y];
                    vector[x] = aux;
                    vector[y] = vector[x];
                }
                
            }//fin del for dos
        }//fin del for uno
    }


    public void mostrar(){
        
        System.out.print("El arreglo ordenado es: ");
        for(int x = 0; x < 4 ; x++){
            System.out.println(vector[x]);
        }
    }

    public static void main(String[] args){
        Shell e = new Shell();

        e.programa();
        
        //while(control < 4){
        //    System.out.println(vector[control]);
        //    control++;
        //}
        //e.ordenS();
        e.mejorado();
        e.mostrar();

    }

    
    

}
