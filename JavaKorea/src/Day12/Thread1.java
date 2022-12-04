package Day12;

public class Thread1 {
	public static void main(String[] args) {
		// 배열 사용법 - 방 5개를 만들면 4번방까지만 있다
		// 오버로딩과 오버라이딩의 차이
		// 컬렉션 List, Set, Map의 차이
		// 프로세스와 쓰레드의 차이

		// 프로그램 : 운영체제에 설치된 처리방법과 순서가 기술된 명령문의 집합체(실행파일)
		// 프로세스 : 실행 중인 프로그램 (프로그램이 프로세스에 등록됨)
		// 스레드 : 프로세스 내에서 실제로 작업을 수행하는 주체
		
		// main() : 주 스레드
		// 스레드를 추가하고 다루는 방법
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				// 1000ms 동안 스레드 중지
			
			
		}
				
	}
}

class MyThread1{
	// 클래스에 어떤걸 만들던 main만 실행됨
	
}