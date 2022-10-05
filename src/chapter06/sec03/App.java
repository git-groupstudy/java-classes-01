package chapter06.sec03;

public class App {

	public static void main(String[] args) {
		
		Member member1 = new Member("철수", 10);
		
		System.out.println(member1.toString());
		
		member1.name = "김철수";
//		member1.age = 20;
		System.out.println(member1.toString());
		
	}

}
