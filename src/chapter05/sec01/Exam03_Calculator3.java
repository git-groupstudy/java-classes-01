package chapter05.sec01;


public class Exam03_Calculator3 {

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		
		System.out.println("cal1 = " + cal1.add(3));
		System.out.println("cal1 = " + cal1.add(4));
		
		System.out.println("");

		System.out.println("cal2 = " + cal2.add(10));
		System.out.println("cal2 = " + cal2.add(5));
		
	}

}

class Calculator {
	
	int result = 0;
	
	int add(int num) {
		result += num;
		
		return result;
	}
}
