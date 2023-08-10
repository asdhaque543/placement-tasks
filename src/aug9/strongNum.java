package aug9;

import java.util.Scanner;

public class strongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check STRONG or NOT: ");
        int n=sc.nextInt();
        int temp=n;
        int i,fact,lastDigit=0,sum=0;
        while (temp!=0) {
            fact=1;
            lastDigit=temp%10;
            for(i=1;i<=lastDigit;i++){
                fact*=i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if (sum==n) {
            System.out.println("It is a STRONG NUMBER");
        } else {
            System.out.println("It is NOT A STRONG NUMBER");
        }
    }
}
