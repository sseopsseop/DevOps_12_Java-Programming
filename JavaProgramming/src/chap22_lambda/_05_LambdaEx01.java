package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.IndexOfString;

public class _05_LambdaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		indexOfString((str1, str2) -> {
//			int res = -1;
//			
//			if(str1.length() < str2.length()) {
//				return res;
//			}
//			
//			for(int i = 0; i < str1.length(); ++i) {
//				if(str1.substring(i).length() < str2.length()) break;
//				if(str1.charAt(i) == str2.charAt(0)) {
//					res = i;
//					for(int j = 1; j < str2.length(); ++j) {
//						if(str1.charAt(i+j) != str2.charAt(j)) res = -1;
//					}
//				}
//				if(res == i) break;
//			}
//		
//			return res;
//		});
		indexOfString((str1, str2) -> str1.indexOf(str2));
	}
	
	// 문자열 2개를 입력받아서
	// 첫 번째 입력받은 문자열에서
	// 두 분째 입력받은 문자열이 어느 위치(인덱스)에 있는 지 검사하는 메소드를 구현하세요.
	// 매개변수는 함수형 인터페이스인 IndexOfString을 받습니다.
	// 검사해서 첫 번째 문자열에 두 번째 문자열이 포함되어있으면
	// 감사합니다. 에서 합니의 인덱스는 2입니다. 라고 출력
	// 검사해서 첫 번째 문자열에 두 번째 문자열이 포함되어있지 않으면
	// 감사합니다. 에서 가나다를 찾을수 없습니다. 라고 출력
	public static void indexOfString(IndexOfString iof) {
		Scanner sc = new Scanner(System.in);
		
		int res;
		System.out.print("문자열 1 입력 : ");
		String str1 = sc.nextLine();
		

		System.out.print("문자열 2 입력 : ");
		String str2 = sc.nextLine();
		
		// findIndex 메소드를 호출하면서 매개변수로 전달한 람다식이 실행된다,.
		res = iof.indexOf(str1, str2);
		if(res == -1) 
			System.out.println(str1+"에서 "+str2+"를 찾을 수 없습니다.");
		else
			System.out.println(str1+"에서 "+str2+"의 인덱스는 "+res+"입니다.");
		
		sc.close();
	}

}
