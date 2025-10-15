//este código viola el principio de O.C.P
public class AreaCalculator1 {
    public double calculateArea(String shape, double a, double b) {
        if (shape.equals("rectangle")) {
            return a * b;
        } else if (shape.equals("triangle")) {
            return (a * b) / 2;
        } else {
            return 0;
        }
    }
}
