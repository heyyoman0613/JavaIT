package Day12;

public class Thread5 {
	public static void main(String[] args) {
		// 멀티 스레드
		// 우선순위를 정하는 방법2
		// 1. join() : 지금 실행중인 스레드 말고는 전부 대기하라
		// 2. setPriority() : 우선순위 정하기
				
		MyThread5 mt5 = new MyThread5();
		MyThread5EX mt5ex = new MyThread5EX();
				
		mt5.start();
		try {mt5.join();}				// join() : 나 말고 대기
		catch (Exception e) {}
		
		mt5ex.start();					// 이놈 대기
		mt5ex2.start();					// 이놈도 대기

		
	}
}


class MyThread5 extends Thread{
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


class MyThread5EX extends Thread{
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
