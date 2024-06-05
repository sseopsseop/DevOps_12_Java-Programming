package chap99_homework.homework12;

import java.util.*;
import java.util.stream.Collectors;

public class Basic02 {
    public static void main(String[] args) {
//      --------------------배열--------------------
//      1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
        int[] intArr1 = new int[10];

        for(int i = 0; i < intArr1.length; i++) {
            intArr1[i] = i + 1;
        }

        for(int num : intArr1) {
            System.out.println(num);
        }

//      2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
        Scanner sc = new Scanner(System.in);

        int[] intArr2 = new int[1000];
        int cnt = 0;

        while(true) {
            System.out.println("정수를 입력하세요. Q나 q입력 시 종료");

            String input = sc.nextLine();

            if(input.equalsIgnoreCase("q")) {
                System.out.println("종료합니다.");
                break;
            }

            intArr2[cnt++] = Integer.parseInt(input);
        }

        int[] intArr3 = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            intArr3[i] = intArr2[i];
        }

        for(int num : intArr3) {
            System.out.println(num);
        }

//      3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
        int[] intArr4 = new int[10];

        for(int i = 0; i < intArr4.length; i++) {
            System.out.println("정수를 입력하세요.");

            intArr4[i] = sc.nextInt();
            sc.nextLine();
        }

        int sum = 0;

        for(int num : intArr4) {
            sum += num;
        }

        System.out.println("평균은 " + (sum / (double)intArr4.length));

//      4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
        int[] intArr5 = new int[100];

        int index = 0;

        for(int i  = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                intArr5[index++] = i;
            }
        }

        int[] intArr6 = new int[index];

        for(int i = 0; i < index; i++) {
            intArr6[i] = intArr5[i];
        }

        int sum2 = 0;

        for(int num : intArr6) {
            sum2 += num;
        }

        System.out.println(sum2);

//      5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
        int max = intArr4[0];
        int min = intArr4[0];

        for(int i = 1; i < intArr4.length; i++) {
            if(intArr4[i] > max) {
                max = intArr4[i];
            }

            if(intArr4[i] < min) {
                min = intArr4[i];
            }
        }

        System.out.println("최소값: " + min + ", 최대값: " + max);

//      6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
        String[] strArr = new String[5];

        for(int i = 0; i < strArr.length; i++) {
            System.out.println("문자열을 입력하세요.");
            strArr[i] = sc.nextLine();
        }

        String maxStr = strArr[0];
        String minStr = strArr[0];

        for(String str : strArr) {
            if(str.length() > maxStr.length()) {
                maxStr = str;
            }

            if(str.length() < minStr.length()) {
                minStr = str;
            }
        }

        System.out.println("최소길이 문자열: " + minStr + ", 최대길이 문자열: " + maxStr);

//      7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
        int[] intArr7 = new int[4];
        int[] intArr8 = new int[3];

        for(int i = 0; i < intArr7.length; i++) {
            intArr7[i] = (int)(Math.random() * 100) + 1;
        }

        for(int i = 0; i < intArr8.length; i++) {
            intArr8[i] = (int)(Math.random() * 100) + 1;
        }

        index = 0;

        int[] intArr9 = new int[intArr7.length + intArr8.length];

        for(int i = 0; i < intArr7.length; i++) {
            intArr9[index++] = intArr7[i];
        }

        for(int i = 0; i < intArr8.length; i++) {
            intArr9[index++] = intArr8[i];
        }

        for(int num : intArr9) {
            System.out.println(num);
        }

//      8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//      가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
        String str = "";

        for(int i = 0; i < 10; i++) {
            System.out.println("문자열을 입력하세요.");
            str += sc.nextLine();

            if(i != 9) {
                str += "-";
            }
        }

        String[] strArr2 = str.split("-");

        maxStr = strArr2[0];
        int maxIdx = 0;

        for(int i = 0; i < strArr2.length; i++) {
            if(strArr[i].length() > maxStr.length()) {
                maxStr = strArr[i];
                maxIdx = i;
            }
        }

        System.out.println("길이가 가장 긴 문자열: " + maxStr + ", 인덱스: " + maxIdx);

//      --------------------클래스--------------------
//      1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.

//      2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
//
//      3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
        System.out.println(concatStr("a", "b"));

//      4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
        System.out.println(mul(10, 12.3894));

//      5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
        System.out.println("반지름을 입력하세요.");
        int radius = sc.nextInt();
        sc.nextLine();

        Circle circle = new Circle(radius);
        System.out.println(circle.area());
        System.out.println(circle.round());

//      6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.


//      7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요.
//              그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요.
//
//
//      --------------------상속--------------------
//      1. 성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 Parent를 상속받은 ChildA, ChildB 클래스를 만들어서
//      ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.


//      2. 일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 만들고 일한다(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
//              알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다 메소드를 오버라이딩하여 캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
//      쿠팡맨은  "쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다."라고 출력하도록 구현하세요. 일한 시간과 시간당 급여는 생성자에서 초기화합니다.
//
//      3. 근로자를 인터페이스로 생성하고 출근하다, 퇴근하다, 일한다. 메소드를 선언합니다. 근로자를 상속받은 개발자와 공무원 클래스 만들고 상속받은 세 개의 메소드를
//      본인이 원하는 대로 구현하세요.
//
//      4. 게시판 인터페이스를 구현하고 게시글 저장, 수정, 삭제, 조회 메소드를 만들고 게시판을 상속받는 자유게시판과 공지게시판 클래스를 만들어서 네 개의 메소드를 본인이
//      원하는 대로 구현하세요.
//
//
//              --------------------컬렉션--------------------
//      1. Map을 이용하여 영어 단어와 뜻을 저장하고 사용자가 입력한 단어의 뜻을 출력하세요.
        Map<String, String> wordMap = new HashMap<>();

        wordMap.put("apple", "사과");
        wordMap.put("banana", "바나나");
        wordMap.put("grape", "포도");

        System.out.println("apple, banana, grape 중 하나를 입력하세요.");
        String fruit = sc.nextLine();

        System.out.println("입력한 단어의 뜻: " + wordMap.get(fruit));

//      2. Map을 이용해서 음식 이름과 가격을 저장하고 사용자가 입력한 음식의 이름과 수량으로 최종 금액을 출력하세요.
        Map<String, Integer> foodMap = new HashMap<>();

        foodMap.put("치킨", 19000);
        foodMap.put("피자", 25000);
        foodMap.put("파스타", 12000);

        System.out.println("치킨, 피자, 파스타 중 하나를 입력하세요.");
        String food = sc.nextLine();

        System.out.println(food + "의 가격은 " + foodMap.get(food) + "원입니다.");

//      3. Map을 이용해서 학생의 이름과 점수를 저장하고 점수가 90점 이상인 학생의 이름을 모두 출력하세요.
        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("고기천", 70);
        scoreMap.put("홍길동", 85);
        scoreMap.put("임꺽정", 78);
        scoreMap.put("장길산", 100);
        scoreMap.put("이순신", 98);
        scoreMap.put("조병조", 90);

        for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            if(entry.getValue() >= 90) {
                System.out.println(entry.getKey());
            }
        }

//      4. 3번에서 사용한 Map에서 점수가 가장 높은 학생의 이름과 점수를 출력하세요.
        int maxScore = 0;
        String maxName = "";

        for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            if(entry.getValue() >= maxScore) {
                maxScore = entry.getValue();
                maxName = entry.getKey();
            }
        }

        System.out.println("최고점 학생 이름: " + maxName + ", 점수: " + maxScore);

//      5. List에 문자열을 저장하고 사용자가 입력한 문자열을 검색하여 해당 문자열의 인덱스를 출력하세요.
        List<String> stringList = new ArrayList<>();

        stringList.add("바나나");
        stringList.add("사과");
        stringList.add("토마토");
        stringList.add("별똥별");
        stringList.add("우영우");
        stringList.add("역삼역");

        System.out.println("바나나, 사과, 토마토, 별똥별, 우영우, 역삼역 중 하나를 입력하세요.");

        String searchKeyword = sc.nextLine();

        for(int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i).equals(searchKeyword)) {
                System.out.println(searchKeyword + "는 " + i + "번 째에 있습니다.");
            }
        }

//      6. List에 정수 10개를 저장하되 중복 값을 1개 이상 포함시키고 Set으로 옮겨서 모든 요소를 출력하세요.
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(6);
        integerList.add(6);

        Set<Integer> integerSet = integerList.stream().collect(Collectors.toSet());

        for(int i : integerSet) {
            System.out.println(i);
        }

//      7. 현대차의 차종과 판매량을 저장하는 Map 한 개와 기아차의 차종과 판매량을 저장하는 Map 한 개를 만들어서
//      List에 둘 다 저장합니다. 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장하고
//      출력하세요. (현대 차종은 아반떼, 소나타, 그랜저 기아 차종은, k5, k7, k9, 판매량은 마음대로 정하시면 됩니다.)
        List<Map<String, Integer>> carMapList = new ArrayList<>();

        Map<String, Integer> hCarMap = new HashMap<>();

        hCarMap.put("아반떼", 1000);
        hCarMap.put("소나타", 2000);
        hCarMap.put("그랜저", 3000);

        carMapList.add(hCarMap);

        Map<String, Integer> kCarMap = new HashMap<>();

        kCarMap.put("k5", 1000);
        kCarMap.put("k7", 2000);
        kCarMap.put("k9", 3000);

        carMapList.add(kCarMap);

        List<Map.Entry<String, Integer>> carEntryList = new ArrayList<>();

        for(int i = 0; i < carMapList.size(); i++) {
            int maxSale = 0;
            Map.Entry<String, Integer> entry = null;
            for(Map.Entry<String, Integer> carEntry : carMapList.get(i).entrySet()) {
                if(carEntry.getValue() > maxSale) {
                    maxSale = carEntry.getValue();
                    entry = carEntry;
                }
            }
            carEntryList.add(entry);
        }

        for(Map.Entry<String, Integer> carEntry : carEntryList) {
            System.out.println(carEntry);
        }
    }

    //      3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
    public static String concatStr(String str1, String str2) {
        return str1 + str2;
    }

    //      4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
    public static double mul(int num1, double num2) {
        return (double)(Math.round(num1 * num2) * 100) / 100.0;
    }
}
