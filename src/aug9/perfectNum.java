package aug9;
import java.util.*;
public class perfectNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check the Number is PERFECT or NOT: ");
		int n=sc.nextInt();
		int perfectsum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				perfectsum=perfectsum+i;
			}
		}
		if(perfectsum==n) {
			System.out.println("It is Perfect Number");
		}
		else {
			System.out.println("It is not a Perfect Number");
		}
	}

}
