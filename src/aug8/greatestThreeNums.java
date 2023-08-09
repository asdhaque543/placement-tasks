package aug8;
import java.util.Scanner;

public class greatestThreeNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2=sc.nextInt();        
        System.out.print("Enter the third number: ");
        int n3=sc.nextInt();
        if ((n1>=n2) && (n1>=n3)) {
            System.out.println(n1+" is the Greatest of Three Numbers");
        } else if((n2>=n1) && (n2>=n3)) {
            System.out.println(n2+" is the Greatest of Three Numbers");
        }
        else {
            System.out.println(n3+" is the Greatest of Three Numbers");
        }
    }
}
