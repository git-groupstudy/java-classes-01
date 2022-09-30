package chapter05.sec03;

public class Exam01_Class {

	public static void main(String[] args) {
		
		//1. 객체 생성
		Animal dog = new Animal();
		Animal cat = new Animal();
		Animal horse = new Animal();
		
		//2. 객체 변수 사용
		dog.name = "dog";
		cat.name = "cat";
		horse.name = "horse";
		
		System.out.println(dog.name);
		System.out.println(cat.name);
		System.out.println(horse.name);
		
		//3. 메서드
		dog.setName("DOG");
		cat.setName("CAT");
		horse.setName("HORSE");
		
		System.out.println(dog.getName());
		System.out.println(cat.getName());
		System.out.println(horse.getName());
		
		
	}

}

class Animal { //1. 아무것도 없어도 객체 생성이라는 기능을 할 수 있다.
	
	
	//2. 멤버 변수, 객체 변수, 속성
	String name;
	
	
	//3 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
