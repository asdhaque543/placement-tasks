package aug9;
import java.util.*;
public class oddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to CHECK ODD or EVEN: ");
		int n=sc.nextInt();
		int res=(n/2)*2;
		if(res==n) {
			System.out.println(n+" is Even");
		}
		else {
			System.out.println(n+" is Odd");
		}
	}
}