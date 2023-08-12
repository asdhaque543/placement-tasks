package aug10;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter the element number "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Reversed Array is: ");
        for (int i = s-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
