package FigurasGeometricas;

public class rectangulo extends figura {
    private float base;
    private float altura;
        //metodo constructor
public rectangulo(float base,float altura){
    this.base=base;
    this.altura=altura;
}
//metodos accesores 
public float getbase() {
    return base;
}
public void setbase(float base) {
    this.base = base;
}
public float getaltura() {
    return altura;
}
public void setaltura(float altura) {
    this.altura = altura;
}
//metodo subclase 

public void calcularArea(){
    float area=0;
    area=base*altura;
    System.out.println("La base de su triángulo es " +base+ "la altura de su triángulo es  " +altura+ "y su area es " +area);
    

}
}
