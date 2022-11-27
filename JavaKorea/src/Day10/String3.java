package Day10;

public class String3 {
	public static void main(String[] args) {
		// 객체화
		MyString3 ms3 = new MyString3();
		ms3.go();
	}
}



class MyString3{
	private String str = "123";					// null
	private int num;							// 0
	private double dNum;						// 0.0
	
	public void go() {
		// 기본 자료형끼리의 형변환 ()
		dNum = (double)num;
		num = (int)dNum;
		
		// String 클래의 형변환
		num = Integer.parseInt(str);			// String -> int
		dNum = Double.parseDouble(str);			// String -> double
		
		str = Integer.toString(num);			// int -> String
		str = Double.toString(dNum);			// double -> String
		
		System.out.println(num);
		System.out.println(dNum);
		System.out.println(str);
		
		
		
	}
}