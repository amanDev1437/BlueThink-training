package oops.basic;

public class AccountDriver {
     static int a= 10;
     int b = 10;
    public static void main(String[] args) {
        Account a1 = new Account(331501,"Aman Singh",15000);
        a1.deposit(5000);
        a1.withdrawl(500);
        a1.getBalance();
        a1.display();
        System.out.println(a);
    }
    
    
    
}
