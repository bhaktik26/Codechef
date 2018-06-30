package spoj.stacksqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class STPAR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			Queue<Integer> input = new LinkedList<>();
			while(tk.hasMoreTokens())
				input.add(Integer.parseInt(tk.nextToken()));
			Stack<Integer> sortedStack = new Stack<>();
			Stack<Integer> sideStack = new Stack<>();
			int min = input.stream().min(Comparator.naturalOrder()).get();
			int firstElement = input.remove();
			if(firstElement == min)
				sortedStack.push(firstElement);
			else
				sideStack.push(firstElement);
			while(input.size()!=0) {
				int pop = input.remove();
				if(pop > sortedStack.peek() && pop < sideStack.peek())
					sortedStack.push(pop);
				else
					sideStack.push(pop);
			}	
			System.out.println(input.size());
			System.out.println(sortedStack);
			System.out.println(sideStack);
		}
	}
}
