package homework.advance08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//	    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
//	    ex) 2023-01-29 2023-02-05 입력
//		출력       2023-01-29
//	             2023-01-30
//	             2023-01-31
//	             2023-02-01
//	             2023-02-02
//	             2023-02-03
//	             2023-02-04
//	             2023-02-05
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat simpledateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print("첫 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate1 = sc.nextLine();
		System.out.print("두 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate2 = sc.nextLine();
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		try {
			cal2.setTime(simpledateFormat1.parse(inputDate1));
			cal3.setTime(simpledateFormat1.parse(inputDate2));
		}catch(ParseException pe) {
			pe.getMessage();
		}
		
		long time2 = cal2.getTimeInMillis();
		long time3 = cal3.getTimeInMillis();
		long diff = time2 - time3;
		System.out.println(diff / (1000 * 60 * 60 * 24));
		
		int idx = 0;
		if(diff > 0) {
			long day = diff / (1000 * 60 * 60 * 24);
			
			for(int i = 0; i <= day; ++i) {
				System.out.println(simpledateFormat1.format(cal3.getTime()));
				cal3.add(Calendar.DATE, 1);
			}
		}else if(diff == 0) {
			System.out.println("같은 시간");
		}else {
			long day = -diff / (1000 * 60 * 60 * 24);
			for(int i = 0; i <= day; ++i) {
				System.out.println(simpledateFormat1.format(cal2.getTime()));
				cal2.add(Calendar.DATE, 1);
			}
		}
		
		
		
		
		sc.close();
	}
}
