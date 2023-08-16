package aug10;

import java.util.*;

public class transposeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] arr2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = arr[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}