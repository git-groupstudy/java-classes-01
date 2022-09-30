package chapter05.sec01;

public class Exam02_Calculator2 {
	
	public static void main(String[] args) {

		System.out.println("Cal1 = " + Cal1.add(3));
		System.out.println("Cal1 = " + Cal1.add(4));
		
		System.out.println("");

		System.out.println("Cal2 = " + Cal2.add(10));
		System.out.println("Cal2 = " + Cal2.add(5));
	}


}

class Cal1 {
	
	static int result = 0;
	
	static int add(int num) {
		result += num;
		
		return result;
	}
}

class Cal2 {
	
	static int result = 0;
	
	static int add(int num) {
		result += num;
		
		return result;
	}
}
