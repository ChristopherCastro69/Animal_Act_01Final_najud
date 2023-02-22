public class ProductCommerce implements IProduct{
    Product products[];

    public ProductCommerce(){
        products = new Product[max];
    }
    @Override
    public boolean addProduct(String id, String name, int qty, double price) {


        if(search(id) != null){
            System.out.printf("Name must be unique");
            return false;
        }
        for(int i = 0; i < products.length; i++){
            if(search(id) == null){
                products[i] = new Product(id, name, qty, price);
            }
            return true;
        }
        System.out.printf("Sorry Storage is full");
        return false;
    }

    @Override
    public boolean deleteProduct(Product p) {
        Product temp = null;
        String ID = p.getProdID();
        for(int i = 0; i < products.length; i++){
            if(search(ID).equals(products[i].getProdID())){
                temp = products[i];
                products[i] = products[i+1];
                System.out.printf("Delete Successful");
                return true;
            }
        }

        System.out.printf("Product not in the list. Delete unsuccessful");
        return false;
    }

    @Override
    public int buyProduct(String id, int quantity) {
        Product p = search(id);

        if(p == null){
            return -1; //Product is not in the list
        }
        if(p.getQuantity() < quantity){
            return 0; //quantity is not enough
        }

        p.setQuantity(p.getQuantity() - quantity);

        return 1; // transaction successful
    }

    @Override
    public Product search(String id) {
        for(int i = 0; i < products.length; i++){
            if(products[i].getProdID().equals(id)){
                return products[i];
            }
        }
        System.out.printf("Product is not on the list");
        return null;
    }

    @Override
    public void bulkOrder(Product[] p) {
        for(int i = 0; i < products.length; i++){
            if(p[i].getProdID().equals(products[i].getProdID())){
                buyProduct(p[i].getProdID(),p[i].getQuantity());
            }
        }
    }
}
