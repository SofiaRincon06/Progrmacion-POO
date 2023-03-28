package Salud;
import java.util.Scanner;

public class Empleado extends Personas{
    //reto 3
    //atributos de la subclase
    private String cargo;
    private double valorhora;
    private int horastrabajadas;
    private String departamento;
    private double valortotal;
    private double reteica=0.0966;

        public Empleado() {

        }
        
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    public double getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getValortotal() {
        return valortotal;
    }
    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }
    public double getReteica() {
        return reteica;
    }
    public void setReteica(double reteica) {
        this.reteica = reteica;
    }
    //metodo constructor de la subclase con metodos de la superclase
    public Empleado(String tipoDoc,int docuemento, String nombre,String apellido,String cargo,double valorhora,int horastrabajadas,String departamento ){
        super(tipoDoc, docuemento, nombre, apellido);
        this.cargo=cargo;
        this.valorhora=valorhora;
        this.horastrabajadas=horastrabajadas;
        this.departamento=departamento;
    }
    
    public void datosEmpleado() {
        Scanner horas=new Scanner(System.in);
        System.out.println("Ingrese su cargo ");
        cargo=horas.nextLine();
        System.out.println("Ingrese sus horas trabajadas ");
        horastrabajadas=horas.nextInt();
        System.out.println("Ingrese el valor $ por hora trabajada ");
        valorhora=horas.nextDouble();
        
    }
    public void mostrarEmpleado(){
        System.out.println("Su cargo es: " +getCargo());
        System.out.println("Sus horas trabajadas fueron: " +getHorastrabajadas());
        System.out.println("El valor a pagar por hora es: " +getValorhora() );
        System.out.println("Su pago total fue: "+getValortotal());
    }
    //metodo propio de la subclase
    public void calcularHorario() {
     valortotal= valorhora*horastrabajadas;
    valortotal=valortotal-reteica;


    } 
}
