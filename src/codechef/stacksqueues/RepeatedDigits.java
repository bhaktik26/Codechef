package codechef.stacksqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// not
public class RepeatedDigits {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			long n = Long.parseLong(br.readLine());
			Stack<Integer> st = new Stack<>();
			while (n != 0) {
				int digit = (int) (n % 10);
				n = n / 10;
				if (st.empty() || st.search(digit) == -1)
					st.push(digit);
			}
			int arr[] = new int[st.size()];
			int no = 0;
			for (int j = 0; j <= arr.length - 1; j++) {
				arr[j] = st.pop();
				no = (int) (no + arr[j] * Math.pow(10, arr.length - 1 - j));
			}
			System.out.println(no);
		}
	}
}
