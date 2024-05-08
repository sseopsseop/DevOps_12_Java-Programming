package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {
	public static void main(String[] args) {
		 // 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하세요.
		// Math.max, Math.min  메소드를 이용하세요
		int[] intArr = new int[5];
		
		int maxIdx = 0;
		int minIdx = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < intArr.length; ++i) {
			System.out.print(i+1+"번째 정수 입력 : ");
			intArr[i] = sc.nextInt();
			if(Math.max(intArr[maxIdx], intArr[i]) != intArr[maxIdx]){
				maxIdx = i;
			}
			if(Math.min(intArr[minIdx], intArr[i]) != intArr[minIdx]){
				minIdx = i;
			}
		}
		sc.nextLine();
	

		System.out.println("최대값 : " + intArr[maxIdx]);
		System.out.println("최소값 : " + intArr[minIdx]);
		
		sc.close();
	}
}
