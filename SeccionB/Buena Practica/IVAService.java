public class IVAService {
    public double calculateIVA (Product product) {
        // Ejemplo: cálculo de IVA basado en tipo
        if ("physical".equalsIgnoreCase (product.getType())) {
            return product.getPrice() * 0.21;
        } else if ("digital".equalsIgnoreCase (product.getType())) {
            return product.getPrice() * 0.10;
        }
        // Otros tipos sin IVA
        return 0;
    }
}