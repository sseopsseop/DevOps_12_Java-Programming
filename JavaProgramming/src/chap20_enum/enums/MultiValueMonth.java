package chap20_enum.enums;

public enum MultiValueMonth {
	// 1. 값이 여러 개인 상수 선언
	// 첫 번째 선언된 상수의 값의 타입, 개수와 일치시켜서 만들어야한다.
	JAN(1, "JANUARY"),
	FEB(2, "FEBRUARY"),
	MAR(3, "MARCH"),
	APR(4, "APRIL"),
	MAY(5, "MAY"),
	JUN(6, "JUNE"),
	JUL(7, "JULY"),
	AUG(8, "AUGUST"),
	SEP(9, "SEPTEPBER"),
	OCT(10, "OCTOBER"),
	NOV(11, "NOVEMBER"),
	DEC(12, "DECEMBER");
	
	// 2. 위에서 지정한 상수의 값의 개수만큼 변수 선언
	private int monthVal;
	private String monthFullName;
	
	// 3. 생성자에서도 지정된 값의 개수만큼의 변수를 초기화한다.
	MultiValueMonth(int monthVal, String monthFullName){
		this.monthVal = monthVal;
		this.monthFullName = monthFullName;
	}
	
	// 4. 지정된 값의 개수만큼의 getter 메소드 선언
	public int getMonthValue() {
		return this.monthVal;
	}
	
	public String getMonthFullName() {
		return this.monthFullName;
	}
}
