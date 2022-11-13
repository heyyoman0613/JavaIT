package Day04;

public class While3 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i+"번");
			i += 1; 		// i++; (동일)
		}
		
		
		int a = 0;
		while(a < 5) {
			System.out.println("안녕");
			a++;
			
		}
		
		
		int b = 1;
		int sum = 0;
		while(b < 11) {
			// System.out.println(b);
			sum += b;
			b++;
		}
		
		System.out.println(sum);
		
	}
}
