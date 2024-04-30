package chap05_array;

import java.util.Random;

public class _04_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		// 0, 1, 2 중 랜덤한 값
		int randomVal = random.nextInt(3);
		System.out.println(randomVal);
		System.out.println("-----------------------");
		
		// 1, 2, 3 중 랜덤한 값
		randomVal = random.nextInt(3) + 1;
		System.out.println(randomVal);
		System.out.println("-----------------------");
		
		// 1 ~ 100 중 랜덤한 값
		randomVal = random.nextInt(100) + 1;
		System.out.println(randomVal);
		System.out.println("-----------------------");
		
		// 2. 자바에서 랜덤 값 생성 방법 2: Math 클래스의 Random() 메소드 사용
		// 0 <= Math.random() < 1 의 실수 값을 랜덤으로 리턴
		// 0 * 10 <= Math.random() * 10 < 1 * 10
		// (int)0 * 10 <= ((int)Math.random()) * 10 < (int) i * 10 
		// (int)0 * 10 + 1 <= ((int)Math.random()) * 10 + 1 < (int) i * 10 + 1
		
		randomVal = (int)(Math.random() * 10) + 1;
		System.out.println(randomVal);
		System.out.println("-----------------------");
		
		// 3. 정수 10개를 저장하는 배열을 생성하고 1 ~ 100 까지의 랜덤값을 10개 저장하고 출력하세요.
		int[] randArr = new int[10];
		
		for(int i = 0 ; i < randArr.length; ++i) {
//			randArr[i] = random.nextInt(100) + 1;
			randArr[i] = (int)(Math.random() * 100) + 1;
			System.out.print(randArr[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
	}

}