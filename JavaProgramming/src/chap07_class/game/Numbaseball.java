package chap07_class.game;

import java.util.Scanner;

public class Numbaseball {
	// 1. 컴퓨터가 0~9 까지 숫자 중 랜덤한 값 3개를 배열에 저장(중복불가능)
	// 2. 사용자가 0~9 까지 숫자 세개 입력(중복 불가능)
	// 3. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 다르면 볼로 판단
	// 4. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 같으면 스트라이크로 판단
	// com{1,2,3} user{1,3,5} ==> 1스트라이크 1볼
	// com{1,2,3} user{4,5,6} ==> 0스트라이크 0볼
	// com{1,2,3} user{2,3,1} ==> 0스트라이크 3볼
	// com{1,2,3} user{1,2,3} ==> 3스트라이크 아웃 게임종료
	
	// 클래스에 필요한 필드
	
	int strike = 0;
	int ball = 0;
	
	int[] com = new int[3];
	int[] user = new int[3];
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		// com 배열에 3개의 숫자 저장
		for(int i = 0; i < com.length; ++i) {
			com[i] = (int)(Math.random() * 10);
			for(int j = 0; j < i; ++j) {
				if(checkDuplicatedValue(com[i], com[j])) {
					i--;
					break;
				}
			}
		}
		
		
		// 3스트라이크 아웃이 될때까지 사용자의 입력값 받기
		while(true) {
			strike = 0;
			ball = 0;
			
			for(int comNum : com)
				System.out.print(comNum);
			System.out.println();
			
			for(int i = 0; i < user.length; ++i) {
				System.out.print(i+"번째 수 입력 : ");
				user[i] = sc.nextInt();
				if(user[i] < 0 || user[i] > 9) {
					System.out.println("잘못 입력하셨습니다");
					i--;
					continue;
				}
				for(int j = 0; j < i; ++j) {
					if(checkDuplicatedValue(user[i], user[j])) {
						i--;
						break;
					}
				}
			}
			
			// 사용자 입력 값 확인
			for(int userNum : user) {
				System.out.print(userNum);
			}
			System.out.println();
			
			checkNumbaseball();
			printResult();
			if(strike == 3) break;
			System.out.println();
		}
		
		System.out.println(" 게임 종료");
		
		sc.close();
	}
	
	public boolean checkDuplicatedValue(int num1, int num2) {
		if(num1 == num2) return true;
		
		return false;
	}
	
	public void checkNumbaseball() {
		for(int i = 0; i < com.length; ++i) {
			for(int j = 0; j < user.length; ++j) {
				if(com[i] == user[j]) {
					if(i == j) strike++;
					else ball++;
				}
			}
		}

	}
	
	public void printResult() {
		System.out.print(strike+"스트라이크 "+ball +"볼");
	}
	
}
