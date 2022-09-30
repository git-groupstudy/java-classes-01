package chapter05.sec02;

public class CalculatorService {

	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		
		System.out.println(cal1.add(4));
		System.out.println(cal1.add(3));
		System.out.println(cal1.sub(5));
		
		System.out.println("");
		
		System.out.println(cal2.add(1));
		System.out.println(cal2.add(4));
		System.out.println(cal2.sub(2));
	}

}
