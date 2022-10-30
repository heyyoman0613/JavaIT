package Day02;

public class Review {
	public static void main(String[] args) {
		// 자바는 main에서부터 시작을 하기 때문에 반드시 생성을 한 이후에 코드 작성
		// 프로그래밍 언어(자바) : 컴퓨터에게 일을 시키기 위한 문법
		// 슬래시 2개 적으면 그 줄은 프로그래밍 언어가 아니라 메모로 간주 (주석)
		
		// 출력 syso -> Crtl+Space 자동완성
		// 실행(디버깅 없이 시작) Ctrl + F11
		System.out.println("Hello World");
		
		// F11 : 디버깅모드 (한줄씩 실행)
		// 디버그 : de + bug : 나방을 제거한다 (코드를 짤 때, 내가 의도하지 않은 부분을 찾기 위해서 실행하는 행동이라고 생각하면 쉬움)
		// 웹개발은 디버깅할 일이 거의 없다고 보면 됨
		// 숫자 옆에 코드가 작성이 되어 있는 영역의 어느 한 부분을 클릭(더블클릭)하면 점이 생기는데, 그 부분부터 디버깅을 한다고 생각하면 됨
		
		// Ctrl + Alt + ↓ : 커서가 있는 줄을 밑으로 복붙
		// Ctrl + Z : 뒤로 돌리기
		// Ctrl + Y : 뒤로 돌리기 취소
		
		// 변수 : 저장공간
		// 자주 바꾸거나 사용하게 될 단어든 코드는 따로 공간을 만들어서 관리
		
		String word = "Java";
		
		System.out.println("Hello "+word);
		System.out.println("Hello "+word);
		System.out.println("Hello "+word);
		
		String str = "Hi";			// 글자를 저장할 수 있는 공간
		int num = 0;				// 숫자를 저장할 수 있는 공간
		double dnum = 0.0;			// 소수점 있는 숫자를 저장할 수 있는 공간
		
		
		// 자료형 변환						변수를 넣을 때는 큰 따옴표 없이 넣어야 함
		System.out.println(num);
		System.out.println((double)num);
		
		// 변수(공간)을 처음 만들 땐, 변수 이름 앞에 자료형을 적어주고
		// 이미 만들어진 변수(공간)을 사용할 땐, 자료형 없이 적어준다
		str = "Hello";				// 다른 값을 대입 (기존의 값이 삭제되고 새로운 값이 노출이 됨)
									// 위에 Hi가 삭제가 되고, Hello 값이 출력됨
		System.out.println(str);	// 사용, 출력
		
		// = : 대입연산자 (오른쪽에 있는 값을 왼쪽의 공간에 담는다. 라는 개념으로 생각)
		str = "Java222";				// 왼쪽은 '공간'역할, 오른쪽은 '값'역할
		word = str;					// word : 공간(왼쪽),  str : 안에 들어있는 값(오른쪽)
		System.out.println(word);
		word = word;					// woed(왼쪽):공간,  word(dhfmsWhr):안에 들어있는 값
		
		// 변수이름 만들 때,
		// 1. 맨앞 숫자X, 특수문자X(예외도 있긴함) (한글, 영어)
		// 2. 띄어쓰기X ('_'로 대체)
		
		// 자바 개발환경 : 인텔리제이(사기업,대부분 이거 씀), 
		// 이클립스(그냥 안쓴다고 보면 됨, 연습용), STS(웹개발 전용 이클립스, 학습용), Egov(국가행정SI, 학습용)
	}
}
