package aug8;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an year: ");
        int n=sc.nextInt();
        if ((n%4==0) && (n%100!=0) || (n%400==0)) {
            System.out.println(n+" is a Leap Year");
        } else {
            System.out.println(n+" is not a Leap Year");
        }
    }
}
