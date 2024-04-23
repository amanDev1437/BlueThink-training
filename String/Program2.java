package String;

public class Program2 {
    public static void main(String[] args) {
        String s = "Sachin";
        String s1 = "Sachin";
        String str = new String("Sachin");
        String str1 = new String("Ram");
        System.out.println(s.equals(str));
        System.out.println(str1 == str);
        System.out.println(s == s1);
        System.out.println(s.compareTo(s1));
        System.out.println(str.compareTo(str1));
    }

}
