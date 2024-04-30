package chap05_array;

public class _02_ArrayExample {
	public static void main(String[] args) {
		// 1. 10개의 정수를 저장하는 배열을 생성하고 3의 배수만 10개 저장하세요.
		
		int intArrLen = 10;
		int[] intArr = new int[intArrLen];
		
		
		// for 문
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = 3*(i+1);
			System.out.print(intArr[i] + " "); 
		}

		System.out.println();
		
		// while 문
		int j = 0;
		while(j < intArr.length) {
			intArr[j] = 3 * (j + 1);
			System.out.print(intArr[j++] + " ");
		}

		System.out.println();

	}

}