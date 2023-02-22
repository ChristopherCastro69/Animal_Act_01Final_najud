public class Product {
    private String prodID;
    private String prodName;
    private int quantity;
    private double price;

    public Product(){};
    public Product(String prodID, String prodName, int quantity, double price){
        setProdID(prodID);
        setProdName(prodName);
        setQuantity(quantity);
        setPrice(price);
    }
    public void setProdID(String prodID){
        this.prodID = prodID;
    }

    public String getProdID(){
        return prodID;
    }
    public void setProdName(String prodName){
        this.prodName = prodName;
    }
    public String getProdName(){
        return prodName;
    }
    public void setQuantity(int quantity){
        if(quantity< 0){
            throw new IllegalArgumentException("Quantity must be positive");
        }
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }
    public double getPrice(){

        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            Product other = (Product) obj;
            return prodID.equals(other.prodID);
        }
        return false;
    }

    @Override
    public String toString(){
        return "Product [prod ID: " + prodID + ", prod Name: " + prodName + ", Quantity: " + quantity + ", Price: " + price;
     }


}
