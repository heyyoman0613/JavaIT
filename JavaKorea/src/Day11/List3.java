package Day11;

import java.util.ArrayList;

public class List3 {
	public static void main(String[] args) {
		ListClass3 lc3 = new ListClass3();
		lc3.go();
		
		
	}
}


class ListClass3{
	public void go() {
		
		ArrayList<String> arr1 = new ArrayList<>();
		
		arr1.add("아메리카노");
		arr1.add("카페라떼");
		arr1.add("카페모카");
		arr1.add("카라멜마끼아또");
		
		// 추가
		arr1.add(0, "에스프레소");
		
		// 수정
		arr1.add(4, "오렌지주스");
		
		// 삭제
		arr1.remove(4);
		arr1.remove("카페모카");
		
		System.out.println(arr1.indexOf("에스프레소"));
		
		// 읽기
		System.out.println(arr1.get(0));
		System.out.println(arr1.size());
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i)+" ");	
				
		}
	
	}
	
}