package Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map3 {
	public static void main(String[] args) {
		Map3Impl m3i = new Map3Impl();
		m3i.go();
	
	}
}



class Map3Impl{
	private HashMap<String, String> hm = new HashMap<>();
	public void go() {
		
		Set<String> set = null;
		Iterator<String> it = null;
				
		hm.put("한국", "서울");
		hm.put("대한한국", "서울");
		hm.put("일본", "도쿄");
		hm.put("미국", "워싱턴DC");
		hm.put("중국", "베이징");
		hm.put("싱가폴", "싱가폴");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국가를 입력하세요. (0을 입력하면 전체보기) >>");
		
		String nation = sc.nextLine();
		
		if(nation.equals("0")) {
			set = hm.keySet();
			it = set.iterator();
			while(it.hasNext()) {
				String country = it.next();
				System.out.println(country+" : "+hm.get(country));
				
			}
						
		}eles if(hm.get(nation) == null || hm.get(nation).equals(" ")) {
			System.out.println("해당 국가가 없습니다");
			
		}else {
			System.out.println(nation+" : "+hm.get(nation));
			
		}
		
		sc.close();
	}
}