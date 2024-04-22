package oops;

public class Account {
    static String bankName = "ABC bank";
    int accountNumber;
    String accountName;
    double balance;

    public Account(){

    }
    public Account(int accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }



    public void deposit(int amt){
        balance = balance+amt;
        System.out.println(amt+" deposited");
    }

    public void withdrawl(int amt){
        if(balance>amt){
            balance = balance-amt;
            System.out.println(amt+" withdrawn");
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public void getBalance(){
        System.out.println("Your current balance is:"+balance);
    }
    public void display(){
        System.out.println("Your accoun details are:");
        System.out.println("Account Number:"+accountNumber+" "+"Account Name"+accountName+" "+"Account Balance"+balance);
    }
}
