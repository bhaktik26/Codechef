package codechef.misc;

public class SumOfDigits {
	// to find sum of digits of a number
	public static void main(String[] args) {
		int n = 234;
		// String.valueOf will return the string representation of n. chars()
		// converts it into IntStream, getNumericValue is the int value tht the
		// character represents
		int sum = String.valueOf(n).chars().map(Character::getNumericValue).sum();
		System.out.println(sum);

	}

}
