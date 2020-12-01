import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    // es un objeto que sirve para llamar a otra clase y utiliar sus metodos y atributos
    Circuferencia C = new Circuferencia();


    public void Opciones(){
        System.out.println("Bienvenido a figuras geometricas");

        System.out.println(" Elija la opcion \n1) circulo \n2) triangulo equilatero" );
        switch (input.nextInt()){
            case 1 :
                opcionCirculo();

        };

    }

    private void opcionCirculo() {
        System.out.println("Que quiere buscar ?");
        System.out.println("1) Area\n2) Perimetro \n 3) Radio");

        switch (input.nextInt()) {

            case  1:

C.Area();
                break;

            case 2:
              obtenerRadio();
                C.perimetro();
              break;

              case 3:

                  C.Radio(obtenerperimetro());
            break;
        }

    }

    private void obtenerRadio() {
        System.out.println(" Ingrese el radio de la circunferencia");
        C.setRadio(input.nextDouble());



    }

    private double obtenerperimetro() {
        System.out.println(" Escriba el perimetro");

        return input.nextDouble();
    }
}
