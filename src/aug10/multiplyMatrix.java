package aug10;

import java.util.*;

public class multiplyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int[][] arr = new int[s][s];
        int[][] arr2 = new int[s][s];
        int[][] add = new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                for (int k = 0; k < s; k++) {

                    add[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println("");
        }

    }
}