package FigurasGeometricas;

public class cuadrado extends figura {
    private float valorLado;
    //metodo constructor
public cuadrado(float valorLado){
    this.valorLado=valorLado;
}
//metodos accesores 
public float getValorLado() {
    return valorLado;
}
public void setValorLado(float valorLado) {
    this.valorLado = valorLado;
}
//metodo subclase 

public void calcularArea(){
    float area=0;
    area=valorLado*valorLado;
    System.out.println("El lado del del cuadrado es " +valorLado+ "y su area es " +area);
    

}





}
