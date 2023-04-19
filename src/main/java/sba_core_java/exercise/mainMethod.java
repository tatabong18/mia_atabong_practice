package sba_core_java.exercise;

import java.util.ArrayList;

public class mainMethod {
    public static void main(String[] args) {
        String[] myStringArrayTestValue = {"life", "is", "worth",
                "living", "with", "passion"};
        MyOperation myOp = new MyOperation();
        myOp.convertStringArrayIntoArrayList(myStringArrayTestValue);
        System.out.println(myOp.getMyArrayList());

        myOp.replaceAnElementInTheStringArrayListGiven(1);
        System.out.println(myOp.getMyArrayList());

        ArrayList<String> myNewArrayList =
                myOp.createANewArrayListFromExistingArray();
        System.out.println(myNewArrayList);

            }
        }
