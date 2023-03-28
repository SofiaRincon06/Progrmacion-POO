package FigurasGeometricas;
import java.util.Scanner;

public class Ejecucion {
    //reto 4
    public static void main(String[] args) {
        int opcion=0;
        int numVeces=1;
        float valorLado,base,altura,pi,radio;
    /*Scanner capturar=new Scanner(System.in);
    System.out.println("Digite el valor del lado del cuadrado ");
    valorLado=capturar.nextFloat();

        //crear el objeto de la subclase cuadrado
        cuadrado cu1=new cuadrado(valorLado);
        cu1.calcularArea();

        //crear el objeto de la subclase rectángulo 
        System.out.println("Digite la base del rectángulo ");
        base=capturar.nextFloat();
        System.out.println("Digite la altura del rectángulo ");
        altura=capturar.nextFloat();

        //crear el objeto de la subclase rectángulo
        rectangulo rec1=new rectangulo(base, altura);
        rec1.calcularArea();

        //crear el objeto de la subclase triángulo 
        System.out.println("Digite la base del triángulo ");
        base=capturar.nextFloat();
        System.out.println("Digite la altura del triángulo ");
        altura=capturar.nextFloat();

        //crear el objeto de la subclase triángulo
        triangulo tri1=new triangulo(base, altura);
        tri1.calcularArea();

        //crear el objeto de la subclase círculo 
        System.out.println("Digite el pi  ");
        pi=capturar.nextFloat();
        System.out.println("Digite el radio del círculo ");
        radio=capturar.nextFloat();

        //crear el objeto de la subclase circulo
        circulo cir1=new circulo(pi, radio);
        cir1.calcularArea();

        capturar.close();
        
    }*/
    
    Scanner capturar=new Scanner(System.in);
    while (numVeces==1){
    System.out.println("Este es el menú");
    System.out.println("Escoga la figura para saber su area: opcion 1:cuadrado opcion 2:circulo opcion 3: rectángulo opcion 4: triángulo ");
    opcion=capturar.nextInt();

    
    switch(opcion){
        case 1:
    System.out.println("Digite el valor del lado del cuadrado ");
    valorLado=capturar.nextFloat();

        //crear el objeto de la subclase cuadrado
        cuadrado cu1=new cuadrado(valorLado);
        cu1.calcularArea();
        break;
        case 2:
        //crear el objeto de la subclase círculo 
        System.out.println("Digite el pi  ");
        pi=capturar.nextFloat();
        System.out.println("Digite el radio del círculo ");
        radio=capturar.nextFloat();

        //crear el objeto de la subclase rectángulo
        circulo cir1=new circulo(pi, radio);
        cir1.calcularArea();
        break;
        case 3:
        //crear el objeto de la subclase rectángulo 
        System.out.println("Digite la base del rectángulo ");
        base=capturar.nextFloat();
        System.out.println("Digite la altura del rectángulo ");
        altura=capturar.nextFloat();

        //crear el objeto de la subclase rectángulo
        rectangulo rec1=new rectangulo(base, altura);
        rec1.calcularArea();
        break;
        case 4:
        //crear el objeto de la subclase triángulo 
        System.out.println("Digite la base del triángulo ");
        base=capturar.nextFloat();
        System.out.println("Digite la altura del triángulo ");
        altura=capturar.nextFloat();
        break;

    }
    System.out.println("¿Quiere seguir realizando las operaciones para hallar las areas");
    numVeces=capturar.nextInt();
}
}
}
