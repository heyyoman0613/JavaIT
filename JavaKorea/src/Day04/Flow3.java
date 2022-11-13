package Day04;

import java.util.Scanner;

public class Flow3 {
	public static void main(String[] args) {
		// 대한민국 수도 맞추기 만들기, 맞추면 break
		// 무한반복 -> 입력 -> 맞추면 break
		
		Scanner sc = new Scanner(System.in);
		
		String answer = null;
		
		while(true) {
			System.out.println("대만민국의 수도는?  ");
			answer = sc.next();
			
			if(answer.equals("서울")) {				// String 문자열이 == 사용이 불가 -> .equals
				System.out.println("정답입니다");
				break;
		}else {
			System.out.println("틀렸습니다");
			
		}
			
		}
	}
}

