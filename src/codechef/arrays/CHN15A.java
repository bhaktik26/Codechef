package codechef.arrays;

import java.util.Scanner;

public class CHN15A {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int cnt = 0;
			for (int i = 0; i <n ; i++) {
				int no = sc.nextInt();
				no = no + k;
				if(no % 7 ==0)
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}

