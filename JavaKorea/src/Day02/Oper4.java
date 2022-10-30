package Day02;

public class Oper4 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정 기능)
		// 1. 산술연산자 : +, -, *, /, %
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++, --
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&, ||(shift+역슬래시), !
		
		int 숫자1 = 0;
		숫자1 += 1;					// 숫자1 = 숫자1 + 1;
		숫자1++;						// 숫자1 += 1;		+1을 누적해서 할 때만 ++ 쓸 수 있음
		
		숫자1 += 2;					// 이건 안됨 (누적값이 1일 경우에만)
		
		숫자1--;						// 숫자1 -= 1;
		
		int num = 3;
		num--;						// num -= 1;
		System.out.println(num);
		num++;						// num += 1;
		System.out.println(num);
		
		++num;						// 앞에 쓰면, 먼저 1을 누적연산하고 시작
		num++;						// 뒤에 쓰면, 해당 코드 실행 후 1을 누적연산 시작
		
		int 숫자2 = 0;
		System.out.println(++숫자2);		// ++하고 출력
		System.out.println(숫자2++);		// 출력하고 ++
		System.out.println(숫자2);
		
		// 증감연산자 ++, --
		// 변수명 앞 또는 뒤에 ++를 쓸 수 있음
		// +=1, -=1 줄임말
		num = num +1;
		num += 1;
		num++;
		// 위에 3개 모두 동일한 말
	}
}
