package Salud;

import java.util.Scanner;

public class Personas {
    //crear los atributos 
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    /*private int edad;
    private double peso;
    private double estatura;
    private String sexo;*/
    
    //resto 1 metodo constructor
    public Personas(){

    }
    public Personas(String tipoDoc,int docuemento, String nombre,String apellido){ /* eso tambien va ahidouble peso,double estatura,int edad,String sexo*/ 

    }
    //reto 3 
    
public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    /*public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }*/
//reto 1
public void PedirDatos(){
    Scanner capturar=new Scanner(System.in);
    System.out.println("Ingrese su tipo de docuemnto ");
    tipoDoc=capturar.next();
    System.out.println("Ingrese su número de docuemnto ");
    documento=capturar.nextInt();
    System.out.println("Ingrese su nombre ");
    nombre=capturar.next();
    System.out.println("Ingrese su apellido ");
    apellido=capturar.next();
   /*  System.out.println("Ingrese su edad ");
    edad=capturar.nextInt();
    System.out.println("Ingrese su tipo de sexo ");
    sexo=capturar.next();*/
}
//reto 1
public void mostrarPersona(){
    System.out.println("Su tipo de documento es: " +tipoDoc);
    System.out.println("Su número de documento es: " +documento);
    System.out.println("Su nombre es: " +nombre);
    System.out.println("Su apellido es: " +apellido);
    /*System.out.println("Su peso es: " +peso);
    System.out.println("Su estatura es: " +estatura);
    System.out.println("Su edad es: " +edad);
    System.out.println("Su sexo es : " +sexo);*/

}
//reto1
/*public void mostarResultados(){
    pesoActual=peso/(estatura*estatura);
    System.out.println("El su Mc es: " +pesoActual);
    if(pesoActual<20){
        System.out.println("Su peso esta por debajo de lo ideal ");
    }else if(pesoActual<=25){
        System.out.println("Su peso es ideal ");
    }else {
        System.out.println("Su peso ya es sobrepeso");
    }

}*/
///resto 2
public double mostarResultados(double peso,double estatura){
     double pesoActual;
    pesoActual=peso/(estatura*estatura);

    if(pesoActual<20){
        System.out.println("PESO BAJO ");
    }else if(pesoActual<=25){
        System.out.println("PESO IDEAL ");
    }else {
        System.out.println("SOBRE PESO");
    }
   return pesoActual;
}
/*reto1 
public void mayorEdad(){
    if(edad<18){
        System.out.println("usted es MENOR de edad ");
    }else if(edad>=18){
        System.out.println("Usted es MAYOR de edad ");
    }*/
}
