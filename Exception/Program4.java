import java.util.*;

class InvalidAgeException extends Exception {

    InvalidAgeException(String str) {
        super(str);
    }
}

public class Program4 {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        try {
            validate(n);
        } catch (InvalidAgeException e) {
            System.out.println(e);

        }
        System.out.println("Thanks");
    }

}
