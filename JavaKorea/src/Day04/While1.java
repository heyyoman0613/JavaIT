package Day04;

public class While1 {
	public static void main(String[] args) {
		// 조건문 : if, switch
		// 반복문 : while, for
		
		
		int age = 22;
		if(age >= 20) {
			// 소괄호 내용이 맞으면 {} 실행
			System.out.println("if문 : "+age);
		}
		
		while(age >=20) {
			// 소괄호 내용이 맞으면 {} 실행하고 다시 소괄호로 돌아감
			System.out.println("while문 : "+age);
		}
	}
}
