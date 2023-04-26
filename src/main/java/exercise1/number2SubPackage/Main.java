package sba_core_java.exercise.number2SubPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] myNumberArray = {23, 12, 33, 47};
        double average = getAverage(myNumberArray);
        System.out.printf("%.2f", average);

        MajorLeagueSoccer mls = new MajorLeagueSoccer();
        mls.displayPlayerNumbers();
        mls.sendPlayerToMinorLeague(4);
        mls.sendPlayerToMinorLeague(4);
        mls.transferPlayerToDifferentTeam(6,
                "Tottenham");
        mls.transferPlayerToDifferentTeam(6,
                "Napoli");
    }

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}

