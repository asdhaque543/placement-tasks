package aug10;

import java.util.*;

public class duplicatesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter the element number "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("Duplicate element is: " + arr[i]+" ");
                }
            }
        }

    }
}