package array;

public class Main6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (i != 2) {
                System.out.println("Element at index " + i + " is " + arr[i]);
            }
        }
    }
}