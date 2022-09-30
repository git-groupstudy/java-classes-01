package chapter05.sec01;


public class Exam01_Calculator {

	public static void main(String[] args) {

		System.out.println(Cal.add(3));
		System.out.println(Cal.add(4));

	}
}

class Cal {
	
	static int result = 0;
	
	static int add(int num) {
		result += num;
		
		return result;
	}
}
