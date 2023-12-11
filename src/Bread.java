public class Bread extends Product {

    private  int total ;

    public Bread(){
        super();
        super.stock = 1000;
        super.price = 10;
    }
    public int addToAcc(int loaves){
        if (availability==true) {
            total += loaves;
            return total*price;
        }
        else
            return total;
    }
}
