import java.util.Scanner;

// https://www.codechef.com/problems/HS08TEST
class main {
	public static void main(String[] args) {

		// Taking two inputs
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();

		// Applying first condition
		if (n1 % 5 == 0) {

			// Applying second condition
			if ((n1 + 0.5) < n2) {
				System.out.printf("%.2f", n2 - (n1 + 0.5));

			} else {

				System.out.printf("%.2f", n2);

			}

			// If both conditions fail
		} else {

			System.out.printf("%.2f", n2);

		}
	}
}
