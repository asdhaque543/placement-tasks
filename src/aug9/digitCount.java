package aug9;
import java.util.*;
public class digitCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to count the digits: ");
		int n=sc.nextInt();
		int digit=0;
		while(n!=0) {
			n=n/10;
			digit++;
		}
		System.out.println("no.of digits = "+digit);
	}
}