package Day12;

public class Thread2 {
	public static void main(String[] args) {
		MyThread mt2 = new MyThread2();
		MyThread mt22 = new MyThread2();
		// 추가한 스레드는 start로 시작 (run에 적은 코드는 start로 실행)
		mt2.start();
		mt22.start();
		
		
	}
}

// 스레드를 추가하고 싶다면 스레드를 상속받으세요
class MyThread2 extends Thread{
	// Thread의 코드는 run에 구현
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 추가된 스레드는 run() 메서드를 main으로 가짐
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}