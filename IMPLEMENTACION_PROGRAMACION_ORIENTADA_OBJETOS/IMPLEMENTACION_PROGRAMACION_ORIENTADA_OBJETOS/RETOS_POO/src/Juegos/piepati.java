package Juegos;

import java.util.Random;
import java.util.Scanner;

public class piepati implements juego {
    //atributo
    private int opcion;
    private String nomJugador;
    private int resultado;
    //capturar datos
    Scanner capturar=new Scanner(System.in);
    //solicitar el nombre en el metodo iniciar

    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador " );
        nomJugador=capturar.nextLine();
    }

    //crear el generador aleatorio con el metodo jugar
    public void jugar(){
        System.out.println(nomJugador+  " Haga su elección \n1.piedra \n2.papel \n3.tijera ");
        resultado=capturar.nextInt();
        Random aleatorio=new Random();
        opcion=aleatorio.nextInt(3)+1;

    }
    //quien gana, pierde o empata 
    public void finalizar() {
       if(opcion==1 && resultado==1) {
        System.out.println("La opción fue piedra, GANASTE " +nomJugador);
       }else if(opcion==2 && resultado==2){
        System.out.println("La opción fue papel, GANASTE " +nomJugador);
       }else if(opcion==3 && resultado==3){
        System.out.println("La opción fue tijera, GANASTE " +nomJugador); 
       }else if(opcion==1 && resultado==2){
        System.out.println("La opción fue piedra, PERDISTE " +nomJugador);  
       }else if(opcion==2 && resultado==3){
        System.out.println("La opción fue papel, PERDISTE " +nomJugador);  
       }else if(opcion==3 && resultado==1){
        System.out.println("La opción fue tijera, PERDISTE " +nomJugador);  
       }
    }


}
