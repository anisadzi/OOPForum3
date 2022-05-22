public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(int amount){
        if(amount > 0){
            this.balance += amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(int amount){
        if(this.balance > amount){
            this.balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }
}


