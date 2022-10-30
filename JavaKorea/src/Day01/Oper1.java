package Day01;

public class Oper1 {
	public static void main(String[] args) {
		// 글자(문자열), 숫자(정수), 소수점 있는 숫자(실수)
		// String : 글자
		// int : 숫자
		// double : 소수점 있는 숫자
		
		// 자료형 변수명;
		int 숫자1;
		int 숫자2;
		
		// 프로그래밍에서는 연산이 가능 (+, -, *, /, ...)
		// 연산을 시켜주는 기호들을 '연산자'라고 부름
		System.out.println(1+1);
		System.out.println(3-4);
		System.out.println(3*3);
		System.out.println(10/2);
		
		// 연산은 변수끼리도 가능 (저장되어 있는 값을 연산함)
		숫자1=1;
		숫자2=2;
		int 숫자3 = 숫자1 + 숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1+숫자2);
		
		// 글자는 더하기만 가능
		String 글자1="안녕";
		String 글자2="하세요!";
		System.out.println(글자1+글자2);
		
		// 숫자는 더하기, 빼기, 곱하기, 나누기 등 여러가지 가능
		// 우선순위 높음 : *, /
		// 우선순위 낮음 : +, -
		
		String 글자3="Hello";
		String 글자4="World";
		System.out.println(글자3 + 글자4);
		
		숫자1=1;
		숫자2=1;
		System.out.println(숫자1+숫자2);
		
		숫자1=2;
		숫자2=1;
		System.out.println(숫자1-숫자2);
		
		숫자1=2;
		숫자2=3;
		System.out.println(숫자1*숫자2);
		
		숫자1=10;
		숫자2=2;
		System.out.println(숫자1/숫자2);
		
		int 국어 = 50;
		int 영어 = 40;
		int 수학 = 60;
		int 합계 = 0;
		합계 = 국어 + 영어 + 수학;
		System.out.println("총정 : "+합계+"점");
		int 평균 = 합계/3;
		System.out.println("평균 : "+평균+"점");
		// 공간을 일단 만들고 시작해야 함, 이 부분이 조금 헷갈리는 듯		
		
		// 정수 : 소수점이 없는 숫자(자료형)
		// 평균이 소수점까지 노출이 되도록 하려면, double을 넣고, 소수점 뒤에 .0까지 붙여야 함
		// 정수 + 정수 = 정수
		// 정수 / 실수 = 실수
		
		// 자료형  변환 : 앞에다가 (자료형)
		System.out.println((int)3.14);
		System.out.println(3.14);
		System.out.println(3);
		System.out.println((double)3);
		
		
		System.out.println(국어+영어+수학);
		System.out.println((국어+영어+수학)/3);
	}
}
