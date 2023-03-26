import java.util.List;

class JSONProductAdapter implements ProductAdapter {
    public String convertProduct(List<Product> products) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Product product : products) {
            sb.append("{");
            sb.append("\"id\":").append(product.getId()).append(",");
            sb.append("\"name\":\"").append(product.getName()).append("\",");
            sb.append("\"price\":").append(product.getPrice()).append(",");
            sb.append("\"category\":\"").append(product.getCategory()).append("\"");
            sb.append("},");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}