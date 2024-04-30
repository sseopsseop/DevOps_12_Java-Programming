package chap06_method.game;

import java.util.Random;

public class Lotto {
	// 1. 1~45까지 숫자 중 랜덤 값 7개를 저장해서 배열로 리턴하는 메소드 generateLottoArray를 구현하세요.
	// 매개변수 없음
	public int[] generateLottoArray() {
		int[] lottoArr = new int[7];
		Random rand = new Random();
		
		for(int i = 0; i < lottoArr.length; ++i) {
			lottoArr[i] = rand.nextInt(45) + 1;
			if(isDuplicated(lottoArr, i)) i--;
		}
		
		return lottoArr;
		
	}
	
	
	// 2. 정수형 배열과 int 타입의 인덱스를 매개변수로 받아서 중복체크하는 메소드 isDuplicated를 구현하세요.
	// 리턴타입 boolean => 중복이 됐으면 true 리턴, 중복이 없으면 false 리턴
	public boolean isDuplicated(int[] intArr, int idx) {
		for(int i = 0; i < idx; ++i) {
			if(intArr[i] == intArr[idx]) return true;
		}
		
		return false;
	}
	
//	public static void main(String[] args) {
//		Lotto lotto = new Lotto();
//		int[] lottoArr = lotto.generateLottoArray();
//		
//		for(int i = 0 ; i < lottoArr.length; ++i)
//			System.out.print(lottoArr[i] + " ");
//	}
}
