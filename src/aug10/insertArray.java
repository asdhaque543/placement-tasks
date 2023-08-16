package aug10;

import java.util.*;

public class insertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int element = sc.nextInt();

        int[] arr = { 34, 89, 67, 23, 98, 21, 32 };
        System.out.println("Before inserting: " + Arrays.toString(arr));

        int[] arr2 = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (i == pos) {
                arr2[i] = element;
            } else {
                arr2[i] = arr[j];
                j++;
            }
        }
        System.out.println("After inserting: " + Arrays.toString(arr2));
    }
}