package Day03;

public class Review {
	public static void main(String[] args) {
		// 프로그래밍 언어의 발전은 '수정'에 초점이 맞춰져 있음
		// 변수 : 저장공간, 자주 변경될 것 같은 혹은 자주 사용될 것 같은 데이터를 저장해 놓는 공간 (재활용에 초점이 맞춰져 있음, 값 수정)
		
		// 변수 선언(생성) : 자료형은 변수를 만들때 처음 한번만
		// 자료형 변수형;
		String 변수1;				// 문자열(글자) 저장공간
		int 변수2;				// 정수(숫자) 저장공간
		double 변수3;				// 실수(소수점이 있는 숫자) 저장공간
		
		// 변수 대입(값 넣기) : = 을 사용해서 값을 넣음 (이미 생성된 변수에 대해서는 자료형은 적으면 안됨, 처음 만들떄만, 공간의 형태를 바꿀떄만 사용)
		변수1 = "java";
		변수2 = 123;
		변수3 = 3.14;
		
		// 변수 초기화(선언과 동시에 대입을 한번에 진행하겠다라는 의미)
		String 변수4 = "선언과 동시에 대입";
		
		// 변수 사용 : 변수명을 적어주면 됨, 변수 안에 들어있는 값이 사용됨
		System.out.println(변수4);
		
		// 대입시 유의사항
		변수4 = 변수1;				// 오른쪽에 있는 것은 값을 사용한다는 의미, 왼쪽에 있는 것은 공간의 개념으로 사용됨
		System.out.println(변수4);
		
		// 연산자
		// == 같다
		System.out.println(변수1==변수4);
		
		// != 다르다
		// >, <, >=, <=
		// +, -, *, /, %
		// +=, -=, *=, /=, %=
		// ++, --
		// &&, ||, !
		
		// 누적, 증감 연산
		int num1 = 0;
		int num2 = 0;
		num1 = num1 + 2;
		System.out.println(num1);
		
		num2 += 2;							// 위에 코드랑 동일
		System.out.println(num2);
		
		// 만약에, 누적 증가값이 1이면 한번더 생략가능
		num1 += 1;
		num2++;			// num += 1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = num1 - 1;			// num1 -= 1'
		num2--;
		System.out.println(num1);
		System.out.println(num2);
		
		// 자료형 변환 (정수 <-> 실수)
		int 정수1 = 3;
		double 실수1 = 3.14;
		System.out.println(정수1);
		System.out.println(실수1);
		
		System.out.println("=================형변환====================");
		System.out.println((double)정수1);
		System.out.println((int)실수1);
		
		/*
		 정수 / 정수 == 정수
		 실수 / 정수 == 실수
		 실수 / 실수 == 실수
		 */
		
	}
}
