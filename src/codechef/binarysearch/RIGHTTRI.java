package codechef.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class RIGHTTRI {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			// h - hypotenuse, s - area
			long h = Long.parseLong(tk.nextToken());
			long s = Long.parseLong(tk.nextToken());
			// h = squareroot of (l^2 + b^2) , s = 0.5lb
			// get quadratic equation 
			// calculate discriminant
			double discriminant = Math.pow(h, 2) - 4 * s;
			double sqRootD = Math.sqrt(discriminant);
			double sqRootB = Math.sqrt(h * h + 4 * s);
			if (discriminant >= 0) {
				double l = (sqRootB + sqRootD) / 2;
				double b = (sqRootB - sqRootD) / 2;
				DecimalFormat dec = new DecimalFormat("#0.000000");

				if (l < b)
					System.out.println(dec.format(l) + " " + dec.format(b) + " " + dec.format(h));
				else
					System.out.println(dec.format(b) + " " + dec.format(l) + " " + dec.format(h));
			} else
				System.out.println("-1");

		}
	}
}
