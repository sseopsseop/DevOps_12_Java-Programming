package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListEx {
	public static void main(String[] args) {
//		List<String> sourceArr = createStringList();
//		for(int i = 0; i < sourceArr.size(); ++i) {
//			System.out.println(sourceArr.get(i));
//		}
		
		// 2. 사용자가 입력한 문자열을 StringBuilder 객체에 저장하고
		// 길이를 10씩 잘라서 List<StrintgBuilder>에 저장하고 출력하세요

		List<StringBuilder> strBuilderArr = new ArrayList<StringBuilder>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		StringBuilder strBuilder = new StringBuilder(sc.nextLine());
		
		for(int i = 0; i < strBuilder.length(); i+=10) {
			int startIdx = i;
			int lastIdx = i+10;
			lastIdx = lastIdx < strBuilder.length() ? lastIdx : strBuilder.length();
			strBuilderArr.add(new StringBuilder(strBuilder.substring(startIdx, lastIdx)));
		}
		
		for(int i = 0; i < strBuilderArr.size(); ++i) {
			System.out.println(strBuilderArr.get(i));
		}
		
		sc.close();
	}
	
	// 1. 사용자가 입력한 5개의 문자열을 List<String>에 저장해서 리턴하는 메소드를 구현하세요.
	public static List<String> createStringList(){
		
		List<String> saveStrArr = new ArrayList<String>();
		int inputSize = 5;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < inputSize; ++i) {
			System.out.print(i+"번째 문자열 :");
			saveStrArr.add(sc.nextLine());
		}
		
		sc.close();
		return saveStrArr;
	}
}
