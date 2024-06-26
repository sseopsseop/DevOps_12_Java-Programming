package chap05_array;

public class _03_ArrayExample {
	public static void main(String[] args) {
		// 3. chArr의 요소 중 소문자는 대문자로, 대문자는 소문자로 변환하여 converArr에 저장하세요.
		char[] chArr = {'b', 'I', 't', 'C'};
		
		// {'B', 'i', 'T', 'c'}
		char[] convertArr = new char[4];
		
		for(int i = 0; i < convertArr.length; i++) {
//			if(chArr[i] >= 'A' && chArr[i] <= 'Z') convertArr[i] = (char) (chArr[i] + ('a' - 'A'));
//			else if(chArr[i] >= 'a' && chArr[i] <= 'z') convertArr[i] = (char)(chArr[i] - ('a' - 'A'));
//			else continue;

			if(chArr[i] >= 'A' && chArr[i] <= 'Z') 
				convertArr[i] = Character.toLowerCase(chArr[i]);
			else if(chArr[i] >= 'a' && chArr[i] <= 'z')
				convertArr[i] = Character.toUpperCase(chArr[i]);
			else continue;
			System.out.print(convertArr[i] + " ");
		}
		System.out.println();
	}

}
