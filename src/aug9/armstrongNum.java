package aug9;

import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to Check Armstrong Number or Not: ");
        int n=sc.nextInt();
        int temp=n;
        int digits=0,last=0,sum=0;
        while (temp>0) {
            temp/=10;
            digits++;
        }
        temp=n;
        while (temp>0) {
            last=temp%10;
            sum+=(Math.pow(last, digits));
            temp/=10;
        }
        if (sum==n) {
            System.out.println(n+" is an Armstrong Number");
        } else {
            System.out.println(n+" is not an Armstrong Number");
        }
    }
}
