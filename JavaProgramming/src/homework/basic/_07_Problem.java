package homework.basic;

public class _07_Problem {

	public static void main(String[] args) {
		int sum = 0;
		int idx = 1;
		do {
			sum += idx;
		}while(++idx <= 100);
		
		System.out.println(sum);
	}

}
