package Day04;

public class Flow2 {
	public static void main(String[] args) {
		// 제어문 : 조건문, 반복문, 기타 제어문
		// 조건문 : if, switch
		// 반복문 : while, for
		// 기타 제어문 : break, continue, goto(이건 쓰는거 아니래)
		
		// break : 반복문을 강제 종료 (switch도 가능, 보통 if랑 많이 사용, 무한반복을 탈출할 때 많이 사용)
		// continue : 반복문 1회성 취소 (for랑 많이 사용)
		
		for(int i=1; i<6; i++) {
			if(i==3) {
				break;			// i가 3과 같다면 반복문을 종료
			}	
			System.out.println(i+"번");
		}
		
		System.out.println("프로그램 종료");
		
		
		for(int j=1; j<6; j++) {
			if(j==3) {
				continue;		// j와 3과 같다면 밑에 있는 코드는 실행하지 않고 위로 올라감 (1회성 취소)
			}
			System.out.println(j+"회");
		}
		
		System.out.println("프로그램 종료2");
	}
}
