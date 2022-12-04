package Day12;

public class Thread3 {
	public static void main(String[] args) {
		// 캐릭터가 움직이ㅕㄴ서 배경음악은 재생되고 있음을 만든다고 가정
		MyThread3 mt3 = new MyThread3();
		MyThread3Bgm bgm = new MyThread3Bgm();
		
		mt3.start();		// run 메서드를 사용
		bgm.start();		// run() 실행
		
		
	}
}


class MyThread3 extends Thread{
	// 캐릭터 동작을 맡는다고 가정
	@Override
	public void run() {
		go();
		
	}
	
	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("캐릭터 동작중");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}


class MyThread3Bgm extends Thread{
	@Override
	public void run() {
		go();
		
	}
	
	public void go() {
		for (int i = 0; i < 20; i++) {
			System.out.println("배경음악 재생 중");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}