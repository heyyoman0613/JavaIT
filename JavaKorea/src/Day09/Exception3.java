package Day09;

import java.io.BufferedReader;
import java.io.IOException;

// Exception : 제일 포괄적인 범위
// IOException : IO 관련된 범위


public class Exception3 {
	public static void main(String[] args) throws Exception {
		
		Try3 try3 = new Try3();
		try3.go();
		
		// throws Exception : '예외가 발생할 경우 Exception 클래스에 맡긴다' 라는 뜻
		
	}
}


class Try3{
	private BufferedReader br = null;
		
	public void go() throws Exception {
		
		// 1번, try~catch 사용
		try {
			br.read();
		
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();					// 배열 범위가 넘어갔을 때 예외처리
			
		} catch(IOException e) {
			e.printStackTrace();					// IO 예외가 나왔을 떄만
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();					// 모든 대상에 대해서
		}

		// 2번, 해당 메서드에 throws Exception 사용
		br.read();
		
	}
	
}