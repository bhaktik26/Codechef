package codechef.recursion;

import java.util.Scanner;

public class TRISQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			System.out.println(calcNoOfSquares(n));
		}
	}

	private static int calcNoOfSquares(int n) {
		// if length of base of triangle is 1 or 2
		if (n == 1 || n == 2)
			return 0;
		// base is greater than 2, side of square is 2
		return (n - 2) / 2 + calcNoOfSquares(n - 2);
	}
}
