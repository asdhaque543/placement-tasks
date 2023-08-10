package aug9;
import java.util.*;

public class swapNums {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int n1=sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int n2=sc.nextInt();
		System.out.println("Before Swapping:\nN1 = "+n1+"\nN2 = "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After Swapping:\nN1 = "+n1+"\nN2 = "+n2);
	}
}
