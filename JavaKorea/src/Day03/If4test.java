package Day03;

import java.util.Scanner;

public class If4test {
	public static void main(String[] args) {
		
		int 국어, 영어, 수학, 총합;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 >>");
		국어 = sc.nextInt();
		System.out.println("영어점수를 입력하세요 >>");
		영어 = sc.nextInt();
		System.out.println("수학점수를 입력하세요 >>");
		수학 = sc.nextInt();
		
		총합 = 국어 + 영어 + 수학;
		
//		if(국어 >= 40 && 영어 >= 40 && 수학 >= 40 && 총합 >= 150) {
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
		
		if(총합 >= 150){
			if(국어>=40 && 영어>=40 && 수학>=40) {
				System.out.println("합격");
			}
			else {
				System.out.println("과락");
			}
		}else {
			System.out.println("불합격");
		}
	}
}
