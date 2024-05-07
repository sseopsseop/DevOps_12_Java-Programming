package homework.advance05;

public class ComStudent extends CommonStat implements Student {

	public ComStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComStudent(int sno, String name, String[] subject, int[] finalExamScore) {
		super(sno, name, subject, finalExamScore);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveInfo(int index, String subject, int score) {
		this.getSubject()[index] = subject;
		this.getFinalExamScore()[index] = score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("학생 번호 : " + this.getSno());
		System.out.println("학생 이름 : " + this.getName());
		for(int i = 0; i < this.getSubject().length; ++i) {
			System.out.println("과목 "+ this.getSubject()[i] + "의 점수 : "
		+ this.getFinalExamScore()[i]);
		}
	}

	@Override
	public double getAvg() {
		double result = 0.0;
		for(int i = 0; i < this.getFinalExamScore().length; ++i) {
			result += this.getFinalExamScore()[i];
		}
		// Math.round는 반올림 메소드인데, 리턴 타입이 long이다.
		// 따라서 평균에서 살리려는 자리수의 값까지 곱해주어 메소드의 전달인자로 보내어
		// 리턴값에서 잘리는 자리수의 값을 가져오고 다시 곱해준 값만큼 나누어준다.
		return (double)Math.round(result / this.getFinalExamScore().length * 100) / 100;
	}

}
