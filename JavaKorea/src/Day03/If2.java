package Day03;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		// 출력 (결과를 사용자에게 보여줌)
		System.out.println("출력 syso");
		
		// 입력 (사용자가 값을 제공해 주는 것)
		Scanner sc = new Scanner(System.in);
		
		// 입력을 받으려면 받을 변수(공간)가 있어야 함
		int 숫자1 = 0;
		String 글자1 = null;
		double 숫자2 = 0.0;
								// 해당 공간, 자료의 기본값(기본값으로 초기화를 해준다?라는 의미, 안해주면 에러 뜰 수 있음)
		
		// 입력받기 (하단 애들 모두 키보드로 입력을 받겠다는 의미)
		
		System.out.println("정수를 입력하세요 :");
		숫자1 = sc.nextInt();
		System.out.println("문자열을 입력하세요 :");
		글자1 = sc.next();
		System.out.println("실수를 입력하세요 :");
		숫자2 = sc.nextDouble();
		
		System.out.println(숫자1);
		System.out.println(글자1);
		System.out.println(숫자2);
				
		if(숫자1 == 10) {
			// int
			System.out.println("입력한 숫자는 10입니다");
	
		}
		if(숫자2 == 3.14) {
			// double
			System.out.println("입력한 실수는 3.14입니다");
		}
		if(글자1.equals("비교대상")) {
			// String
			System.out.println("입력한 문자열은 비교대상 입니다");
		}
		
		sc.close();
		
	}

}
