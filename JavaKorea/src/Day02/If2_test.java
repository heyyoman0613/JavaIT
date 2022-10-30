package Day02;

public class If2_test {
	public static void main(String[] args) {
		int 나이 = 18;
		int 금액 = 0;
		if(나이 >= 20) {
			System.out.println("성인");
			금액 = 1000;
		}else if(나이 >= 14) {
			System.out.println("청소년");
			금액 = 650;
		}else {
			System.out.println("미성년자");
			금액 = 400;
		}
		
		System.out.println("금액은 "+금액+"원");
	}
}
