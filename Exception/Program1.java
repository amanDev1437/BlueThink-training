public class Program1{
    public static void main(String[] args){
        try{
            int[] a = new int[10];
            System.out.println(a[11]);
        }catch(Exception e){
            System.out.println("Handled exception"+e);
        }finally{
            System.out.println("This is finally block");
        }
    }
}