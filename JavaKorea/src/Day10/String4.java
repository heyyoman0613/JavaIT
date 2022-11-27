package Day10;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		MyString4 ms4 = new MyString4();
		ms4.go();
	}
}



class MyString4{
	Scanner sc = new Scanner(System.in);
		
	public void go() {
		System.out.println(won());
	}
	
	
	public void won() {
		// 정수 입력받아서 천원단위로 ,를 찍어 출력
		// 5000000 -> 5,000,000
		
		System.out.println("숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		String result = Integer.toString(num);
		int result_len = result.length();
		String parse1, parse2, parse3, parse4;
		int sount = 0;			// 천단위
		
		
/*		
		if(num < 1000) {
			// 999
			parse1 = result.substring(1, 4);
			parse2 = result.substring(0, 1);
			result = parse2+","+ parse1;

		}else if (num < 10000) {
			// 9999
			parse1 = result.substring(2, 5);
			parse2 = result.substring(0, 2);
			result = parse2+","+ parse1;
			
		}else if (num < 100000) {
			// 99999
			parse1 = result.substring(3, 6);
			parse2 = result.substring(0, 3);
			result = parse2+","+ parse1;
			
		}else if (num < 1000000) {
			// 999999
			parse1 = result.substring(4, 7);
			parse2 = result.substring(1, 4);
			parse3 = result.substring(0, 1);
			result = parse3+","+ parse2+","+parse1;
			
		}else if (num < 10000000) {
			// 9999999
			parse1 = result.substring(5, 8);
			parse2 = result.substring(2, 5);
			parse3 = result.substring(0, 2);
			result = parse3+","+ parse2+","+parse1;
			
		}else if (num < 100000000) {
			// 99999999
			parse1 = result.substring(6, 9);
			parse2 = result.substring(3, 6);
			parse3 = result.substring(0, 3);
			result = parse3+","+ parse2+","+parse1;
			
		}else if (num < 1000000000) {
			// 999999999
			parse1 = result.substring(7, 10);
			parse2 = result.substring(4, 7);
			parse3 = result.substring(1, 4);
			parse4 = result.substring(0, 1);
			result = parse4+","+parse3+","+ parse2+","+parse1;
		}
		
		// if에 넣을 때는 밑에 break 빼고 조건 맞춰서 집어 넣으면 됨
		
		switch(result_len) {
		case 4 :
			
			parse1 = result.substring(1, 4);
			parse2 = result.substring(0, 1);
			result = parse2+","+ parse1;
			break;
			
		case 5:
			parse1 = result.substring(2, 5);
			parse2 = result.substring(0, 2);
			result = parse2+","+ parse1;
			break;

		case 6:
			parse1 = result.substring(3, 6);
			parse2 = result.substring(0, 3);
			result = parse2+","+ parse1;
			break;	
			
		case 7:
			parse1 = result.substring(4, 7);
			parse2 = result.substring(1, 4);
			parse3 = result.substring(0, 1);
			result = parse3+","+ parse2+","+parse1;
			break;
			
		case 8:
			parse1 = result.substring(5, 8);
			parse2 = result.substring(2, 5);
			parse3 = result.substring(0, 2);
			result = parse3+","+ parse2+","+parse1;
			break;
			
		case 9:
			parse1 = result.substring(6, 9);
			parse2 = result.substring(3, 6);
			parse3 = result.substring(0, 3);
			result = parse3+","+ parse2+","+parse1;
			break;
			
		case 10:
			parse1 = result.substring(7, 10);
			parse2 = result.substring(4, 7);
			parse3 = result.substring(1, 4);
			parse4 = result.substring(0, 1);
			result = parse4+","+parse3+","+ parse2+","+parse1;
			break;
			
		}
*/		
		
		while(num / 1000 > 0) {
			count++;
		}
		if(count == 4) {
			parse1 = result.substring(7, 10);
			parse2 = result.substring(4, 7);
			parse3 = result.substring(1, 4);
			parse4 = result.substring(0, 1);
			result = parse4+","+parse3+","+ parse2+","+parse1;
		}else if(count == 3) {
			parse1 = result.substring(result_len-3, result_len);
			parse2 = result.substring(result_len-6, result_len-3);
			parse3 = result.substring(0, result_len-6);
			result = parse3+","+ parse2+","+parse1;
		}
		
		
		return result;
				
		
	}
	
	public void hint() {
		String str1 = "Hello World";
		String str2 = str1.substring(0, 5);
		String str3 = str1.substring(6, 11);
		
		String str4 = str2+","+str3;
		System.out.println(str4);
	}
	
}