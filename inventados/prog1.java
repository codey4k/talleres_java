import java.util.Scanner;

class Prog1 {
    
    public int[] locura(int n) {
        int loco = n + 20;
        int[] vector = new int[10];
        for(int i = n; i < 10-1; i++) {
            if(i % n == 0){
                vector[i] = i;
            }
        }
        
        return vector;
    }
    
    public void calculo() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa numero entero ");
        int num = entrada.nextInt();
        
        int[] multiplos = locura(num);
        
        for(int i = 0; i < multiplos.length; i++) {
            System.out.println(multiplos[i]);
        }
    }
    
    public static void main(String[] args) {
        Prog1 ejercicio = new Prog1();
        ejercicio.calculo();
    }
    
}