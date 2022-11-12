package D1112;

public class Class6 {
	public static void main(String[] args) {
		Person 철수 = new Person();
		Person 영희 = new Person();


		철수.name = "철수";
		철수.age = 22;
		철수.gender = "남";
		철수.hight = 177.6;
		철수.name = "영희";
		철수.age = 21;
		철수.gender = "여";
		철수.hight = 170.1;
		
		
	}
}


class Person{
	// 이름, 나이, 성별, 키
	// 정보보기 (이름, 나이, 성별, 키 출력)
	// 인사하기 (홍길동이 인사합니다)
	
	String name;
	int age;
	String gender;
	double hight;
	
	
	public void 정보보기() {
		System.out.println("이름:"+name+"(age, gender, hight)");
	}
		
	public void 인사하기() {
		System.out.println(name+"가(이) 인사합니다.");
		
	}
	
	
}