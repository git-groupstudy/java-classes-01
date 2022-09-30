package chapter05.sec02;

public class Calculator {
	
	int sum = 0;
	
	public int add(int a) {
		
		sum += a;
		
		return sum;
	}
	
	public int sub(int a) {
		
		sum -= a;
		
		return sum;
	}
}
