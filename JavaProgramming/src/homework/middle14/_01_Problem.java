package homework.middle14;

import java.util.ArrayList;
import java.util.List;

public class _01_Problem {
	public static void main(String[] args) {
//		1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고 
//		List<Student> studentList에 
//		(1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)를 저장하고 
//		Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺼정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		studentList.stream()
				   .filter(student -> student.getScore() >= 95)
				   .forEach(student -> System.out.println(student));
	}
}
