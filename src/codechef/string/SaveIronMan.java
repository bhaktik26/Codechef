package codechef.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SaveIronMan {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- != 0) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder(str);
			int n = sb.length();
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i < n ; i++) {
				char[] arr = sb.toString().toCharArray();
				if(arr[i] == ' ')
					list.add(i);
				else if((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= '0' && arr[i] <= '9'))
				{
					
				}
				else
					list.add(i);
			}
			for(int j = list.size() - 1; j>=0;j--)
				sb.deleteCharAt(list.get(j));
			str = sb.toString();
			if(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
				System.out.println("YES");
			else 
				System.out.println("NO");
		
		}
	}
}
