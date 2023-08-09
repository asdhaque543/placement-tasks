import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to start Tables: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int res = i * n;
            System.out.println(i + " x " + n + " = " + res);
        }
    }
}