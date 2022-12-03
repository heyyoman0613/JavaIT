package Day11;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		// 객체화
		ListClass2 lc2 = new ListClass2();
		// go 사용
		lc2.go();
	}
}



class ListClass2{
	public void go() {
		// ArrayList<> 객체화
		ArrayList<String> arr1 = new ArrayList<>();
		ArratList<Integer> arr2 = new ArrayList<>();
		
		
		// 추가, 삽입 : add()
		// 수정 : set()
		// 삭제 : remove()
		// 읽기 : get()
		// 총 갯수 : size()
		arr1.add("일");			// add를 한 순간 ,방이 하나 생성되고 "일"을 대입함
		arr1.add("이");			// 방이 하나 생성되고 "이"를 대입

		// 읽기
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		
		arr2.add(1);
		arr2.add(2);
		
		System.out.println(arr2.get(0));
		System.out.println(arr2.get(1));
		
	}
}