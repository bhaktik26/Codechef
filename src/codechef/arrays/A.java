package codechef.arrays;

import java.util.Scanner;

public class A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int moreRequired = x-y;
			int k = sc.nextInt();
			int n = sc.nextInt();
			boolean flag = false;
			for(int j=0;j<n;j++){
				int pages = sc.nextInt();
				int cost = sc.nextInt();
				if(pages>=moreRequired && cost<=k)	flag=true;
			}
			if(flag==true)	System.out.println("LuckyChef");
			else	System.out.println("UnluckyChef");
		}
		
	
	}
}
