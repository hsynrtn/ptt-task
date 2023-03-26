import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class EcommerceSystem {
    private List<Product> products;

    public EcommerceSystem(List<Product> products) {
        this.products = products;
    }

    public void exportProducts(ProductAdapter adapter, String fileName) {
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            String convertedProduct = adapter.convertProduct(products);
            writer.print(convertedProduct);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}