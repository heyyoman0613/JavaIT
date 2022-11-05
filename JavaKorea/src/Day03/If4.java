package Day03;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		// 국어, 영어, 수학
		// 각각 40점 이상이고
		// 총합이 150 이상이면
		// '합격'
		// 그 외에는 '불합격'
		
		Scanner scanner = new Scanner(System.in);
		
		int 국어1 = scanner.nextInt();
		int 영어1 = scanner.nextInt();
		int 수학1 = scanner.nextInt();
		System.out.println("국어점수를 입력하세요");
		System.out.println("영어점수를 입력하세요");
		System.out.println("수학점수를 입력하세요");
		if(!(국어1>=40)&&!(영어1>=40)&&!(수학1>=40)&&!(국어1+영어1+수학1>=150)){
			System.out.println("합격");
		}
		else{
			System.out.println("불합격");
		}
	}
}