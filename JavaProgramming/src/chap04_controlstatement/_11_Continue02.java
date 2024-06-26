package chap04_controlstatement;

import java.util.Scanner;

public class _11_Continue02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		// 3. 사용자가 입력한 숫자 단까지 구구단을 출력하는 프로그램을 작성하세요. 0을 입력하면 종료.
		// 2~9까지의 숫자만 입력할 수 있도록 한다. 다른 숫자를 입력하면 continue 를 이용해서 다시 숫자를 입력하도록 한다. 
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("2~9 까지의 숫자를 입력하세요 : ");
			int inputNum = sc.nextInt();
			
			if(inputNum == 0) {
				System.out.println("구구단 출력 프로그램 종료");
				break;
			}else if(inputNum < 2 || inputNum > 9) {
				System.out.println("2~9 까지의 숫자를 입력해 주세요.");
				continue;
			}
			
			for(int i = 2; i <= inputNum; ++i) {
				System.out.print(i+"단 출력 : ");
				for(int j = 1; j <= 9; ++j) {
					System.out.print(i + " * " + j + " = " + i*j +"  ");
				}
				System.out.println();
			}
			
		}
		sc.close();
	}
	
	

}
