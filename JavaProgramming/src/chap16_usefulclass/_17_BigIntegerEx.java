package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {
	public static void main(String[] args) {
		// 1~100 까지 곱한 값을 구하세요.(100 팩토리얼, 100!)
		BigInteger bigInteger = new BigInteger("1");
		bigInteger = BigInteger.ONE;
		for(int i = 1; i <= 100; ++i) {
			bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
		}
		System.out.println(bigInteger);
		
		long longVal = 10;
		System.out.println(factorial(longVal));
		
		System.out.println(factorialBigInteger(BigInteger.valueOf(100L)));
		
		for(int i = 1; i <= 100; ++i) {
			System.out.println(i + "! = "+factorialBigInteger(BigInteger.valueOf(i)));
		}
	}
	
	public static long factorial(long num) {
		if(num == 0)
			return 1;
		else {
			// 재귀메소드 : 현재 메소드를 구현부안에서 호출
			// num = 10이 들어오면
			// 10 * factorial(9)
			// 10 * 9 * factorial(8)
			// ....
			// 10 * 9 * 8 * 7 * 6 ... factorial(0)
			return num * factorial(num - 1);
		}
	}
	
	public static BigInteger factorialBigInteger(BigInteger bigInt) {
		if(bigInt.longValue() == 0) return BigInteger.ONE;
		else return bigInt.multiply(factorialBigInteger(bigInt.subtract(BigInteger.ONE)));
	}
}
