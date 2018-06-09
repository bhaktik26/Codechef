package codechef.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LAPIN {
	static String str1;
	static String str2;
	static Map<Character, Integer> map1 = new HashMap<>();
	static Map<Character, Integer> map2 = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			String str = sc.next();
			int len = str.length();
			if (len % 2 == 0) {
				str1 = str.substring(0, len / 2);
				str2 = str.substring(len / 2, len);
				print(str1, str2);
			} else {
				str1 = str.substring(0, (len - 1) / 2);
				str2 = str.substring((len - 1) / 2 + 1, len);
				print(str1, str2);
			}
		}

	}

	public static void print(String str1, String str2) {
		for (char ch : str1.toCharArray()) {
			if (map1.containsKey(ch)) {
				int val = map1.get(ch);
				map1.put(ch, val + 1);
			} else {
				map1.put(ch, 1);
			}
		}
		for (char ch : str2.toCharArray()) {
			if (map2.containsKey(ch)) {
				int val = map2.get(ch);
				map2.put(ch, val + 1);
			} else {
				map2.put(ch, 1);
			}
		}
		if (map1.equals(map2))
			System.out.println("YES");
		else
			System.out.println("NO");
		map1.clear();
		map2.clear();
	}
}
