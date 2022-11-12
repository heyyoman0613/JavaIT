package D1112;

// 객체지향기법 : 클래스 기반 코딩 기법

public class Class5 {
	public static void main(String[] args) {
		// 객체화
		// 클래스명 객체명 : new 클래스명();
		// 클래스 : 추상적인 개념(설계도)
		// 객체(object) : 구체적인 대상
		Car 아빠차 = new Car();
		Car 엄마차 = new Car();
		Car 내차 = new Car();
		
		아빠차.setInfo("아빠", "제네시스G90", 2960);
		엄마차.setInfo("엄마", "포르쉐", 7137);
		내차.owner = "홍길동";
		내차.name = "아우디RSA7";
		내차.car_num = 2422;
		
		System.out.println(아빠차.car_num);
		System.out.println(내차.car_num);
		
		아빠차.carInfo();
		엄마차.carInfo();
		내차.carInfo();
		
		
	}
}


// class는 설계도 같은 것이라 생각하면 됨
class Car{
	// 속성
	String owner;
	String name;
	int car_num;
	
	public void carInfo() {
		System.out.println("차주인: "+owner+" 모델명: "+name+" 차번호: "+car_num);
	}
	
	public void setInfo(String owner, String name, int car_num) {
		this.owner = owner;
		this.name = name;
		this.car_num = car_num;
	}
	
}