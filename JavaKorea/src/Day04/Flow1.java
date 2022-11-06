package Day04;

public class Flow1 {
	public static void main(String[] args) {
		// 조건문 안에 반복문		조건이 맞으면 안에 있는 반복문이 실행
		int flag = 1;
		if(flag !=0) {
			for(int i=0; i<5; i++) {
				System.out.println("조건문 안에 반복문");
			}
		}
		
		
		// 반복문문 안에 조건문		가장 많이 사용된다고 함
		for(int i=0; i<5; i++) {
			if(i%2 == 0) {
				System.out.println("반복문 안에 조건문"+i);
			}
		}
		
		
		// 조건문 안에 조건문		사실상 and랑 동일하다고 함
		int age = 30;
		if(age >= 20) {
			System.out.println("성인");
			if(age < 50) {
				System.out.println("50세 미만");
			}
		}
		
		
		
		// 조건문 안에 조건문과 eles if는 다름 (같게 만들 수는 있음)
		if(agw >=20) {
			System.out.println("성인");
		}else if(age < 50) {
			System.out.println("50세 미만");
		}
		
		
		
		
		// 반복문 안에 반복문		이중반복문 (보통 게임에 쓰인다고 함 +ㅁ+!!)   x축, y축 할때 많이 쓰임
		for(int out=0; out<3; out++) {
			System.out.println("바깥 반복문"+(out+1));
			for(int in=0; in<3; in++) {
				System.out.println("안쪽 반복문"+(in+1));
			}
		}
		
		
		
	}
}
