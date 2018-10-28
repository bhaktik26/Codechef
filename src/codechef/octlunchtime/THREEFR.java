package codechef.octlunchtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class THREEFR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			List<Integer> rupees = new ArrayList<>();
			while (tk.hasMoreTokens())
				rupees.add(Integer.parseInt(tk.nextToken()));
			// sort in descending order
			Collections.sort(rupees, Comparator.reverseOrder());
			// |x| + |y| + |z| = 0
			// sum of the other 2 nos = max of the 3
			if (rupees.get(0) == rupees.get(1) + rupees.get(2))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
