package Day02;

public class Oper5 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정 기능)
		// 1. 산술연산자 : +, -, *, /, %
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++, --
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&, ||(shift+역슬래시), !
		
		// 비교연산자
		boolean 참거짓1 = true;
		boolean 참거짓2 = false;
		
		System.out.println(3 > 2);
		System.out.println(3 < 2);
		
		// > 크다
		// < 작다
		// >= 크거나 같다
		// >= 작거나 같다
		// == 같다
		// != 다르다
		// 비교 결과값을 확인할 때 많이 사용됨
		// 조건문을 사용할 떄 많이 사용됨
		
		int 숫자1 = 1;
		int 숫자2 = 2;
		System.out.println(숫자1 > 숫자2);
		System.out.println(숫자1 < 숫자2);
		System.out.println(숫자1 >= 숫자2);
		System.out.println(숫자1 <= 숫자2);
		System.out.println(숫자1 == 숫자2);
		System.out.println(숫자1 != 숫자2);
		
		System.out.println("===========================");
		
		int x = 20;
		int y = 10;
		boolean result = false;
		
		result = x > y;
		System.out.println("x > y ="+result);
		
		result = x < y;
		System.out.println("x < y ="+result);
		
		result = x >= y;
		System.out.println("x >= y ="+result);
		
		result = x <= y;
		System.out.println("x <= y ="+result);
		
		result = x == y;
		System.out.println("x == y ="+result);
		
		result = x != y;
		System.out.println("x != y ="+result);
		
		// 각 자료형의 기본값 (아무런 값을 넣지 않으면 하단의 값들이 들어가게 됨)
		// 알아서 기본값이 잘 들어가겠지,, 라고 하면 안됨, 그냥 처음에 지정을 아예 해 주는 것이 에러가 적게 날 수 있음
		int 정수 = 0;
		double 실수 = 0.0;
		String 문자열 = null;
		boolean 불린 = false;
		char 문자 = '\0'; 		// null이랑 똑같은 의미
		
		
	}
}
