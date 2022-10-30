package Day02;

public class If1 {
	public static void main(String[] args) {
		// 상황에 따라서 프로그램 동작을 다르게 하고 싶을 떄 사용하는 문법
		// ex) 버스요금 - 나이에 따라 금액을 다르게
		
		// if ~ else if ~ else
		// 성인인지, 미성년자인지 판별하는 프로그램
		int age = 18;
		if(age >= 20) {
			System.out.println("성인입니다.");
			// 소괄호 안의 내용이 틀리면 무시됨
		}else {
			// 소괄호 안에 내용이 틀리면 실행
			System.out.println("미성년자입니다.");
		}
		
		int money = 10001;
		if(money > 10000) {
			System.out.println("부자");
		}
		
		/*
		 if(조건1){
		 	조건이 맞으면 실행할 문장1;
		 	조건이 맞으면 실행할 문장2;
		 }else if(조건2){
		 	위 조건이 틀리고 조건2가 맞으면 실행할 문장1;
		 	위 조건이 틀리고 조건2가 맞으면 실행할 문장2;
		 }else if(조건3){
		 	위 모든 조건들이 틀리고 조건3이 맞으면 실행할 문장1;
		 }else{
		 	위 모든 조건들이 틀릴 때 실행할 문장;
		 }		  
		 */
		
		System.out.println("===================");
		
		int 점수 = 90;
		if(점수 >= 90) {
			System.out.println("공부벌레 입니다.");
		}
		
		System.out.println("===================");
		
		int age = 20;
		if(age >= 20) {
			System.out.println("성인");
		}ele if(age >=14 || age <=20) {
			System.out.println("청소년");
		}
	}
}