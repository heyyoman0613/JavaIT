package Day02;

public class Oper7 {
	public static void main(String[] args) {
		// 번외 (삼항연산자) : 조건에 따라서 프로그램 동작을 다르게 시킬 때
		int num = 3;
		String result = (num > 2) ?  "맞다" : "틀리다";
		// ? 왼쪽에 조건을 작성, ? 우측에는 조건에 따른 결과값을 씀
		System.out.println(result);
	}
}
