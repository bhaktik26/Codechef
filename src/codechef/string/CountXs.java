package codechef.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// gfg
public class CountXs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int x = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(tk.nextToken());
			int u = Integer.parseInt(tk.nextToken());
			int count = 0;
			for (int i = l + 1; i < u; i++) {
				int no = i;
				// get all digits of each no and check if it is equal to x
				while (no != 0) {
					int digit = no % 10;
					no = no / 10;
					if (digit == x)
						count++;
				}
			}
			System.out.println(count);
		}
	}
}
