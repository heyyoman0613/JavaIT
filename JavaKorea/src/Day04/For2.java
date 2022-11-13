package Day04;

public class For2 {
	public static void main(String[] args) {
		
		int i=0;
		for (; i<10; i++) {
			// () 안의 값들을 제거할 수도 있음, for(;;) 무한 반복
			// () 안의 식들을 밖으로 뺄 수도 있음
			System.out.println(i+"번");
		}
		
		System.out.println(i);
		
	}
}
