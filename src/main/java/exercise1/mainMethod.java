package sba_core_java.exercise;
import java.util.Scanner;
import java.util.ArrayList;

public class mainMethod {

    public static void main(String[] args) {
        String[] myStringArrayTestValue = {"life", "is", "worth",
                "living", "with", "passion"};
        MyOperation myOperation;
        myOperation = new MyOperation() {
            @Override
            public void replaceAnElementInTheStringArrayListGiven
                    (int index) {

            }
        };
        myOperation.convertStringArrayIntoArrayList
                (myStringArrayTestValue);
        System.out.println(myOperation.getMyArrayList());

        myOperation.replaceAnElementInTheStringArrayListGiven
                (1);
        System.out.println(myOperation.getMyArrayList());

        ArrayList<String> myNewArrayList =
                myOperation.createANewArrayListFromExistingArray();
        System.out.println(myNewArrayList);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } else {
            try {
                throw new MyOwnException("Invalid integer");
            } catch (MyOwnException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static class MyOwnException extends Throwable {
        public MyOwnException(String invalidInteger) {
        }
    }
}
