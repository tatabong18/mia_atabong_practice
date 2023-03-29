package array;

public class Main5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("Array values:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
