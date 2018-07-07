package codechef.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// gfg 
public class ShuffleIntegers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int a[] = new int[n];
			int i = 0;
			while(tk.hasMoreTokens()) {
				a[i] = Integer.parseInt(tk.nextToken());
				i++;
			}
		}
	}

}
