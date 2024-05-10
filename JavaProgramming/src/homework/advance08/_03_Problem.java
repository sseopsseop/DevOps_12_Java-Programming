package homework.advance08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//	    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//	    ex) [1, 2, 3, 4, 5] => 4, 5 출력
		
		List<Integer> intArrList = new ArrayList<Integer>();
		int arrSize = 5;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arrSize; ++i) {
			intArrList.add(Integer.valueOf(sc.nextInt()));
		}
		sc.nextLine();
		
		int max = 0;
		int maxIdx = 0;
		for(int i = 0; i < intArrList.size()-1; ++i) {
			if(max < intArrList.get(i) + intArrList.get(i+1)) {
				max = intArrList.get(i) + intArrList.get(i+1);
				maxIdx = i;
			}
		}
		
		System.out.println(intArrList.get(maxIdx) + ", " + intArrList.get(maxIdx+1));
		
	}
}