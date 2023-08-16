package aug10;

import java.util.*;

public class deleteArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newarr = new int[arr.length - 1];
        int j = 3;
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != j) {
                newarr[k] = arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(newarr));
    }
}