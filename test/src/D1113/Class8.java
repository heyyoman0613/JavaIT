package D1113;

public class Class8 {
	public static void main(String[] args) {
		Person 철수 = new Person("철수", 22, "남성", 188.8);
		Person 영희 = new Person("영희", 20, "여성", 170.1);
		// 해당 클래스 사용을 위해서 먼저 해줘야 하는 작업을 문법으로 만듦(생성자)
		
		
		/*
		철수.name = "철수";
		철수.age = 22;
		철수.gender = "남";
		철수.height = 177.6;
		영희.name = "영희";
		영희.age = 21;
		영희.gender = "여";
		영희.height = 170.1;
		*/
	}
}


class Person{
	// 이름, 나이, 성별, 키
	// 정보보기 (이름, 나이, 성별, 키 출력)
	// 인사하기 (홍길동이 인사합니다)
	
	String name;
	int age;
	String gender;
	double height;
	
	// 생성자의 이름은 클래스의 이름과 같고, 자료형이 없다.
	Person(String name, int age, String gender, double height){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
		
	public void 정보보기() {
		System.out.println("이름:"+name+"(age, gender, height)");
	}
		
	public void 인사하기() {
		System.out.println(name+"가(이) 인사합니다.");
		
	}
	
	
}