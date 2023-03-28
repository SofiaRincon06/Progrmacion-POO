package Principal;
import java.util.Scanner;

import Salud.Personas;
import Salud.Empleado;
public class Inicio {
    public static void main(String[] args) {
        Personas persona=new Personas();
        Empleado empleados=new Empleado();
        /*persona.setEdad(78);
        System.out.println("la edad es "+persona.getEdad());*/
        /*double peso;
        double estatura;*/
        /*Scanner registrar=new Scanner(System.in);
        System.out.println("Ingrese su peso en (kg) ");
        peso=registrar.nextDouble();
        System.out.println("Ingrese su estatura en (m) ");
        estatura=registrar.nextDouble();*/
        /*persona.mostarResultados(peso, estatura);   
     }*/
        persona.PedirDatos();
        empleados.datosEmpleado();
        empleados.calcularHorario();
        persona.mostrarPersona(); 
        empleados.mostrarEmpleado();
        /*persona.mayorEdad();*/
         


        

}
}

