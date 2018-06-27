package codechef.flmock03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHEFSOCK {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		// cost of jacket
		int jacketCost = Integer.parseInt(tk.nextToken());
		// cost of single sock
		int sockCost = Integer.parseInt(tk.nextToken());
		// amt of initial money
		int money = Integer.parseInt(tk.nextToken());
		int moneyForSocks = money - jacketCost;
		int noOfSocks = moneyForSocks / sockCost;
		// if no of socks that can be purchased is even, it ll be a pair and
		// chef wont have a single sock
		if (noOfSocks % 2 == 0)
			System.out.println("Lucky Chef");
		else
			System.out.println("Unlucky Chef");
	}
}
