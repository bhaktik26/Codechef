package codechef.binarysearch;

import java.util.Scanner;

public class STACKS {

	public static int find(int[] a, int start, int end, int val) {
		if (start == end)
			return start;
		int mid = (start + end) / 2;
		if (val >= a[mid])
			return find(a, mid + 1, end, val);
		else
			return find(a, start, mid, val);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = Integer.MAX_VALUE;
			for (i = 0; i < n; i++) {
				int temp = sc.nextInt();
				int index = find(a, 0, n - 1, temp);
				a[index] = temp;
			}
			int count = 0;
			for (i = 0; i < n && a[i] != Integer.MAX_VALUE; i++)
				count++;
			System.out.print(count + " ");
			for (i = 0; i < n && a[i] != Integer.MAX_VALUE; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}

	}

}
