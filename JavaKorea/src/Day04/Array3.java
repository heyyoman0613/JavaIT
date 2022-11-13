package Day04;

public class Array3 {
	public static void main(String[] args) {
		String name[] = new String[4];
		int no[] = {1,2,3,4};
		
		name[0] = "홍길동";
		name[1] = "하하";
		name[2] = "유재석";
		name[3] = "송지효";
		
		System.out.println("===출석부===");
		for(int i=0; i<name.length; i++) {
			System.out.println(no[i]+"번 - "+name[i]);
		}
		
	}
}
