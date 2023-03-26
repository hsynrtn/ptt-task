import java.util.List;

class XMLProductAdapter implements ProductAdapter {
    public String convertProduct(List<Product> products) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<products>");
        for (Product product : products) {
            sb.append("<product>");
            sb.append("<id>").append(product.getId()).append("</id>");
            sb.append("<name>").append(product.getName()).append("</name>");
            sb.append("<price>").append(product.getPrice()).append("</price>");
            sb.append("<category>").append(product.getCategory()).append("</category>");
            sb.append("</product>");
        }
        sb.append("</products>");
        return sb.toString();
    }
}