package homework.advance08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_Problem {
//	4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
	
	public static void main(String[] args) {
		List<Integer> intArrList = new ArrayList<Integer>();
		List<Integer> resArrList = new ArrayList<Integer>();
		
		int arrSize = 6;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arrSize; ++i) {
			intArrList.add(Integer.valueOf(sc.nextInt()));
		}
		sc.nextLine();
		
		for(int i = 0; i < intArrList.size(); ++i) {
			for(int j = i+1; j < intArrList.size(); ++j) {
				resArrList.add(intArrList.get(i) + intArrList.get(j));
			}
		}
		System.out.println(resArrList);
		for(int i = 0; i < resArrList.size(); ++i) {
			boolean isDuplicated = false;
			for(int j = i+1; j < resArrList.size(); ++j) {
				if(resArrList.get(i).intValue() == resArrList.get(j).intValue()) {
					resArrList.remove(j--);
					isDuplicated = true;
				}
			}
			if(isDuplicated) {
				resArrList.remove(i--);
			}
		}
		
		System.out.println(resArrList);
		
		
		
		sc.close();
	}
}
