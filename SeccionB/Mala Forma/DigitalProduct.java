public class DigitalProduct extends Product {
    public DigitalProduct(String name, double price) {
        super(name, price, 0, "digital");
    }
    @Override
    public double getWeight() {
        throw new Unsupported OperationException("Digital products have no weight.");
    }
}
