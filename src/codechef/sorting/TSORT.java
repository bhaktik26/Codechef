package codechef.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TSORT {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		while (n-- != 0)
			list.add(Integer.parseInt(br.readLine()));
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
