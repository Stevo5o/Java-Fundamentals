package B01Advanced;

//~--- JDK imports ------------------------------------------------------------

/** @author Stephen */
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[] listNum = new int[10];

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = (int) (Math.random() * 20);
        }

        // print Min or Max
        System.out.println("\nType *Min* to Print Minimum");
        System.out.println("Type *Max* to Print Maximum");

        Scanner printInput = new Scanner(System.in);
        String  next       = printInput.nextLine();

        if (next.equalsIgnoreCase("min")) {
            System.out.println("This is the Min :" + getMinValue(listNum));
            printArray(listNum);
        }

        if (next.equalsIgnoreCase("max")) {
            System.out.println("This is the Max :" + getMaxValue(listNum));
            printArray(listNum);
        }
    }

    // getting the maximum value
    public static int getMaxValue(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    // getting the miniumum value
    public static int getMinValue(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    // this method prints the elements in an array......
    // if this case is true, then that's enough to prove to you that the user
    // input has //been stored in an array!!!!!!!
    public static void printArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
