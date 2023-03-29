package array;

public class Main4 {
    public static void main(String[] args) {
        // create an integer array with 5 elements
        int[] myArray = {10, 20, 30, 40, 50};

        System.out.println("Value at index 0 is: " + myArray[0]); // print value at first index
        System.out.println("Value at last index is: " + myArray[myArray.length-1]); // print value at last index
        System.out.println("Value at index length is: " + myArray[myArray.length]); // try to print value at index length, which causes an ArrayIndexOutOfBoundsException
        myArray[50] = 4;
    }
}







