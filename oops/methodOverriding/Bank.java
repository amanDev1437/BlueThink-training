package oops.methodOverriding;

public class Bank {

    public int getIntrest() {
        return 0;
    }
}

class Sbi extends Bank {
    public int getIntrest() {
        return 8;
    }
}

class Kotak extends Bank {
    public int getIntrest() {
        return 6;
    }
}
