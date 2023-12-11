public class Coal extends Product{
    private  int total ;
    public Coal(){
        super();
        super.stock = 20;
        super.price = 350;
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
