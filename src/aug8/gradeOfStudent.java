package aug8;
import java.util.Scanner;

public class gradeOfStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Mark Here: ");
        int m=sc.nextInt();
        if ((m>=90) && (m<=100)) {
            System.out.println("Grade: O");
        } 
        else if((m>=80) && (m<90)) {
            System.out.println("Grade: A+");
        }
        else if((m>=70) && (m<80)){
            System.out.println("Grade: A");
        }
        else if((m>=60) && (m<70)){
            System.out.println("Grade: B+");
        }
        else if((m>=50) && (m<60)){
            System.out.println("Grade: B");
        }
        else if((m>=0) && (m<50)){
            System.out.println("Grade: RA");
        }
    }
}
