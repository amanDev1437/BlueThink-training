class Program2{
    public static void checkEligibility(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible to vote");
        }else{
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String[] args){
        checkEligibility(17);
    }
}