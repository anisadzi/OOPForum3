import java.util.ArrayList;
import java.util.Objects;

public class Bank{
    private ArrayList<Customer> customers;
    private int numberOfCustomer;
    private String bankName;

    public Bank(String bankName){
        this.customers = new ArrayList<Customer>();
        this.bankName = bankName;
    }

   public String getBankName(){
       return bankName;
   }

   public void addCustomer(String firstName, String lastName){
       Customer customer = new Customer(firstName, lastName);
       this.customers.add(customer);
       numberOfCustomer ++;
   }

   public int getNumberOfCustomer() {
       return this.numberOfCustomer;
   }

   public Customer getCustomer(int index){
       return customers.get(index);
   }
}