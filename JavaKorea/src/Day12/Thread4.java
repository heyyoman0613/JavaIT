package Day12;

import java.util.ArrayList;

public class Thread4 {
	static ArrayList<String> arr = new ArrayList<>();
	
	public static void main(String[] args) {
		
		MyThread4 mt4 = new MyThread4(arr);
		MyThread4 mt4ex = new MyThread4(arr);
		
		mt4.start();
		mt4ex.start();
		
		
	}
}


class MyThread4 extends Thread{
	// 생성자를 통해서 멤버에 저장
	// 0.5초에 한번씩 add
	@Override
	public void run() {
	//	Thread4.arr.add("1");				// static은 객체화없이 사용 가능
		for(int i=0; i<20; i++) {
			Thread4.arr.add(""+1);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class MyThread4EX extends Thread{
	// 생성자를 통해서 멤버에 저장
	// 1초에 한번씩 전체 조회
	@Override
	public void run() {
	//	System.out.println(Thread4.arr.get(0));
		for (int j=0; j<10; j++) {
			for(int i=0; Thread4.arr.size(); i++) {
				System.out.print(Thread4.arr.get(i));
			}
			System.out.println();
			try {
				sleep(1000);
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	}
	
	}
}