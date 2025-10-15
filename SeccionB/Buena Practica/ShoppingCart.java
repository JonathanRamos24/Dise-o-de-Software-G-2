import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    public void addProduct (Product product) {
        products.add(product);
    }

    public void removeProduct (Product product) {
        products.remove (product);
    }
    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
            return total;
    }
}