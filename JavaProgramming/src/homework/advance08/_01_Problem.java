package homework.advance08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.
//		String str = "2001년 12월 19일";
		
		int year = 2001;
		int lateYear = 2022;
		int month = 12;
		int date = 19;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, date);
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		simpleDateFormat1.format(calendar.getTime());
		// 2004 2008 2012 2016 2020
		// 2002 ~ 2022
		for(int i = year+1; i <= lateYear; ++i) {
			calendar.add(Calendar.YEAR, 1);
			if(isLeapYear(i)) {
				calendar.add(Calendar.DATE, 1);
			}
		}
		
		System.out.println(simpleDateFormat1.format(calendar.getTime()));
		
	}
	
	public static boolean isLeapYear(int year) {
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return true;
		else return false;
	}

}
