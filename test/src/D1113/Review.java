package D1113;

public class Review {
	public static void main(String[] args) {
		// 다른 클래스의 변수 또는 메서드를 사용하려면 '객체화'를 해주어야 한다.
		// 클래스명 변수명 = new 클래스명();
		// 변수명.
		MyReview mr = new MyReview();		// 객체화
		mr.function1();
		mr.funtion2(33);					// 메서드 사용
				
		
	}
}

// 클래스와 메서드
// 클래스 : 변수와 메서드를 뭉쳐놓은 꾸러미, 클래스는 소괄호 취급 안함, 바로 중괄호
class MyReview{
	// 변수 : 저장 공간
	String str;
	int num;
	
		
	// 메서드 : 코드를 저장하는 공간
	int function1() {
		// 소괄호가 있으면 메서드 (단, if, switch, while, for 제외)
		
		return this.num; 			// (자료형이 있는 경우는 return을 해줘야함)
									// this. : 클래스에 있는 것을 가져다 쓰겠다라는 의미
									//		  : 단, 지역(메서드, 함수 안에)에 중복이 없으면 생략가능
		
	}
	
	// () : 메서드란 표시, 매개변수를 만들어 놓는다.
	void funtion2(int num) {
		// return값이 없는 경우에는 바로 void로 작성
		
		String str;
		this.num = num;
		str = "지역변수";				// 지역변수 : 함수가 끝나면 공간이 없어짐
		this.str = "멤버변수";			// 멤버변수 : 클래스에 있는 변수
		
				
		
	}
	
	
	
}