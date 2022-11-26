package Day09;

public class Exception2 {
	public static void main(String[] args) {
		Try2 try2 = new Try2(10, 0);
		try2.go();
				
	}
}



class Try2{
	private int num1;
	private int num2;
	
	public Try2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void go() {
		System.out.println("프로그램 시작");
		
		// if로는 현실적으로 모든 예외상황을 대바할 수 없음 --> 그래서 나온게 try ~catch
		/* if(num2 != 0) {
			System.out.println(num1/num2);
		}else {
			System.out.println("0으로는 나눌 수 없습니다");
		}
		*/
		
		try {
			System.out.println("num1/num2");
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없음");
		}		
		
		System.out.println("프로그램 정상 종료");
	}
	
}