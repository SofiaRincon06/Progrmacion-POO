package FigurasGeometricas;

public class circulo extends figura {
    private float pi;
    private float radio;
   
        //metodo constructor
public circulo(Float pi,float radio){
    this.pi=pi;
    this.radio=radio;
}
//metodos accesores 
public double getPi() {
    return pi;
}

public void setPi(Float pi) {
    this.pi = pi;
}

public float getRadio() {
    return radio;
}

public void setRadio(float radio) {
    this.radio = radio;
}
//metodo subclase 

public void calcularArea(){
    float area=0;
    area=pi*(radio*radio);
    System.out.println("El pi es  " +pi+ "el radio del círculo es  " +radio+ "y su area es " +area);
    

}


}


