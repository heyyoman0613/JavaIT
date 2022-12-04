package Day12;

public class Thread6 {
	public static void main(String[] args) {
		MyThread6 mt6 = new MyThread6();
		MyThread6 mt6ex = new MyThread6EX("first");
		MyThread6 mt6ex2 = new MyThread6EX("second");
	
		mt6ex.setPriority(Thread.MAX_PRIORITY);			// 최고 우선순위 스레드
		mt6ex2.setPriority(Thread.MIN_PRIORITY);		// 최저 우선순위 스레드
		
		mt6.start();
		
		try { mt6.join(); } catch (Exception e) {}
		
		mt6ex.start();
		mt6ex2.start();
		
	}
}


class MyThread6 extends Thread{
	// 생성자를 통해서 멤버에 저장
	// 0.5초에 한번씩 add
	@Override
	public void run() {
	//	Thread4.arr.add("1");				// static은 객체화없이 사용 가능
		for(int i=0; i<20; i++) {
			Thread4.arr.add(""+1);
		
		}
	}
	
}

class MyThread6ex extends Thread{
	
	public MyThread6EX(String name) {
		currentThread().setName(name);
	}
	
	@Override
	public void run() {
	//	System.out.println(Thread4.arr.get(0));
		for (int j=0; j<10; j++) {
			System.out.print(currentThread().getName());
			for(int i=0; Thread4.arr.size(); i++) {
				System.out.print(Thread4.arr.get(i));
			}
			System.out.println();
			
		}
	
	}

}
