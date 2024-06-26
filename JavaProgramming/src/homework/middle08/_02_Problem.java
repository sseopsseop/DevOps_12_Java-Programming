package homework.middle08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//		   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		
		String[] dayOfWeekStrArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar1 = Calendar.getInstance();
		
		try {// Date 타입의 객체
			calendar1.setTime(simpleDateFormat1.parse(str));
		}catch(ParseException pe) {
			pe.getMessage();
		}
		
		System.out.println(dayOfWeekStrArr[calendar1.get(Calendar.DAY_OF_WEEK)]);
		
		sc.close();
	}
}
