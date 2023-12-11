public abstract class Product {
    protected int stock;
    public int getStock() {return stock;    }
    public int setStock(int newStock)
    {
        this.stock = newStock;
        return stock;
    }
    protected int price;
    public int getPrice() {
        return price;
    }
    public  int setPrice(int newPrice)
    {
        this.price = newPrice;
        return price;
    }
    public boolean availability ;
    public boolean getAvailability(){
        return  availability;
    }
    public void setAvailability(){
        if(stock == 0) {
            this.availability = false;
        }
    }
    private int sell(int item){
        if (stock>=item){
            this.stock -= item;
            setAvailability();
            return stock;
        }
        else {
            System.out.println("Stokta " + stock + " adet ürün kalmıştır.");
            return stock;
        }
    }
    public abstract int addToAcc(int item);

}

