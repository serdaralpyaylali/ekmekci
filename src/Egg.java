public class Egg extends Product{
    private  int total ;
    public Egg(){
        super();
        super.stock = 100;
        super.price = 120;
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
