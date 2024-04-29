package chap04_controlstatement;

public class _02_SwitchCase {
	public static void main(String[] args) {
		String grade = "B";
		
		switch(grade) {
		case "A" :
			System.out.println("90점 이상입니다.");
			break;
		case "B" :
			System.out.println("80점 이상입니다.");
			break;
		case "C" :
			System.out.println("70점 이상입니다.");
			break;
		case "D" :
			System.out.println("60점 이상입니다.");
			break;
		default:
			System.out.println("60점 미만입니다.");
			break;
		}
		
		int num = 129412;
		
		// num이 3의 배수인지 아닌지를 출력하는 switch case문 작성하세요.
		switch(num % 3) {
		case 0:
			System.out.println("3의 배수입니다.");
			break;
		default:
			System.out.println("3의 배수가 아닙니다.");
		}
	}
}
