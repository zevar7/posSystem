public class Product {       //attributes
    private long barcode;
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(){              // empty Constructor

    }

    public Product(long barcode, String name, String category, double price, int quantity) {
        this.barcode = barcode;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public Product(String diaper, double v, int price, Category category) {
    }

    public String getName() {              // Getter and Setter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barcode=" + barcode +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
