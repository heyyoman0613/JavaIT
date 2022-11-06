package Day04;

public class Array2 {
	public static void main(String[] args) {
		String menu[] = {"에스프레소", "아메리카노"};		// 2칸 (0~1) (초기 설정값에 맞게 생성 필요)
		int price[] = {1500, 2000};					// 2칸 (0~1)
		
		for(int i=0; i<menu.length; i++) {
			System.out.println(menu[i]+":"+price[i]+"원");
		}
		
		// 배열 초기화를 많이 함 (선언과 동시에 값 대입)
		int num[] = {0,10,20,30,40};
		
		// 배열 선언만 하고 싶다 (공간만 먼저 생성해두고 싶다(조금 복잡))
		int no[] = new int[5];
		
		// 대입 (수정, 값을 덮어씌기 하는거)
		num[0] = 5;
		no[0] = 5;
		num[1] = 15;
		no[1] = 15;
		
		
		int numbers[];				// 공간만 생성하는 경우도 있다,, 정도로 알고 있으면 될 듯
				
		numbers = new int[100];
		
		
		
		
	}
}
