package sba_core_java.exercise;

import java.util.ArrayList;

public class MyOperation implements IMyOperations {
    private ArrayList<String> myArrayList;

    public MyOperation() {
        myArrayList = new ArrayList<>();
    }

    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {
        for (String str : stringArray) {
            myArrayList.add(str);
        }
    }

    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {
        myArrayList.set(index, "Nah");
    }

    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        ArrayList<String> newArrayList = new ArrayList<>(myArrayList);
        newArrayList.removeIf(str -> str.equals("Nah"));
        return newArrayList;
    }

    public ArrayList<String> getMyArrayList() {
        return myArrayList;
    }
}
