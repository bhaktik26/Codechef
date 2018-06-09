package codechef.may;

import java.util.Scanner;

public class CHEFRUN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int x3 = sc.nextInt();
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			float t1 = (float) (x3 - x1) / s1;
			float t2 = (float) (x2 - x3) / s2;
			if (t1 < t2)
				System.out.println("Chef");
			if (t1 > t2)
				System.out.println("Kefa");
			if (t1 == t2)
				System.out.println("Draw");
		}
	}
}
