package aug10;

import java.util.*;

public class searchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();
        int[] arr = { 34, 57, 33, 23, 90 };

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Key element found in index " + i);
            }
        }

    }
}
