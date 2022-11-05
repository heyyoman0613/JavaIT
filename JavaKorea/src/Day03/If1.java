package Day03;

public class If1 {
	public static void main(String[] args) {
		// 조건문
		// if, switch
		// 외부 조건에 따라서 프로그램 동작을 다르게 하고 싶을 떄
		
		// if(){}
		// () 안에 내용이 맞으면 {}를 실행
		// () 안에 내용이 틀리면 {}를 무시
		
//		int age = 17;
//		if(age >= 20) {
//			System.out.println("성인입니다");
//		}else {
//			// else : 위 if가 틀렸을 떄 대신 실행할 코드
//			System.out.println("성인이 아닙니다");
//		}
		
		int age = -2;
		if(age >= 20){
			System.out.println("성인 입니다.");
		} 
		
		else if(age >= 14) {
			System.out.println("청소년 입니다.");
		} 
		
		else if(age >=0) {
			System.out.println("어린이 입니다.");
		} 
		
		else {
			System.out.println("?");
		}
		
		
		
		
	}
}
