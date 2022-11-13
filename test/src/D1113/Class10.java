package D1113;

public class Class10 {
// public class : 파일당 1개
	public static void main(String[] args) {
		// 여기서 객체화해서 사용
		
		MyClass10 mc = new MyClass10();
		
		mc.quiz1();
		mc.quiz2("java");
		String result3 = mc.quiz3("My", "Quiz");
		System.out.println(result3);
		
		int result4 = mc.quiz4(3, -4);
		System.out.println(result4);
	}
}



class MyClass10{
		
	// 1. 매개변수가 없고 리턴값이 없는 Hello World 출력해주는 메서드
	void quiz1() {
		System.out.println();
	}
	
	
	// 2. 매개변수가 String 1개, 매개변수의 문자열을 출력해주는 메서드
	void quiz2(String str1) {
		System.out.println(str1);
		
	}
	
	// 3. 매개변수로 String 2개를 받아서, 두 문자열을 합치고 return (return한 값은 main 메서드에서 syso로 출력)
	String quiz3(String str1, String str2) {
		return str1 + str2;
	}
	
		
	// 4. 매개변수로 int 2개를 받아서, 매개변수가 음수면 각각 양수로 만들고 더해서 return (절대값으로 만들고 더한 다음 return)
	int quiz4(int num1, int num2) {
		if(num1 < 0) {
			num1 = num1 * -1;
		}
		if(num2 < 0) {
			num2 = num2 * -1;
		}
		return num1 + num2;
	}
}