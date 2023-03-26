import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = getProducts();
        EcommerceSystem ecommerceSystem = new EcommerceSystem(products);

        ProductAdapter jsonAdapter = new JSONProductAdapter();
        ProductAdapter xmlAdapter = new XMLProductAdapter();

        ecommerceSystem.exportProducts(jsonAdapter, "json_products.json");
        ecommerceSystem.exportProducts(xmlAdapter, "xml_products.xml");
    }

    public static List<Product> getProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Product 1", 1.00, "Electronic"));
        products.add(new Product(2, "Product 2", 2.00, "Fashion"));
        products.add(new Product(3, "Product 3", 3.00, "Home Decor"));
        products.add(new Product(4, "Product 4", 4.00, "Electronic"));
        products.add(new Product(5, "Product 5", 5.00, "Fashion"));
        products.add(new Product(6, "Product 6", 6.00, "Home Decor"));
        products.add(new Product(7, "Product 7", 7.00, "Electronic"));
        products.add(new Product(8, "Product 8", 8.00, "Fashion"));
        products.add(new Product(9, "Product 9", 9.00, "Home Decor"));
        products.add(new Product(10, "Product 10", 10.00, "Electronic"));
        return products;
    }
}