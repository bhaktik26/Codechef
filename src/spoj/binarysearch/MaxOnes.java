package spoj.binarysearch;

import java.util.Scanner;

//gfg
public class MaxOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int m[][] = new int[r][c];
			int i, j, count, max = Integer.MIN_VALUE, index = 0;
			for (i = 0; i < r; i++) {

				count = 0;
				for (j = 0; j < c; j++) {
					m[i][j] = sc.nextInt();
					if (m[i][j] == 1) {
						count++;
					}
				}
				if (count > max) {
					max = count;
					index = i;
				}
			}
			System.out.println(index);
		}
	}

}
