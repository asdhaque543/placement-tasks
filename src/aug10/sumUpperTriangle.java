package aug10;

import java.util.*;

public class sumUpperTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sum = 0;

        int[][] arr = new int[s][s];

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (j > i) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("The Sum of Upper Triangle Matrix =  " + sum);
    }
}