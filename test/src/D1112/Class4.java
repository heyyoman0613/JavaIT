package D1112;

public class Class4 {
	public static void main(String[] args) {
		
		Aircon aircon = new Aircon();
		aircon.temp = 20;
		System.out.println(aircon.temp);
		
		aircon.powerOn();
		aircon.tempUp();
		aircon.currentTemp();
	}
}


class aircon{
	int temp = 25;												// 클래스 안에서 만들어진 변수 (멤버 변수)
	
	void currntteTemp() {
		int temp = 0;											// 함수 안에서 만들어진 변수 (지역 변수) 
		System.out.println("현재 온도는 "+this.temp+"입니다");			//  ㄴ특징1 : 함수가 끝나면 사라짐, 우선 순위가 높음(멤버 변수보다 높음)
	}				// this. : 멤버에 있는 변수 또는 메서드를 지칭     		//  ㄴ특징2 : 해당 함수 안에서만 사용 가능
	
	void tempUp() {												// () 안에는 this 라는 변수가 숨어 있음
		temp++;
		System.out.println("에어컨 온도를 올립니다. 온도: "+temp);
	}
	
	void tempDown() {
		temp--;
		System.out.println("에어컨 온도를 내립니다. 온도: "+temp);
	}
	
	void powerOn() {
		System.out.println("에어컨을 가동합니다. 온도: "+temp);
	}
}