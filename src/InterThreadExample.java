class Customer{
    int balance = 10000;

    synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println("going to withdraw");
        if(balance<amount){
            System.out.println("Insufficient balance, waiting for deposit");
            wait();
        }
        balance = balance-amount;
        System.out.println("withdrawal completed");
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit");
        balance = balance+amount;
        System.out.println("deposit completed");
        notify();
    }
}

public class InterThreadExample{
    public static void main(String[] args){

        Customer c = new Customer();
        
        new Thread(() -> {
            try {
                c.withdraw(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> c.deposit(10000)).start();




    }
}