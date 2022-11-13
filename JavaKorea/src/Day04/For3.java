package Day04;

public class For3 {
	public static void main(String[] args) {
		
		for(int a=0; a<5; a++) {
			System.out.println("for안녕");
		}
			
		for(int e=1; e<11; e++) {
			System.out.println(e);
		}
		
		
		int sum = 0;
		for(int b=0; b<11; b++) {
			sum += b;
		}
		System.out.println("for 총합 : "+sum);
		
		
		for(int c=10; c>0; c--) {
			System.out.println(c);
		}
		
		
		for(int d=0; d<21; d+=2) {
			System.out.println(d);
		}
	}
}
