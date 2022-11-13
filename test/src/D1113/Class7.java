package D1113;

public class Class7 {
	public static void main(String[] args) {
		MyClass mc = new MyClass7(3,4);
	}
}

class MyClass7{
	int a, b;
	
	// 생성자 : 객체화를 하는 순간 자동으로 사용되는 메서드
	// 생성자의 이름은 클래스의 이름과 같다.
	
	MyClass7(int x, int y){
		//객체화를 하면 자동 사용
		setNum(x, y);
				
	}
	
	void seyNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
}