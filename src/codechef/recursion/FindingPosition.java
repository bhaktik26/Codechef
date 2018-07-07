package codechef.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// gfg 
public class FindingPosition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0) {
			int no = Integer.parseInt(br.readLine());
			for(int i =0; ; i++) {
				if(no>=Math.pow(2, i) && no < Math.pow(2, i+1))
				{
					System.out.println((int)Math.pow(2, i));
					break;
				}
			}
		}
	}
}
