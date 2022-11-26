package Day09;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		MyRandom2 mr2 = new MyRandom2();
		mr2.go();
	}
}



class MyRandom2{
	public void go() {
		// 랜덤을 돌리는 방법 2가지
		// 1. Math.random()
		// 2. Random 클래스
				
				
		// 2. Random 클래스
		Random rand = new Random();
		
		// 0 ~ 99
		// double num2 = Math.random()*100;					// 0 ~ 99
		double num2 = rand.nextDouble();
		System.out.println(num2);
				
		// int num3 = (int)(Math.random()*100);
		int num3 = rand.nextInt(100);
		System.out.println(num3);
				
				
		// 1 ~ 100
		// int num4 = (int)(Math.random()*100) +1;				// (0 ~ 99) +1
		int num4 = rand.nextInt(100) +1;
		System.out.println(num4);
				
				
		// 50 ~ 100
		// int num5  = (int)(Math.random()*51) +50;			// (0 ~ 50) +50
		int num5 = rand.nextInt(51) +50;
		System.out.println(num5);
		
	}
}