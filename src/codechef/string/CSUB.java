package codechef.string;

import java.util.Scanner;

public class CSUB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			String str = sc.next();
			long cnt = str.chars().filter(i -> i == '1').count();
			long sum = 0;
			while (cnt != 0) {
				sum = sum + cnt;
				cnt--;
			}
			System.out.println(sum);
		}
	}
}
