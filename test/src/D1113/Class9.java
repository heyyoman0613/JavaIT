package D1113;

public class Class9 {
	public static void main(String[] args) {
	// 사용	
		
		MyClass9 mc = new MyClass9();
		// mc.num1 = 3;
		mc.setNum1(3);
		//mc.num2 = 4;			// 메서드를 덜 만들게 됨 -> 구조를 잡는 실력이 늘지 않음
		mc.setNum2(4);
		
		// System.out.println(mc.num1);
		// System.out.println(mc.num2);
		System.out.println(mc.getNum1());
		System.out.println(mc.getNum2());
		// 변수(정보)는 private으로, 메서드는 public으로 해서 정보를 보호한다 => 캡슐화
		
		mc.Print();
		
	}
}


// 설계
class MyClass9{
	// 접근권한제어자 (가상의 문법 제어자를 만들어냄) : 멤버변수에는 private, 메서드에는 public
	// 클래스 내부에서 num1, num2에게 접근할 수 있는 함수를 따로 만들어줘야 함
	private int num1, num2;				// 변수에는 정보가 저장된다. 중요하기 때문에 보안이 필요 private
	
	// get: 바깥에서 사용하게 할 때 (다른 클래스)
	public int getNum1() {
		return num1;
	}


	// set : 바깥에서 값을 받아올 때 (다른 클래스)
	public void setNum1(int num1) {
		this.num1 = num1;
	}



	public int getNum2() {
		return num2;
	}



	public void setNum2(int num2) {
		this.num2 = num2;
	}



	// 사용할 것이면 메서드를 사용해라 public
	public void Print() {
		System.out.println("num1 : "+num1+", num2 : "+num2);
	}
	
	// 접근권한 제어자
	// public : 모두 사용 가능
	// protected : 같은 패키지 + 상속에서 사용 가능
	// (default) : 같은 패키지에서 사용 가능
	// private : 같은 클래스일 경우만 사용 가능
	
}