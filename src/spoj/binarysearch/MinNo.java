package spoj.binarysearch;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//gfg
public class MinNo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {

			int n = sc.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			Arrays.sort(arr);
			System.out.println(arr[0]);
		}
	}
}
