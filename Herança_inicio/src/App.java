import entites.Account;
import entites.BusinessAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //upcasting

        Account acc3 = bacc;

        //downcasting 
        BusinessAccount bacc2 = (BusinessAccount) acc;
    }
}
