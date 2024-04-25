public class Main {
    public static void main(String[] args) {
        Rombo rombo1 = new Rombo();
        Circulo circulo1 = new Circulo();
        Cuadrado cuadrado1 = new Cuadrado();


        System.out.println("ROMBO");
        System.out.println("Area");

        rombo1.calcularArea();;

        System.out.println("Perimetro");
        rombo1.calcularPerimetro();

        System.out.println("TRAPECIO");
        System.out.println("Area");
        circulo1.calcularArea();

        System.out.println("Perimetro");
        circulo1.calcularPerimetro();

        System.out.println("CUADRADO");
        System.out.println("Area");
        cuadrado1.calcularArea();

        System.out.println("Perimetro");
        cuadrado1.calcularPerimetro();

    }
}