package aug10;

import java.util.*;

public class ascending_descending {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 3, 2, 7, 4, 8 };
        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = len - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
