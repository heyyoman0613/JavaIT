package Day04;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		// for : while이 너무 지저분하니 정리해서 쓰자,, 라는 개념
		
		// while 버전
		int a = 0;
		while(a < 5) {
			System.out.println("while안녕");
			a++;
		}

		// for 버전
		for (int i=0; i<5; i++){				// 소괄호 안에 모든걸 다 집어 넣어,,
			System.out.println("for안녕");
		}
		
		
		/*
		 		for(초기값;조건식;증감량){
		 			반복하고자 하는 코드들;
		 		}
		 */
		
		
		// while 버전
		int b = 1; 
		int sum = 0;
		while(b < 11) {
			// System.out.println(b);
			sum += b;
			b++;
		}
		System.out.println("while version :"+sum);
		
		
		// for 버전
		int 총합 = 0;
		for (int c=0; c<11; c++) {
			총합 += c;
		}
		System.out.println("for version : "+총합);
		
		// 1. 초기값을 생성
		// 2. 조건식 검사
		// 3. {} 실행
		// 4. 증감식 (증감연산)
		// 5. 조건식 검사
		// 6. {} 실행
		// ...
		
	}
}
