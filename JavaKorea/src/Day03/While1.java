package Day03;

public class While1 {
	public static void main(String[] args) {
		// 조건문 : if, switch (만약에)
		// 반복문 : while, for (~동안에)
		
		int age = 30;
		// if : 소괄호 내용이 맞으면 중괄호 실행, 틀리면 중괄호 무시하고 진행
		if(age >=20) {
			System.out.println("if문 : "+age);
		}
		
		// while : if 굉장히 유사한데, 다르다. 소괄호 내용이 맞으면 중괄호 계속 실행, 틀리면 중괄호 무시하고 진행
		// 중괄호 맞으면 다시 소괄호로 돌와서 검사 진행, 틀릴때까지 진행, 무한반복
		while(age >= 20) {
			System.out.println("while문 : "+age);
		}
		
		// while은 if와 다르게 별다른 작업을 해주지 않으면 무한반복에 빠짐, 탈출 불가
		
	}
}
