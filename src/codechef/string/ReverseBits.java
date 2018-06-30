package codechef.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseBits {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int no = Integer.parseInt(br.readLine());
			String str = Integer.toBinaryString(no);
			int n = str.length();
			String zeroString = "0";
			// append the reqd no of 0's, till length of string is not equal to
			// 32
			for (int i = 1; i < 32 - n; i++)
				zeroString = zeroString.concat("0");
			// append the 0 string to actual string
			str = zeroString.concat(str);
			// reverse the string
			str = new StringBuilder(str).reverse().toString();
			char[] arr = str.toCharArray();
			int[] intA = new int[arr.length];
			// store the values in int array, if u use char[] values it takes
			// ascii value of 0 and 1
			for (int p = 0; p < arr.length; p++) {
				if (arr[p] == '1')
					intA[p] = 1;
				else
					intA[p] = 0;
			}
			long newNo = 0;
			// convert the binary no to decimal no
			for (int k = 0; k < arr.length; k++)
				newNo = (long) (newNo + intA[k] * Math.pow(2, arr.length - k - 1));
			System.out.println(newNo);
		}
	}
}
