package spoj.stacksqueues;

import java.util.Scanner;
import java.util.Stack;

public class JNEXT {
	static int top = -1;
	static int[] no;

	public static void main(String[] args) throws Exception {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		System.out.println(s.toString());
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int i;
			int n = sc.nextInt();
			no = new int[n];
			double num = 0;
			for (i = 0; i < n; i++) {
				no[i] = 0;
				push(sc.nextInt());
				num = num + no[i]*Math.pow(10, n-i-1);
			}
			//check(num);
		}
	}

	private static void check(double num) throws Exception {
		int p1 = pop();
		int p2 = pop();
		push(p1);
		push(p2);
	}

	static int pop() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is empty");
		} else
			return no[top--];

	}
	
	static void push(int v) {
		no[++top] = v;
	}
	
	static void popN(int n) throws Exception
	{
	 int ar[] = new int[n];
	 for(int i = 0; i<n;i++)
	 {
	  ar[i] = pop();
	 }
	 for(int j=0;j<n;j++)
	 {
	  push(ar[j]);
	 }
	}

}
