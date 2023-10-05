import java.util.*;

public class prime1 {
     static boolean isPrime(int n) {
		
		if (n == 0 || n == 1) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}
		
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter n1: ");
		int n1= s.nextInt(); 

		
		System.out.print("\nEnter n2: ");
		int n2 = s.nextInt();

		
		System.out.printf("\nPrime numbers between "+n1+" and "+n2+" are: ");

		for (int i = n1; i <= n2; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		s.close();
	}
}

