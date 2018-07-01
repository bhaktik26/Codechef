package spoj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//gfg
public class FacingTheSun {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int noOfBuildings = Integer.parseInt(br.readLine());
			int height[] = new int[noOfBuildings];
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int i = 0;
			int count = 1;
			while (tk.hasMoreTokens()) {
				height[i] = Integer.parseInt(tk.nextToken());
				i++;
			}
			int peak = height[0];
			for (i = 1; i < noOfBuildings; i++) {
				if (peak < height[i]) {
					count++;
					peak = height[i];
				}
			}
			System.out.println(count);
		}
	}
}
