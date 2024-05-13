package chap20_enum.enums;

public enum RGB {
	// RED, GREEN, BLUE 상수 선언
	// 값은 4개를 갖는다
	// 첫 번째 값은 소문자 색상이름
	// 두 번째 값은 빨간색 농도(255가 최대값)
	// 세 번째 값은 초록색 농도(255가 최대값)
	// 네 번째 값은 파란색 농도(255가 최대값)
	// enum을 구현하세요.
	RED("RED", 255, 0, 0){
		public void printColorNum() {
			
		}
	},
	GREEN("GREEN", 0, 255, 0),
	BLUE("BLUE", 0, 0, 255);
	
	private String color;
	private int red;
	private int green;
	private int blue;
	
	private RGB(String color, int red, int green, int blue) {
		this.color = color;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getRed() {
		return this.red;
	}
	
	public int getGreen() {
		return this.green;
	}
	
	public int getBlue() {
		return this.blue;
	}
}
