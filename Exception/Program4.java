class MyException extends Exception {

    MyException(String str) {
        super(str);
    }
}

public class Program4 {
    public static void validate(int age) throws MyException {
        if (age <= 18) {
            throw new MyException("age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(19);
        } catch (MyException e) {
            System.out.println(e);

        }
        System.out.println("rest of the code");
    }

}
