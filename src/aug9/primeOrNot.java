package aug9;
import java.util.*;
public class primeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check PRIME or NOT: ");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
