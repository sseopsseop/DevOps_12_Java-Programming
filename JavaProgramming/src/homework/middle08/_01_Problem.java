package homework.middle08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _01_Problem {
	public static void main(String[] args) throws ParseException {
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			calendar.setTime(simpleDateFormat1.parse(str));
		}catch(ParseException pe) {
			System.out.println(pe.getMessage());
		}
		System.out.println(simpleDateFormat1.format(calendar.getTime()));
		
		calendar.add(Calendar.DATE, 3);

		System.out.println(simpleDateFormat1.format(calendar.getTime()));
		
		sc.close();
		
		
	}
}
