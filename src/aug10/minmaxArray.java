package aug10;

import java.util.Scanner;

public class minmaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Eneter the element number "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for (int i = 1; i < n; i++) {
            if (a[i]>max) {
                max=a[i];
            }
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("MAXIMUM Element = "+max);
        System.out.println("MINIMUM Element = "+min);
    }
}
