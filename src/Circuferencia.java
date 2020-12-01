public class Circuferencia {
   private double pi;
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   public Circuferencia ( ){
       this.pi = 3.14;
   }
    public void Radio(Double perimetro) {
        System.out.println("El radio es "+(perimetro / pi));
    }
    public void  perimetro(){
        System.out.println(" el perimetro es " + (2 * pi * radio));
    }
}
