import java.util.Arrays;

public class MultidimentionalArrays {
    public static void main(String[] args){

        int[] sourceArray = {1,2,3,4,5};
        int[] targetArrays = new int[sourceArray.length];

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(sourceArray));

        System.arraycopy(sourceArray,  0,
                targetArrays,  1,  2);

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(sourceArray));
    }
}
