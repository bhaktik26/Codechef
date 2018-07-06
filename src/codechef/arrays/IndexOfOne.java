package codechef.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class IndexOfOne {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			List<Integer> list = new ArrayList<>();
			while(tk.hasMoreTokens())
				list.add(Integer.parseInt(tk.nextToken()));
			int index = list.indexOf(1);
			System.out.println(index);
		}

	}

}
