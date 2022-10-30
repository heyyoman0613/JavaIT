package Day02;

public class If2 {
	public static void main(String[] args) {
		
		int age = 30;
		
		if(age < 10) {
			System.out.println("미성년자");
		}				// 조건 검사
		else if(age < 20) {
			System.out.println("10대");
		}				// 그 다음 검사
		else if(age < 30) {
			System.out.println("20대");
		}				// 그 다음 검사
		else if(age < 40){
			System.out.println("30대");
		}			// 다 틀리면
		else {
			System.out.println("그 외 40대 이상");
		}
		
	}
}


		int 나이 = 0;
		if(나이 < 14) {
			System.out.println("어린이");
			else if(나이 >=14 || 나이 < 20) {
				System.out.println("청소년");
				else {
					System.out.println("성인");
				}
			}
		}