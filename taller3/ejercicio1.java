import java.util.Scanner;

class Ejercicio1 {

    

    public void programa() {
        Scanner dato = new Scanner(System.in);
        
        String voto = "si";
        
        int votantes, 
            sexo, 
            candidato,
            candidato1 = 0,
            candidato1Hombres = 0,
            candidato1Mujeres = 0,
            candidato2 = 0,
            candidato2Hombres = 0,
            candidato2Mujeres = 0,
            candidato3 = 0,
            candidato3Hombres = 0,
            candidato3Mujeres = 0,
            hombre = 0,
            mujer = 0,
            c1,
            c2,
            c3;
        

        System.out.print("Cantidad de votantes ");
        votantes = dato.nextInt();

        for(int i = 0; i < votantes; i++){
            //se pide el sexo del votante
            System.out.print("Sexo del votante " + "\n" +
                "hombre 0" + "\n" +
                "mujer 1" + "\n"
            );
            sexo = dato.nextInt();
            
            
            
            
            /*
            Aca se pide el total de hombres y mujeres
            que votaron de forma global
            */
            // if(sexo == 0){
            //     hombre += 1;
            // }
            // else {
            //     mujer += 1;
            // }

            //se pregunta si voto o no voto
            System.out.print("Voto? ");
            voto = dato.next();

            if(voto.equals("si")){
                System.out.print("Por quien voto? " + "\n"+
                    "candidato1 1" + "\n" +
                    "candidato2 2" + "\n" +
                    "candidato3 3" + "\n"
                );
                candidato = dato.nextInt();
                
                if(sexo == 1){
                    if(candidato == 1){
                        candidato1Mujeres += 1;
                    }
                    else {
                        if(candidato == 2){
                            candidato2Mujeres += 1;
                        }
                        else {
                            candidato3Mujeres += 1;
                            
                        }
                    }
                
                }//fin del if
                else { //iniciodel else
                    if(candidato == 1){
                        candidato1Hombres += 1;
                    }
                    else {
                        if(candidato == 2){
                            candidato2Hombres += 1;
                        }
                        else {
                            candidato3Hombres += 1;
                            
                        }
                    }
                }//cierre del else
               
                
            } //cierre del if
            else {
                if(sexo == 1){
                    hombre += 1;
                }
                else{
                    mujer += 1;
                }
                System.out.println("Voto nulo ");
            }
            
        }//cierre del for
        
        
        
        String ganador, ultimoLugar;
        
        int totalMujeres = candidato1Mujeres + candidato2Mujeres + candidato3Mujeres + mujer,
            totalHombres = candidato1Hombres + candidato2Hombres + candidato3Hombres + hombre;
        
        c1 = candidato1Mujeres + candidato1Hombres;
        c2 = candidato2Mujeres + candidato2Hombres;
        c3 = candidato3Mujeres + candidato3Hombres;
        
        float porcentajeM, porcentajeH;

        

        //evaluar quien gano
        if(c1 > c2){
            if(c1 > c3){
                porcentajeM = c1 * 100 / votantes;
                ganador = "candidato1";
                //evaluar quien quedo en el ultimo lugar
                if(c2 > c3){
                    if(c3 == 0){//evalua si nadie voto por el candidato
                        porcentajeH = 0;// le asigna un 0 (cero)
                    }
                    else{//de lo contrario hace la operacion normal
                        porcentajeH = c3 * 100 / votantes;
                        ultimoLugar = "candidato3";
                    }
                }
                else{
                    if(c2 == 0){//por si da como resultado cero
                        porcentajeH = 0;
                    }
                    else{// se hace la evaluacion normal grrrrrrrr
                        porcentajeH = c2 * 100 / votantes;
                        ultimoLugar = "candidato2";
                    }
                }
            }//cierre del primer if
            else {//ganador candidato3
                porcentajeM = c3 * 100 / votantes;
                ganador= "candidato3";
                //evaluacion del ultimo lugar
                if(c2 > c1){
                    if(c1 == 0){// si es cero se le asigna cero directamente
                        porcentajeH = 0;
                    }
                    else{// se hace la operacion normal
                        porcentajeH = c1 * 100 / votantes;
                        ultimoLugar = "candidato1";
                    }
                }
                else{
                    if(c2 == 0){//se evalua si es cero
                        porcentajeH = 0;
                    }
                    else{//se hace la operacion normal
                        porcentajeH = c2 * 100 / votantes;
                        ultimoLugar = "candidato2";
                    }
                }
            }
        }
        
        //si da como resultado empate
        else if(c1 == c2){
            System.out.print("Empate entre candidato1 y candidato 2" );
            if(c1 == c3){
                System.out.print("Triple empate ave maria!!" );
            }
        }
        //cierre del empate
        
        else {
            if(c2 > c3){
                porcentajeM =  c2 * 100 / votantes;
                ganador = "candidato2";
                //perdedores
                
                if(c2 < c1){
                    //si da como resultado cero (0)
                    if(c2 == 0){
                        porcentajeH = 0;
                    }
                    else{// se hace la evaluacion normal
                        porcentajeH =  c2 * 100 / votantes;
                        ultimoLugar = "candidato2";
                    }
                }
                else{
                    if(c1 == 0){//por si el resultado es cero
                        porcentajeH = 0;
                    }
                    else{//se hace la evaluacion normal
                        porcentajeH = c1 * 100 / votantes;
                        ultimoLugar = "candidato1";
                    }
                }
            }
            else{
                porcentajeM = c3 * 100 / votantes;
                ganador = "candidato3";
                //perdedores
                if(c2 > c1){
                    if(c1 == 0){// por si es cero
                        porcentajeH = 0;
                    }
                    else{// se hace la operacion normal
                        porcentajeH = c1 * 100 / votantes;
                        ultimoLugar = "candidato1";
                    }
                }
                else{
                    if(c2 == 0){//por si es cero
                        porcentajeH = 0;
                    }
                    else{//sino se hace la operacion normal
                        porcentajeH = c2 * 100 / votantes;
                        ultimoLugar = "candidato2";
                    }
                }
            }
        }
        
        

        System.out.println(
            "Votaron un total de " + totalMujeres + " mujeres" +
            " y un total de " + totalHombres + " hombres" + "\n" +
            "El ganador es el " + ganador + "\n" +
            "Un " + porcentajeM + "% de mujeres voto por el" + ganador +"\n"+
            "Un " + porcentajeH +"% voto por el perdedor" 
        );
    }

    public static void main(String[] args){
        Ejercicio1 e = new Ejercicio1();
        e.programa();
    }

}