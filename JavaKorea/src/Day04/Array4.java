package Day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// 입력받은 나라의 수도를 알려주는 프로그램 만들기
		// 국가, 수도
		
		// 어느 나라의 수도가 궁금하신가요?
		// '미국'
		// 미국의 수도는 워싱턴 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		String nations[] = {"한국", "대한민국", "일본", "중국", "미국"};
		String cities[] = {"서울", "서울", "도쿄", "베이징", "워싱턴 DC"};
		
		String answer = null;
		
		while(true) {
			System.out.println("어느 나라의 수도가 궁금하신가요?");
			answer sc.next();
							
			if(answer.equals("한국")||answer.equals("대한민국")) {
				System.out.println("서울입니다");
			}
			else if(answer.equals("일본")) {
				System.out.println("도쿄입니다");
			}
			else if(answer.equals("중국")) {
				System.out.println("베이징입니다");
			}
			else if(answer.equals("미국")) {
				System.out.println("워싱턴 DC입니다");
						
		}else {
			System.out.println("없는 나라입니다");
		}
				
	}
}
}