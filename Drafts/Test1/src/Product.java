class Product{
    private String prodID;
    private String prodName;
    private int quantity;
    private double price;

    public Product(){} // default
    public Product(String prodID, String prodName, int quantity, double price){
        setProdID(prodID);
        setProdName(prodName);
        setQuantity(quantity);
        setPrice(price);

    }

    //Setters and getters

    public void setProdID(String prodID){
        this.prodID = prodID;
    }

    public void setProdName(String prodName){
        this.prodName = prodName;
    }

    public void setQuantity(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException("Must be Positive");
        }
        this.quantity = quantity;
    }
    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Must be Positive");
        }
        this.price = price;
    }

    //getters
    public String getProdID(){
        return prodID;
    }
    public String getProdName(){
        return prodName;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Product){
            Product other = (Product) obj;
            return prodID.equals(other.prodID);

        }
        return false;
    }

    @Override
    public String toString(){
        return "Product ID: " + prodID + '\n' +
                "Product Name: " + prodName + '\n' +
                "Quantity: " + quantity + '\n' +
                "Price: " + price;
    }


}