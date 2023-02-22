public class ProductCommerce implements iProduct{
    private Product[] products;

    public ProductCommerce(){
        products = new Product[max];
    }


    @Override
    public boolean addProduct(String id, String name, int qty, double price) {

        if(search(id) != null){
            System.out.println("Product already exists.");
            return false;
        }

        for(int i = 0; i < products.length; i++){
            if(products[i] == null){
                products[i] = new Product(id, name, qty, price);
                return true;
            }
        }
        System.out.println("Sorry Storage full.");
        return false;
    }

    @Override
    public boolean deleteProduct(Product p) {
        String ID = p.getProdID();
        for(int i = 0; i < products.length; i++){

            if(ID.equals(products[i].getProdID())){

                products[i]=products[i+1];
                return true;
            }
        }
        return false;
    }

    @Override
    public int buyProduct(String id, int quantity) {
        Product p = search(id);
        if (p == null) {
            return -1; // product not found
        }
        if (p.getQuantity() < quantity) {
            return 0; // not enough quantity
        }
        p.setQuantity(p.getQuantity() - quantity);
        return 1; // transaction successful
    }

    @Override
    public Product search(String id) {
        for (int i = 0; i < products.length; i++){
            if(id.equals(products[i].getProdID())){
                return products[i];
            }
        }
        return null;
    }


    @Override
    public void bulkOrder(Product[] p) {
        for(int i=0; i<products.length; i++){
            if(p[i].getProdID().equals(products[i].getProdID())){
                buyProduct(p[i].getProdID(), p[i].getQuantity());
            }
        }
    }
}
