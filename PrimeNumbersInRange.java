import java.util.*;

public class PrimeNumbersInRange {

	// function which checks whether a number is Prime or Not
	// If the number is prime, it returns true. Else, it returns false.
	public static boolean isPrime(int n) {
		// 0 and 1 are neither prime nor composite numbers
		if (n == 0 || n == 1) {
			return false;
		}
		// 2 is a prime number
		if (n == 2) {
			return true;
		}
		// every composite number has a prime factor
		// less than or equal to its square root.
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ask user to enter lower value of interval
		System.out.print("Enter lower number of the interval: ");
		int n1 = sc.nextInt(); // Take input

		System.out.print("\nEnter upper number of the interval: ");
		int n2 = sc.nextInt(); 

		// Print display message
		System.out.printf("\nPrime numbers between %d and %d are: ", n1, n2);

		for (int i = n1; i <= n2; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
