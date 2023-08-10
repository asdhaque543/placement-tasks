package aug9;

import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check Palindrome or Not: ");
        int n=sc.nextInt();
        String numString=Integer.toString(n);
        String revNumString="";
        for (int i = numString.length()-1; i >= 0; i--) {
            revNumString+=numString.charAt(i);
        }
        int revNum=Integer.parseInt(revNumString);
        if(revNum==n){
            System.out.println(n+" is a Palindrome");
        }else{
            System.out.println(n+" is not a Palindrome");
        }
    }
}
