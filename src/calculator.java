import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,sum,diff,mul,rem;
        double div;
        System.out.print("Enter the Number1: ");                
        n1=sc.nextInt();
        System.out.print("Enter the Number2: ");
        n2=sc.nextInt();
        System.out.println("(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division\n(5) Modulus");
        System.out.println("Enter the choice to perform the operation: ");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                sum=n1+n2;
                System.out.println("Addition Result: "+sum);
                break;
            case 2:
                diff=n1-n2;
                System.out.println("Subtraction Result: "+diff);
                break;
            case 3:
                mul=n1*n2;
                System.out.println("Multiplication Result: "+mul);
                break;
            case 4:
                div=(double)n1/n2;
                System.out.println("Division Result: "+div);
                break;
            case 5:
                rem=n1%n2;
                System.out.println("Modulus Result: "+rem);
                break;
            default:
                System.out.println("Invalid Choice of Operation");
                break;
        }
    }
}
