public interface IProduct{
    int max = 100;

    public boolean addProduct(String id, String name, int qty, double price);
    public boolean deleteProduct(Product p);
    public int buyProduct(String id, int quantity);
    public Product search(String id);
    public void bulkOrder(Product p[]);


}