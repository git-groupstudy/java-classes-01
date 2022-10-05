package chapter06.sec01;

public class App {

	public static void main(String[] args) {

		//1.Dog 객체 생성
		Dog dog = new Dog("멍멍이");
		
		//2. sleep
		dog.sleep();
		
		//3. 생성자 오버로딩
		Dog dog2 = new Dog(0);
		dog2.sleep();
		
		
	}

}
