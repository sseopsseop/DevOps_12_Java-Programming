package chap16_usefulclass;

import java.util.Scanner;

public class _05_StringEx {
	public static void main(String[] args) {
		// 사용자가 문자열 두개 입력하여 str1, str2에 저장
		// str1이 str2를 포함하면 str1에 있는 str2를 빈칸으로 변경해서 출력
		// str1이 str2를 포함하지 않으면 str1에서 str2를 찾을 수 없습니다. 출력
		
		String str1, str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 1 입력 : ");
		str1 = sc.nextLine();
		
		System.out.print("문자열 2 입력 : ");
		str2 = sc.nextLine();
		
		// String 객체의 contains() 메소드 이용
		if(str1.contains(str2)) {
			System.out.println(str1.replace(str2, ""));
		}else {
			System.out.println(str1+"에서 "+str2+"를 찾을 수 없습니다.");
		}

		// String 객체의 indexOf() 메소드 이용
//		if(str1.indexOf(str2) != -1) {
//			System.out.println(str1.replace(str2, ""));
//		}else {
//			System.out.println(str1 + "에서 " + str2 + "를 찾을 수 없습니다.");
//		}
		
		sc.close();
	}
}
