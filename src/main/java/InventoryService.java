public interface InventoryService {
    void addProduct(Product product);
    void updateProduct(long barcode, Product product);
    void removeProduct(long barcode);
    void showProduct();
}
