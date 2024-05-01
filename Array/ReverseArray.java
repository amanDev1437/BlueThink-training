//copy and reverse of an array

class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        int[] copy_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy_arr[i] = arr[i];
        }

        for (int i = copy_arr.length - 1; i >= 0; i--) {
            System.out.println(copy_arr[i] + " ");
        }
    }
}
