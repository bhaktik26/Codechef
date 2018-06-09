package codechef.arrays;

import java.util.Scanner;

public class CNote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- !=0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int k = sc.nextInt();
			int n = sc.nextInt();
			int req = x-y;
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				if (p >= req && c <= k)
					flag = true;
			}
			if (flag == true)
				System.out.println("LuckyChef");
			else
				System.out.println("UnluckyChef");
		}
	}
}
