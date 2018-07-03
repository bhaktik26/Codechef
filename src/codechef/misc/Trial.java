package codechef.misc;

import java.math.BigInteger;
import java.util.Random;

public class Trial {

	public static void main(String[] args) {
		System.out.println(getBiggerPrime(10));
	}

	public static long getBiggerPrime(int m) {
		BigInteger prime = BigInteger.probablePrime(getNumberOfBits(m) + 1, new Random());
		return prime.longValue();
	}

	private static int getNumberOfBits(int number) {
		return Integer.SIZE - Integer.numberOfLeadingZeros(number);
	}

}
