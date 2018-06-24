package codechef.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// geeks 
public class ArraySubset {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- != 0) {
			List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(tk1.nextToken());
			int n2 = Integer.parseInt(tk1.nextToken());
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			while (tk2.hasMoreTokens())
				list1.add(Integer.parseInt(tk2.nextToken()));
			StringTokenizer tk3 = new StringTokenizer(br.readLine());
			while (tk3.hasMoreTokens())
				list2.add(Integer.parseInt(tk3.nextToken()));
			if (list1.containsAll(list2))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
