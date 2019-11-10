public class Product {

    private String name;
    private double price;
    private ServiceCategory productCategory;

    public Product(String name, double price, ServiceCategory productCategory) {
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productCategory=" + productCategory.getName() +
                '}';
    }
}
