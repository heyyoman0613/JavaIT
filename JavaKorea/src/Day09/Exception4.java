package Day09;

public class Exception4 {
	public static void main(String[] args) {
		Throws4 throws4 = new Throws4();
		throws4.go();
	}
}



class Throws4{
	public void go() {
		
		try {
			MyExcept();
		}catch(Exception e) {
			System.out.println("호출한 메서드에서 예외처리");
		}
	}
	
	
	public void MyExcept() throws Exception{
		throw new Exception();
	}
	
}