package array;

import java.util.Arrays;

public class Main3 {
        public static void main(String[] args) {
            String[] colors = {"red", "green", "blue", "yellow"};
            System.out.println("Array length: " + colors.length);
            String[] colorsCopy = colors.clone();
            System.out.println("Copied array: " + Arrays.toString(colorsCopy));
        }
    }
