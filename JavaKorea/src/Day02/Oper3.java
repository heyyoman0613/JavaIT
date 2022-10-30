package Day02;

public class Oper3 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정 기능)
		// 1. 산술연산자 : +, -, *, /, %
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++, --
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&, ||(shift+역슬래시), !
		
		int 숫자1;					// 숫자1이라는 변수를 만듦
		int 숫자2;
		숫자1 = 3;					// 숫자1 변수에 3을 담음
		숫자2 = 2;
		
		System.out.println(숫자1+숫자2);
		int 숫자3 = 숫자1 + 숫자2;
		System.out.println(숫자3);
		숫자3 = 숫자1 + 숫자2;			// 단순 더하기
		숫자1 = 숫자1 + 숫자2;			// 새로운 공간을 만들지 않고, 기존의 공간을 활용해서 사용도 가능
									// 숫자1 값과 숫자2 값을 더한 후 숫자1 공간에 저장
		System.out.println(숫자1);
			// 자기 자신의 값을 사용, 산순연산을 진행한 후 자신에게 다시 저장하는 것 (누적연산)
		
		숫자1 += 숫자2;				// 숫자1 = 숫자1 + 숫자2;
		
		int 숫자4 = 0;
		System.out.println(숫자4);
		숫자4 = 숫자4 +1;				// 0 + 1을 한다음 숫자4에 저장한다는 말
		System.out.println(숫자4);
		
		숫자4 += 2;					// 숫자4 = 숫자4 + 2;
		System.out.println(숫자4);	// 3
		
		숫자4 -= 1;					// 숫자4 = 숫자4 - 1
		숫자4 *= 2;					// 숫자4 = 숫자4 * 2
		숫자4 /= 2;					// 숫자4 = 숫자4 / 2
		
		int i = 0;
		i += 3;
		System.out.println("i+3 = "+i);
		
		i += 3.14;
		System.out.println("i+=3.14 "+i);
		
		i *= 2;
		System.out.println("i*=2 = "+i);
		
		i /= 2;
		System.out.println("i/=2 = "+i);
		
		i -= 5;
		System.out.println("i-=5 = "+i);
		
		i %= 2;
		System.out.println("i%2 = "+i);
		
	}
}
