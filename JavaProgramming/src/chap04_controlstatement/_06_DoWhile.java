package chap04_controlstatement;

public class _06_DoWhile {
	public static void main(String[] args) {
		// 1. do-While: 조건식을 따지기 전에 소스코드를 무조건 1회 실행
		do {
			System.out.println("무조건 1회 실행");
		}while(10 < 5);
		
		// while 문에서는 조건이 false 면 1회도 실행이 되지 않는다.
		int i = 0;
		while(i > 10) {
			System.out.println("실행되지 않음");
		}
		
		// 2. 1~20까지의 정수 중 3의 배수만 출력하는 do~while구문을 작성하세요.
		int j = 1;
		do {
			if(j % 3 == 0) System.out.println(j + " : 3의 배수");
		}while(j++ < 20);
	}
}
