public class PhysicalProduct extends Product implements Weighable {
    private double weight;

    public PhysicalProduct (String name, double price, double weight, String type) {
        super(name, price, type);
        this.weight = weight;
    }
    @Override
        public double getWeight () {
        return weight;
    }
}