package aug10;

import java.util.*;

public class diagonalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int[][] arr = new int[s][s];
        int dia1 = 0;
        int dia2 = 0;

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i == j) {
                    dia1 += arr[i][j];
                }
                if ((i + j) == (s - 1)) {
                    dia2 += arr[i][j];
                }
            }
        }

        System.out.println(dia1);
        System.out.println(dia2);
    }
}