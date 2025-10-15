public class Main {
    public static void main(String[] args) {
        Areacalculator calc = new Areacalculator();

        Shape rect = new Rectangle(5, 10);
        Shape tri = new Triangle(4, 6);
        Shape cir = new Circle(3);

        System.out.println("Área del rectángulo: " + calc.calculate(rect));
        System.out.println("Área del triángulo: " + calc.calculate(tri));
        System.out.println("Área del círculo: " + calc.calculate(cir));
    }
}

