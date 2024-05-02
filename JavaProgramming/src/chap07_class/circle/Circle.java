package chap07_class.circle;

public class Circle {

	public final double PI = 3.14;
	public int radius;
	
	public Circle() {
		
	}
	public Circle(int radius) {
		// 생성자를 호출하면 객체가 생성되는데
		// this는 생성된 객체를 받아준다.
		this.radius = radius;
	}
	
	public double getRound() {
		return 2*PI*radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
}
