package chapter05.sec04;

public class Exam01_Method {
	
	//1. 입력값이 있고, 출력값이 있는 메서드
	int sum(int a, int b) { //a, b 는 매개 변수
		return a + b;
	}
	
	//2. 입력값이 없고, 출력값이 있는 메서드
	String say() {
		return "Hello";
	}
	
	//3. 입력값이 있고, 출력값이 없는 메서드
	void printSum(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	//4. 입력값이 없고, 출력값도 없는 메서드
	void printSay() {
		System.out.println("print Hello");
	}

	public static void main(String[] args) {
		
		Exam01_Method sample = new Exam01_Method();
		
		//1.
		int c = sample.sum(3, 4); //3, 4는 인수
		
		System.out.println("c : " + c);
		
		//2.
		String say = sample.say();
		
		System.out.println("say : " + say);
		
		//3.
		sample.printSum(2, 7);
		
		
		//4.
		sample.printSay();
	}

}
