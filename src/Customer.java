import java.util.Scanner;

public class Customer {
    public String name;
    public int account = 0;
    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAccount() {
        return account;
    }

}
